package com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import ekd.e0;
import android.content.Context;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.StringBuilder;

public final class OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1 extends Lambda implements p	// class@001b91
{
    public final boolean $isAutoUpload;
    public final int $source;

    public void OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1(boolean p0,int p1){
       this.$isAutoUpload = p0;
       this.$source = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1.class, "1")) {
          return;
       }
       a.p(p0, "zipFilePath");
       a.p(p1, "mmapFilePath");
       if (this.$isAutoUpload != null && this.$source == 3) {
          File externalFile = e0.b.getExternalFilesDir("trace");
          String absolutePath = (externalFile != null)? externalFile.getAbsolutePath(): null;
          File uFile = new File(absolutePath, "onlinesystrace.trace");
          FilesKt__UtilsKt.P(new File(p0), uFile, true, 0x100000);
          "path:"+uFile.getAbsoluteFile();
       }
       return;
    }
}
