package com.yxcorp.gifshow.util.a;
import androidx.recyclerview.widget.h$b;
import com.yxcorp.gifshow.util.ARecyclerAdapter$a;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.util.ARecyclerAdapter$e;
import com.yxcorp.gifshow.util.ARecyclerAdapter;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c;
import kotlin.jvm.internal.a;

public final class a extends h$b	// class@001f39
{
    public final ARecyclerAdapter$a a;
    public final List b;
    public final List c;

    public void a(ARecyclerAdapter$a p0,List p1,List p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(int p0,int p1){
       boolean b;
       ARecyclerAdapter$e uoe = this.b.get(p0);
       ARecyclerAdapter$e uoe1 = this.c.get(p1);
       ARecyclerAdapter$c uoc = this.a.b.f.get(uoe1.b());
       if (uoc != null) {
          this.a.b.J0(uoc);
          b = uoc.b(uoe.a(), uoe1.a());
       }else {
          b = true;
       }
       return b;
    }
    public boolean b(int p0,int p1){
       boolean b;
       ARecyclerAdapter$e uoe = this.b.get(p0);
       ARecyclerAdapter$e uoe1 = this.c.get(p1);
       if (uoe.b() != uoe1.b()) {
          return false;
       }
       ARecyclerAdapter$c uoc = this.a.b.f.get(uoe1.b());
       if (uoc != null) {
          this.a.b.J0(uoc);
          b = uoc.a(uoe.a(), uoe1.a());
       }else {
          b = a.g(uoe.a(), uoe1.a());
       }
       return b;
    }
    public Object c(int p0,int p1){
       Object obj;
       ARecyclerAdapter$e uoe = this.b.get(p0);
       ARecyclerAdapter$e uoe1 = this.c.get(p1);
       ARecyclerAdapter$c uoc = this.a.b.f.get(uoe1.b());
       if (uoc != null) {
          this.a.b.J0(uoc);
          obj = uoc.c(uoe.a(), uoe1.a());
       }else {
          obj = null;
       }
       return obj;
    }
    public int d(){
       return this.c.size();
    }
    public int e(){
       return this.b.size();
    }
}
