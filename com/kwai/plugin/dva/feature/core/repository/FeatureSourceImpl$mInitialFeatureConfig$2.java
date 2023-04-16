package com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mInitialFeatureConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.plugin.dva.feature.core.repository.b;
import java.lang.reflect.Field;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.InputStream;
import okio.n;
import okio.l;
import okio.d;
import java.nio.charset.Charset;
import cud.k;
import java.io.Closeable;
import com.kwai.plugin.dva.util.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import qj7.d;
import com.kwai.plugin.dva.repository.store.a;
import com.google.gson.Gson;

public final class FeatureSourceImpl$mInitialFeatureConfig$2 extends Lambda implements a	// class@000e76
{
    public final FeatureSourceImpl this$0;

    public void FeatureSourceImpl$mInitialFeatureConfig$2(FeatureSourceImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public final FeatureDetails invoke(){
       FeatureDetails uFeatureDeta;
       InputStream inputStream;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeatureSourceImpl$mInitialFeatureConfig$2 obj = PatchProxy.apply(objArray, this, FeatureSourceImpl$mInitialFeatureConfig$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       FeatureSourceImpl uFeatureSour = FeatureSourceImpl.class;
       Object obj1 = PatchProxy.apply(objArray, obj, uFeatureSour, "9");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          String str = PatchProxy.apply(objArray, obj, uFeatureSour, "10");
          if (str != patchProxyRe) {
          }else {
             Charset obj2 = PatchProxy.apply(objArray, objArray, b.class, "3");
             if (obj2 != patchProxyRe) {
             }else {
                try{
                   Field field = b.a().getField("VERSION_NAME");
                   field.setAccessible(true);
                   obj2 = field.get(objArray);
                }catch(java.lang.NoSuchFieldException e0){
                   obj2 = "unknown";
                }catch(java.lang.IllegalAccessException e0){
                }catch(java.lang.ClassNotFoundException e0){
                }
             }
          }
          if (str == null) {
             d.b("readFeatureConfigFromAsset\(\) assetConfigJson=null!!!", new IllegalStateException());
          }else {
             try{
                uFeatureDeta = a.c().b().h(str, FeatureDetails.class);
             }catch(java.lang.Exception e0){
                d.b("parseSplitsContentForSplitDetailsGsonBean error", e0);
                uFeatureDeta = objArray;
             }
             if (uFeatureDeta == null) {
                d.b("readFeatureConfigFromAsset\(\) assetDetails=null!!!", new IllegalStateException());
             }else {
                d.c("readFeatureConfigFromAsset\(\) read success.");
                objArray = uFeatureDeta;
             }
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
