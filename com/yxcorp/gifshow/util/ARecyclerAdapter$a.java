package com.yxcorp.gifshow.util.ARecyclerAdapter$a;
import com.yxcorp.gifshow.util.ARecyclerAdapter;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.util.a;
import java.util.List;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vsd.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.util.ARecyclerAdapter$e;

public final class ARecyclerAdapter$a	// class@001ec1
{
    public final ArrayList a;
    public final ARecyclerAdapter b;

    public void ARecyclerAdapter$a(ARecyclerAdapter p0){
       this.b = p0;
       super();
       this.a = new ArrayList(p0.h);
    }
    public static void c(ARecyclerAdapter$a p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p3 = p0.a;
       p0.b.h.clear();
       p0.b.h.addAll(p3);
       h.c(new a(p0, new ArrayList(p0.b.h), p3), p1).d(p0.b);
       return;
    }
    public final ARecyclerAdapter$a a(d p0,Object p1){
       a.p(p0, "holder");
       Integer integer = this.b.L0(p0);
       if (integer != null) {
          this.a.add(new ARecyclerAdapter$e(integer.intValue(), p1));
       }
       return this;
    }
    public final ARecyclerAdapter$a b(){
       this.a.clear();
       return this;
    }
}
