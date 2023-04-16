package com.alipay.sdk.m.s.d$f;
import com.alipay.sdk.m.s.e;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.alipay.sdk.m.q.b;

public class d$f	// class@000ea8
{
    public final WeakReference a;
    public final String b;
    public final String c;
    public final JSONObject d;
    public boolean e;

    public void d$f(e p0,String p1,String p2,JSONObject p3){
       super();
       this.e = false;
       this.a = new WeakReference(p0);
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static String a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       return p0.replace("\'", "");
    }
    public void b(JSONObject p0){
       if (this.e != null) {
          return;
       }
       e uoe = b.b(this.a);
       if (uoe == null) {
          return;
       }
       this.e = true;
       Object[] objArray = new Object[]{d$f.a(this.c),d$f.a(p0.toString())};
       uoe.d(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc\(\'%s\',\'%s\'\);", objArray));
       return;
    }
}
