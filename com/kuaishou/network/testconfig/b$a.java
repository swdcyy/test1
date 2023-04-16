package com.kuaishou.network.testconfig.b$a;
import android.view.View$OnClickListener;
import com.kuaishou.network.testconfig.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ao4.d;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import ao4.c;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import brd.t;
import com.kuaishou.network.testconfig.b$a$a;
import com.kuaishou.network.testconfig.b$a$b;
import erd.g;
import crd.b;

public class b$a implements View$OnClickListener	// class@000a3b
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       e.b(new d(RouteType.API, d.b), c.class).getInfo().subscribe(new b$a$a(this), new b$a$b(this));
       return;
    }
}
