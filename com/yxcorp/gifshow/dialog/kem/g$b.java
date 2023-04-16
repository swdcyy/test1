package com.yxcorp.gifshow.dialog.kem.g$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemCommonDialogResponse;
import android.graphics.Bitmap;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i2b.a;
import x9a.v;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.lang.Math;
import com.yxcorp.gifshow.dialog.kem.g$b$a;
import o07.n;

public class g$b implements PopupInterface$f	// class@001ab7
{
    public final boolean b;
    public Activity c;
    public KemCommonDialogResponse d;
    public Bitmap e;
    public static final int f;

    static {
       g$b.f = a1.e(19.00f);
    }
    public void g$b(Activity p0,KemCommonDialogResponse p1,Bitmap p2){
       super();
       this.b = a.t().d("kem_dialog_allow_3party_link", false);
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g$b.class, "1");
       if (p3 != patchProxyRe) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d05bf, p2, false);
       view.findViewById(R.id.close_btn).setOnClickListener(new v(p0));
       ImageView imageView = view.findViewById(R.id.image_content_view);
       g$b uob = g$b.class;
       if (!PatchProxy.applyVoidOneRefs(imageView, this, uob, "2")) {
          int width = this.e.getWidth();
          int height = this.e.getHeight();
          ViewGroup$LayoutParams layoutParams = imageView.getLayoutParams();
          uob = PatchProxy.apply(null, this, uob, "3");
          if (uob != patchProxyRe) {
             i = uob.intValue();
          }else {
             i = n.k(this.c);
             if (!i) {
                i = n.x(this.c);
             }
          }
          i = Math.min(width, (i - (g$b.f * 2)));
          layoutParams.width = i;
          layoutParams.height = (int)(((float)height / (float)width) * (float)i);
          imageView.setLayoutParams(layoutParams);
       }
       imageView.setImageBitmap(this.e);
       imageView.setOnClickListener(new g$b$a(this, p0));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
