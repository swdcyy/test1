package og.b;
import n3d.a;
import f55.g;
import b26.b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import java.lang.Object;
import android.content.Intent;
import kotlin.jvm.internal.a;
import java.lang.String;
import ekd.j0;
import lnc.y6;
import b26.d;
import java.lang.Class;
import lnc.x6;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import lnc.a1;
import android.os.Bundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.app.Application;
import o56.a;
import android.content.Context;
import vk7.g0;
import qkd.b;
import java.lang.StringBuilder;
import java.io.File;
import com.kuaishou.gifshow.files.a;
import java.util.Objects;
import zsd.u;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasPrepareResult;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.util.UUID;
import og.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import java.lang.Integer;
import brd.t;
import b26.b$b;
import og.b$a;
import erd.g;
import og.b$b;
import erd.o;
import og.b$c;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$UploadTokenNeededParams;
import brd.w;
import brd.a;
import og.b$d;
import og.b$e;
import og.a$b;
import og.a$c;
import og.a$a;
import erd.a;
import crd.b;

public final class b implements a	// class@002797
{
    public final g b;
    public final b c;
    public final Activity d;
    public final JsSelectMixMediasParams e;

    public void b(g p0,b p1,Activity p2,JsSelectMixMediasParams p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       String str1;
       boolean b;
       b td;
       JsSelectMixMediasParams mUploadToken;
       t ot;
       if (p0 == 19) {
          p0 = -1;
          if (p1 == p0) {
             a.m(p2);
             p1 = j0.b(p2, "activity_result_encode_id", p0);
             if (p1 != p0) {
                String str = j0.f(p2, "activity_result_production_cover");
                long l = j0.c(p2, "activity_result_duration", 0);
                d uod = y6.r(d.class);
                Bundle uBundle = null;
                EncodeInfo uEncodeInfo = (uod != null)? uod.c3(p1): uBundle;
                int i = 0x7f104f67;
                int i1 = 412;
                if (uEncodeInfo == null) {
                   this.b.a(i1, a1.p(i), uBundle);
                   return;
                }else if(TextUtils.x(uEncodeInfo.getOutputPath())){
                   this.b.a(i1, a1.p(i), uBundle);
                   return;
                }else {
                   Ref$ObjectRef objectRef = new Ref$ObjectRef();
                   objectRef.element = uEncodeInfo.getOutputPath();
                   if (!g0.a(a.b(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
                      str1 = b.z(uEncodeInfo.getOutputPath());
                      a.o(str1, "FileUtils.getExtension\(encodeInfo.outputPath\)");
                      File uFile = a.b(String.valueOf('.')+str1);
                      a.o(uFile, "dst");
                      objectRef.element = uFile.getAbsolutePath();
                   }
                   Ref$ObjectRef element = objectRef.element;
                   String str2 = "finalFilePath";
                   a.o(element, str2);
                   Objects.requireNonNull(element, "null cannot be cast to non-null type java.lang.String");
                   str1 = element.toLowerCase();
                   a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                   b = u.H1(str1, ".mp4", false, 2, uBundle);
                   JsSelectMixMediasPrepareResult jsSelectMixM = new JsSelectMixMediasPrepareResult();
                   JsSelectMixMediasResultBase jsSelectMixM1 = new JsSelectMixMediasResultBase();
                   jsSelectMixM1.mTaskId = UUID.randomUUID().toString();
                   jsSelectMixM1.mFilePath = objectRef.element;
                   i1 = (b)? j.b(): j.a();
                   jsSelectMixM1.mFileType = i1;
                   jsSelectMixM.mTasks.add(jsSelectMixM1);
                   this.b.onSuccess(jsSelectMixM);
                   AtomicReference uAtomicRefer = new AtomicReference();
                   String str3 = "params.mThumbnailCompres¡­ltThumbnailCompressConfig";
                   if (b && str != null) {
                      b tc = this.c;
                      td = this.d;
                      JsSelectMixMediasParams mThumbnailCo = this.e.mThumbnailCompressConfig;
                      if (mThumbnailCo == null) {
                         mThumbnailCo = a.b(a.d);
                      }
                      a.o(mThumbnailCo, str3);
                      mUploadToken = this.e.mUploadTokenNeededParams;
                      a.o(mUploadToken, "params.mUploadTokenNeededParams");
                      ot = b$b.a(tc, td, str, mThumbnailCo, null, 8, null).doOnNext(new b$a(this, l, jsSelectMixM1)).concatMap(new b$b(this, p1, objectRef)).map(new b$c(jsSelectMixM1)).concatWith(a.d.h(mUploadToken, jsSelectMixM1, new AtomicReference(objectRef.element), uAtomicRefer));
                      a.o(ot, "compressPlugin\n         ¡­    uploadResultFileUri\)\)");
                   }else {
                      Ref$ObjectRef element1 = objectRef.element;
                      a.o(element1, str2);
                      a uoa = this.c.rc(p1, element1).ignoreElements();
                      b tc1 = this.c;
                      b td1 = this.d;
                      Ref$ObjectRef objectRef1 = objectRef.element;
                      a.o(objectRef1, str2);
                      JsSelectMixMediasParams mThumbnailCo1 = this.e.mThumbnailCompressConfig;
                      if (mThumbnailCo1 == null) {
                         mThumbnailCo1 = a.b(a.d);
                      }
                      JsSelectMixMediasParams jsSelectMixM2 = mThumbnailCo1;
                      a.o(jsSelectMixM2, str3);
                      mUploadToken = this.e.mUploadTokenNeededParams;
                      a.o(mUploadToken, "params.mUploadTokenNeededParams");
                      ot = uoa.d(b$b.a(tc1, td1, objectRef1, jsSelectMixM2, null, 8, null)).doOnNext(new b$d(this, jsSelectMixM1)).map(new b$e(jsSelectMixM1)).concatWith(a.d.h(mUploadToken, jsSelectMixM1, new AtomicReference(objectRef.element), uAtomicRefer));
                      a.o(ot, "compressPlugin.waitEncod¡­    uploadResultFileUri\)\)");
                   }
                   JsSelectMixMediasResultBase mTaskId = jsSelectMixM1.mTaskId;
                   a.o(mTaskId, "task.mTaskId");
                   td = ot.subscribe(new a$b(this.b), new a$c(this.b, jsSelectMixM1), new a$a(this.b, jsSelectMixM1, uAtomicRefer));
                   a.o(td, "observable.subscribe\(\n  ¡­esultFileUri\)\n          \)");
                   a.d.c(mTaskId, td);
                }
             }
          }
       }
       return;
    }
}
