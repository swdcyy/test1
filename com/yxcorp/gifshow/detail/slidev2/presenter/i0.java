package com.yxcorp.gifshow.detail.slidev2.presenter.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.y2;
import com.yxcorp.gifshow.detail.slidev2.presenter.i0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wd5.s;
import zd5.e;
import java.util.Objects;
import kotlin.jvm.internal.a;
import zd5.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import java.lang.Math;
import lnc.i3;
import java.lang.Integer;
import k2b.u1;

public class i0 extends PresenterV2	// class@0019bd
{
    public f p;
    public BaseFragment q;
    public QPhoto r;
    public boolean s;
    public SlidePlayViewModel t;
    public int u;
    public boolean v;
    public final Runnable w;
    public final a x;

    public void i0(){
       super();
       this.w = new y2(this);
       this.x = new i0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.r0(this.q, this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "3")) {
          return;
       }
       this.t.q0(this.q, this.x);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0.class, "4")) {
          return;
       }
       if (this.p.get() != null && this.s == null) {
          s.b(this.r, this.p.get().getPlayerEventSessionId(), this.q, this.u, this.v);
          e a = e.a;
          i0 tr = this.r;
          String playerEventS = this.p.get().getPlayerEventSessionId();
          i0 tq = this.q;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(tr, playerEventS, tq, a, e.class, "1")) {
             a.p(tq, "fragment");
             i3 obj = PatchProxy.apply(objArray, objArray, h.class, "3");
             double d = (obj != PatchProxyResult.class)? obj.doubleValue(): a.t().getValue("detailPhotoPlayBeginEventRatio", Double.TYPE, Double.valueOf(0xbff0000000000000)).doubleValue();
             if (Math.random() - d <= 0 && tr != null) {
                obj = i3.f();
                obj.d("photo_id", tr.getPhotoId());
                obj.d("watch_id", playerEventS);
                obj.d("page", tq.o());
                obj.d("exp_tag", tr.getExpTag());
                obj.c("photo_type", Integer.valueOf(tr.getType()));
                String str = obj.e();
                u1.R("DETAIL_PHOTO_PLAY_BEGIN_EVENT", str, 14);
             }
          }
       label_00ca :
          this.s = true;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.p = this.x8("DETAIL_LOGGER");
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(QPhoto.class);
       return;
    }
}
