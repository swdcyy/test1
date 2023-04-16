package com.kwai.plugin.dva.split.CommonNativeLibraryInstaller$mCommonSoDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.split.CommonNativeLibraryInstaller;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public final class CommonNativeLibraryInstaller$mCommonSoDir$2 extends Lambda implements a	// class@00137f
{
    public final CommonNativeLibraryInstaller this$0;

    public void CommonNativeLibraryInstaller$mCommonSoDir$2(CommonNativeLibraryInstaller p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, CommonNativeLibraryInstaller$mCommonSoDir$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.this$0.b.getDir("dva", 0), "common_so");
    }
    public Object invoke(){
       return this.invoke();
    }
}
