package com.kuaishou.cover.container.loader.b$b;
import b30.b;
import com.kuaishou.cover.container.loader.b;
import b30.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import d30.c;
import g30.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.util.Map;
import java.lang.Exception;
import hu4.h;
import com.kuaishou.cover.Link;
import android.app.Activity;

public class b$b implements b	// class@0016db
{
    public final a a;
    public final b b;

    public void b$b(b p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean onBackPressed(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$b obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj.l == null || obj.a == null) {
          return b;
       }
       if (obj.k()) {
          c.d("handle back close widget, materialId: "+this.b.c);
          String str = "dismissOnBackKey";
          b$b tb = this.b;
          b e = tb.e;
          b f = tb.f;
          Object obj1 = PatchProxy.applyThreeRefs(str, e, f, null, e.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(!TextUtils.isEmpty(e) && !TextUtils.isEmpty(str)){
             boolean b1 = "0".equals(Uri.parse(e).getQueryParameter(str));
             if (!b1 && (f != null && f.containsKey(str))) {
                b1 = "0".equals(f.get(str));
             }
          label_0088 :
             b = b1;
          }
       }else {
          this.b.D2(b);
       }
       this.a.a(this.b.a);
       return true;
    }
}
