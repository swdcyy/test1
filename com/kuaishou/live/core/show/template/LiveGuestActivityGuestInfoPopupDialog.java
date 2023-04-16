package com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import b61.b;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog$b;
import ekd.j;
import android.widget.ImageView;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import hc.b;
import com.kuaishou.live.common.core.basic.tools.l;

public class LiveGuestActivityGuestInfoPopupDialog extends LiveSafeDialogFragment implements d	// class@001178
{
    public j A;
    public CDNUrl[] B;
    public KwaiImageView C;
    public int D;
    public int E;
    public int F;
    public KwaiImageView s;
    public LiveUserView t;
    public TextView u;
    public TextView v;
    public UserInfo w;
    public String x;
    public boolean y;
    public Drawable z;
    public static final int G;

    public void LiveGuestActivityGuestInfoPopupDialog(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGuestActivityGuestInfoPopupDialog.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1d9d);
       this.t = m1.f(p0, 0x7f0a1d9b);
       this.u = m1.f(p0, 0x7f0a1d9c);
       this.v = m1.f(p0, 0x7f0a1d9a);
       this.C = m1.f(p0, 0x7f0a1825);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGuestActivityGuestInfoPopupDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(true);
       uDialog.setCancelable(true);
       Window window = uDialog.getWindow();
       window.setBackgroundDrawableResource(R.color.arg_RES_7f06202f);
       window.requestFeature(true);
       window.setGravity(17);
       window.setDimAmount(0x3f000000);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGuestActivityGuestInfoPopupDialog.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0b50, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGuestActivityGuestInfoPopupDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveGuestActivityGuestInfoPopupDialog tz = this.z;
       if (tz != null) {
          this.s.setImageDrawable(tz);
       }else {
          this.s.setImageResource(R.drawable.arg_RES_7f0811f6);
       }
       p0.setOnClickListener(new LiveGuestActivityGuestInfoPopupDialog$a(this));
       boolean b = false;
       this.t.p0(this.w, HeadImageSize.ADJUST_MIDDLE, b);
       this.u.setText(b.c(this.w));
       LiveGuestActivityGuestInfoPopupDialog tv = this.v;
       if (this.y == null) {
          b = 8;
       }
       tv.setVisibility(b);
       if (!this.v.getVisibility()) {
          this.v.setOnClickListener(new LiveGuestActivityGuestInfoPopupDialog$b(this));
       }
       if (!PatchProxy.applyVoid(null, this, LiveGuestActivityGuestInfoPopupDialog.class, "6") && !j.h(this.B)) {
          tv = this.C;
          if (tv != null) {
             tv.setTranslationX((tv.getTranslationX() + (float)a1.e((float)this.D)));
             tv = this.C;
             tv.setTranslationY((tv.getTranslationY() + (float)a1.e((float)this.E)));
             l.c(this.C, this.B, this.F, null);
          }
       }
       return;
    }
}
