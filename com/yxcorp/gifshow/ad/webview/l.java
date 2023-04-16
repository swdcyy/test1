package com.yxcorp.gifshow.ad.webview.l;
import com.yxcorp.gifshow.webview.view.c;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.app.Activity;
import k59.d1;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.TextView;
import lnc.a1;
import android.text.TextUtils$TruncateAt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.webview.k;
import lnc.c3$a;
import lnc.c3;

public class l extends c	// class@00190a
{
    public EmojiTextView A;

    public void l(View p0,String p1){
       super(p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.A = m1.f(p0, 0x7f0a3f7b);
       return;
    }
    public void u(Activity p0){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       super.u(p0);
       c tk = this.k;
       int i = 1;
       if (tk != null) {
          tk.setOnClickListener(new d1(this));
          tk = this.k;
          if (tk instanceof ImageButton) {
             tk.setImageResource(R.drawable.arg_RES_7f0800cb);
          }
          this.k.setVisibility(8);
          layoutParams = this.k.getLayoutParams();
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             layoutParams.addRule(i, R.id.left_btn);
          }
          tk = this.i;
          if (tk instanceof ImageButton) {
             tk.setImageResource(R.drawable.arg_RES_7f0800c8);
          }
       }
       l tA = this.A;
       if (tA != null) {
          layoutParams = tA.getLayoutParams();
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             layoutParams.removeRule(0);
             layoutParams.removeRule(i);
          }
          this.A.setPadding(a1.e(100.00f), 0, a1.e(100.00f), 0);
          this.A.setEllipsize(TextUtils$TruncateAt.END);
       }
       return;
    }
    public boolean v(){
       c obj = PatchProxy.apply(null, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void w(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       c3.c(this.k, new k(p0));
       return;
    }
    public void x(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "3")) {
          return;
       }
       c tk = this.k;
       if (tk != null && tk instanceof ImageButton) {
          if (p0) {
             tk.setVisibility(0);
          }else {
             tk.setVisibility(8);
          }
       }
       return;
    }
}
