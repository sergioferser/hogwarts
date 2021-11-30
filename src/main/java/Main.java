import entity.HousePoints;
import entity.Person;
import entity.Course;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Inicio apartado 1
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Query q=em.createQuery("select p from Person p inner join p.courses c inner join c.teacher t where t.id=:prof");

        q.setParameter("prof",97);
        List<Person> list= q.getResultList();
        list.forEach(person ->{
            System.out.println("id: "+person.getId()+ " nombre: "+person.getFirstName()+" "+ person.getLastName());
        });
//        Fin apartado 1
    }
}
