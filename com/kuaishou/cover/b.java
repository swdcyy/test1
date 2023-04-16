package com.kuaishou.cover.b;
import com.kuaishou.cover.b$a;
import java.lang.Object;
import c30.b;
import z20.a;
import d30.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.cover.Link;
import androidx.fragment.app.FragmentActivity;
import android.content.ComponentName;
import android.app.Activity;

public class b	// class@0016d4
{
    public boolean a;
    public b b;
    public Map c;
    public a d;
    public a e;
    public String f;
    public String g;
    public boolean h;
    public int i;
    public boolean j;
    public a k;

    public void b(b$a p0){
       super();
       this.a = p0.e;
       this.b = p0.a;
       this.c = p0.b;
       this.d = p0.c;
       this.e = p0.d;
       this.k = p0.f;
    }
    public b a(){
       return this.b;
    }
    public a b(){
       return this.k;
    }
    public a c(){
       return this.e;
    }
    public void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.h = p0;
       if (!p0 && (Link.h().k() != null && Link.h().k().getComponentName() != null)) {
          this.g = Link.h().k().getComponentName().getClassName();
       }
    label_0043 :
       return;
    }
    public void e(boolean p0){
       this.j = p0;
    }
}
