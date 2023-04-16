package com.yxcorp.gifshow.detail.slideplay.presenter.comment.d$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.component.tabs.panel.a;
import al9.a;
import lnc.u1;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import g7a.f0;
import java.lang.Runnable;
import ekd.k1;

public class d$a extends a	// class@001858
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d$a tb = this.b;
       tb.Y = false;
       tb.B.get().exitStayForComments();
       d x = this.b.X;
       if (x != null && x.g()) {
          this.b.X.b();
       }
       this.b.G.V0();
       u1.b(this.b);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       tb.Y = true;
       u1.a(tb);
       if (this.b.E.getDetailDanmakuParam().openDanmakuPanel != null) {
          tb = this.b;
          tb.T = 7;
          tb.E.getDetailDanmakuParam().openDanmakuPanel = false;
       }else if(this.b.E.getDetailCommonParam().getComment() == null){
          return;
       }else {
          tb = this.b;
          if (tb.S8(tb.E.getDetailCommonParam())) {
             return;
          }
       }
       k1.r(new f0(this), 100);
       this.b.Z = false;
       return;
    }
    public void k1(){
    }
}
