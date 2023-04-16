package l90.f;
import g26.a;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import lnc.g7;
import n46.a;
import i90.f;
import java.lang.Boolean;
import x80.k2;
import com.kwai.ykitlib.YKitRunnerObj;
import lq.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.Pair;
import androidx.lifecycle.MutableLiveData;
import tkd.b;
import tkd.d;
import u80.j;
import t45.d;
import brd.z;
import l90.a;
import erd.a;
import l90.c;
import l90.b;
import erd.g;
import crd.b;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import mca.a;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kwai.video.clipkit.mv.ExtraInterface;
import x80.z1;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import com.kwai.video.ksspark.NewSparkTemplateManager$SparkTemplateDelegate;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.google.gson.Gson;
import java.lang.Thread;
import android.os.Looper;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.g;
import io.reactivex.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import y80.b;
import y80.h;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.h;
import com.kuaishou.gifshow.kuaishan.logic.i;
import com.kuaishou.gifshow.kuaishan.logic.j;
import com.kuaishou.gifshow.kuaishan.logic.k;
import brd.w;
import com.kuaishou.gifshow.kuaishan.logic.f;
import java.lang.IllegalArgumentException;
import com.kuaishou.gifshow.kuaishan.logic.l1;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import g26.d;
import e17.i;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import android.app.Activity;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.kwai.ykitlib.YKitInfo$YKitJsonParam;
import com.kwai.ykitlib.YKitInfo$YKitFrame;
import com.kwai.ykitlib.YKitInfo$YKitImage;
import com.kwai.ykitlib.YKitInfo$YKitFaceData;
import java.util.Iterator;
import java.util.LinkedList;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceInfo;
import com.kwai.ykitlib.YKitInfo$YKitFaceInfo;
import com.kwai.kscnnrenderlib.YCNNComm$KSPtInfo;
import com.kwai.ykitlib.YKitInfo$YKitFacePoint;
import com.kwai.ykitlib.YKitInfo$YKitOut;
import com.kwai.ykitlib.YKitInfo;
import java.lang.Math;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.util.PostUtils;
import l90.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import x80.k;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KSPostKuaiShanVideoEditActivity;
import boc.e;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.io.File;
import lq.l;
import com.kwai.ykitlib.YKitInfo$YKitConfig;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import i90.a;
import i90.b;
import cjd.e;
import l90.d;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$a;
import q46.g;
import com.kuaishou.android.post.PostArguments;
import java.lang.Number;

public class f implements a	// class@002532
{

