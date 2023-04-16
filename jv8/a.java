package jv8.a;
import jv8.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Context;
import lv8.c;
import android.widget.Toast;
import lv8.g;
import android.net.Uri;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.Throwable;
import nv8.b;

public final class a implements b	// class@0029b1
{

    public void a(){
       super();
    }
    public void a(String p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Context context = PayManager.getInstance().getContext();
       if (!c.g(context, "com.eg.android.AlipayGphone")) {
          Toast.makeText(context, R.string.arg_RES_7f103b85, 1).show();
          g.d("alipay contract failed, alipay not installed");
          p0 = g.l("alipay", p0, null);
          str = "FAIL";
       }else {
          Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
          intent.addFlags(0x10000000);
          context.startActivity(intent);
          g.d("alipay contract start, providerConfig="+p0);
          p0 = g.l("alipay", p0, null);
          str = "FINISH";
       }
       g.j("GATEWAY_CONTRACT", str, p0);
       return;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       g.d("alipay qrmContract start, providerConfig="+p0);
       Context context = PayManager.getInstance().getContext();
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
       try{
          intent.addFlags(0x10000000);
          context.startActivity(intent);
       }catch(java.lang.Exception e4){
          b.g("AlipayContract", "alipay qrmContract failed,", e4);
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       g.d("alipay scoreContract not avaliable");
       return;
    }
}
