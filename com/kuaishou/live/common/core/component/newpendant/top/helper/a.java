package com.kuaishou.live.common.core.component.newpendant.top.helper.a;
import java.util.Comparator;
import java.lang.Object;
import ks5.m;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import java.lang.Integer;

public final class a implements Comparator	// class@0016ca
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Integer.compare(p0.o(), p1.o());
    }
}
