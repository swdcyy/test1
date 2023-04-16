package com.yxcorp.gifshow.webview.bridge.a$a;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.util.ArrayList;
import com.yxcorp.gifshow.webview.bridge.a$a$a;
import com.yxcorp.gifshow.webview.bridge.a$a$b;
import com.yxcorp.gifshow.webview.bridge.a$a$c;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsDialogParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import java.lang.CharSequence;
import java.util.List;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsDialogParams$DialogButton;
import vxc.m;
import u07.x;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import vxc.k;
import u07.u;
import vxc.l;

public class a$a extends z	// class@00170d
{
    public List k;
    public u l;
    public u m;
    public u n;
    public final a o;

    public void a$a(a p0,Activity p1,WebView p2){
       this.o = p0;
       super(p1, p2);
       this.k = new ArrayList(3);
       this.l = new a$a$a(this);
       this.m = new a$a$b(this);
       this.n = new a$a$c(this);
    }
    public void i(Serializable p0){
       JsDialogParams$DialogButton mText;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          t$a uoa = new t$a(this.o.a);
          uoa.X0(p0.mTitle);
          uoa.z0(p0.mContent);
          JsDialogParams mPositiveBut = p0.mPositiveButton;
          if (mPositiveBut != null) {
             this.k.add(mPositiveBut);
          }
          mPositiveBut = p0.mNeutralButton;
          if (mPositiveBut != null) {
             this.k.add(mPositiveBut);
          }
          mPositiveBut = p0.mNegativeButton;
          if (mPositiveBut != null) {
             this.k.add(mPositiveBut);
          }
          int i = 3;
          if (this.k.size() == i) {
             CharSequence[] uCharSequenc = new CharSequence[i];
             uCharSequenc[0] = p0.mPositiveButton.mText;
             uCharSequenc[1] = p0.mNeutralButton.mText;
             uCharSequenc[2] = p0.mNegativeButton.mText;
             uoa.P0(uCharSequenc);
             uoa.U0(0);
             uoa.M0(new m(this));
             uoa.v(1);
             j.c(uoa);
          }else {
             JsDialogParams$DialogButton uDialogButto = null;
             if (this.k.size() == 2) {
                uDialogButto = this.k.get(0).mText;
                mText = this.k.get(1).mText;
             }else if(this.k.size() == 1){
                uDialogButto = this.k.get(0).mText;
                mText = uDialogButto;
             }else {
                mText = uDialogButto;
             }
             uoa.T0(uDialogButto);
             uoa.R0(mText);
             uoa.u0(new k(this));
             uoa.t0(new l(this));
             uoa.v(1);
             j.d(uoa);
          }
       }
       return;
    }
}
