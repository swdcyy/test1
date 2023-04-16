package com.kwai.plugin.dva.feature.core.FeatureManager$mNativeLibraryInstaller$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class FeatureManager$mNativeLibraryInstaller$2 extends Lambda implements a	// class@000e59
{
    public static final FeatureManager$mNativeLibraryInstaller$2 INSTANCE;

    static {
       FeatureManager$mNativeLibraryInstaller$2.INSTANCE = new FeatureManager$mNativeLibraryInstaller$2();
    }
    public void FeatureManager$mNativeLibraryInstaller$2(){
       super(0);
    }
    public final NativeLibraryInstaller invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FeatureManager$mNativeLibraryInstaller$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = FeatureManager.b;
       if (b == null) {
          a.S("mContext");
       }else {
          objArray = b;
       }
       return new NativeLibraryInstaller(objArray);
    }
    public Object invoke(){
       return this.invoke();
    }
}
