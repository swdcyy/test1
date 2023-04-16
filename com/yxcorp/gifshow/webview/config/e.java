package com.yxcorp.gifshow.webview.config.e;
import com.kuaishou.webkit.DownloadListener;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import yz7.r;
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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.kernel.container.YodaWebView;
import u07.t$a;
import android.app.Activity;
import yxc.f;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class e implements DownloadListener	// class@001744
{
    public final WeakReference a;

    public void e(KwaiYodaWebViewFragment p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void onDownloadStart(String p0,String p1,String p2,String p3,long p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
             return;
          }
       }
       if (TextUtils.m(p0, ".html")) {
          r.h("KwaiWebViewDownloadListener", "url:"+p0+"; mimeType="+p3+"; contentDisposition ="+p2);
       }
       TextPaint textPaint = new TextPaint();
       textPaint.setTextSize((float)c.b(a.B.getResources(), R.dimen.arg_RES_7f07023f));
       textPaint = TextUtils.ellipsize(p0, textPaint, ((float)n.y(a.B) * 0x3f2a7efa), TextUtils$TruncateAt.END);
       KwaiYodaWebViewFragment kwaiYodaWebV = this.a.get();
       if (kwaiYodaWebV == null) {
          return;
       }else {
          FragmentActivity activity = kwaiYodaWebV.getActivity();
          if (activity == null) {
             return;
          }else {
             YodaBaseWebView yodaBaseWebV = kwaiYodaWebV.Ch();
             if (yodaBaseWebV != null && yodaBaseWebV.isActive()) {
                t$a uoa = new t$a(activity);
                Object[] objArray1 = new Object[]{textPaint};
                uoa.X0(a.B.getString(R.string.arg_RES_7f100a87, objArray1));
                uoa.S0(R.string.arg_RES_7f103a83);
                uoa.Q0(R.string.cancel);
                uoa.u0(new f(this, p0, yodaBaseWebV));
                uoa.v(1);
                j.d(uoa);
             }
             return;
          }
       }
    }
}
