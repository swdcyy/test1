package com.yxcorp.gateway.pay.webview.b$o;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import android.widget.ImageButton;
import android.widget.TextView;
import lv8.a;
import rv8.j;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.PayWebView;

public class b$o extends d	// class@00128d
{
    public final String e;
    public final b f;

    public void b$o(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       PayWebViewActivity mLeftTv;
       View$OnClickListener onClickListe;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$o.class, "1")) {
       }else {
          g.d("PayJsInject: setTopLeftBtn: params="+this.e);
          JsPageButtonParams mShow = p0.mShow;
          if (mShow == null) {
             mShow = Boolean.TRUE;
          }
          p0.mShow = mShow;
          int i = 4;
          if (mShow.booleanValue()) {
             if (p0.mIcon == null && TextUtils.isEmpty(p0.mText)) {
                p0.mIcon = JsPageButtonParams$Icon.BACK;
             }
             if (p0.mIcon != null) {
                this.f.a.mLeftBtn.setVisibility(0);
                this.f.a.mLeftTv.setVisibility(i);
                PayWebViewActivity mLeftBtn = this.f.a.mLeftBtn;
                if (mLeftBtn instanceof ImageButton) {
                   mLeftBtn.setImageResource(p0.mIcon.mIconId);
                }
             }else if(!TextUtils.isEmpty(p0.mText)){
                this.f.a.mLeftBtn.setVisibility(i);
                this.f.a.mLeftTv.setVisibility(0);
                b$o tf = this.f;
                tf.b.a(p0, tf.a.mLeftTv);
             }else {
                this.f.a.mLeftTv.setVisibility(i);
                this.f.a.mLeftBtn.setVisibility(i);
             }
             if (TextUtils.isEmpty(p0.mOnClick)) {
                mLeftTv = this.f.a.mLeftTv;
                onClickListe = null;
             }else {
                onClickListe = new j(this, p0);
                mLeftTv = this.f.a.mLeftTv;
             }
             mLeftTv.setOnClickListener(onClickListe);
             this.f.a.mLeftBtn.setOnClickListener(onClickListe);
          }else {
             this.f.a.mLeftTv.setVisibility(i);
             this.f.a.mLeftBtn.setVisibility(i);
          }
          this.f.a.mWebView.setJsSetTopLeftButton(true);
       }
       return;
    }
}
