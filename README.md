sistema de administración de cursos haciendo uso de Java Swing, la librería Util de Java y arreglos. Dicho sistema con las siguientes funcionalidades:

Rol administrador:

Iniciar sesión: Para iniciar sesión como administrador se deberá ingresar con el usuario ADMIN y contraseña ADMIN. 
Creación de profesor: servirá para crear profesores que también podrán iniciar sesión en la aplicación más tarde. La aplicación tendrá la opción de almacenar una cantidad indefinida de profesores, y para poder crear un profesor solicitará la siguiente información obligatoria:
Usuario: es un campo alfanumérico donde se pondrá el nombre de usuario que tendrá el profesor para iniciar sesión en la aplicación.
Nombre: es un campo de texto donde se ingresarán los nombres del estudiante.
Apellido: es un campo de texto donde se ingresarán el apellido del estudiante.
Contraseña: es un campo de texto donde se ingresará la contraseña que usará el profesor para iniciar sesión, dicha contraseña debe cumplir con las siguientes condiciones: contener al menos una mayúscula, una minúscula, un número y un carácter especial, si la contraseña no cumple las condiciones no podrá crearse el profesor.
Consulta de profesores: Mostrará en un JTable la información de todos los profesores ingresados al sistema.
Edición de profesores: permitirá cambiar cualquier dato de un profesor excepto el usuario.
Creación de alumno: servirá para crear alumnos que también podrán iniciar sesión en la aplicación más tarde. La aplicación tendrá la opción de almacenar una cantidad indefinida de alumnos, y para poder crear un alumno solicitará la siguiente información obligatoria:
Carné: es un campo alfanumérico de 8 caracteres, y es con el mismo que deberá ingresar el estudiante, en su login.
Nombre: es un campo de texto donde se ingresarán los nombres del estudiante.
Apellido: es un campo de texto donde se ingresarán el apellido del estudiante.
Contraseña: es un campo de texto donde se ingresará la contraseña que usará el estudiante para iniciar sesión, dicha contraseña debe cumplir con las siguientes condiciones: contener al menos una mayúscula, una minúscula, un número y un carácter especial, si la contraseña no cumple las condiciones no podrá crearse el alumno.
Consulta de alumnos: Mostrará en un JTable la información de todos los alumnos ingresados al sistema.
Edición de alumnos: permitirá cambiar cualquier dato de un alumno excepto el carnet.
Creación de curso: Servirá para crear los cursos los cuales se podrán después asignar a los estudiantes, para crear un curso se solicitará la siguiente información obligatoria:
ID del curso: es un número correlativo el cual será generado automáticamente por la aplicación para poder identificar el curso.
Nombre: nombre del curso.
Sección: es un campo de texto que almacenará la letra o nombre de la sección del curso.
Fecha de inicio: es un campo tipo Date que almacenará la fecha de inicio del curso.
Fecha fin: es un campo tipo Date que almacenará la fecha de fin del curso.
Hora inicio: hora de inicio del curso.
Hora fin: hora fin del curso.
Profesor: es un combo box, el cual permitirá seleccionar un catedrático que ya haya sido creado con anterioridad, mostrará únicamente el usuario del catedrático.
Consulta de cursos: Mostrará en un JTable la información de todos los cursos ingresados al sistema. 
Modificación de cursos: permitirá modificar cualquier campo de un curso (incluso el profesor) excepto el id del curso.
Asignación de alumnos a curso: Permitirá asignar hasta un máximo de 10 alumnos en un curso, un mismo estudiante podrá estar asignado hasta en un máximo de 5 cursos.
Mi Perfil: Mostrará sus datos personales, nombre, carné, además del nombre de la universidad y su sede (Mariano Gálvez, Centro de San José Pinula)
Carga masiva de profesores: Se contará con una opción que permitirá cargar un archivo en formato CSV (separado por comas) (se debe permitir a través de un JFileChooser la ubicación donde se encuentra el archivo), en él se ingresará la información del profesor en cada uno de los espacios de la siguiente forma (ejemplo de un archivo profesores.csv, proporcionado junto con el enunciado, el archivo en la calificación puede tener cualquier nombre pero debe ser CSV):


usuario,nombre,apellido,contraseña
pro1,Jim,Carrey,1234567Aa!
pro2,Adam,Sandler,1234567Bb!
pro3,Scarlett,Johansson,1234567Cc!
pro4,Nicole,Kidman,1234567Dd!
pro5,Angelina,Jolie,1234567Ee!
pro6,Brad,Pit,1234567Ff!
pro7,Gal,Gadot,1234567Gg!

Una vez cargado el archivo se podrá iniciar sesión con cualquier profesor que se haya cargado.

