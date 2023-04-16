package com.kwai.performance.fluency.jank.monitor.uploader.JankUploader$uploadAsZipFile$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import kotlin.io.FilesKt__UtilsKt;

public final class JankUploader$uploadAsZipFile$2 extends Lambda implements l	// class@001091
{
    public final boolean $delete;
    public final l $finish;
    public final File $uuidDir;

    public void JankUploader$uploadAsZipFile$2(boolean p0,File p1,l p2){
       this.$delete = p0;
       this.$uuidDir = p1;
       this.$finish = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (this.$delete != null) {
          FilesKt__UtilsKt.V(this.$uuidDir);
       }
       JankUploader$uploadAsZipFile$2 t$finish = this.$finish;
       if (t$finish != null) {
          t$finish.invoke(Boolean.valueOf(p0));
       }
       return;
    }
}
