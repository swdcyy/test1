package com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import j89.k;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import java.io.File;
import java.lang.StringBuilder;
import brd.t;
import com.kwai.framework.fileuploader.UploadUtils;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$a;
import erd.a;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$b;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$c;
import erd.g;
import crd.b;

public final class OnlineSystraceManagerImpl$beginTrace$traceResult$1 extends Lambda implements p	// class@001b90
{
    public final boolean $isAutoUpload;
    public final String $logUUID;
    public final String $scene;
    public final int $source;
    public final Long $type;
    public final k this$0;

    public void OnlineSystraceManagerImpl$beginTrace$traceResult$1(k p0,boolean p1,int p2,String p3,Long p4,String p5){
       this.this$0 = p0;
       this.$isAutoUpload = p1;
       this.$source = p2;
       this.$logUUID = p3;
       this.$type = p4;
       this.$scene = p5;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceManagerImpl$beginTrace$traceResult$1.class, "1")) {
          return;
       }
       a.p(p0, "zipFilePath");
       a.p(p1, "mmapFilePath");
       if (this.$isAutoUpload != null) {
          if (this.$source == 2) {
             OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = this.this$0.a();
             a.m(keepPushPerf);
             b.a(-2022051331).j(keepPushPerf.mTaskID, this.$logUUID, 3, null);
          }
          File uFile = new File(p0);
          File uFile1 = new File(p1);
          if (!uFile.exists()) {
             return;
          }else {
             UploadUtils.uploadExceptionFile(uFile, "{\"mLogUUID\":"+this.$logUUID+"}", "zip").doFinally(new OnlineSystraceManagerImpl$beginTrace$traceResult$1$a(this, uFile, uFile1)).subscribe(new OnlineSystraceManagerImpl$beginTrace$traceResult$1$b(this, uFile), new OnlineSystraceManagerImpl$beginTrace$traceResult$1$c(this));
          }
       }
       return;
    }
}
