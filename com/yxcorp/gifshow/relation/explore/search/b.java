package com.yxcorp.gifshow.relation.explore.search.b;
import y8c.g;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import nu7.a;
import ok.h;
import ekd.j;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.search.i;
import nu7.d;
import android.view.View;
import i2b.a;
import ml8.c;

public class b extends g	// class@001875
{
    public ArrayList w;

    public void b(){
       super();
    }
    public ArrayList a1(int p0,f p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.w == null) {
          Object[] objArray = new Object[]{new c("AUTO_ALIAS_CALLER_CONTEXT", new a(1, null))};
          this.w = j.a(objArray);
       }
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.add(new i());
       obj.add(new d());
       return new f(a.i(p0, 0x7f0d0409), obj);
    }
}
