package test;

import entities.Asistencia;
import entities.Clase;

import entities.Entrenador;
import entities.Membresia;
import entities.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import persistence.AsistenciaData;
import persistence.ClaseData;
import persistence.Conexion;
import persistence.EntrenadorData;
import persistence.MembresiaData;
import persistence.SocioData;

public class Pruebas {

    private Conexion conexion;
    private ClaseData claseData;
    private AsistenciaData asistenciaData;

    public static void main(String[] args) {
        Conexion.getConexion();

//Crear una clase
//Crear una clase
//    ClaseData clase = new ClaseData();
//     LocalTime horaInicio = LocalTime.of(8, 0);
//     LocalTime horaFin = LocalTime.of(12, 0);
//     clase.buscarPorRangoHorario(horaInicio, horaFin);

//    Clase clase1 = new Clase("Boxeo", 4, LocalTime.parse("13:00:00"), 20, true);
//    clase.agregarClase(clase1);
// Crear una asistencia    
//    Socio socio1 = new Socio("135465", "Felipe", "Juarez", 30, "hab@yopmail.com", "3471688", true);
//        SocioData socioData = new SocioData();
//        Socio socio = new Socio("2511115678", "Daniel", "Perez", 20, "1o553ocio@gmail.com", "0675621", true);
//        socioData.agregarSocio(socio);
//        Socio socio1 = new Socio(6, "252005678", "Daniel", "Lopez", 45, "1orr3eo11Socio@gmail.com", "0675621", true);
//        socioData.actualizarSocio(socio1);
//         
//    Clase clase1 = new Clase("Boxeo", 4, LocalTime.parse("13:00:00"), 20, true);           
//    AsistenciaData asistencia = new AsistenciaData();
//    Asistencia asist1 = new Asistencia(socio1, clase1, LocalDate.of(2024, 5, 15));
//    asistencia.agregarAsistencia(asist1);
////Crear un entrenador
//    EntrenadorData ed = new EntrenadorData();
//    Entrenador entrenador1 = new Entrenador("Martin", "Norton", "123", "preparacion fisica", true);
//    ed.agregarEntrenador(entrenador1);
//    SocioData socio = new SocioData();
//    Socio soci= socio.buscarSocio(1);
//    
////    Membresia membresia1= new Membresia(1,soci,LocalDate.of( 2024,5,20), LocalDate.of( 2024,6,20) , 20, 200, 1);
//    MembresiaData mem =new MembresiaData();
//    
//    mem.agregarMembresia(membresia1);
//        System.out.println("la lista de membresia es");
//        System.out.println(mem.listarMembresia(soci));
//        Membresia membresia2= new Membresia(5,soci,LocalDate.of( 2024,6,20), LocalDate.of( 2024,7,20) , 15, 100, 0);  
//        mem.actualizarMembresia(membresia2);
//        mem.borrarMembresia(6);
//    }
        //---------------Crear Socio----------------------
//        SocioData socioData = new SocioData();
//        Socio socio = new Socio("2511115678", "Daniel", "Perez", 20, "1o553ocio@gmail.com", "0675621", true);
//        socioData.agregarSocio(socio);
//        Socio socio = new Socio(6, "252005678", "Daniel", "Lopez", 45, "1orr3eo11Socio@gmail.com", "0675621", true);
//        socioData.actualizarSocio(socio);
//
//--------------buscar socio por id_socio---------
//        System.out.println(socioData.buscarSocio(1));
//
//--------------listar todos los socios-------------
//        System.out.println("lista de todos los socios del gim");
//        System.out.println(socioData.listarSocios());
//    ClaseData clase = new ClaseData();
//    Clase clase1 = new Clase("Pilates", 4, LocalTime.parse("13:00:00"), 20, true);
//    clase.agregarClase(clase1);
//Crear un entrenador
        EntrenadorData ed = new EntrenadorData();
//        Entrenador entrenador1 = new Entrenador("Martin", "Norton", "42508965", "preparacion fisica", true);
//        ed.agregarEntrenador(entrenador1);

//---------------eliminar socio---------------------
//           socioData.eliminarSocio(1);
//---------------Crear una clase--------------------
// Crear un entrenador de prueba
//        Entrenador entrenador = new Entrenador();
//        entrenador.setIdEntrenador(3);
//        Clase nuevaClase = new Clase();
//        ClaseData clase = new ClaseData();
//        nuevaClase.setNombreClase("Yoga");
//        nuevaClase.setEntrenador(entrenador);
//        nuevaClase.setHorarioClase(LocalTime.of(9, 0));
//        nuevaClase.setCapacidad(20);
//        nuevaClase.setEstado(true);
//        clase.agregarClase(nuevaClase);
//-------------Listar todas las clases-------------- 
//        System.out.println(clase.listarClases());
//------------Listar clase por ID-------------------
//System.out.println(clase.listarClasesPorId(6));
//------------Actualizar clase----------------------
//        Clase claseParaActualizar = clase.listarClasesPorId(8);
//        claseParaActualizar.setNombreClase("Esferopilates");
//        clase.actualizarClase(claseParaActualizar);
//------------Buscar clase por Nombre---------------
//
// List<Clase> clasesPorNombre = clase.buscarPorNombre("Yoga");
//        System.out.println(clasesPorNombre);      
//------------Buscar clase por Entrendor------------
//List<Clase> clasesPorEntrenador = clase.buscarPorEntrenador(4);
//            System.out.println("Clases encontradas por entrenador:");
//            for (Clase c : clasesPorEntrenador) {
//                System.out.println(c.getNombreClase());
//            }
//------------Buscar Clase por Horario--------------
// List<Clase> clasesPorHorario = clase.buscarPorHorario(LocalTime.of(9, 0));
//        System.out.println("Clases encontradas por horario:");
//        for (Clase c : clasesPorHorario) {
//            System.out.println(c.getNombreClase());
//        }
//-----------Borrar clase--------------------------
//clase.borrarClase(16);
    }

}
