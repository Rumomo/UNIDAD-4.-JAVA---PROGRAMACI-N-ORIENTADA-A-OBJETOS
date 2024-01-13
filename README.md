UNIDAD 4. JAVA - PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIOS DE POO 
En cada uno de los ejercicios tendremos la clase principal (Por ejemplo: MiPrimerProgramaEnJavaoEjercicio8)ylaclaseoclasesnecesariaspararesolverelejercicio
yqueseindicanencadaunodelosejercicios.Entodosloscasossedeberáimplementar,al menos, un constructor.
1. Crea un programa que implemente la clase Persona.Los atributos serán:dni,nombre, apellidosyedad. 
En el main, se instanciarán dos objetos dela clase Persona y se solicitarán por teclado los datos para cada una de esas dos personas.
Sedeberá implementarunmétodoparamostrarporpantallalosdatosdeunapersona.(Añadido: implementarunmétodoquevalideelDNI,comprobandoquelaletracorrespondecon el número).
2. CreaunprogramaqueimplementelaclaseArticuloconlosatributosnombre,precio, igic y unidadesDisponibles. Implementa los siguientes métodos: 
a. boolean existenUnidadesDisponibles() 
b. double precioConIGIC() 
c. void imprimirDatosArticulo() 
i. Al imprimir losdatosdel artículohabráquemostrar tantoel precio como el precio con IGIC. 
3. CreaunprogramaqueimplementelaclaseNIF.Losatributosserán:numeroyletra.La clasedeberáimplementarunmétodoquecalculelaletradelDNIyotroquecompruebe 
si un determinado DNI es válido o no. 
4. Implementarunprogramaquesimuleunaempresaconsusdiferentesdepartamentos y empleados. Para ello, necesitamos la clase: 
a. Direccion(calle, numero, codigoPostal, localidad, provincia) 
b. Empresa(nombre, cif, direccion, ArrayList<Departamento> departamentos) 
c. Departamento(nombre, codigo, localizacion, ArrayList<Empleado> empleados) 
d. Empleado(nombre, dni, edad, salario, categoria) 
Todas lasclasesdeberán tener implementadossusgetter ysetter, ademásde los respectivos constructores. EnelcasodelaclaseEmpresa,deberáimplementarseelmétodoaddDepartamentoy 
elmétodoborrarDepartamento.EnelcasodeborrarDepartamento,antesderealizarla accióndeeliminar, deberácomprobarquenohayempleados trabajandoparaese departamento. 
EnelcasodelaclaseDepartamento,deberáimplementarseelmétodoaddEmpleadoy borrarEmpleado. 
Tambiéndeberá implementarseelmétodonumeroEmpleadosque devolverá el número de empleados que hay ahoramismo trabajando para ese departamento. 
Estemétodoseráútil parahacer lacomprobacióndel númerode empleados antes de borrar un departamento.
5. Diseña laclaseCuentaCorriente, quealmacena losdatos: DNI, nombredel titulary saldo. Las operaciones típicas son: 
a. Crearunacuenta: senecesitaDNI ynombredel títular.Elsaldoinicialserá0. (Pensar en el constructor).
b. Sacardinero:elmétododebeindicarsihasidoposiblerealizarlaoperación,en funcióndesihaysaldosuficienteono.Encasodepoder,sereduceelsaldoen función de la operación.
c. Ingresar dinero: se incrementa el saldo.
d. Mostrar información: muestra la información disponible de la cuenta.
6. Diseña las siguientes clases necesarias para gestionar una empresa ferroviaria. Distinguimosdosgrandesgrupos:elpersonalylamaquinaria.
Enelprimeroseubican todos losempleadosdelaempresa, queseclasificanentrestipos: losmaquinistas, los mecánicos y los jefes de estación. 
De cada uno de ellos es necesario almacenar: 
a. Maquinista: nombre, DNI, sueldo y rango que tiene adquirido. 
b. Mecánico: nombre, teléfono y en qué especialidad desarrolla su trabajo. 
c. Jefe de estación: nombre, DNI y la fecha en que fue nombrado jefe de estación. 
Enlapartedemaquinariapodemosencontrartrenes, locomotorasyvagones.Decada uno de ellos hay que considerar: Vagones: tienenunnúmeroque los identifica, unacargamáxima, 
lacarga actual y el tipo de mercancía con el que están cargados. Locomotoras:disponendeunamatrícula(quelasidentifica), lapotenciadesus motoresyañode fabricación.
Además, cada locomotora tieneasignadoun mecánico que se encarga de su mantenimiento. Trenes:Estánformadosporunalocomotorayunmáximode5vagones.Cada tren tiene asignado 
un maquinista que es responsable de él. Además,existirálaclaseEmpresaFerroviariaquetendrácomoatributoselnombre,el CIF y diferentes ArrayList quealmacenarán losmaquinistas,
mecánicos, jefesde estación, vagones, locomotoras y trenes.
