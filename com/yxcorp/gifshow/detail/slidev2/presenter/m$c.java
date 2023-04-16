package com.yxcorp.gifshow.detail.slidev2.presenter.m$c;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9a.e;
import g9a.f;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import qvb.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import jta.c;
import r7a.f;

public class m$c extends a	// class@0019c6
{
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m$c.class, "2")) {
          return;
       }
       this.b.W8(false);
       this.b.s.setPressListener(objArray);
       Object[] objArray1 = new Object[false];
       o.C().w("NasaSpeedPlayPresenter", "¶µµ×»Ö¸´±¶ËÙ×´Ì¬"+this.b.w.getUserName(), objArray1);
       m$c tb = this.b;
       tb.C.b(tb.J);
       tb = this.b;
       tb.A.c(tb.I);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, m$c.class, "1")) {
          return;
       }
       m$c tb = this.b;
       tb.C.e(tb.J);
       tb = this.b;
       tb.A.a(tb.I);
       tb = this.b;
       tb.s.setPressListener(tb.H);
       this.b.R8();
       return;
    }
}
