package com.kwai.yoda.function.tool.SecAtlasSignFunction;
import ay7.a;
import com.kwai.yoda.function.tool.SecAtlasSignFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.tool.SecAtlasSignFunction$b;
import yz7.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import dy7.d;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.yoda.kernel.cookie.CookieManagerWrapper;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Boolean;
import zsd.u;
import java.util.Collection;
import java.lang.StringBuilder;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.a;
import yz7.r;
import yb7.i;
import com.kwai.yoda.function.tool.SecAtlasSignFunction$SecAtlasSignParams;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public final class SecAtlasSignFunction extends a	// class@001222
{
    public static final SecAtlasSignFunction$a d;

    static {
       SecAtlasSignFunction.d = new SecAtlasSignFunction$a(null);
    }
    public void SecAtlasSignFunction(){
       super();
    }
    public String c(){
       return "secAtlasSign2";
    }
    public String d(){
       return "tool";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       SecAtlasSignFunction$a d;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, SecAtlasSignFunction.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       SecAtlasSignFunction$b uob = e.a(p1, SecAtlasSignFunction$b.class);
       obj = 0x1e84f;
       if (uob == null) {
          throw new YodaException(obj, "inputStr is null");
       }
       if (uob.a() == null) {
          throw new YodaException(obj, "url is null");
       }
       obj = new ArrayList();
       d.a(obj, uob.query);
       d.a(obj, uob.form);
       if (p0 != null) {
          p0.injectCookie();
       }
       YodaCookie f = YodaCookie.f;
       String str1 = uob.a();
       Objects.requireNonNull(f);
       List list = PatchProxy.applyOneRefs(str1, f, YodaCookie.class, "28");
       if (list != patchProxyRe) {
       }else if(str1 == null || !str1.length()){
          list = 1;
       }else {
          list = null;
       }
       if (list) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          list = f.i().b(str1);
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       int b = false;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          Object obj2 = obj1;
          d = SecAtlasSignFunction.d;
          Objects.requireNonNull(d);
          Object obj3 = PatchProxy.applyOneRefs(obj2, d, SecAtlasSignFunction$a.class, str);
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else if(u.q2(obj2, "accessproxy_session", false, 2, b) || u.q2(obj2, "apdid", false, 2, b)){
             b = 1;
          }else {
             b = 0;
          }
          b = b ^ 1;
          if (b) {
             uArrayList.add(obj1);
          }
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          obj.add(iterator1.next());
       }
       String str2 = "";
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator2 = obj.iterator();
       while (iterator2.hasNext()) {
          Object obj4 = iterator2.next();
          i = u.q2(obj4, "__NS", false, 2, b) ^ 1;
          if (i) {
             uArrayList1.add(obj4);
          }
       }
       Iterator iterator3 = CollectionsKt___CollectionsKt.b5(uArrayList1).iterator();
       while (iterator3.hasNext()) {
          str2 = str2+iterator3.next();
       }
       uob = uob.body;
       if (uob != null) {
          str2 = str2+uob;
       }
       str2 = str2;
       a.h(str2, "builder.toString\(\)");
       String str3 = "secAtlasSign2";
       r.b(str3, "plain:"+str2);
       str2 = i.c(str2);
       uob = "md5:"+str2;
       try{
          r.b(str3, uob);
          SecAtlasSignFunction$SecAtlasSignParams secAtlasSign = new SecAtlasSignFunction$SecAtlasSignParams();
          secAtlasSign.mResult = 1;
          MXSec mXSec = MXSec.get();
          a.h(mXSec, "MXSec.get\(\)");
          secAtlasSign.atlasSign = mXSec.getWrapper().atlasSign("Yoda", "455dbffe-35f7-4ee5-9d5c-3baae8dbed9f", false, str2);
          return secAtlasSign;
       }catch(java.lang.Exception e13){
          throw new YodaException(0x1e84a, e13.getMessage());
       }
    }
}
