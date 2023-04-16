package com.yxcorp.gifshow.detail.slidev2.presenter.feature.m$a;
import qw6.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rkd.b;
import k2b.j2;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class m$a extends b	// class@0019aa
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "1")) {
          return;
       }
       m$a tb = this.b;
       tb.s = tb.q.getCurrentPhoto();
       if (this.b.s != null && b.e()) {
          tb = this.b;
          if (tb.t != null) {
             tb.t = false;
             tb.r.c(tb.s);
          }
          tb = this.b;
          tb.r.e(tb.s.getPhotoId());
          Log.b("PadLandScapeLogPresenter", "willAppear="+this.b.s.getCaption());
       }
       return;
    }
}
