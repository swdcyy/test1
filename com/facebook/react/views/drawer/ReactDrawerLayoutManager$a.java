package com.facebook.react.views.drawer.ReactDrawerLayoutManager$a;
import androidx.drawerlayout.widget.DrawerLayout$d;
import androidx.drawerlayout.widget.DrawerLayout;
import df.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import of.a;
import android.view.ViewGroup;
import df.b;
import of.b;
import java.lang.Integer;
import of.d;
import java.lang.Float;
import of.c;

public class ReactDrawerLayoutManager$a implements DrawerLayout$d	// class@0013b6
{
    public final DrawerLayout a;
    public final c b;

    public void ReactDrawerLayoutManager$a(DrawerLayout p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactDrawerLayoutManager$a.class, "3")) {
          return;
       }
       this.b.c(new a(this.a.getId()));
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactDrawerLayoutManager$a.class, "2")) {
          return;
       }
       this.b.c(new b(this.a.getId()));
       return;
    }
    public void c(int p0){
       ReactDrawerLayoutManager$a uoa = ReactDrawerLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.b.c(new d(this.a.getId(), p0));
       return;
    }
    public void d(View p0,float p1){
       ReactDrawerLayoutManager$a uoa = ReactDrawerLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.c(new c(this.a.getId(), p1));
       return;
    }
}
