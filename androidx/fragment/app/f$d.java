package androidx.fragment.app.f$d;
import java.lang.Runnable;
import k2.f;
import androidx.collection.ArrayMap;
import java.lang.Object;
import androidx.fragment.app.f$e;
import java.util.ArrayList;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.graphics.Rect;
import androidx.fragment.app.f;
import java.util.Collection;

public final class f$d implements Runnable	// class@0007ad
{
    public final f b;
    public final ArrayMap c;
    public final Object d;
    public final f$e e;
    public final ArrayList f;
    public final View g;
    public final Fragment h;
    public final Fragment i;
    public final boolean j;
    public final ArrayList k;
    public final Object l;
    public final Rect m;

    public void f$d(f p0,ArrayMap p1,Object p2,f$e p3,ArrayList p4,View p5,Fragment p6,Fragment p7,boolean p8,ArrayList p9,Object p10,Rect p11){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       this.m = p11;
       super();
    }
    public void run(){
       ArrayMap uArrayMap = f.h(this.b, this.c, this.d, this.e);
       if (uArrayMap != null) {
          this.f.addAll(uArrayMap.values());
          this.f.add(this.g);
       }
       f.f(this.h, this.i, this.j, uArrayMap, false);
       f$d td = this.d;
       if (td != null) {
          this.b.z(td, this.k, this.f);
          View view = f.t(uArrayMap, this.e, this.l, this.j);
          if (view != null) {
             this.b.k(view, this.m);
          }
       }
       return;
    }
}
