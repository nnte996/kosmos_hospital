DROP table IF EXISTS Citas;
CREATE table Citas (
citaId int not null,
doctor int not null,
horarioConsulta time not null,
nombrePaciente varchar(255) not null,
primary key(citaId)
);
-- ---------------------------------------
INSERT INTO Doctores(nombre, apellidoPaterno, apellidoMaterno, especialidad) VALUES('Juan', 'Rodriguez', 'Garcia', 'Oftamologia');
INSERT INTO Doctores(nombre, apellidoPaterno, apellidoMaterno, especialidad) VALUES('Marco', 'Garcia', 'Garza', 'Neurologia');
INSERT INTO Doctores(nombre, apellidoPaterno, apellidoMaterno, especialidad) VALUES('Mariana', 'Torres', 'Hernandez', 'Psicologia');
 
INSERT INTO Consultorios(numero, piso) VALUES(23, 2);
INSERT INTO Consultorios(numero, piso) VALUES(25, 1);
INSERT INTO Consultorios(numero, piso) VALUES(13, 3);

 Select * From Doctores;
 Select * From Consultorios;
 Select * from Citas;