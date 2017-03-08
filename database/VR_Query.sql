--PROCEDIMIENTOS DE USUARIO
GO
CREATE PROCEDURE AgregarUsuario(
@UserName varchar(50),
@FirstName varchar(MAX),
@Contrase�a varchar(MAX),
@BirthDay varchar(MAX),
@Phone varchar(MAX),
@Country varchar(MAX),
@Genero varchar(MAX),
@LastName varchar(MAX))
AS
INSERT INTO 
Usuario(UserName, FirstName, LastName, Contrase�a, BirthDay, Phone, Country, Genero)
VALUES (@UserName, @FirstName, @LastName, @Contrase�a, @BirthDay, @Phone, @Country, @Genero)

GO 
CREATE PROCEDURE ActualizarUsuario(
@UserName varchar(50),
@FirstName varchar(MAX),
@Contrase�a varchar(MAX),
@BirthDay varchar(MAX),
@Phone varchar(MAX),
@Country varchar(MAX),
@Genero varchar(MAX),
@LastName varchar(MAX))
AS
UPDATE Usuario SET UserName = @UserName, FirstName = @FirstName, LastName = @LastName,
				   Contrase�a = @Contrase�a, BirthDay = @BirthDay, Phone = @Phone,
				   Country = @Country, Genero = @Genero WHERE UserName = @UserName

GO 
CREATE PROCEDURE EliminarUsuario(
@UserName varchar(50))
AS
UPDATE Usuario SET Estado = 0 WHERE UserName = @UserName

GO
CREATE PROCEDURE ListarUsuario
AS
SELECT* FROM Usuario WHERE Estado = 1

--PROCEDIMIENTOS DE CONTACTO-----------------------------------------------------------------------
GO
CREATE PROCEDURE AgregarContacto(
@Nombre varchar(max),
@PhoneticName varchar(max),
@NickName varchar(max),
@RutaImagen varchar(max),
@Phone varchar(50),
@PhonePlace varchar(max),
@BirthDay varchar(max),
@NombreUsuarioPertenece varchar(50),
@Email varchar(max))
AS
INSERT INTO 
Contacto(Nombre, PhoneticName, NickName, RutaImagen, Phone, PhonePlace, BirthDay, NombreUsuarioPertenece, Email)
VALUES (@Nombre, @PhoneticName, @NickName, @RutaImagen, @Phone, @PhonePlace, @BirthDay, @NombreUsuarioPertenece, @Email)

GO
CREATE PROCEDURE ActualizarContacto(
@Nombre varchar(max),
@PhoneticName varchar(max),
@NickName varchar(max),
@RutaImagen varchar(max),
@Phone varchar(50),
@PhonePlace varchar(max),
@BirthDay varchar(max),
@NombreUsuarioPertenece varchar(50),
@Email varchar(max))
AS
UPDATE Contacto SET Nombre = @Nombre, PhoneticName = @PhoneticName, NickName = @NickName,
					RutaImagen = @RutaImagen, Phone = @Phone, PhonePlace = @PhonePlace,
					BirthDay = @BirthDay, NombreUsuarioPertenece = @NombreUsuarioPertenece,
					Email = @Email WHERE Phone = @Phone

GO 
CREATE PROCEDURE EliminarContacto(
@Phone varchar(50))
AS
UPDATE Contacto SET Estado = 0 WHERE Phone = @Phone

GO
CREATE PROCEDURE ListarContacto
AS
SELECT* FROM Contacto WHERE Estado = 1

--PROCEDIMIETOS DE Mensajes--------------------------------------------------------------------
GO
CREATE PROCEDURE AgregarMensaje(
@Fecha varchar(50),
@Asunto varchar(max),
@Destinatario varchar(50),
@NombreUsuarioPertenece varchar(50))
AS
INSERT INTO 
Mensaje(Fecha, Asunto, Destinatario, NombreUsuarioPertenece)
VALUES (@Fecha ,@Asunto, @Destinatario, @NombreUsuarioPertenece)

GO 
CREATE PROCEDURE EliminarMensaje(
@Fecha varchar(50))
AS
UPDATE Mensaje SET Estado = 0 WHERE Fecha = @Fecha

GO
CREATE PROCEDURE ListarMensaje
AS
SELECT* FROM Mensaje WHERE Estado = 1

--PROCEDIMIETOS DE Bitacora----------------------------------------------------------------------
GO
CREATE PROCEDURE AgregarBitacora(
@Fecha varchar(50),
@Accion varchar (50),
@NombreUsuarioPertenece varchar(50))
AS
INSERT INTO 
Bitacora(Fecha, Accion, NombreUsuarioPertenece)
VALUES (@Fecha ,@Accion, @NombreUsuarioPertenece)

GO
CREATE PROCEDURE ListarBitacora
AS
SELECT* FROM Bitacora