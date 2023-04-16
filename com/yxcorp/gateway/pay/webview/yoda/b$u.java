package com.yxcorp.gateway.pay.webview.yoda.b$u;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import lv8.l;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.webview.yoda.g;
import android.view.View$OnClickListener;
import lv8.m;

public class b$u extends p0	// class@0012c4
{
    public final String g;
    public final b h;

    public void b$u(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       b c;
       View$OnClickListener onClickListe;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$u.class, "1")) {
       }else {
          g.d("bridge: setTopRightBtn");
          int i = 4;
          if (!TextUtils.x(this.g)) {
             JsPageButtonParams mShow = p0.mShow;
             if (mShow != null && mShow.booleanValue()) {
                mShow = p0.mIcon;
                if (mShow != null && JsPageButtonParams$Icon.DEFAULT != mShow) {
                   this.h.c.setVisibility(R.id.pay_right_btn, 0);
                   this.h.c.setVisibility(R.id.pay_right_tv, i);
                   this.h.c.setImageRes(R.id.pay_right_btn, p0.mIcon.mIconId);
                }else if(!TextUtils.isEmpty(p0.mText)){
                   this.h.c.setVisibility(R.id.pay_right_btn, i);
                   this.h.c.setVisibility(R.id.pay_right_tv, 0);
                   this.h.c.bindTextButton(R.id.pay_right_tv, p0);
                }
                if (TextUtils.isEmpty(p0.mOnClick)) {
                   c = this.h.c;
                   onClickListe = null;
                }else {
                   onClickListe = new g(this, p0);
                   c = this.h.c;
                }
                c.setOnClickListener(R.id.pay_right_tv, onClickListe);
                this.h.c.setOnClickListener(R.id.pay_right_btn, onClickListe);
             }else {
                this.h.c.setVisibility(R.id.pay_right_tv, i);
                this.h.c.setVisibility(R.id.pay_right_btn, i);
             }
             if (b.a(this.h) instanceof m) {
                b.a(this.h).setJsSetTopRightButton(true);
             }
          }
          this.h.c.setVisibility(R.id.pay_right_tv, i);
          this.h.c.setVisibility(R.id.pay_right_btn, i);
       }
       return;
    }
}
