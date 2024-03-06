package co.edu.uniquindio.poo.util.QuaryBuilder;

public class Query {
    private QuerySelect querySelect;
    private FromFrom fromFrom;
    private User user;
    private OrderBy orderBy;
    

    public Query(QuerySelect querySelect, FromFrom fromFrom, User user, OrderBy orderBy ){
        assert querySelect != null;
        assert fromFrom != null;
        assert user != null;
        assert orderBy != null;

        this.querySelect= querySelect;
        this.fromFrom= fromFrom;
        this.user= user;
        this.orderBy= orderBy;
    }

    public static QueryBuilder builder( ){
        return new QueryBuilder();
    }

    public QuerySelect getQuerySelect() {
        return querySelect;
    }


    public FromFrom getFromFrom() {
        return fromFrom;
    }


    public User getUser() {
        return user;
    }


    public OrderBy getOrderBy() {
        return orderBy;
    }

    public static class QueryBuilder{
        private QuerySelect querySelect;
        private FromFrom fromFrom;
        private User user;
        private OrderBy orderBy;


        public QueryBuilder select(QuerySelect querySelect) {
            this.querySelect = querySelect;
            return this;

    }
    public QueryBuilder from(FromFrom fromFrom) {
        this.fromFrom = fromFrom;
        return this;

}
public QueryBuilder user(User user) {
    this.user = user;
    return this;
} 

public QueryBuilder order(OrderBy orderBy) {
    this.orderBy = orderBy;
    return this;
} 

public Query build(){
    return new Query(querySelect, fromFrom, user, orderBy);

}

}

}