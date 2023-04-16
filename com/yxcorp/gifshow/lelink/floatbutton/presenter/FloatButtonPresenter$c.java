package com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$c;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView$a;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import yza.f;

public final class FloatButtonPresenter$c implements FloatWindowView$a	// class@001a46
{
    public final FloatButtonPresenter a;

    public void FloatButtonPresenter$c(FloatButtonPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       FloatButtonPresenter$c uoc = FloatButtonPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.p, "onChangePosition: x="+p0+"  y="+p1, objArray);
       return;
    }
    public void b(int p0,int p1){
       FloatButtonPresenter$c uoc = FloatButtonPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.p, "onChangeSize: width= "+p0+"  height = "+p1, objArray);
       return;
    }
    public void onClick(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter$c.class, "1")) {
          return;
       }
       FloatButtonPresenter$c ta = this.a;
       if (ta.z == null) {
          ta.z = true;
       }
       FloatButtonPresenter s = ta.s;
       if (s == null) {
          a.S("mListener");
       }
       s.a(FloatButtonPresenter.P8(this.a));
       return;
    }
}
