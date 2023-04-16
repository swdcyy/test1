package com.yxcorp.gifshow.encode.k1;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.encode.f1;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import pr3.e;
import java.lang.Iterable;
import t45.d;
import brd.z;
import pca.i2;
import erd.o;
import com.yxcorp.gifshow.encode.i1;
import erd.g;
import pca.f2;
import com.yxcorp.gifshow.encode.h1;
import erd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.AuditFrameUploadParam;
import java.lang.reflect.Type;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import com.yxcorp.gifshow.encode.j1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mca.a;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.LinkedList;
import pr3.d;
import java.util.ArrayList;
import pca.k2;
import pca.j2;
import java.lang.IllegalStateException;

public final class k1	// class@000d2c
{

    public void k1(){
       super();
    }
    public static t a(List p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(k1.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, k1.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("RxFetchFramesApi", "rxFetchMultiFileFrames\(\) called with: paths = ["+p0.size()+"]", objArray);
       q.c(p0, f1.a);
       if (p0.isEmpty()) {
          return t.error(new IllegalArgumentException("paths is empty"));
       }else {
          return t.fromIterable(p0).observeOn(d.c).concatMap(new i2(p1, p2, p3)).doOnNext(i1.b).map(new f2(new e(p0.size()))).doFinally(h1.b);
       }
    }
    public static t b(String p0,int p1,int p2,int p3){
       AuditFrameUploadParam obj;
       AuditFrameUploadParam mFlashFrameI;
       AuditFrameUploadParam mShortSideLe;
       AuditFrameUploadParam mMaxCount;
       if (PatchProxy.isSupport(k1.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, k1.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("RxFetchFramesApi", "rxFetchSingleFileFrames\(\) called with: mediaPath = ["+p0+"], maxCount = ["+p1+"], interval = ["+p2+"]", objArray);
       if (TextUtils.x(p0)) {
          return t.error(new IllegalArgumentException("mediaPath is empty"));
       }else {
          String str = "rawFrameUploadParam2";
          obj = a.t().getValue(str, AuditFrameUploadParam.class, new AuditFrameUploadParam());
          if (p2 <= 0) {
             mFlashFrameI = obj.mFlashFrameInterval;
          }
          if (p3 <= 0) {
             mShortSideLe = obj.mShortSideLength;
          }
          if (p1 <= 0) {
             mMaxCount = obj.mMaxCount;
          }
          if (mMaxCount <= null) {
             mMaxCount = 1;
          }
          if (str.a().matcher(p0).matches()) {
             Object[] objArray1 = new Object[0];
             a.D().w("RxFetchFramesApi", "rxFetchSingleFileFrames: it is image", objArray1);
             return FetchFrameManager.i().h(p0, mShortSideLe, mShortSideLe, 0).map(j1.b);
          }else {
             try{
                long l = (long)(EditorSdk2UtilsV2.getComputedDuration(a.b(p0)) * 0x408f400000000000);
                Object[] objArray2 = new Object[0];
                a.D().w("RxFetchFramesApi", "rxFetchSingleFileFrames: width="+mShortSideLe+" height="+mShortSideLe+" duration="+l, objArray2);
                if (mShortSideLe <= null || l <= 0) {
                   return t.error(new IllegalStateException("cant get width height or duration "+p0));
                }else {
                   LinkedList linkedList = new LinkedList();
                   long l1 = (long)mMaxCount;
                   if (l - ((long)mFlashFrameI * l1) > 0) {
                      mFlashFrameI = (int)(l / l1);
                   }
                   int i = 0;
                   while ((long)i - l <= 0 && linkedList.size() < mMaxCount) {
                      linkedList.add(Integer.valueOf(i));
                      i = i + mFlashFrameI;
                   }
                   Object[] objArray3 = new Object[0];
                   a.D().s("RxFetchFramesApi", "rxFetchSingleFileFrames: postList num="+linkedList.size()+",interval="+mFlashFrameI, objArray3);
                   mMaxCount = linkedList.size();
                   d uod = new d();
                   uod.c = new ArrayList(mMaxCount);
                   return t.fromIterable(linkedList).observeOn(d.a).concatMap(new k2(p0, mShortSideLe)).onErrorReturnItem("").map(new j2(uod, mMaxCount));
                }
             }catch(java.lang.Exception e11){
                a.D().z("RxFetchFramesApi", "rxFetchSingleFileFrames: ", e11);
                return t.error(new IllegalStateException("create project failed "+p0));
             }
          }
       }
    }
}
