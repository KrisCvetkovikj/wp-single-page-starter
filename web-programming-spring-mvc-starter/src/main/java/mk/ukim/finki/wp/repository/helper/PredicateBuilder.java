package mk.ukim.finki.wp.repository.helper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by ristes on 11/16/15.
 */
public interface PredicateBuilder<T> {

    Predicate toPredicate(CriteriaBuilder cb,
                          CriteriaQuery<T> cq,
                          Root<T> root);
}