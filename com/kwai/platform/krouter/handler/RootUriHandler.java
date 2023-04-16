package com.kwai.platform.krouter.handler.RootUriHandler;
import com.kwai.platform.krouter.handler.ChainedHandler;
import rh7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import zh7.a;
import xh7.b;
import android.net.Uri;
import xh7.a;
import zh7.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import vh7.a;
import vh7.a$a;
import qh7.b;
import yh7.a;
import uh7.b;
import java.util.Iterator;
import java.util.List;
import uh7.a;
import com.kwai.platform.krouter.handler.RootUriHandler$a;
import qh7.c;

public class RootUriHandler extends ChainedHandler	// class@00128e
{

    public void RootUriHandler(){
       super();
    }
    public RootUriHandler f(a p0,int p1){
       ChainedHandler obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RootUriHandler rootUriHandl = RootUriHandler.class;
       if (PatchProxy.isSupport(rootUriHandl)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, rootUriHandl, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = ChainedHandler.class;
       if (PatchProxy.isSupport(obj)) {
          rootUriHandl = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, obj, "1");
          if (rootUriHandl != patchProxyRe) {
          label_0034 :
             return rootUriHandl;
          }
       }
       this.b.b(p0, p1);
       rootUriHandl = this;
       goto label_0034 ;
    }
    public void g(b p0){
       boolean b;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, RootUriHandler.class, str)) {
          return;
       }
       Uri uri = p0.g();
       Object obj = PatchProxy.applyOneRefs(uri, null, b.class, str);
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(TextUtils.isEmpty(uri.toString())){
          b = false;
       }else {
          b = true;
       }
       if (!b) {
          String str1 = "invalidate uri:"+p0.g();
          if (!PatchProxy.applyVoidOneRefs(str1, null, a.class, "5") && a.a) {
             a.b.g(str1);
          }
          p0 = p0.c(b.class, "com.kwai.platform.krouter.CompleteListener");
          if (p0 != null) {
             p0.a(new a(400));
          }
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, null, b.class, str)){
          Iterator iterator = b.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0);
          }
       }
       this.b(p0, new RootUriHandler$a(this, p0));
       return;
    }
}
