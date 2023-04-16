package com.kuaishou.live.common.core.basic.widget.h;
import ml8.d;
import android.app.Dialog;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import ya1.g0;
import android.view.View$OnClickListener;
import ya1.h0;
import android.os.Bundle;
import android.view.Window;
import java.lang.CharSequence;
import android.text.TextUtils;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class h extends Dialog implements d	// class@000f3e
{
    public final h$a b;
    public TextView c;
    public TextView d;
    public KwaiImageView e;

    public void h(Context p0,h$a p1){
       super(p0, 0x7f110362);
       this.b = p1;
    }
    public static h$a a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h$a(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a3f7b);
       this.d = m1.f(p0, 0x7f0a0962);
       this.e = m1.f(p0, 0x7f0a03a4);
       m1.a(p0, new g0(this), R.id.close_btn);
       m1.a(p0, new h0(this), R.id.bind_btn);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0104);
       this.doBindView(this.getWindow().getDecorView());
       h tb = this.b;
       h$a b = tb.b;
       if (b != null) {
          this.c.setText(b);
       }else if(!TextUtils.isEmpty(tb.c)){
          this.c.setText(this.b.c);
       }else {
          this.c.setVisibility(8);
       }
       tb = this.b;
       b = tb.d;
       if (b != null) {
          this.d.setText(b);
       }else {
          h$a e = tb.e;
          if (e != null) {
             this.d.setText(e);
          }else {
             this.d.setVisibility(8);
          }
       }
       this.e.L(c0.a.b("/udata/pkg/kwai-client-image/live_bind_phone/local_bind_phone_icon.webp"));
       this.setCancelable(false);
       this.setCanceledOnTouchOutside(false);
       return;
    }
}
