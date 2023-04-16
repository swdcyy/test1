package com.yxcorp.gifshow.webview.config.f;
import com.kuaishou.webkit.DownloadListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import k2b.u1;
import android.text.TextPaint;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import android.content.Context;
import com.yxcorp.utility.n;
import android.text.TextUtils$TruncateAt;
import java.lang.CharSequence;
import android.text.TextUtils;
import u07.t$a;
import android.app.Activity;
import yxc.i;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class f implements DownloadListener	// class@001745
{
    public final GifshowActivity a;

    public void f(GifshowActivity p0){
       super();
       this.a = p0;
    }
    public void onDownloadStart(String p0,String p1,String p2,String p3,long p4){
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
             return;
          }
       }
       if (TextUtils.m(p0, ".html")) {
          u1.Q("KwaiWebViewDownloadListener", "url:"+p0+"; mimeType="+p3+"; contentDisposition ="+p2);
       }
       TextPaint textPaint = new TextPaint();
       textPaint.setTextSize((float)c.b(a.B.getResources(), R.dimen.arg_RES_7f07023f));
       t$a uoa = new t$a(this.a);
       Object[] objArray1 = new Object[]{TextUtils.ellipsize(p0, textPaint, ((float)n.y(a.B) * 0x3f2a7efa), TextUtils$TruncateAt.END)};
       uoa.X0(a.B.getString(R.string.arg_RES_7f100a87, objArray1));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new i(p0));
       uoa.v(1);
       j.d(uoa);
       return;
    }
}
