package com.kuaishou.live.gzone.treasurebox.a;
import h9c.i;
import s53.d;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.a$b;
import android.view.ViewGroup;
import h9c.i$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.gzone.treasurebox.a$c;

public class a extends i	// class@001c57
{
    public a$b g;
    public boolean h;
    public boolean i;

    public void a(d p0,a p1){
       super();
       a$b uob = new a$b();
       this.g = uob;
       this.h = true;
       this.i = true;
       uob.b = p0;
       uob.c = p1;
    }
    public i$a R0(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new a$c());
       return new i$a(a.i(p0, 0x7f0d0e2a), obj, this.g);
    }
}
