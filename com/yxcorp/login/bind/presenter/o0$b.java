package com.yxcorp.login.bind.presenter.o0$b;
import y8c.g;
import com.yxcorp.login.bind.presenter.o0;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.login.bind.presenter.o0$a;
import ml8.c;

public class o0$b extends g	// class@001a8e
{
    public final o0 w;

    public void o0$b(o0 p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       o0$b uob = o0$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d096a), new o0$a(this.w));
    }
}