Generación de archivo CSV de profesores: una vez se haya hecho la carga masiva de los profesores, y también se hayan agregado más profesores al listado a través de su aplicación, se podrá generar un archivo CSV de profesores con el mismo formato anteriormente dado para poder cargarlo, se deberá pedir el nombre que queremos darle al archivo y la ubicación donde queremos guardarlos. Si un archivo ya existe este se debe de sobreescribir, y en archivo se almacenarán todos los profesores que estén almacenados en memoria.
Carga masiva de alumnos: Se contará con una opción que permitirá cargar un archivo en formato XML (Extensible Markup Language) (se debe permitir a traves de un JFileChooser la ubicación donde se encuentra el archivo), en el se ingresará la información del alumno en cada uno de los espacios de la siguiente forma (ejemplo de un archivo alumnos.xml, proporcionado junto con el enunciado, el archivo en la calificación puede tener cualquier nombre pero debe ser XML):

<?xml version="1.0" encoding="UTF-8"?>
<alumnos>
<alumno>
<carne>A1234567</carne>
<nombre>Daenerys</nombre>
<apellido>Targaryen</apellido>
<password>A1234567</password>
</alumno>
<alumno>
<carne>B1234567y!</carne>
<nombre>Cersei</nombre>
<apellido>Lannister</apellido>
<password>B1234567t?</password>
</alumno>
<alumnos>

Una vez cargado el archivo se podrá iniciar sesión con cualquier alumno que se haya cargado.
Generación de archivo XML de alumnos: una vez se haya hecho la carga masiva de los alumnos, y también se hayan agregado más profesores al listado a través de su aplicación, se podrá generar un archivo XML de alumnos con el mismo formato anteriormente dado para poder cargarlo, se deberá pedir el nombre que queremos darle al archivo y la ubicación donde queremos guardarlos. Si un archivo ya existe este se debe de sobreescribir, y el archivo se almacenarán todos los profesores que estén almacenados en memoria.
Carga masiva de cursos: para cargar de forma masiva los cursos se harán uso de archivos con formato .js, y el contenido vendrá en formato JSON (se debe permitir a través de un JFileChooser la ubicación donde se encuentra el archivo), en él se ingresará la información del curso en cada uno de los espacios de la siguiente forma (ejemplo de un archivo cursos.js, proporcinado junto con el enunciado, el archivo en la calificación puede tener cualquier nombre pero debe ser JS):

[
{
"id":1,
"nombre": "Programacion 1",
"seccion": "A",
"fecha_inicio": "2024-05-08T20:53:31.000+0000",
"fecha_fin": "2024-05-08T20:53:31.000+0000",
"hora_inicio":"10:00",
"hora_fin":"12:00",
"profesor":"pro1"
},
{
"id":2,
"nombre": "Programacion 2",
"seccion": "A",
"fecha_inicio": "2024-05-08T20:53:31.000+0000",
"fecha_fin": "2024-05-08T20:53:31.000+0000",
"hora_inicio":"10:00",
"hora_fin":"12:00",
"profesor":"pro2"
}
]

Una vez cargado el archivo se podrá ver que el curso ha sido asignado al profesor desde su perfil

Asignación masiva de estudiantes a cursos: para asignar de forma masiva los estudiantes a cursos se cargará un archivo de texto plano separado por numerales # similar a los archivos CSV, pero seran extensión .progra1 y contendran la siguiente información (ver archivo asignaciones.progra1 para tener una mejor referencia):
curso#carnet_estudiante
1# A1234567
2# B1234567
3# B1234567
4# A1234567
5# C1234567
Una vez cargado el archivo se podrá ver que el curso ha sido asignado al estudiante desde su perfil

Logout: Servirá para regresar a la pantalla de inicio sesión y poder ingresar ahora cualquiera de los otros usuarios ya sea profesor o alumno, o ingresar de nuevo como administrador.
Rol catedrático:

Iniciar sesión: para iniciar sesión como catedrático deberá ingresar su nombre de usuario y su contraseña, la cual ya fue configurada por el usuario administrador.
Consulta de cursos asignados: Mostrará un listado de sus cursos asignados en un JTable (un profesor solo puede ver sus cursos asignados no podrá ver los de otros profesores).
Consulta de alumnos asignados a cursos asignados: Mostrará un listado de los alumnos asignados al curso en un JTable.
Ingreso de nota final: Para cada alumno asignado se podrá ingresar su nota final, la cual deberá ser un número entero entre 0 y 100.
Mi Perfil: Mostrará el nombre y apellido del catedrático, y además le permitirá cambiar la contraseña para inicio de sesión, respetando las reglas anteriores.
Logout: Servirá para regresar a la pantalla de inicio de sesión y cambiar de usuario.
Rol alumno:

Iniciar sesión: para ingresar como alumno se deberá ingresar su número de carné y su contraseña.
Consulta de cursos asignados: Mostrará un listado de sus cursos asignados y debe verse el nombre del profesor que imparte dicho curso. Además, si el profesor ya ha ingresado su nota final también debe ser visible.
Asignación de curso: un estudiante podrá buscar dentro de los cursos disponibles y asignarlo si aún no tiene asignados más de 5 cursos.
Desasignación de curso: un alumno podrá desasignarse de cualquier curso al cual se haya asignado o haya sido asignado por el administrador.
Mi Perfil: Mostrará la información del alumno, su promedio en las clases y permitirá cambiar de contraseña con las restricciones dadas anteriormente.
Logout: Servirá para regresar a la pantalla de inicio de sesión y cambiar de usuario.
