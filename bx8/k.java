package bx8.k;
import bx8.k$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cx8.h;
import cx8.g;
import java.lang.Long;
import t45.d;
import brd.z;
import bx8.k$b;
import erd.o;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import tw8.g;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.Math;
import com.kwai.video.editorsdk2.RemuxTaskInputParams;
import android.content.Context;
import lnc.a1;
import com.kwai.video.editorsdk2.RemuxTask;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.RemuxTaskInputParamsBuilder;
import com.kwai.video.editorsdk2.RemuxTaskInputStreamType;
import java.util.Objects;
import kotlin.jvm.internal.Ref$ObjectRef;
import tw8.e;
import io.reactivex.g;
import tw8.f;
import erd.a;
import bx8.k$f;
import erd.r;
import bx8.k$g;
import bx8.k$c;
import erd.g;
import bx8.k$d;
import bx8.k$e;

public final class k	// class@000480
{
    public final a a;
    public boolean b;
    public final a c;
    public b d;
    public EditorSdk2V2$VideoEditorProject e;
    public final QPhoto f;
    public final c g;
    public static final k$a h;

    static {
       k.h = new k$a(null);
    }
    public void k(QPhoto p0,c p1){
       a.p(p0, "photo");
       a.p(p1, "draft");
       super();
       this.f = p0;
       this.g = p1;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.a = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.c = uoa;
    }
    public final QPhoto a(){
       return this.f;
    }
    public final t b(){
       t obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.i() != null || this.b != null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareReEditRepo", "getReEditRepo have download or is downloading: "+this.b, objArray);
          return this.a;
       }else {
          this.b = true;
          Long longx = Long.valueOf(this.f.getPhotoId());
          a.o(longx, "java.lang.Long.valueOf\(photo.photoId\)");
          obj = g.a().g(longx.longValue()).observeOn(d.a).map(new k$b(this));
          a.o(obj, "PublishApi.getApiService¡­n@map it.body\(\)\n        }");
          return obj;
       }
    }
    public final t c(){
       t ot;
       double d4;
       Object[] obj2;
       String str4;
       Object[] objArray3;
       ArrayList uArrayList1;
       RemuxTaskInputParams remuxTaskInp;
       double d7;
       t obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k obj1 = PatchProxy.apply(null, obj, k.class, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareReEditRepo";
       a.b().w(str, "startEncode", objArray);
       obj1 = obj.e;
       if (obj1 != null) {
          a.m(obj1);
          Object[] objArray1 = obj1.trackAssets().toNormalArray();
          a.o(objArray1, "videoProject!!.trackAssets\(\).toNormalArray\(\)");
          String str1 = (!objArray1.length)? 1: null;
          if (str1) {
          label_02fa :
             Object[] objArray2 = new Object[0];
             a.b().w(str, "videoProject is null, return ", objArray2);
             ot = t.just("");
          }else {
             obj1 = obj.e;
             a.m(obj1);
             objArray1 = obj1.audioAssets().toNormalArray();
             a.o(objArray1, "videoProject!!.audioAssets\(\).toNormalArray\(\)");
             objArray1 = (!objArray1.length)? 1: null;
             if (objArray1) {
                objArray1 = new Object[i];
                a.b().w(str, "videoProject has no audio asset, return track asset", objArray1);
                k e = obj.e;
                a.m(e);
                ot = t.just(e.trackAssets(i).assetPath());
             }else {
                obj1 = obj.e;
                a.m(obj1);
                File uFile = b.X(b.a(-1504323719).c(".video_cache"), ".mp4");
                a.o(uFile, "FileUtils.newFile\(\n     ¡­    FileUtils.MP4_SUFFIX\)");
                str = uFile.getAbsolutePath();
                String str2 = obj1.trackAssets(i).assetPath();
                a.o(str2, "tempProject.trackAssets\(0\).assetPath\(\)");
                double d = obj1.trackAssets(i).clippedRange().start();
                double d1 = obj1.trackAssets(i).clippedRange().duration();
                String str3 = obj1.audioAssets(i).assetPath();
                a.o(str3, "tempProject.audioAssets\(0\).assetPath\(\)");
                double d2 = obj1.audioAssets(i).clippedRange().start();
                double d3 = obj1.audioAssets(i).clippedRange().duration();
                str1 = "outputFilePath";
                a.o(str, str1);
                g og = g.class;
                if (PatchProxy.isSupport(og)) {
                   objArray = new Object[]{str2,Double.valueOf(d),Double.valueOf(d1),str3,Double.valueOf(d2),Double.valueOf(d3),str};
                   d4 = d1;
                   obj2 = PatchProxy.apply(objArray, null, og, "1");
                   if (obj2 != patchProxyRe) {
                      str4 = str;
                   }else {
                   label_0131 :
                      a.p(str2, "videoPath");
                      String str5 = "audioPath";
                      a.p(str3, str5);
                      a.p(str, str1);
                      ArrayList uArrayList = new ArrayList();
                      String str6 = str1;
                      String str7 = str;
                      String str8 = "videoPath";
                      obj2 = new Object[0];
                      a.b().w("RemuxEncodeUtils", "audioPath:"+str3+" audioDuration:"+d3+" audio start:"+d2, obj2);
                      double d5 = d;
                      d = d4;
                      while (d - 0x3fa999999999999a > 0) {
                         String str9 = str2;
                         objArray3 = new Object[0];
                         a.b().w("RemuxEncodeUtils", "restDuration:"+d, objArray3);
                         uArrayList1 = uArrayList;
                         d1 = Math.min(d, d3);
                         double d6 = d3;
                         objArray3 = new Object[0];
                         a.b().w("RemuxEncodeUtils", "audio duration:"+d1, objArray3);
                         if (PatchProxy.isSupport(og)) {
                            remuxTaskInp = PatchProxy.applyThreeRefs(str3, Double.valueOf(d2), Double.valueOf(d1), null, g.class, "3");
                            if (remuxTaskInp != patchProxyRe) {
                            label_020b :
                               uArrayList1.add(remuxTaskInp);
                               d = d - d1;
                               uArrayList = uArrayList1;
                               str2 = str9;
                               d3 = d6;
                            }
                         }
                         a.p(str3, str5);
                         remuxTaskInp = EditorSdk2Utils.newRemuxTask(a1.c()).newRemuxInputParamsBuilder().setPath(str3).setStartTime(d2).setDuration(d1).setType(RemuxTaskInputStreamType.AUDIO).build();
                         a.o(remuxTaskInp, "EditorSdk2Utils.newRemux¡­e.AUDIO\)\n        .build\(\)");
                         goto label_020b ;
                      }
                      uArrayList1 = uArrayList;
                      String str10 = str2;
                      d = d5;
                      d1 = d4;
                      objArray3 = new Object[0];
                      a.b().w("RemuxEncodeUtils", "video path:"+str10+"  start:"+d+"  duration:"+d1, objArray3);
                      if (PatchProxy.isSupport(og)) {
                         d7 = d1;
                         remuxTaskInp = PatchProxy.applyThreeRefs(str10, Double.valueOf(d), Double.valueOf(d1), null, g.class, "4");
                         if (remuxTaskInp != patchProxyRe) {
                         label_0297 :
                            RemuxTaskInputParams[] remuxTaskInp1 = new RemuxTaskInputParams[0];
                            obj2 = uArrayList1.toArray(remuxTaskInp1);
                            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<T>");
                            Ref$ObjectRef obj3 = PatchProxy.applyThreeRefs(remuxTaskInp, obj2, str7, null, g.class, "2");
                            if (obj3 != patchProxyRe) {
                               obj = obj3;
                               str4 = str7;
                            }else {
                               a.p(remuxTaskInp, "videoParams");
                               a.p(obj2, "audioParams");
                               str4 = str7;
                               a.p(str4, str6);
                               obj3 = new Ref$ObjectRef();
                               obj3.element = null;
                               obj = t.create(new e(obj2, remuxTaskInp, str4, obj3)).doOnDispose(new f(obj3));
                               a.o(obj, "Observable.create<Double\x20\x02ose { remuxer?.cancel\(\) }\x00");
                            }
                         }
                      }else {
                         d7 = d1;
                      }
                      a.p(str10, str8);
                      remuxTaskInp = EditorSdk2Utils.newRemuxTask(a1.c()).newRemuxInputParamsBuilder().setPath(str10).setStartTime(d).setDuration(d7).setType(RemuxTaskInputStreamType.VIDEO).build();
                      a.o(remuxTaskInp, "EditorSdk2Utils.newRemux¡­e.VIDEO\)\n        .build\(\)");
                      goto label_0297 ;
                   }
                }else {
                   d4 = d1;
                   goto label_0131 ;
                }
                ot = obj2.filter(k$f.b).map(new k$g(str4));
             }
          }
       }else {
          goto label_02fa ;
       }
       obj1 = this;
       obj = ot.doOnNext(new k$c(obj1)).doOnSubscribe(new k$d(obj1)).doOnComplete(new k$e(obj1));
       a.o(obj, "encodeObservable\n       ¡­ remixDisposable = null }");
       return obj;
    }
}
