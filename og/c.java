package og.c;
import n3d.a;
import f55.g;
import b26.b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import java.util.ArrayList;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasPrepareResult;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.util.UUID;
import kotlin.jvm.internal.a;
import og.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import og.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import java.lang.Integer;
import brd.t;
import og.c$a;
import erd.g;
import og.c$b;
import erd.o;
import og.c$c;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$UploadTokenNeededParams;
import brd.w;
import og.a$b;
import og.a$c;
import og.a$a;
import erd.a;
import crd.b;
import lnc.a1;
import android.os.Bundle;

public final class c implements a	// class@00279d
{
    public final g b;
    public final b c;
    public final Activity d;
    public final JsSelectMixMediasParams e;

    public void c(g p0,b p1,Activity p2,JsSelectMixMediasParams p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Bundle uBundle = null;
       int i = 0x7f1004c5;
       if (p1 == -1 && p2 != null) {
          ArrayList uArrayList = j0.e(p2, "album_data_list");
          if (uArrayList == null || uArrayList.isEmpty()) {
             this.b.a(0, a1.p(i), uBundle);
             return;
          }else {
             JsSelectMixMediasPrepareResult jsSelectMixM = new JsSelectMixMediasPrepareResult();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                QMedia qMedia = iterator.next();
                QMedia path = qMedia.path;
                path = (path == null || !path.length())? 1: null;
                if (path) {
                   continue ;
                }else {
                   JsSelectMixMediasResultBase jsSelectMixM1 = new JsSelectMixMediasResultBase();
                   jsSelectMixM1.mTaskId = UUID.randomUUID().toString();
                   jsSelectMixM1.mFilePath = qMedia.path;
                   a.o(qMedia, "media");
                   int i1 = (qMedia.isVideo())? j.b(): j.a();
                   jsSelectMixM1.mFileType = i1;
                   jsSelectMixM.mTasks.add(jsSelectMixM1);
                   AtomicReference uAtomicRefer = new AtomicReference();
                   AtomicReference uAtomicRefer1 = new AtomicReference();
                   uAtomicRefer1.set(jsSelectMixM1.mFilePath);
                   c tc = this.c;
                   c td = this.d;
                   JsSelectMixMediasResultBase mFilePath = jsSelectMixM1.mFilePath;
                   a.o(mFilePath, "task.mFilePath");
                   JsSelectMixMediasParams mThumbnailCo = this.e.mThumbnailCompressConfig;
                   if (mThumbnailCo == null) {
                      mThumbnailCo = a.b(a.d);
                   }
                   a.o(mThumbnailCo, "params.mThumbnailCompres¡­ltThumbnailCompressConfig");
                   a d = a.d;
                   JsSelectMixMediasParams mUploadToken = this.e.mUploadTokenNeededParams;
                   a.o(mUploadToken, "params.mUploadTokenNeededParams");
                   b uob = tc.Qp(td, mFilePath, mThumbnailCo, Integer.valueOf(jsSelectMixM1.mFileType)).doOnNext(new c$a(this, jsSelectMixM1)).concatMap(new c$b(this, jsSelectMixM1)).map(new c$c(this, uAtomicRefer1, jsSelectMixM1)).concatWith(d.h(mUploadToken, jsSelectMixM1, uAtomicRefer1, uAtomicRefer)).subscribe(new a$b(this.b), new a$c(this.b, jsSelectMixM1), new a$a(this.b, jsSelectMixM1, uAtomicRefer));
                   a.o(uob, "compressPlugin\n         ¡­tFileUri\)\n              \)");
                   jsSelectMixM1 = jsSelectMixM1.mTaskId;
                   a.o(jsSelectMixM1, "task.mTaskId");
                   d.c(jsSelectMixM1, uob);
                }
             }
             this.b.onSuccess(jsSelectMixM);
          }
       }else {
          this.b.a(0, a1.p(i), uBundle);
       }
       return;
    }
}
