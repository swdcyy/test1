package com.yxcorp.gifshow.util.LatestBrowsedFeedCache$Operation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LatestBrowsedFeedCache$Operation extends Enum	// class@001ef1
{
    public final int value;
    public static final LatestBrowsedFeedCache$Operation[] $VALUES;
    public static final LatestBrowsedFeedCache$Operation ACTIVE;
    public static final LatestBrowsedFeedCache$Operation INACTIVE;
    public static final LatestBrowsedFeedCache$Operation UNKNOWN;

    static {
       LatestBrowsedFeedCache$Operation operation;
       LatestBrowsedFeedCache$Operation[] operationArr = new LatestBrowsedFeedCache$Operation[]{operation,operation,operation};
       operation = new LatestBrowsedFeedCache$Operation("UNKNOWN", 0, 0);
       LatestBrowsedFeedCache$Operation.UNKNOWN = operation;
       operation = new LatestBrowsedFeedCache$Operation("ACTIVE", 1, 1);
       LatestBrowsedFeedCache$Operation.ACTIVE = operation;
       operation = new LatestBrowsedFeedCache$Operation("INACTIVE", 2, 2);
       LatestBrowsedFeedCache$Operation.INACTIVE = operation;
       LatestBrowsedFeedCache$Operation.$VALUES = operationArr;
    }
    public void LatestBrowsedFeedCache$Operation(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LatestBrowsedFeedCache$Operation valueOf(String p0){
       return Enum.valueOf(LatestBrowsedFeedCache$Operation.class, p0);
    }
    public static LatestBrowsedFeedCache$Operation[] values(){
       return LatestBrowsedFeedCache$Operation.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
    public String toString(){
       return String.valueOf(this.value);
    }
}
