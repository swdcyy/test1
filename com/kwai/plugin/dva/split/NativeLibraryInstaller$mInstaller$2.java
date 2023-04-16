package com.kwai.plugin.dva.split.NativeLibraryInstaller$mInstaller$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import java.lang.Object;
import pj7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kwai.plugin.dva.split.CommonNativeLibraryInstaller;
import pj7.c;

public final class NativeLibraryInstaller$mInstaller$2 extends Lambda implements a	// class@001381
{
    public final NativeLibraryInstaller this$0;

    public void NativeLibraryInstaller$mInstaller$2(NativeLibraryInstaller p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       NativeLibraryInstaller$mInstaller$2 obj = PatchProxy.apply(null, this, NativeLibraryInstaller$mInstaller$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       CommonNativeLibraryInstaller uCommonNativ = (obj.d(obj.b))? new CommonNativeLibraryInstaller(this.this$0.b): new c(this.this$0.b);
       return uCommonNativ;
    }
}
