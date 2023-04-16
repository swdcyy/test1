package com.yxcorp.gifshow.growth.inject.MerchantInsertPluginImpl$getMerchantId$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ekd.x0;
import java.lang.CharSequence;
import lnc.o5;

public final class MerchantInsertPluginImpl$getMerchantId$1$1 extends Lambda implements p	// class@0013b5
{
    public static final MerchantInsertPluginImpl$getMerchantId$1$1 INSTANCE;

    static {
       MerchantInsertPluginImpl$getMerchantId$1$1.INSTANCE = new MerchantInsertPluginImpl$getMerchantId$1$1();
    }
    public void MerchantInsertPluginImpl$getMerchantId$1$1(){
       super(2);
    }
    public final long invoke(Uri p0,long p1){
       String obj;
       if (PatchProxy.isSupport(MerchantInsertPluginImpl$getMerchantId$1$1.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, MerchantInsertPluginImpl$getMerchantId$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       a.p(p0, "uri");
       obj = x0.a(p0, "shareObjectId");
       int i = 0;
       int i1 = (obj == null || !obj.length())? 1: 0;
       if (!i1) {
          return o5.d(obj, p1);
       }else {
          String str = x0.a(p0, "itemId");
          if (str == null || !str.length()) {
             i = 1;
          }
          if (!i) {
             return o5.d(str, p1);
          }else {
             return p1;
          }
       }
    }
    public Object invoke(Object p0,Object p1){
       return Long.valueOf(this.invoke(p0, p1.longValue()));
    }
}
