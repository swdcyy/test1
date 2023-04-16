package com.kuaishou.live.common.core.component.follow.a;
import ml8.d;
import android.app.Dialog;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import java.lang.String;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import android.widget.Button;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import pg1.a;
import pg1.c;
import pg1.b;
import android.os.Bundle;
import android.view.Window;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a extends Dialog implements d	// class@0010ff
{
    public ImageView b;
    public Button c;
    public Button d;
    public TextView e;
    public KwaiImageView f;
    public final String g;
    public String h;
    public String i;
    public View$OnClickListener j;
    public View$OnClickListener k;
    public View$OnClickListener l;
    public User m;
    public HeadImageSize n;

    public void a(Context p0,User p1,HeadImageSize p2,String p3){
       super(p0, 0x7f110362);
       this.m = p1;
       this.n = p2;
       this.g = p3;
    }
    public void a(Context p0,User p1,HeadImageSize p2,String p3,String p4,String p5){
       super(p0, 0x7f110362);
       this.m = p1;
       this.n = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
    }
    public void a(View$OnClickListener p0){
       this.k = p0;
    }
    public void b(View$OnClickListener p0){
       this.j = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a0a92);
       this.c = m1.f(p0, 0x7f0a0f4c);
       this.d = m1.f(p0, 0x7f0a0da3);
       this.f = m1.f(p0, 0x7f0a0333);
       this.b = m1.f(p0, 0x7f0a0785);
       m1.a(p0, new a(this), R.id.follow_btn);
       m1.a(p0, new c(this), R.id.close_btn);
       m1.a(p0, new b(this), R.id.exit_btn);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0454);
       this.doBindView(this.getWindow().getDecorView());
       this.setCancelable(false);
       a tm = this.m;
       if (tm != null) {
          a tn = this.n;
          if (tn != null) {
             g.b(this.f, tm, tn);
          }
       }
       if (!TextUtils.x(this.g)) {
          this.e.setText(this.g);
       }
       if (!TextUtils.x(this.h)) {
          this.c.setText(this.h);
       }
       if (!TextUtils.x(this.i)) {
          this.d.setText(this.i);
       }
       return;
    }
}
