package com.user.app.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.user.app.entity.Consultorios;
import com.user.app.entity.Doctores;
import com.user.app.entity.Citas;

public class hospitalDao {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Citas p){  
	    String sql="INSERT INTO Citas(citaId,doctor,horarioConsulta,nombrePaciente) values('"+p.getCitaId()+"',"+p.getDoctor()+",'"+p.getHorarioConsulta()+",'"+p.getNombrePaciente()+"')";  
	    return template.update(sql);  
	}  
	public int update(Citas p){  
	    String sql="UPDATE Citas SET citaId='"+p.getCitaId()+"', doctor="+p.getDoctor()+",horarioConsulta='"+p.getHorarioConsulta()+",nombrePaciente='"+p.getNombrePaciente()+"' WHERE citaId="+p.getCitaId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int citaId){  
	    String sql="DELETE FROM Citas WHERE citaId="+citaId+"";  
	    return template.update(sql);  
	}  
	public Citas getCitaById(int citaId){  
	    String sql="SELECT * FROM Citas WHERE citaId=?";  
	    return template.queryForObject(sql, new Object[]{citaId},new BeanPropertyRowMapper<Citas>(Citas.class));  
	}  
	public List<Citas> getCitas(){  
	    return template.query("SELECT * FROM Citas",new RowMapper<Citas>(){  
	        public Citas mapRow(ResultSet rs, int row) throws SQLException {  
	            Citas e = new Citas();  
	            e.setCitaId(rs.getInt(1));  
	            e.setDoctor(rs.getString(2));  
	            e.setHorarioConsulta(rs.getTime(3));  
	            e.setNombrePaciente(rs.getString(4));  
	            return e;  
	        }  
	    });  
	}

}