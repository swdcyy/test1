package com.yxcorp.gateway.pay.webview.yoda.b$s;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.RubasParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nv8.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import nv8.e;

public class b$s extends p0	// class@0012c2
{
    public final b g;

    public void b$s(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$s.class, "1")) {
       }else {
          RubasParams event = p0.event;
          RubasParams dimensions = p0.dimensions;
          RubasParams token = p0.token;
          if (!PatchProxy.applyVoidThreeRefs(event, dimensions, token, null, c.class, "2") && !TextUtils.isEmpty(token)) {
             Set set = c.a.get(token);
             if (set == null) {
                set = new HashSet();
             }
             if (!set.contains(event)) {
                set.add(event);
                e.e(event, dimensions, token);
                c.a.put(token, set);
             }
          }
       }
       return;
    }
}
