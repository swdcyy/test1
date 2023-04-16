package com.kuaishou.merchant.base.rmc.e;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kuaishou.merchant.base.rmc.c;
import erd.r;
import brd.t;
import com.kuaishou.merchant.base.rmc.b;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class e	// class@001585
{
    public final PublishSubject a;
    public b b;
    public b c;
    public long d;

    public void e(){
       super();
       this.a = PublishSubject.g();
       this.d = 2000;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b9.a(this.b);
       this.b = this.a.filter(c.b).subscribe(new b(this), Functions.d());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       b9.a(this.b);
       b9.a(this.c);
       return;
    }
}
