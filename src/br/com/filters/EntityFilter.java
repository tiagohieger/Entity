package br.com.filters;

import java.io.Serializable;

public class EntityFilter implements Serializable {

    private static final long serialVersionUID = 5056016738249309155L;

    public static enum Direction {

        ASC, DESC
    };

    private String text = "";

    private Direction direction = Direction.ASC;

    private String orderBy;

    private Integer limit;

    private Integer offset;

    private String groupBy;

    public EntityFilter() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction orderBy) {
        this.direction = orderBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }
}
