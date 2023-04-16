package com.yxcorp.gifshow.ad.detail.presenter.side.c;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import lnc.a1;
import g19.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import android.view.View;
import g59.m;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.slide.play.detail.rightactionbar.follow.element.i;
import lnc.c3$a;
import lnc.c3;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import g19.n;

public class c extends l	// class@0016a8
{
    public CircleWithStrokeView S;
    public final Runnable T;
    public AvatarInfoResponse U;
    public static final float V;
    public static final float W;
    public static final float X;

    static {
       c.V = (float)a1.e(13.50f);
       c.W = (float)a1.e(19.00f);
       c.X = (float)a1.e(2.00f);
    }
    public void c(){
       super();
       this.T = new o(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.E8();
       if (this.S == null) {
          this.S = m.a(this.getActivity(), this.E, 0x7f0a2d73);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       this.R8();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       View[] viewArray = new View[]{this.S};
       n.Z(4, viewArray);
       l tr = this.r;
       if (tr != null) {
          tr.clearAnimation();
       }
       k1.m(this.T);
       c3.c(this.S, i.a);
       return;
    }
    public void X8(){
    }
    public void Z8(AvatarInfoResponse p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       super.Z8(p0);
       if (this.V8()) {
          return;
       }
       this.U = p0;
       l ol = 1;
       if (p0.mType == ol) {
          AvatarInfoResponse mDynamicEffe = p0.mDynamicEffectMarker;
          if (mDynamicEffe == null || mDynamicEffe.mIsBlocked == null) {
          label_0026 :
             View$OnClickListener onClickListe = null;
             if (ol) {
                if (this.s instanceof ImageView) {
                   this.a9();
                }
                Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "4");
                if (obj != PatchProxyResult.class) {
                   onClickListe = obj;
                }else if(p0.mPhoto == null){
                   onClickListe = new n(this, p0);
                }
                this.D = onClickListe;
                return;
             }else {
                this.R8();
                this.D = onClickListe;
                this.t.setVisibility(8);
                return;
             }
          }
       }
       ol = null;
       goto label_0026 ;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.s.setImageResource(R.drawable.arg_RES_7f081986);
       return;
    }
}
