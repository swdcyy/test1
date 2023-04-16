package com.google.common.graph.Traverser$Order;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Traverser$Order extends Enum	// class@0018d8
{
    public static final Traverser$Order[] $VALUES;
    public static final Traverser$Order POSTORDER;
    public static final Traverser$Order PREORDER;

    static {
       Traverser$Order order = new Traverser$Order("PREORDER", 0);
       Traverser$Order.PREORDER = order;
       Traverser$Order order1 = new Traverser$Order("POSTORDER", 1);
       Traverser$Order.POSTORDER = order1;
       Traverser$Order[] orderArray = new Traverser$Order[]{order,order1};
       Traverser$Order.$VALUES = orderArray;
    }
    public void Traverser$Order(String p0,int p1){
       super(p0, p1);
    }
    public static Traverser$Order valueOf(String p0){
       return Enum.valueOf(Traverser$Order.class, p0);
    }
    public static Traverser$Order[] values(){
       return Traverser$Order.$VALUES.clone();
    }
}
