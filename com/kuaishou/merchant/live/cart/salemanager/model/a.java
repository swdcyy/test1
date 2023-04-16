package com.kuaishou.merchant.live.cart.salemanager.model.a;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity;

public final class a implements Comparator	// class@0019f6
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.mSequence - p1.mSequence);
    }
}
