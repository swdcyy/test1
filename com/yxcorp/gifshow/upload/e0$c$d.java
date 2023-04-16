package com.yxcorp.gifshow.upload.e0$c$d;
import erd.g;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import com.yxcorp.gifshow.upload.e0;
import java.util.Objects;
import dnc.d2;
import java.lang.Long;
import java.io.File;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class e0$c$d implements g	// class@001e70
{
    public final e0$c b;

    public void e0$c$d(e0$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$c$d.class, "1")) {
       }else {
          String str = p0.n().request().url().host();
          p0 = p0.o(p0.n().request().url().url().toString());
          e0$c$d tb = this.b;
          e0 a = tb.o.a;
          e0$c g = tb.g;
          e0$c b = tb.b;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(d2.class) || !PatchProxy.applyVoidFourRefs(str, p0, Long.valueOf(g), b, a, d2.class, "3")) {
             h$b uob = h$b.d(7, 606);
             ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
             uploadDetail.fileLength = new File(b.getFilePath()).length();
             uploadDetail.host = str;
             uploadDetail.ip = p0;
             uploadDetail.fileType = 2;
             p0 = new ClientEvent$ResultPackage();
             p0.domain = 3;
             p0.timeCost = System.currentTimeMillis() - g;
             ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
             taskDetailPa.uploadDetailPackage = uploadDetail;
             uob.r(b.getSessionId());
             uob.h(a.a(b));
             uob.s(taskDetailPa);
             uob.q(p0);
             u1.r0(uob);
          }
       }
       return;
    }
}
