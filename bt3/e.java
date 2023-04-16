package bt3.e;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$b;
import java.lang.Object;
import android.app.Activity;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import bqa.a;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.text.TextUtils;
import vs3.a;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import lnc.i3;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e implements KwaiYodaWebViewActivity$b	// class@00043e
{

    public void e(){
       super();
    }
    public void a(Activity p0,Intent p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
          return;
       }
       int i = 0x6ed4866d;
       if (d.a(i).e5(p1) && d.a(i).yN(p1)) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, MerchantYodaWebViewActivity.class, "11")) {
          if (p1 != null && p1.getData() != null) {
             p2 = x0.a(p1.getData(), "url");
          }
          if (!TextUtils.isEmpty(p2)) {
             if (d.a(0x7074b578).Yv(p2)) {
                if (p1 != null) {
                   p1.setClass(p0, MerchantYodaWebViewActivity.class);
                }else {
                   p1 = MerchantYodaWebViewActivity.G3(p0, p2).a();
                }
                c.i(p0, p1);
             }
             i3 oi3 = i3.f();
             oi3.d("url", p2);
             u1.R("KWAI_WEB_JUMP_MERCHANT_PAGE_YODA", oi3.e(), 7);
          }
       }
       return;
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(0x7074b578).Yv(p0);
    }
}
