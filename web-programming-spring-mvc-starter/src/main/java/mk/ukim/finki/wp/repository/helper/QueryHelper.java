package mk.ukim.finki.wp.repository.helper;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

/**
 * Created by ristes on 11/16/15.
 */
public class QueryHelper {


    public static Path getExpression(Root root, String expr) {
        String[] path = expr.split("\\.");
        Path expression = root;
        for (String p : path) {
            expression = expression.get(p);
        }
        return expression;
    }
}