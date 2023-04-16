package com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import ye7.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import pe7.e;
import java.util.ArrayList;
import df7.f;
import df7.c;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2$uploadFile$1;
import java.util.Objects;
import java.io.File;
import df7.d;
import java.io.FileWriter;
import com.kwai.performance.fluency.jank.monitor.uploader.Gsons;
import com.google.gson.Gson;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import yf7.q;
import com.kwai.performance.fluency.jank.monitor.uploader.JankUploader$uploadAsZipFile$2;
import msd.l;
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.Integer;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.StringBuilder;
import java.util.Map;
import yf7.m;
import brd.t;
import df7.a;
import df7.b;
import erd.g;
import crd.b;
import java.util.List;

public final class FpsEventV2 extends a	// class@001081
{
    public f f;
    public String fileUUID;
    public final List fpsSummaries;
    public final List gestureJankSummaries;
    public final List gestures;
    public boolean hitStackTrace;
    public final List janks;
    public final String section;
    public final int vre;

    public void FpsEventV2(String p0,int p1){
       a.p(p0, "section");
       super(p1);
       this.section = p0;
       this.vre = 3;
       this.hitStackTrace = e.c(p0);
       this.gestureJankSummaries = new ArrayList();
       this.janks = new ArrayList();
       this.gestures = new ArrayList();
       this.fpsSummaries = new ArrayList();
       this.f = new f();
    }
    public Object clone(){
       return super.clone();
    }
    public void d(){
       File c;
       m b;
       if (this.hitStackTrace == null) {
          return;
       }
       a tuuid = this.uuid;
       this.fileUUID = tuuid;
       FpsEventV2 tf = this.f;
       a.m(tuuid);
       FpsEventV2$uploadFile$1 iNSTANCE = FpsEventV2$uploadFile$1.INSTANCE;
       Throwable throwable = null;
       Objects.requireNonNull(c.a);
       a.p(tf, "records");
       a.p(tuuid, "uuid");
       c = c.c;
       if (c != null) {
          File uFile = new File(c, tuuid);
          d.a(uFile);
          c = new File(uFile, "jankInfo");
          d.a(c);
          File uFile1 = new File(c, "jankInfo");
          FileWriter uFileWriter = new FileWriter(uFile1);
          uFileWriter.write(Gsons.a.a().q(tf));
          b.a(uFileWriter, throwable);
          File uFile2 = new File(uFile, "jankInfo.zip");
          String path = c.getPath();
          a.o(path, "jankInfoDir.path");
          int i = 1;
          q.b(uFile1, uFile2, (StringsKt__StringsKt.w3(path, "/", 0, false, 6, null) + i));
          JankUploader$uploadAsZipFile$2 ouploadAsZip = new JankUploader$uploadAsZipFile$2(i, uFile, iNSTANCE);
          if (c.b == null) {
             ouploadAsZip.invoke(Boolean.FALSE);
          }else {
             HashMap hashMap = new HashMap();
             hashMap.put("bizType", Integer.valueOf(5));
             hashMap.put("sid", MonitorBuildConfig.g());
             hashMap.put("did", MonitorBuildConfig.c());
             hashMap.put("fileExtend", "zip");
             hashMap.put("extraInfo", "{\"mLogUUID\":"+tuuid+'}');
             b = c.b;
             a.m(b);
             t ot = b.a(hashMap, uFile2);
             ot.subscribe(new a(ouploadAsZip), new b(ouploadAsZip));
          }
          return;
       }else {
          a.S("mRootDir");
          throw throwable;
       }
    }
    public final List e(){
       return this.fpsSummaries;
    }
    public final List f(){
       return this.gestureJankSummaries;
    }
    public final List g(){
       return this.gestures;
    }
}
