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