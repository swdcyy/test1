package com.yxcorp.gateway.pay.withdraw.WithDrawHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import fv8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gateway.pay.withdraw.WithDrawHelper$a;
import java.util.Map;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import pv8.c;

public final class WithDrawHelper	// class@0012d5
{
    public static Map sListeners;

    static {
       WithDrawHelper.sListeners = new ConcurrentHashMap();
    }
    public void WithDrawHelper(){
       super();
    }
    public static void addWechatListener(String p0,int p1,String p2,String p3,c p4){
       WithDrawHelper withDrawHelp = WithDrawHelper.class;
       if (PatchProxy.isSupport(withDrawHelp)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, withDrawHelp, "1")) {
             return;
          }
       }
       WithDrawHelper.sListeners.put(p0, new WithDrawHelper$a(p1, p2, p4, p3));
       return;
    }
    public static void onWechatResp(BaseResp p0){
       BaseResp obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, WithDrawHelper.class, "3")) {
          return;
       }
       BaseResp transaction = p0.transaction;
       if (transaction == null) {
          return;
       }
       WithDrawHelper$a uoa = WithDrawHelper.sListeners.remove(transaction);
       if (uoa == null) {
          return;
       }
       WithDrawHelper$a a = uoa.a;
       WithDrawHelper$a b = uoa.b;
       WithDrawHelper$a c = uoa.c;
       WithDrawHelper$a d = uoa.d;
       uoa.d = obj;
       c uoc = new c();
       obj = p0.errCode;
       boolean b1 = true;
       boolean b2 = (obj == null)? true: false;
       uoc.a = b2;
       if (obj != -2) {
          b1 = false;
       }
       uoc.b = b1;
       uoc.c = obj;
       uoc.d = p0.errStr;
       uoc.e = p0;
       d.a(a, b, c, uoc);
       return;
    }
    public static void removeWechatListener(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, WithDrawHelper.class, "2")) {
          return;
       }
       WithDrawHelper.sListeners.remove(p0);
       return;
    }
}
