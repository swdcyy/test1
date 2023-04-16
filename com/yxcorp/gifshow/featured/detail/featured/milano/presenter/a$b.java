package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a$b;
import df5.d;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import aoc.a;

public class a$b implements d	// class@000f31
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a$b ta = this.a;
       ta.R8(ta.t.b(), p1);
       ta = this.a;
       a u = ta.u;
       if (u != null) {
          ta.R8(u.b(), p1);
       }
       ta = this.a;
       u = ta.v;
       if (u != null) {
          ta.R8(u.b(), p1);
       }
       ta = this.a;
       u = ta.w;
       if (u != null) {
          ta.R8(u.b(), p1);
       }
       return;
    }
}
