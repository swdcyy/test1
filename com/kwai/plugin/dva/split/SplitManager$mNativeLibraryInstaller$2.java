package com.kwai.plugin.dva.split.SplitManager$mNativeLibraryInstaller$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.split.SplitManager;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class SplitManager$mNativeLibraryInstaller$2 extends Lambda implements a	// class@001385
{
    public static final SplitManager$mNativeLibraryInstaller$2 INSTANCE;

    static {
       SplitManager$mNativeLibraryInstaller$2.INSTANCE = new SplitManager$mNativeLibraryInstaller$2();
    }
    public void SplitManager$mNativeLibraryInstaller$2(){
       super(0);
    }
    public final NativeLibraryInstaller invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, SplitManager$mNativeLibraryInstaller$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = SplitManager.b;
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
