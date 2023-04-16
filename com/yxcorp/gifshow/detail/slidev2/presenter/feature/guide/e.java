package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jta.c;
import r7a.f;
import android.app.Activity;
import h9a.a;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import rf5.u;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;

public class e extends PresenterV2	// class@00198c
{
    public u p;
    public f q;
    public f r;
    public QPhoto s;
    public boolean t;
    public f u;
    public boolean v;
    public a w;
    public final c x;
    public final PopupInterface$h y;

    public void e(){
       super();
       this.x = new e$a(this);
       this.y = new e$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.u.a(this.x);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          this.w = new a(activity);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.P8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.u.c(this.x);
       return;
    }
    public void P8(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "8")) {
          return;
       }
       e tw = this.w;
       if (tw != null && this.v == null) {
          Objects.requireNonNull(tw);
          if (!PatchProxy.applyVoid(objArray, tw, a.class, "2")) {
             a = tw.a;
             if (a != null) {
                a.o();
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(u.class);
       this.q = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.r = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("IS_DETAIL_FORM_PROFILE").booleanValue();
       this.u = this.r8("NASA_SIDEBAR_STATUS");
       return;
    }
}
