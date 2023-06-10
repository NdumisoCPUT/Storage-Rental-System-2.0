/**
 *  IRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */


package za.ac.cput.repository;

public interface IRepository <objectType , t>{

    objectType create (objectType t);
    objectType read (t t);
    objectType update (objectType objectType);
    boolean delete(t t);

}
