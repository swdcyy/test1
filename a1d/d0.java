package a1d.d0;
import erd.c;
import a1d.h0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import a1d.c0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.http.response.AuthInfoResponse$AgreementInfo;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.login.http.response.AuthInfoResponse$Agreement;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import a1d.h0$a;
import w0d.g;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public final class d0 implements c	// class@00001c
{
    public final h0 a;

    public void d0(h0 p0){
       this.a = p0;
    }
    public final Object a(Object p0,Object p1){
       AuthInfoResponse$AgreementInfo mCaption;
       Iterator iterator;
       int i4;
       String str;
       SpannableString spannableStr;
       Iterator iterator1;
       AuthInfoResponse$Agreement uAgreement;
       AuthInfoResponse$Agreement mAgreementNa;
       int i5;
       h0$a uoa;
       d0 ta = this.a;
       Objects.requireNonNull(ta);
       h0 oh0 = h0.class;
       c0 uoc0 = PatchProxy.apply(null, ta, oh0, "5");
       if (uoc0 != PatchProxyResult.class) {
       }else {
          uoc0 = new c0(ta);
       }
       Object obj = uoc0;
       int i = p0.intValue();
       int i1 = p1.intValue();
       if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidThreeRefs(obj, Integer.valueOf(i), Integer.valueOf(i1), ta, h0.class, "6")) {
          Activity activity = ta.getActivity();
          h0 p = ta.p;
          int i2 = 1;
          int i3 = 4;
          if (PatchProxy.isSupport(oh0)) {
             Object[] objArray = new Object[]{activity,Integer.valueOf(i),Integer.valueOf(i1),obj,p};
             if (!PatchProxy.applyVoid(objArray, ta, oh0, "7")) {
             }
          }else {
          }
       }
    label_00fb :
       return null;
    }
}
