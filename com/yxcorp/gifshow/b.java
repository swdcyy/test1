package com.yxcorp.gifshow.b;
import java.lang.Object;
import com.kwai.framework.model.user.QUserContactName;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import sca.e;
import com.kwai.framework.model.user.UserExtraInfo;
import brd.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qra.b;
import java.util.concurrent.Callable;
import brd.w;
import com.yxcorp.gifshow.helper.c;
import erd.r;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.helper.e;
import com.yxcorp.gifshow.bean.ContactInfo;
import com.yxcorp.gifshow.helper.d;
import com.yxcorp.gifshow.upload.r;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.UnsupportedEncodingException;
import com.yxcorp.gifshow.upload.q;
import com.yxcorp.gifshow.upload.m;
import erd.o;

public class b	// class@001c49
{

    public void b(){
       super();
    }
    public static t a(QUserContactName p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x5419c6da).b(p0);
    }
    public static a0 b(UserExtraInfo p0){
       String obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       a0 uoa0 = a0.B(obj);
       if (p0 != null && (p0.mContactName != null || !TextUtils.x(p0.mOpenUserName))) {
          uoa0 = t.concat(b.a(0x5419c6da).b(p0.mContactName), t.fromCallable(new b(p0))).filter(c.b).first(obj).T(d.c).G(d.a);
       }
       return uoa0;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.b(p0);
    }
    public static ContactInfo d(){
       Object obj = PatchProxy.apply(null, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a();
    }
    public static t e(ContactInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return r.c(p0);
       }catch(java.io.UnsupportedEncodingException e3){
          e3.printStackTrace();
          return t.error(e3);
       }catch(com.yxcorp.gifshow.ContactsEmptyException e3){
          e3.printStackTrace();
          return t.error(e3);
       }
    }
    public static t f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.apply(null, null, b.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, r.class, "6");
       if (obj != patchProxyRe) {
       }else {
          obj = t.fromCallable(q.b).flatMap(m.b).subscribeOn(d.c);
       }
       return obj;
    }
}
