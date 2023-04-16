package azb.m;
import o26.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import o26.b;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.kcube.TabIdentifier;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.google.common.collect.ImmutableList;
import r26.a;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.util.Objects;
import com.yxcorp.gifshow.upload.UploadInfo;
import kotlin.jvm.internal.a;
import lnc.d7;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import java.util.Collection;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import azb.l;
import java.lang.Runnable;
import ekd.k1;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.k;
import nsd.u;
import brd.t;
import tkd.b;
import tkd.d;
import dnc.c2;
import azb.i;
import erd.o;
import cjd.e;
import t45.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import azb.j;
import azb.k;
import erd.g;
import crd.b;

public final class m implements c	// class@000379
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public void Dc(QPhoto p0){
       b.a(this, p0);
    }
    public void S9(){
       b.b(this);
    }
    public void tc(PostStatus p0,int p1,float p2,TabIdentifier p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), p3, this, m.class, "5")) {
          return;
       }
       b.c(this, p0, p1, p2, p3);
       return;
    }
    public void u4(ImmutableList p0,a p1,boolean p2){
       d7 a;
       Object[] objArray;
       t ot1;
       String str2;
       int taskType;
       Object obj = this;
       Object obj1 = p1;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, m.class, "6")) {
          return;
       }
       if (obj1 && p1.getUploadInfo() != null) {
          IUploadInfo uploadInfo = p1.getUploadInfo();
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.upload.UploadInfo";
          Objects.requireNonNull(uploadInfo, str);
          String str1 = "GrowthUploadEnaActionRepo";
          int i = 1;
          int i1 = 0;
          if (a.g(uploadInfo.mTaskScene, "UNKNOWN")) {
             a = d7.a;
             if (a.g(uploadInfo.mTaskScene, a.d()) ^ i) {
                uploadInfo.mTaskScene = a.d();
                objArray = new Object[i1];
                p3.D().w(str1, "onStatusChanged update uploadInfo taskScene to "+uploadInfo.mTaskScene, objArray);
             }
          }
          UploadResult uploadResult = Integer.MIN_VALUE;
          if (uploadInfo.getTaskType() == uploadResult) {
             d7 a1 = d7.a;
             if (uploadInfo.getTaskType() != a1.g()) {
                uploadInfo.mTaskType = a1.g();
                Object[] objArray1 = new Object[i1];
                p3.D().w(str1, "onStatusChanged update uploadInfo taskType to "+uploadInfo.mTaskType, objArray1);
             }
          }
          if (uploadInfo.mPublishedGuideCfgMap == null) {
             uploadInfo.mPublishedGuideCfgMap = new LinkedHashMap();
             Iterator iterator = GrowthGuideConfigCacheHelper.e.a().iterator();
             while (iterator.hasNext()) {
                GrowthGuideConfig growthGuideC = iterator.next();
                List guideItemCfg = growthGuideC.getGuideItemCfgsByStage("uploadConfigs");
                if (guideItemCfg != null) {
                   int i2 = guideItemCfg.isEmpty() ^ i;
                   if (i2) {
                      UploadInfo mPublishedGu = uploadInfo.mPublishedGuideCfgMap;
                      a.o(mPublishedGu, "uploadInfo.mPublishedGuideCfgMap");
                      mPublishedGu.put(Integer.valueOf(growthGuideC.getTaskType()), guideItemCfg.get(i1));
                   }
                }
             }
          }
          if (p1.getStatus() != PostStatus.UPLOAD_COMPLETE) {
             return;
          }else {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, m.class, "2")) {
                objArray = new Object[i1];
                p3.D().w(str1, "doUploadEndAction start", objArray);
                IUploadInfo uploadInfo1 = p1.getUploadInfo();
                Objects.requireNonNull(uploadInfo1, str);
                if (uploadInfo1.isRequestedEndAction()) {
                   Object[] objArray2 = new Object[i1];
                   p3.D().A(str1, "doUploadEndAction isRequestedEndAction", objArray2);
                }else if(PatchProxy.applyVoidOneRefs(uploadInfo1, obj, m.class, "7")){
                   k1.o(new l(uploadInfo1));
                }
                List list = PatchProxy.applyOneRefs(uploadInfo1, obj, m.class, "4");
                if (list != patchProxyRe) {
                }else {
                   taskType = uploadInfo1.getTaskType();
                   if (taskType == uploadResult) {
                      UploadInfo mPublishedGu1 = uploadInfo1.mPublishedGuideCfgMap;
                      if (mPublishedGu1 != null) {
                         Set set = mPublishedGu1.keySet();
                         if (set != null) {
                            list = CollectionsKt___CollectionsKt.G5(set);
                            if (list == null) {
                            }
                         }else {
                         }
                      }else {
                      }
                   }else {
                      Integer[] integerArray = new Integer[i];
                      integerArray[i1] = Integer.valueOf(taskType);
                      list = CollectionsKt__CollectionsKt.P(integerArray);
                   }
                }
                uploadResult = uploadInfo1.getUploadResult();
                uploadResult = (uploadResult != null)? uploadResult.mPhotoId: null;
                k ok = v14;
                k ok1 = v14;
                ok = new k(uploadResult, null, null, 0, 14, 0);
                RxBus.f.b(ok1);
                uploadInfo1.markRequestedEndAction();
                t ot = PatchProxy.applyOneRefs(uploadInfo1, obj, m.class, "1");
                if (ot != patchProxyRe) {
                }else {
                   Object[] objArray3 = new Object[0];
                   p3.D().w(str1, "buildParams", objArray3);
                   UploadInfo mUploadParam = uploadInfo1.mUploadParams;
                   ot = (mUploadParam == null || mUploadParam.isEmpty())? 1: 0;
                   if (!ot) {
                      Object[] objArray4 = new Object[0];
                      p3.D().w(str1, "buildParams get directly", objArray4);
                      ot1 = t.just(uploadInfo1.mUploadParams);
                      a.o(ot1, "Observable.just\(uploadInfo.mUploadParams\)");
                   }else {
                      ot1 = d.a(0x3f7e4959).CD(uploadInfo1);
                      a.o(ot1, "PluginManager.get\(Upload¡­enerateFields\(uploadInfo\)");
                   }
                   ot = ot1;
                }
                ot.flatMap(new i(uploadResult, list, uploadInfo1)).map(new e()).subscribeOn(d.c).observeOn(d.a).timeout(5000, TimeUnit.MILLISECONDS).subscribe(new j(uploadInfo1, list, uploadResult, obj1), new k(obj1, uploadResult));
             }
          }
       }
    label_0220 :
       return;
    }
}
