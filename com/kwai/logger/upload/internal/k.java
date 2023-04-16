package com.kwai.logger.upload.internal.k;
import v87.a;
import java.lang.String;
import v87.d;
import java.lang.StringBuilder;
import t87.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.logger.upload.internal.f;
import okhttp3.HttpUrl;
import okhttp3.FormBody$Builder;
import okhttp3.Request$Builder;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import com.kwai.logger.upload.model.ActionResponse;
import java.lang.Class;
import brd.t;
import com.kwai.logger.upload.internal.i;
import u87.p;
import erd.g;
import crd.b;
import com.kwai.logger.upload.model.LogStageResponse;
import u87.q;
import com.kwai.logger.upload.internal.j;

public class k	// class@000ed6
{

    public static void a(a p0,int p1,String p2){
       k.b(p0, p1, p2, "");
    }
    public static void b(a p0,int p1,String p2,String p3){
       d uod = p0.d();
       String str = "notify end for task: "+uod.a+", finishCode="+p1+";";
       d.a("ObiwanUploader", str);
       if (TextUtils.isEmpty(uod.a)) {
          return;
       }
       f uof = f.b();
       uof.d(new Request$Builder().url(uof.a("end")).post(new FormBody$Builder().add("taskId", uod.a).add("progress", String.valueOf(p1)).add("logToken", p3).add("extra", uod.c).add("version", "1.0.0").add("channelType", p0.b()).build()).build(), ActionResponse.class).subscribe(new i(uod, p1, p2), new p(uod, str));
       return;
    }
    public static void c(a p0,String p1){
       d uod = p0.d();
       if (TextUtils.isEmpty(uod.a) || (!TextUtils.isEmpty(uod.b) && !TextUtils.isEmpty(p1))) {
          f uof = f.b();
          t ot = uof.d(new Request$Builder().url(uof.a("stage")).post(new FormBody$Builder().add("taskId", uod.a).add("did", uod.b).add("stageType", p1).add("channelType", p0.b()).add("version", "1.0.0").add("msg", "").build()).build(), LogStageResponse.class);
          ot.subscribe(new q(p1, uod), j.b);
       }
    label_007f :
       return;
    }
}