    public void f(){
       super();
    }
    public t Cr(String p0,long p1,long p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, f.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g7.m(p0, p1, p2);
    }
    public a DJ(){
       Object obj = PatchProxy.apply(null, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
    public boolean Gz(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k2 obj = PatchProxy.apply(null, this, f.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = k2.f();
       _monitor_enter(obj);
       Object obj1 = PatchProxy.apply(null, obj, k2.class, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          k2 a = obj.a;
          b = (a != null && a.ready())? true: false;
       }
       _monitor_exit(obj);
       return b;
    }
    public boolean Jx(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!i.h() || i.m().D())? true: false;
       return b;
    }
    public Pair L3(GifshowActivity p0,String p1,String p2){
       MutableLiveData obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MutableLiveData();
       return new Pair(obj, d.a(-215111236).L3(p0, p1, p2).observeOn(d.a).doOnDispose(a.b).subscribe(new c(p0, obj), new b(obj)));
    }
    public boolean M10(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, h1.class, "28");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.u();
          String str = e.m();
          ExtraInterface uExtraInterf = e.l(KSDownloadHelperX.l().j(true));
          b = (e.F())? new NewSparkTemplateManager(new z1(uExtraInterf, str)).isNewSpark(p0) ^ true: false;
       }
       return b;
    }
    public t X20(String p0,String p1){
       t ot2;
       String id;
       t ot5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDownloadHelperX obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KSDownloadHelperX.class;
       String obj1 = null;
       t ot = PatchProxy.applyTwoRefs(p0, p1, obj1, m1.class, "9");
       if (ot != patchProxyRe) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          e.D().s("KuaiShanManager", "verifyTemplate\(\) called with: templateInfo = ["+p0+"] templateDir="+p1, objArray);
          KSTemplateDetailInfo kSTemplateDe = a.a.h(p0, KSTemplateDetailInfo.class);
          if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
             p1 = PatchProxy.applyOneRefs(kSTemplateDe, obj1, obj, "30");
             boolean b = (p1 != patchProxyRe)? p1.booleanValue(): KSDownloadHelperX.o.f(kSTemplateDe);
             if (!b && KSDownloadHelperX.o(kSTemplateDe)) {
                ot = t.just(Integer.valueOf(100));
             }else {
                ot = t.error(new RuntimeException("check failed"));
             }
          }else {
             ot = KSResourceDownloader.d().c(kSTemplateDe);
             t ot1 = KSDownloadHelperX.p(kSTemplateDe);
             KSDownloadHelperX$a obj2 = PatchProxy.applyTwoRefs(kSTemplateDe, p1, obj1, obj, "28");
             if (obj2 != patchProxyRe) {
             }else {
                obj2 = KSDownloadHelperX.o;
                Objects.requireNonNull(obj2);
                obj2 = PatchProxy.applyTwoRefs(kSTemplateDe, p1, obj2, KSDownloadHelperX$a.class, "7");
                if (obj2 != patchProxyRe) {
                }else {
                   a.p(kSTemplateDe, "info");
                   a.p(p1, "templateDir");
                   objArray = new Object[i];
                   e.D().w("KS_Hodor", "verifyTemplate\(\) called with: info = "+kSTemplateDe+", templateDir = "+p1, objArray);
                   String uniqueIdenti = kSTemplateDe.getUniqueIdentifier();
                   a.o(uniqueIdenti, "info.uniqueIdentifier");
                   obj1 = 1;
                   int i1 = (!uniqueIdenti.length())? 1: 0;
                   if (!i1) {
                      if (p1.length()) {
                         obj1 = null;
                      }
                      if (!obj1) {
                         t ot3 = t.create(new g(kSTemplateDe));
                         a.o(ot3, "Observable.create { emit¡­tter.onComplete\(\)\n      }");
                         String str = "info.id";
                         if (a.g(kSTemplateDe.mTemplateSrc, "1")) {
                            KSDataManager kSDataManage = KSDataManager.q.a();
                            id = kSTemplateDe.getId();
                            a.o(id, str);
                            Objects.requireNonNull(kSDataManage);
                            t ot4 = PatchProxy.applyOneRefs(id, kSDataManage, KSDataManager.class, "37");
                            if (ot4 != patchProxyRe) {
                            }else {
                               a.p(id, "effectId");
                               Object[] objArray1 = new Object[i];
                               e.D().w("KSDataManager", "getTemplateZTDetail\(\) called with: tid = "+id, objArray1);
                               ot4 = kSDataManage.k.d(id).map(new h(id));
                               a.o(ot4, "mKSDataAPIProvider.creat¡­          it[0]\n        }");
                            }
                            ot5 = ot4.map(h.b).doOnNext(new i(kSTemplateDe));
                         }else {
                            obj1 = kSTemplateDe.getId();
                            a.o(obj1, str);
                            ot5 = KSDataManager.q.a().C0(obj1);
                            ot5 = ot5.map(j.b).doOnNext(new k(kSTemplateDe));
                         }
                         ot2 = ot3.switchIfEmpty(ot5).map(new f(p1, kSTemplateDe)).subscribeOn(d.c);
                         a.o(ot2, "cache.switchIfEmpty\(net\)¡­eOn\(KwaiSchedulers.ASYNC\)");
                      label_01f2 :
                         obj2 = ot2;
                      }
                   }
                   ot2 = t.error(new IllegalArgumentException("wrong arg templateDir="+p1+" info.uniqueIdentifier="+kSTemplateDe+".uniqueIdentifier"));
                   a.o(ot2, "Observable.error\(Illegal¡­$info.uniqueIdentifier\"\)\)");
                   goto label_01f2 ;
                }
             }
             ot = t.concat(ot, ot1, obj2.flatMap(l1.b));
          }
       }
       return ot;
    }
    public void XF(GifshowActivity p0,KuaishanPageParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (!d.b()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101bca);
          return;
       }else {
          KSPostPreviewActivity.I3(KSLaunchParams.createdByKSPageParam(p1), p0, false);
          return;
       }
    }
    public boolean Yz(YCNNModelInfo$KSFaceDetectOut p0,Bitmap p1,boolean p2){
       Iterator obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "15");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       k2 ok2 = k2.f();
       _monitor_enter(ok2);
       boolean b = true;
       if (PatchProxy.isSupport(k2.class)) {
          obj = PatchProxy.applyThreeRefs(p1, p0, Boolean.valueOf(p2), ok2, k2.class, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
             _monitor_exit(ok2);
          }else {
          label_0050 :
             k2 a = ok2.a;
             if (a == null || !a.ready()) {
                PostUtils.D("KuaishanIllegalInfoDetectManager", "detectIllegalInfo\(\) ykit runner not ready", new IllegalStateException());
                _monitor_exit(ok2);
             }else {
                ByteBuffer uByteBuffer = ByteBuffer.allocate(p1.getByteCount());
                p1.copyPixelsToBuffer(uByteBuffer);
                ok2.a.getParam().jsonStr = "{\"face_attribute_param\":{\"use_politic\": 1}}";
                YKitInfo$YKitFrame yKitFrame = new YKitInfo$YKitFrame();
                YKitInfo$YKitFrame imageIn = yKitFrame.imageIn;
                imageIn.colorType = 0;
                imageIn.width = p1.getWidth();
                yKitFrame.imageIn.height = p1.getHeight();
                yKitFrame.imageIn.data = uByteBuffer.array();
                yKitFrame.imageIn.singleImage = p2;
                YKitInfo$YKitFaceData yKitFaceData = new YKitInfo$YKitFaceData();
                obj = p0.faces.iterator();
                while (obj.hasNext()) {
                   YCNNModelInfo$KSFaceInfo kSFaceInfo = obj.next();
                   YKitInfo$YKitFaceInfo yKitFaceInfo = new YKitInfo$YKitFaceInfo();
                   yKitFaceInfo.index = kSFaceInfo.index;
                   yKitFaceInfo.left = kSFaceInfo.left;
                   yKitFaceInfo.top = kSFaceInfo.top;
                   yKitFaceInfo.width = kSFaceInfo.width;
                   yKitFaceInfo.height = kSFaceInfo.height;
                   yKitFaceInfo.confidence = kSFaceInfo.confidence;
                   yKitFaceInfo.yaw = kSFaceInfo.yaw;
                   yKitFaceInfo.pitch = kSFaceInfo.pitch;
                   yKitFaceInfo.roll = kSFaceInfo.roll;
                   Iterator iterator = kSFaceInfo.pos.iterator();
                   while (iterator.hasNext()) {
                      YCNNComm$KSPtInfo kSPtInfo = iterator.next();
                      YKitInfo$YKitFacePoint yKitFacePoin = new YKitInfo$YKitFacePoint();
                      yKitFacePoin.xPos = kSPtInfo.xPos;
                      yKitFacePoin.yPos = kSPtInfo.yPos;
                      yKitFacePoin.zPos = kSPtInfo.zPos;
                      yKitFacePoin.valid = kSPtInfo.valid;
                      yKitFaceInfo.pos.add(yKitFacePoin);
                   }
                   yKitFaceData.faces.add(yKitFaceInfo);
                }
                yKitFrame.faceData = yKitFaceData;
                ok2.a.run(yKitFrame);
                YKitInfo$YKitOut anyPtr = ok2.a.getOut().anyPtr;
                String[] stringArray = new String[]{"face_attribute_out","attr"};
                int anyArraySize = YKitInfo.getAnyArraySize(stringArray, anyPtr);
                String[] stringArray1 = new String[]{"politic"};
                int i = 0;
                while (true) {
                   if (i < anyArraySize) {
                      float floatFromAny = YKitInfo.getFloatFromAnyArray(stringArray, i, stringArray1, anyPtr);
                      Object[] objArray = new Object[0];
                      e.D().w("KuaishanIllegalInfoDetectManager", "hasIllegalFaceInfo\(\) politic="+floatFromAny, objArray);
                      double d = (double)floatFromAny;
                      double d1 = d - 0;
                      if (Math.abs(d1) - 0x3f50624dd2f1a9fc >= 0) {
                         d = d - 0x3ff0000000000000;
                         if (Math.abs(d) - 0x3f50624dd2f1a9fc >= 0) {
                            floatFromAny = 0;
                         label_0172 :
                            if (floatFromAny) {
                               _monitor_exit(ok2);
                               break ;
                            }else {
                               i++;
                            }
                         }
                      }
                      floatFromAny = Float.MIN_VALUE;
                      goto label_0172 ;
                   }else {
                      _monitor_exit(ok2);
                   }
                }
             }
             b = false;
          }
       }else {
          goto label_0050 ;
       }
       return b;
    }
    public t cE(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDataManager.B0().C0(p0).flatMap(e.b);
    }
    public PresenterV2 eB(){
       Object obj = PatchProxy.applyWithListener(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(f.class, "7");
       return new k();
    }
    public boolean g20(Activity p0){
       return p0 instanceof KSPostKuaiShanVideoEditActivity;
    }
    public boolean isAvailable(){
       return true;
    }
    public int lo(){
       return 17;
    }
    public void on(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "14")) {
          return;
       }
       k2 ok2 = k2.f();
       Objects.requireNonNull(ok2);
       if (!PatchProxy.applyVoid(objArray, ok2, k2.class, "1")) {
          String str = MagicEmojiResourceHelper.h(e.l.mResource);
          if (new File(str).exists()) {
             if (i.h()) {
                i.m().f(ok2);
             }
             YKitInfo$YKitConfig yKitConfig = new YKitInfo$YKitConfig();
             yKitConfig.moduleType = "ykit_face_attr";
             yKitConfig.modelPath = str;
             yKitConfig.useMode = "ycnn_v3";
             yKitConfig.business = "video_record";
             if (ok2.a != null) {
                Object[] objArray1 = new Object[0];
                e.D().w("KuaishanIllegalInfoDetectManager", "init\(\) already has mYkitRunnerAttr, release", objArray1);
                ok2.g();
             }
             YKitRunnerObj yKitRunnerOb = new YKitRunnerObj(yKitConfig);
             ok2.a = yKitRunnerOb;
             yKitRunnerOb.init();
          }else {
             throw new KSException(-38, "no face attributes file"+str);
          }
       }
       return;
    }
    public YCNNModelInfo$KSFaceDetectOut rb(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(p0);
    }
    public t sP(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().n("["+p0+"]", g7.j(), 17).map(new e()).map(new d(p0));
    }
    public Intent uO(Activity p0,QMedia p1,KSAssetExportInfo p2,String p3,boolean p4,boolean p5,String p6,boolean p7){
       Intent obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),p6,Boolean.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, uof, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Intent(p0, KSPostKuaiShanVideoEditActivity.class);
       SerializableHook.putExtra(obj, "intent_key_qmedia", p1);
       SerializableHook.putExtra(obj, "intent_key_asset_info", p2);
       obj.putExtra("INTENT_KEY_MAGIC_ID", p3);
       obj.putExtra("INTENT_KEY_HAS_SOUND", p5);
       obj.putExtra("INTENT_KEY_NEED_CLIP", p4);
       obj.putExtra("INTENT_KEY_TASK_ID", p6);
       obj.putExtra("INTENT_KEY_FAKE_CLIP", p7);
       return obj;
    }
    public void uV(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       k2.f().g();
       return;
    }
    public Intent v10(GifshowActivity p0,KuaishanPageParam p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       Intent intent = null;
       if (!d.b()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100a34);
          return intent;
       }else if(p1.mToAlbum != null){
          KSLaunchParams kSLaunchPara = KSLaunchParams.createdByKSPageParam(p1);
          KuaiShanEditActivityV2$a obj1 = PatchProxy.applyTwoRefs(p0, kSLaunchPara, intent, KuaiShanEditActivityV2.class, "17");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = KuaiShanEditActivityV2.X;
             Objects.requireNonNull(obj1);
             Object obj2 = PatchProxy.applyTwoRefs(p0, kSLaunchPara, obj1, KuaiShanEditActivityV2$a.class, str);
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else {
                a.p(p0, "activity");
                a.p(kSLaunchPara, "ksLaunchParams");
                Intent intent1 = new Intent(p0, KuaiShanEditActivityV2.class);
                g.a(intent1, kSLaunchPara.isGoHomeOnComplete());
                SerializableHook.putExtra(intent1, "intent_ks_launch_param", kSLaunchPara);
                KSLaunchParams mPostArgumen = kSLaunchPara.mPostArguments;
                if (mPostArgumen != null) {
                   mPostArgumen.write(intent1);
                }
                obj1 = intent1;
             }
          }
          return obj1;
       }else {
          return KSPostPreviewActivity.G3(KSLaunchParams.createdByKSPageParam(p1), p0);
       }
    }
    public int xs(){
       Object obj = PatchProxy.apply(null, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return g7.j();
    }
}
