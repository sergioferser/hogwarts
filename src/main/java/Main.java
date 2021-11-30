import entity.HousePoints;
import entity.Person;
import entity.Course;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Inicio apartado 1
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
//        EntityManager em = emf.createEntityManager();
//        Query q=em.createQuery("select p from Person p inner join p.courses c inner join c.teacher t where t.id=:prof");
//
//        q.setParameter("prof",97);
//        List<Person> list= q.getResultList();
//        list.forEach(person ->{
//            System.out.println("id: "+person.getId()+ " nombre: "+person.getFirstName()+" "+ person.getLastName());
//        });
//        Fin apartado 1
//        Apartado 3-A
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
//        EntityManager em = emf.createEntityManager();
//        Query q = em.createNativeQuery("select p.first_name,p.last_name,h.name from person as p inner join house as h on p.house_id=h.id where h.id=?");
//        q.setParameter(1, 1);
//        List list = q.getResultList();
//        for (Object o : list) {
//            Object[] objs = (Object[]) o;
//            System.out.println("Nombre: " + objs[0] + " " + objs[1] + "       Casa: " + objs[2]);
//        }
//        Fin apartado 3-A
//        Apartado 3-B
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
//        EntityManager em = emf.createEntityManager();
//        Query q = em.createNativeQuery("select p.first_name,p.last_name,e.course_enrollment from person as p left outer join enrollment as e on p.id=e.person_enrollment order by p.id");
//
//        List list = q.getResultList();
//        for (Object o : list) {
//            Object[] objs = (Object[]) o;
//            System.out.println("Nombre: " + objs[0] + " " + objs[1] + "       ID_Curso: " + objs[2]);
//        }select * from person where id in(select receiver from house_points)
//        Fin apartado 3-B
//        Apartado 3-C
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
//        EntityManager em = emf.createEntityManager();
//        Query q = em.createNativeQuery("select id,first_name,last_name from person where id in(select receiver from house_points)");
//
//        List list = q.getResultList();
//        for (Object o : list) {
//            Object[] objs = (Object[]) o;
//            System.out.println("Nombre: " + objs[1] + " " + objs[2] + "       ID: " + objs[0]);
//        }
//        Fin apartado 3-C
    }
}
