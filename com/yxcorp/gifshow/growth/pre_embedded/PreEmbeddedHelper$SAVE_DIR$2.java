package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper$SAVE_DIR$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import java.io.File;
import android.app.Application;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class PreEmbeddedHelper$SAVE_DIR$2 extends Lambda implements a	// class@001478
{
    public static final PreEmbeddedHelper$SAVE_DIR$2 INSTANCE;

    static {
       PreEmbeddedHelper$SAVE_DIR$2.INSTANCE = new PreEmbeddedHelper$SAVE_DIR$2();
    }
    public void PreEmbeddedHelper$SAVE_DIR$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, this, PreEmbeddedHelper$SAVE_DIR$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.B.getExternalFilesDir("");
       if (obj == null) {
          Application b = a.B;
          a.o(b, "AppEnv.APP");
          obj = b.getExternalCacheDir();
       }
       StringBuilder str = "";
       if (obj != null) {
          objArray = obj.getAbsolutePath();
       }
       return str+objArray+"/pre_embedded/feeds";
    }
}
