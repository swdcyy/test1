package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.i;
import rtc.b;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.widget.ProgressBar;
import brd.a0;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import itc.k3;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.f;
import android.view.View$OnClickListener;
import java.util.Set;
import x59.e$d;

public class i extends b	// class@0012a3
{
    public StickerDetailInfo t;
    public Set u;
    public e$d v;
    public KwaiImageView w;
    public DownloadProgressBar x;
    public TextView y;
    public static final int A;
    public static final int z;

    static {
       i.z = a1.e(65.00f);
       i.A = a1.e(195.00f);
    }
    public void i(){
       super();
    }
    public void E8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       this.y.setText(this.t.mStickerId);
       i = 0;
       if (PostExperimentUtils.j()) {
          this.y.setVisibility(i);
       }else {
          this.y.setVisibility(8);
       }
       this.x.setVisibility(8);
       this.X7(f0.i(this.t, objArray).R(Functions.d(), g.b));
       EditStickerBaseView uEditSticker = EditStickerBaseView.e(this.t.mRelatedClientId, this.p);
       if (uEditSticker == null) {
          this.w.y(R.drawable.arg_RES_7f08202e, i.z, i.z);
          return;
       }else {
          uEditSticker.setResourceFilePath(k3.s(this.t));
          int z = i.z;
          uEditSticker.setLayoutParams(new RelativeLayout$LayoutParams(z, z));
          float f = (float)z;
          uEditSticker.setScale((f / (float)i.A));
          b tp = this.p;
          if (!PatchProxy.applyVoidOneRefs(tp, this, oi, "4")) {
             while (i < tp.getChildCount()) {
                View childAt = tp.getChildAt(i);
                if (childAt instanceof EditStickerBaseView) {
                   tp.removeView(childAt);
                }
                i = i + 1;
             }
          }
          this.p.addView(uEditSticker);
          this.w.setVisibility(8);
          super.E8();
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.w = m1.f(p0, 0x7f0a3b63);
       this.x = m1.f(p0, 0x7f0a0c1a);
       m1.a(p0, new f(this), R.id.sticker_item_container);
       this.y = m1.f(p0, 0x7f0a3b6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("DATA");
       this.u = this.r8("ARG_STICKER_CLICK_LISTENER");
       this.v = this.t8("ARG_STICKER_SELECT_LISTENER");
       return;
    }
}
