package com.yxcorp.gateway.pay.webview.yoda.b$t;
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
import android.text.TextUtils;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import lv8.l;
import sv8.n0;
import android.view.View$OnClickListener;
import lv8.m;

public class b$t extends p0	// class@0012c3
{
    public final String g;
    public final b h;

    public void b$t(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       b c;
       View$OnClickListener onClickListe;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$t.class, "1")) {
       }else {
          g.d("bridge: setTopLeftBtn");
          int i = 4;
          if (!TextUtils.x(this.g)) {
             JsPageButtonParams mShow = p0.mShow;
             if (mShow == null) {
                mShow = Boolean.FALSE;
             }
             p0.mShow = mShow;
             if (mShow.booleanValue()) {
                if (p0.mIcon == null && TextUtils.isEmpty(p0.mText)) {
                   p0.mIcon = JsPageButtonParams$Icon.BACK;
                }
                if (p0.mIcon != null) {
                   this.h.c.setVisibility(R.id.pay_left_btn, 0);
                   this.h.c.setVisibility(R.id.pay_left_tv, i);
                   this.h.c.setImageRes(R.id.pay_left_btn, p0.mIcon.mIconId);
                }else if(!TextUtils.isEmpty(p0.mText)){
                   this.h.c.setVisibility(R.id.pay_left_btn, i);
                   this.h.c.setVisibility(R.id.pay_left_tv, 0);
                   this.h.c.bindTextButton(R.id.pay_left_tv, p0);
                }
                if (TextUtils.isEmpty(p0.mOnClick)) {
                   c = this.h.c;
                   onClickListe = null;
                }else {
                   onClickListe = new n0(this, p0);
                   c = this.h.c;
                }
                c.setOnClickListener(R.id.pay_left_tv, onClickListe);
                this.h.c.setOnClickListener(R.id.pay_left_btn, onClickListe);
             }else {
                this.h.c.setVisibility(R.id.pay_left_tv, i);
                this.h.c.setVisibility(R.id.pay_left_btn, i);
             }
             if (b.a(this.h) instanceof m) {
                b.a(this.h).setJsSetTopLeftButton(true);
             }
          }
          this.h.c.setVisibility(R.id.pay_left_tv, i);
          this.h.c.setVisibility(R.id.pay_left_btn, i);
       }
       return;
    }
}
