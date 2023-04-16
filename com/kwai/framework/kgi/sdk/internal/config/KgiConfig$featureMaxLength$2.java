package com.kwai.framework.kgi.sdk.internal.config.KgiConfig$featureMaxLength$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.lang.Integer;

public final class KgiConfig$featureMaxLength$2 extends Lambda implements a	// class@001587
{
    public static final KgiConfig$featureMaxLength$2 INSTANCE;

    static {
       KgiConfig$featureMaxLength$2.INSTANCE = new KgiConfig$featureMaxLength$2();
    }
    public void KgiConfig$featureMaxLength$2(){
       super(0);
    }
    public final int invoke(){
       int i1;
       Object[] objArray = null;
       KgiConfigItem obj = PatchProxy.apply(objArray, this, KgiConfig$featureMaxLength$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = KgiConfig.g.c();
       if (obj != null) {
          Integer integer = Integer.valueOf(obj.featureMaxLength);
          int i = (integer.intValue() > 0)? 1: 0;
          if (i) {
             objArray = integer;
          }
          if (objArray != null) {
             i1 = objArray.intValue();
          label_0037 :
             return i1;
          }
       }
       i1 = 1000;
       goto label_0037 ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
