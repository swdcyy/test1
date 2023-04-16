package com.yxcorp.login.bind.presenter.d0;
import erd.h;
import com.yxcorp.login.bind.presenter.e0;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import e1d.q0;
import v0d.g;
import android.text.SpannableString;
import java.lang.CharSequence;
import z2d.f;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import lnc.u0;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public final class d0 implements h	// class@001a6a
{
    public final e0 a;

    public void d0(e0 p0){
       this.a = p0;
    }
    public final Object a(Object p0,Object p1,Object p2){
       Object[] objArray;
       d0 ta = this.a;
       Context context = ta.getContext();
       int i = p0.intValue();
       int i1 = p1.intValue();
       e0 p = ta.p;
       q0 oq0 = PatchProxy.apply(null, ta, e0.class, "4");
       if (oq0 != PatchProxyResult.class) {
       }else {
          oq0 = new q0(ta);
       }
       g og = g.class;
       int i2 = 1;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[]{context,p2,Integer.valueOf(i),Integer.valueOf(i1),p,oq0};
          if (PatchProxy.applyVoid(objArray, null, og, "3")) {
          label_00a3 :
             return null;
          }
       }
       objArray = new Object[i2];
       objArray[0] = p2;
       String str = context.getString(R.string.arg_RES_7f1003aa, objArray);
       SpannableString spannableStr = new SpannableString(str);
       u0 ou0 = new u0(KwaiWebViewActivity.N3(context, f.k(context)).o("ks://protocol").a(), i);
       i = str.indexOf(p2);
       if (i >= 0) {
          spannableStr.setSpan(ou0, i, (p2.length() + i), 33);
       }
       p.setOnClickListener(oq0);
       p.setTextColor(i1);
       p.setText(spannableStr);
       p.setHighlightColor(0);
       p.setMovementMethod(LinkMovementMethod.getInstance());
       goto label_00a3 ;
    }
}
