package com.mucfc.refreshview.refresh;

/**
 * Created by oliviergoutay on 1/23/15.
 */
public enum MySwipeRefreshLayoutDirection {

    TOP(0),
    BOTTOM(1),
    BOTH(2),
    NONE(3);
    private int mValue;

    MySwipeRefreshLayoutDirection(int value) {
        this.mValue = value;
    }

    public static MySwipeRefreshLayoutDirection getFromInt(int value) {
        for (MySwipeRefreshLayoutDirection direction : MySwipeRefreshLayoutDirection.values()) {
            if (direction.mValue == value) {
                return direction;
            }
        }
        return BOTH;
    }

}
