package com.yxcorp.gifshow.detail.view.d;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$a;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;

public final class d implements Comparator	// class@001a75
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.b - p0.b);
    }
}
