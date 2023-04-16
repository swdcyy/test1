package com.yxcorp.gifshow.ad.webview.n$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.webview.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Intent;
import r59.a;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;

public class n$a implements Runnable	// class@00190c
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void run(){
       String str1;
       n$a tb1;
       if (PatchProxy.applyVoid(null, this, n$a.class, "1")) {
          return;
       }
       n$a tb = this.b;
       if (tb.v != null && tb.getActivity() != null) {
          if (!TextUtils.x(this.b.s)) {
             String str = ":";
             if ((this.b.s).contains(str) && (this.b.s).indexOf(str) <= (this.b.s).length()) {
                n s = this.b.s;
                str1 = s.substring(0, s.indexOf(str));
             label_0050 :
                this.b.v.addFlags(0x10000000);
                a.a(str1, this.b.v);
                this.b.getActivity().startActivity(this.b.v);
                tb1 = this.b;
                tb1.Y8(tb1.s, str1);
                this.b.R8();
             }
          }
          str1 = "";
          goto label_0050 ;
       }else {
          tb1 = this.b;
          d.a(-1694791652).bC(tb1.p, tb1.s, "2");
       }
       return;
    }
}
