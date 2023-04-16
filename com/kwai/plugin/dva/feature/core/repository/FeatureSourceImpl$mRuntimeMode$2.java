package com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mRuntimeMode$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.feature.core.repository.b;
import java.lang.Boolean;
import java.lang.reflect.Field;

public final class FeatureSourceImpl$mRuntimeMode$2 extends Lambda implements a	// class@000e77
{
    public static final FeatureSourceImpl$mRuntimeMode$2 INSTANCE;

    static {
       FeatureSourceImpl$mRuntimeMode$2.INSTANCE = new FeatureSourceImpl$mRuntimeMode$2();
    }
    public void FeatureSourceImpl$mRuntimeMode$2(){
       super(0);
    }
    public final Integer invoke(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, FeatureSourceImpl$mRuntimeMode$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          try{
             Field field = b.a().getField("QIGSAW_MODE");
             field.setAccessible(true);
             b = field.get(null).booleanValue();
          }catch(java.lang.NoSuchFieldException e0){
             b = false;
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
    }
    public Object invoke(){
       return this.invoke();
    }
}
