package miPaquete;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class appPrueba {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad-equipo");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // BEGIN TRANSACTION
        tx.begin();

        // Buscar un equipo y mostrar sus datos
//        Equipo equipo = em.find(Equipo.class, 3);
//        if (equipo != null) {
//            System.out.println("Equipo encontrado: " + equipo);
//        } else {
//            System.out.println("No se encontró un equipo con ID 1.");
//        }

        //Crear equipo
//        Equipo eq = new Equipo();
//        eq.setNombre("Equipo 3");
//        eq.setEstadio("Azteca 2");
//        em.persist(eq);

        //Eliminar equipo
//        Equipo eq = em.find(Equipo.class, 3);
//        em.remove(eq);

        //Update equipo
//        Equipo equipoActualizar = em.find(Equipo.class, 1);
//        if (equipoActualizar != null) {
//            equipoActualizar.setNombre("Equipo Actualizado");
//            equipoActualizar.setEstadio("Estadio Actualizado");
//            em.merge(equipoActualizar);
//            System.out.println("Equipo actualizado");
//        } else {
//            System.out.println("No se encontró un equipo con ID 1 para actualizar.");
//        }

        // Para quipos //

        // INSERT: Crear un nuevo jugador
//        Jugador nuevoJugador = new Jugador();
//        nuevoJugador.setNombre("Jugador Ejemplo");
//        nuevoJugador.setEstatura(1.85f);
//        nuevoJugador.setPeso(78.0f);
//        nuevoJugador.setIdEquipo(em.find(Equipo.class, 1)); // Asignar equipo existente
//        em.persist(nuevoJugador);
//        System.out.println("Jugador insertado: " + nuevoJugador);

        // UPDATE: Actualizar un jugador existente
//        Jugador jugadorActualizar = em.find(Jugador.class, 1);
//        if (jugadorActualizar != null) {
//            jugadorActualizar.setNombre("Jugador Actualizado");
//            jugadorActualizar.setEstatura(1.90f);
//            jugadorActualizar.setPeso(80.0f);
//            em.merge(jugadorActualizar);
//            System.out.println("Jugador actualizado: " + jugadorActualizar);
//        } else {
//            System.out.println("No se encontró un jugador con ID 1 para actualizar.");
//        }

        // DELETE: Eliminar un jugador existente
        Jugador jugadorEliminar = em.find(Jugador.class, 2);
        if (jugadorEliminar != null) {
            em.remove(jugadorEliminar);
            System.out.println("Jugador eliminado: " + jugadorEliminar);
        } else {
            System.out.println("No se encontró un jugador con ID 2 para eliminar.");
        }


        // COMMIT TRANSACTION
        tx.commit();

        // CLOSE ENTITY MANAGER
        em.close();
        emf.close();

    }
}
