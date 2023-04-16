package com.yxcorp.gifshow.relation.user.adapter.d;
import com.yxcorp.gifshow.relation.user.adapter.e;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.w;
import ecc.m;
import ecc.d0;
import nu7.d;
import ml8.c;

public class d extends e	// class@0019ed
{

    public void d(e$b p0){
       super(p0);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d094f);
       obj = new PresenterV2();
       obj.U7(new w());
       obj.U7(new m(this));
       obj.U7(new d0());
       if (this.y != null) {
          obj.U7(new d());
       }
       return new f(view, obj);
    }
}
