package com.yxcorp.gifshow.detail.slidev2.presenter.d$a;
import y8c.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.presenter.d$b;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.Lists;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.a;
import ml8.c;

public class d$a extends g	// class@0018f3
{
    public final d$b w;

    public void d$a(QPhoto p0){
       super();
       d$b uob = new d$b();
       this.w = uob;
       uob.b = p0;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w};
       return Lists.e(obj);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new a());
       return new f(a.i(p0, 0x7f0d07e5), obj);
    }
}
