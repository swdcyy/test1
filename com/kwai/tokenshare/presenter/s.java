package com.kwai.tokenshare.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.l1;
import com.yxcorp.plugin.kwaitoken.model.OnePictureDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.t0;
import android.view.View$OnClickListener;
import fu7.s0;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;

public class s extends PresenterV2	// class@001950
{
    public KwaiImageView p;
    public OnePictureDialogInfo q;
    public KwaiTokenCustomPopUpDialog r;

    public void s(){
       super();
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "3")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "9") && (!this.getActivity().isFinishing() && l1.a())) {
          this.getActivity().setRequestedOrientation(1);
       }
    label_0034 :
       if (!TextUtils.x(this.q.mBigPicUrl)) {
          this.P8();
          this.p.L(this.q.mBigPicUrl);
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       this.p.setPlaceHolderImage(R.drawable.arg_RES_7f081a45);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3b16);
       m1.a(p0, new t0(this), R.id.spring_token_dialog_container);
       m1.a(p0, new s0(this), R.id.spring_token_dialog_close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.q8(OnePictureDialogInfo.class);
       this.r = this.q8(KwaiTokenCustomPopUpDialog.class);
       return;
    }
}
