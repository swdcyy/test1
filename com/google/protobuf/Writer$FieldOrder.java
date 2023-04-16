package com.google.protobuf.Writer$FieldOrder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Writer$FieldOrder extends Enum	// class@000502
{
    public static final Writer$FieldOrder[] $VALUES;
    public static final Writer$FieldOrder ASCENDING;
    public static final Writer$FieldOrder DESCENDING;

    static {
       Writer$FieldOrder uFieldOrder = new Writer$FieldOrder("ASCENDING", 0);
       Writer$FieldOrder.ASCENDING = uFieldOrder;
       Writer$FieldOrder uFieldOrder1 = new Writer$FieldOrder("DESCENDING", 1);
       Writer$FieldOrder.DESCENDING = uFieldOrder1;
       Writer$FieldOrder[] uFieldOrderA = new Writer$FieldOrder[]{uFieldOrder,uFieldOrder1};
       Writer$FieldOrder.$VALUES = uFieldOrderA;
    }
    public void Writer$FieldOrder(String p0,int p1){
       super(p0, p1);
    }
    public static Writer$FieldOrder valueOf(String p0){
       return Enum.valueOf(Writer$FieldOrder.class, p0);
    }
    public static Writer$FieldOrder[] values(){
       return Writer$FieldOrder.$VALUES.clone();
    }
}
