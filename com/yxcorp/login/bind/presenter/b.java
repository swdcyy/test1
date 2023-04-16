package com.yxcorp.login.bind.presenter.b;
import du5.g;
import com.yxcorp.login.bind.presenter.a;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import du5.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.b$a;
import du5.c;

public class b implements g	// class@001a67
{
    public final Activity a;
    public final String b;
    public final a c;

    public void b(a p0,Activity p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0){
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       p0.Dc(this.a, this.b, new b$a(this));
       return;
    }
}
