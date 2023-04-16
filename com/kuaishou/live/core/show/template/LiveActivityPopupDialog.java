package com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import hl2.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import android.widget.ImageView;
import lnc.a1;
import hc.b;
import com.kuaishou.live.common.core.basic.tools.l;

public class LiveActivityPopupDialog extends LiveSafeDialogFragment	// class@001175
{
    public int A;
    public View$OnClickListener B;
    public View s;
    public KwaiImageView t;
    public KwaiImageView u;
    public Dialog v;
    public CDNUrl[] w;
    public CDNUrl[] x;
    public int y;
    public int z;
    public static final int C;

    public void LiveActivityPopupDialog(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityPopupDialog.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       this.v = uDialog;
       uDialog.getWindow().setGravity(17);
       this.v.getWindow().requestFeature(1);
       this.v.getWindow().setDimAmount(0x3f000000);
       this.v.getWindow().setBackgroundDrawableResource(R.color.arg_RES_7f062030);
       return this.v;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveActivityPopupDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d09a2, p1, false);
       if (!PatchProxy.applyVoidOneRefs(view, this, LiveActivityPopupDialog.class, "6")) {
          this.s = m1.f(view, 0x7f0a182d);
          this.t = m1.f(view, 0x7f0a182c);
          this.s.setOnClickListener(new d(this));
          this.u = m1.f(view, 0x7f0a1825);
       }
       return view;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveActivityPopupDialog.class, "8")) {
          return;
       }
       super.onResume();
       this.v.getWindow().setLayout(-1, -1);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityPopupDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t.U(this.w);
       if (!PatchProxy.applyVoid(null, this, LiveActivityPopupDialog.class, "9") && !j.h(this.x)) {
          LiveActivityPopupDialog tu = this.u;
          if (tu != null) {
             tu.setTranslationX((tu.getTranslationX() + (float)a1.e((float)this.y)));
             tu = this.u;
             tu.setTranslationY((tu.getTranslationY() + (float)a1.e((float)this.z)));
             l.c(this.u, this.x, this.A, null);
          }
       }
       return;
    }
    public void wh(View$OnClickListener p0){
       this.B = p0;
    }
}
