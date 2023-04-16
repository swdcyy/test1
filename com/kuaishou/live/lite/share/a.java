package com.kuaishou.live.lite.share.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.sidebar.e;
import or5.d;
import z1.k;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.lite.share.a$b;
import dd3.b;
import java.lang.Class;
import ok.x;
import va1.g0;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.lite.share.h;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.lite.sidebar.c;
import dd3.a;
import android.view.View$OnClickListener;
import vq5.d;
import dd3.c;
import vq5.b;
import com.kuaishou.live.lite.sidebar.e$a;

public class a extends ViewController	// class@000b13
{
    public final ViewModelProvider j;
    public final e k;
    public final d l;
    public final k m;
    public final h n;
    public c o;
    public final k p;

    public void a(e p0,d p1,k p2,k p3){
       super();
       this.j = new ViewModelProvider(this.getViewModelStore(), g0.a(a$b.class, new b(this)));
       this.k = p0;
       this.l = p1;
       this.n = new h(p1);
       this.m = p2;
       this.p = p3;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a$b uob = this.j.get(a$b.class);
       c uoc = new c(4, "SHARE");
       this.o = uoc;
       uoc.n(new a(uob));
       c uoc1 = new c(uob);
       this.p.get().t5("sharepanel", uoc1);
       this.k.b(this.o);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a to = this.o;
       if (to != null) {
          to.m();
       }
       this.p.get().Z4("sharepanel");
       return;
    }
}
