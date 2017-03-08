--PROCEDIMIENTOS DE USUARIO
GO
CREATE PROCEDURE AgregarUsuario(
@UserName varchar(50),
@FirstName varchar(MAX),
@Contraseña varchar(MAX),
@BirthDay varchar(MAX),
@Phone varchar(MAX),
@Country varchar(MAX),
@Genero varchar(MAX),
@LastName varchar(MAX))
AS
INSERT INTO 
Usuario(UserName, FirstName, LastName, Contraseña, BirthDay, Phone, Country, Genero)
VALUES (@UserName, @FirstName, @LastName, @Contraseña, @BirthDay, @Phone, @Country, @Genero)

GO 
CREATE PROCEDURE ActualizarUsuario(
@UserName varchar(50),
@FirstName varchar(MAX),
@Contraseña varchar(MAX),
@BirthDay varchar(MAX),
@Phone varchar(MAX),
@Country varchar(MAX),
@Genero varchar(MAX),
@LastName varchar(MAX))
AS
UPDATE Usuario SET UserName = @UserName, FirstName = @FirstName, LastName = @LastName,
				   Contraseña = @Contraseña, BirthDay = @BirthDay, Phone = @Phone,
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