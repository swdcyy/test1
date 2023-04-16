package com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import wba.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.AssetSegment;
import naa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$1;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2;
import com.yxcorp.gifshow.edit.draft.model.c;
import msd.p;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.Integer;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import qr4.k$b;
import wba.i;
import com.kuaishou.edit.draft.EffectSource;
import java.util.Objects;
import qr4.e$h;
import km6.f;
import saa.a;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$1;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2;
import com.kuaishou.edit.draft.ColorFilter;
import qr4.e$i;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.util.Collection;
import xaa.a;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2;
import com.kuaishou.edit.draft.Makeup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import qr4.k$g;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import qr4.k$g$a;

public final class VideoContextDraftExtKt	// class@001b22
{

    public static final void a(VideoContext p0,c p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, VideoContextDraftExtKt.class, "3")) {
          return;
       }
       a.p(p0, "$this$updateEditMultiBeauty");
       a.p(p1, "draft");
       a.p(p2, "beautifyConfigGetter");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = z.y(p1).iterator();
       boolean i = 0;
       while (iterator.hasNext()) {
          Beauty obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = z.a.e(p1, obj.getIdentifier(), a.g(p1), VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$1.INSTANCE, VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2.INSTANCE);
          k$b uob = null;
          if (obj != null) {
             FeatureId featureId = obj.getFeatureId();
             a.o(featureId, "beauty.featureId");
             BeautifyConfig uBeautifyCon = p2.invoke(Integer.valueOf(featureId.getInternalValue()));
             if (uBeautifyCon != null && uBeautifyCon.mId > null) {
                uob = i.b(obj, i);
                a.o(uob, "BeautifyConfigConverter.¡­MetaBeauty\(beauty, index\)");
                uob.h = uBeautifyCon.mUseQuickBeauty;
                uob.j = i;
                i = (obj.getEffectSource() != EffectSource.PIC_TEMPLATE)? true: false;
                uob.i = i;
             }
          }
          if (uob) {
             uArrayList.add(uob);
          }
          i = i1;
       }
       k$b[] uobArray = new k$b[0];
       Object[] objArray = uArrayList.toArray(uobArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       p0.X = objArray;
       return;
    }
    public static final void b(VideoContext p0,c p1,l p2){
       e$i oi;
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, VideoContextDraftExtKt.class, "2")) {
          return;
       }
       a.p(p0, "$this$updateEditMultiEditFilter");
       a.p(p1, "projectDraft");
       a.p(p2, "filterConfigGetter");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = z.y(p1).iterator();
       int i = 0;
       while (iterator.hasNext()) {
          ColorFilter obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = z.a.e(p1, obj.getIdentifier(), a.e(p1), VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$1.INSTANCE, VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2.INSTANCE);
          if (obj != null) {
             oi = new e$i();
             oi.b = (float)obj.getIntensity();
             FeatureId featureId = obj.getFeatureId();
             a.o(featureId, "colorFilter.featureId");
             FilterConfig uFilterConfi = p2.invoke(Integer.valueOf(featureId.getInternalValue()));
             if (uFilterConfi != null) {
                str = String.valueOf(uFilterConfi.mFilterId);
                if (str != null) {
                label_0087 :
                   oi.a = str;
                   oi.i = obj.getIsReco();
                   boolean b = (obj.getEffectSource() != EffectSource.PIC_TEMPLATE)? true: false;
                   oi.j = b;
                   oi.k = i;
                }
             }
             str = "";
             goto label_0087 ;
          }else {
             oi = 0;
          }
          if (oi) {
             uArrayList.add(oi);
          }
          i = i1;
       }
       e$i[] oiArray = new e$i[0];
       Object[] objArray = uArrayList.toArray(oiArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       VideoContext videoContext = p1.d1();
       a.o(videoContext, "projectDraft.videoContext");
       videoContext.V = objArray;
       return;
    }
    public static final void c(VideoContext p0,c p1,l p2){
       Object obj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, VideoContextDraftExtKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$updateEditMultiMakeup");
       a.p(p1, "projectDraft");
       a.p(obj, "makeupGetter");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = z.y(p1).iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Makeup obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj1 = z.a.e(p1, obj1.getIdentifier(), a.h(p1), VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1.INSTANCE, VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2.INSTANCE);
          k$g og = null;
          if (obj1 != null) {
             String primaryTypeI = obj1.getPrimaryTypeId();
             a.o(primaryTypeI, "makeup.primaryTypeId");
             a uoa = obj.invoke(primaryTypeI);
             if (uoa != null) {
                og = new k$g();
                og.a = uoa.a;
                ArrayList uArrayList1 = new ArrayList();
                a c = uoa.c;
                a.o(c, "curConfig.mSubConfigs");
                Iterator iterator1 = c.iterator();
                int i2 = 0;
                while (iterator1.hasNext()) {
                   a$a uoa1 = iterator1.next();
                   uArrayList1.add(new k$g$a());
                   uArrayList1.get(i2).c = uoa1.e;
                   uArrayList1.get(i2).b = uoa1.c;
                   uArrayList1.get(i2).a = uoa1.a;
                   i2 = i2 + 1;
                }
                k$g$a[] og$aArray = new k$g$a[0];
                Object[] objArray = uArrayList1.toArray(og$aArray);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                og.b = objArray;
                og.e = uoa.e;
                og.h = i;
                boolean b = (obj1.getEffectSource() != EffectSource.PIC_TEMPLATE)? true: false;
                og.g = b;
             }
          }
          if (og) {
             uArrayList.add(og);
          }
          i = i1;
       }
       k$g[] ogArray = new k$g[0];
       Object[] objArray1 = uArrayList.toArray(ogArray);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       VideoContext videoContext = p1.d1();
       a.o(videoContext, "projectDraft.videoContext");
       f.d(videoContext).W = objArray1;
       return;
    }
}
