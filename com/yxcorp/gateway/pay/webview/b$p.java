package com.yxcorp.gateway.pay.webview.b$p;
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
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import lv8.a;
import com.yxcorp.gateway.pay.webview.g;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.PayWebView;

public class b$p extends d	// class@00128e
{
    public final String e;
    public final b f;

    public void b$p(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       PayWebViewActivity mRightTv;
       View$OnClickListener onClickListe;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$p.class, "1")) {
       }else {
          g.d("PayJsInject: setTopRightBtn: params="+this.e);
          JsPageButtonParams mShow = p0.mShow;
          int i = 4;
          if (mShow != null && mShow.booleanValue()) {
             mShow = p0.mIcon;
             if (mShow != null && JsPageButtonParams$Icon.DEFAULT != mShow) {
                this.f.a.mRightBtn.setVisibility(0);
                this.f.a.mRightTv.setVisibility(i);
                this.f.a.mRightBtn.setImageResource(p0.mIcon.mIconId);
             }else if(!TextUtils.isEmpty(p0.mText)){
                this.f.a.mRightBtn.setVisibility(i);
                this.f.a.mRightTv.setVisibility(0);
                b$p tf = this.f;
                tf.b.a(p0, tf.a.mRightTv);
             }else {
                this.f.a.mRightTv.setVisibility(i);
                this.f.a.mRightBtn.setVisibility(i);
             }
             if (TextUtils.isEmpty(p0.mOnClick)) {
                mRightTv = this.f.a.mRightTv;
                onClickListe = null;
             }else {
                onClickListe = new g(this, p0);
                mRightTv = this.f.a.mRightTv;
             }
             mRightTv.setOnClickListener(onClickListe);
             this.f.a.mRightBtn.setOnClickListener(onClickListe);
          }else {
             this.f.a.mRightTv.setVisibility(i);
             this.f.a.mRightBtn.setVisibility(i);
          }
          this.f.a.mWebView.setJsSetTopRightButton(true);
       }
       return;
    }
}
