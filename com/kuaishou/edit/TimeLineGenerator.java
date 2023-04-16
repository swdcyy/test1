package com.kuaishou.edit.TimeLineGenerator;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$b;
import com.kwai.video.editorsdk2.VideoEditorSession;
import java.lang.Object;
import y30.a;
import java.util.LinkedList;
import y30.d;
import java.util.HashMap;
import java.lang.ref.WeakReference;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.ThumbnailStatsInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import android.graphics.Bitmap;
import java.lang.Long;
import java.lang.Boolean;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import gq.a;
import y30.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.List;
import ekd.k1;
import android.util.LruCache;
import java.util.Map;
import p16.c;
import java.lang.Double;
import java.lang.Integer;
import com.kuaishou.edit.TimeLineGenerator$TimeLineGeneratorException;
import com.kwai.video.editorsdk2.model.ModelBase;
import java.lang.System;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Objects;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import w46.b;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kuaishou.edit.a;
import com.kwai.video.editorsdk2.ThumbnailGenerator$RequestFinishListener;
import com.kuaishou.edit.TimeLineGenerator$a;
import android.content.Context;
import lnc.a1;
import wba.d0;

public class TimeLineGenerator implements VideoSDKPlayerView$b	// class@0016ef
{
    public int a;
    public final a b;
    public ThumbnailGenerator c;
    public final VideoEditorSession d;
    public c e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public EditorSdk2V2$VideoEditorProject m;
    public final List n;
    public c o;
    public final d p;
    public d q;
    public final Map r;
    public TimeLineGenerator$a s;
    public WeakReference t;

    public void TimeLineGenerator(VideoEditorSession p0){
       super();
       this.a = 9226;
       this.b = a.d();
       this.k = false;
       this.l = false;
       this.n = new LinkedList();
       this.p = new d();
       this.q = new d();
       this.r = new HashMap();
       this.t = new WeakReference(null);
       this.d = p0;
    }
    public void TimeLineGenerator(EditorSdk2V2$VideoEditorProject p0,int p1,int p2,VideoEditorSession p3){
       super();
       this.a = 9226;
       this.b = a.d();
       this.k = false;
       this.l = false;
       this.n = new LinkedList();
       this.p = new d();
       this.q = new d();
       this.r = new HashMap();
       this.t = new WeakReference(null);
       this.f = p1;
       this.g = p2;
       this.d = p3;
       this.j(p0);
    }
    public ThumbnailStatsInfo a(){
       Object[] objArray = null;
       TimeLineGenerator obj = PatchProxy.apply(objArray, this, TimeLineGenerator.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.getThumbnailDetailedStats();
       }
       return objArray;
    }
    public final Bitmap b(ThumbnailGeneratorResult p0,long p1,boolean p2){
       TimeLineGenerator obj;
       Object[] this;
       Object[] objArray;
       TimeLineGenerator tb;
       if (PatchProxy.isSupport(TimeLineGenerator.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), this, TimeLineGenerator.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this = new Object[0];
       a.D().w("TimeLineGenerator", "afterFetch needCache:"+p2, this);
       Bitmap uBitmap = null;
       if (this.o == null) {
          objArray = new Object[0];
          a.D().A("TimeLineGenerator", "fetchNext: mCurrentRequest is null", objArray);
          return uBitmap;
       }else if(p1 - this.j < 0){
          objArray = new Object[0];
          a.D().s("TimeLineGenerator", "fetchNext: request start time before last clear cache time", objArray);
          return uBitmap;
       }else if(p0.hasError() && (p0.getErrorCode() == -20018 && this.o.k < 3)){
          objArray = new Object[0];
          a.D().s("TimeLineGenerator", "getThumbnailGenerator getBitmap error THUMBNAIL_SERVICE_ERROR", objArray);
          ExceptionHandler.handleCaughtException(new Throwable("getThumbnailGenerator getBitmap error THUMBNAIL_SERVICE_ERROR"));
          TimeLineGenerator to = this.o;
          to.k = to.k + 1;
          this.n.add(0, to);
          this.o = uBitmap;
          return this.f();
       }else {
          obj = this.o;
          this.o = uBitmap;
          this.f();
          Object[] objArray1 = new Object[0];
          a.D().y("TimeLineGenerator", "fetchNext: cost time="+k1.t(p1), objArray1);
          if (p0.hasError()) {
             objArray = new Object[0];
             a.D().A("TimeLineGenerator", "fetchByRenderTime: error="+p0.getErrorReason()+" req="+obj, objArray);
             return uBitmap;
          }else {
             Bitmap thumbnailBit = p0.getThumbnailBitmap();
             if (thumbnailBit == null) {
                objArray = new Object[0];
                a.D().A("TimeLineGenerator", "bitmap is null:", objArray);
                return uBitmap;
             }else if(p2){
                tb = this.b;
                _monitor_enter(tb);
                if (PatchProxy.applyVoidTwoRefs(obj, thumbnailBit, tb, a.class, "6")) {
                   _monitor_exit(tb);
                }else if(obj.b < null){
                   Object[] objArray3 = new Object[0];
                   a.D().A("TimeLineCache", "put: wrong arg mTrackIndex="+obj.b, objArray3);
                   _monitor_exit(tb);
                }else {
                   String str = tb.c(obj, obj.m);
                   this = new Object[0];
                   a.D().s("TimeLineCache", "put, key="+str, this);
                   tb.c.remove(str+"_b");
                   tb.c.put(str, thumbnailBit);
                   str = obj.b();
                   if (obj.c() && tb.a.get(str) == null) {
                      this = new Object[0];
                      a.D().w("TimeLineCache", "put: set mTrackFirstBitmaps "+str, this);
                      tb.a.put(str, thumbnailBit);
                   }
                   _monitor_exit(tb);
                }
             }
             Object[] objArray2 = new Object[0];
             a.D().y("TimeLineGenerator", "trackIndex = ["+obj.b+"], trackPath = ["+obj.c+"], trackTime = ["+obj.e+"], trackCacheKey = ["+obj.f+"]", objArray2);
             c o = obj.o;
             if (o != null) {
                o.a();
             }
             tb = this.e;
             if (tb != null) {
                tb.a();
             }
             return thumbnailBit;
          }
       }
    }
    public Bitmap c(double p0,int p1,int p2,c p3,boolean p4,boolean p5){
       Object[] objArray;
       TimeLineGenerator obj;
       Object[] objArray2;
       Bitmap uBitmap1;
       String str2;
       int i = this;
       double d = p0;
       int i1 = p1;
       int i2 = p2;
       object oobject = p3;
       String str = " trackIndex=";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i3 = 0;
       if (PatchProxy.isSupport(TimeLineGenerator.class)) {
          objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),oobject,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, i, TimeLineGenerator.class, "9");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i.m;
       Bitmap uBitmap = null;
       String str1 = "TimeLineGenerator";
       if (obj == null) {
          Object[] objArray1 = new Object[i3];
          a.D().A(str1, "fetchByRenderTime: mProject is null", objArray1);
          return uBitmap;
       }else if(!obj.trackAssetsSize()){
          objArray2 = new Object[i3];
          a.D().A(str1, "fetchByRenderTime: wrong project trackAssets "+i.m, objArray2);
          ExceptionHandler.handleCaughtException(new TimeLineGenerator$TimeLineGeneratorException(i.m.toString()));
          return uBitmap;
       }else if(i1 <= 0 || i2 <= 0){
          objArray2 = new Object[0];
          a.D().A(str1, "fetchByRenderTime: wrong arg width="+i1+" height"+i2, objArray2);
          return null;
       }else {
          try{
             long l = System.currentTimeMillis();
             RenderPosDetail renderPosDet = i.r.get(Double.valueOf(p0));
             if (renderPosDet == null) {
                renderPosDet = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(i.m, d);
                TimeLineGenerator r = i.r;
                r.put(Double.valueOf(p0), renderPosDet);
             }
             int trackAssetIn = renderPosDet.getTrackAssetIndex();
             double trackAssetOr = renderPosDet.getTrackAssetOriginalPtsSec();
             if (trackAssetIn >= i.m.trackAssetsSize()) {
                str2 = "trackIndex bigger than mProject.trackAssetsSize\(\) "+i.m;
                ExceptionHandler.handleCaughtException(new TimeLineGenerator$TimeLineGeneratorException(str2));
                objArray2 = new Object[0];
                a.D().A(str1, "fetchByRenderTime: "+str2, objArray2);
                return null;
             }else if(trackAssetOr - null < 0){
                str2 = "trackTime < 0,renderTime="+d+",detail.getTrackAssetIndex="+renderPosDet.getTrackAssetIndex()+",detail.getTrackAssetOriginalPtsSec="+renderPosDet.getTrackAssetOriginalPtsSec()+",detail.getRenderPositionSec="+renderPosDet.getRenderPositionSec()+",detail.getPlaybackPositionSec="+renderPosDet.getPlaybackPositionSec();
                Object[] objArray3 = new Object[0];
                a.D().A(str1, "fetchByRenderTime: wrong arg "+str2+", videoEditProject="+i.m, objArray3);
                ExceptionHandler.handleCaughtException(new TimeLineGenerator$TimeLineGeneratorException(str2));
                return null;
             }else {
                PatchProxyResult patchProxyRe1 = patchProxyRe;
                int i4 = i.m.trackAssets(trackAssetIn).rotationDeg();
                String str3 = i.m.trackAssets(trackAssetIn).assetPath();
                objArray = new Object[0];
                a.D().y(str1, "fetchByRenderTime: fetchTime="+d+str+trackAssetIn+" trackTime="+trackAssetOr, objArray);
                Object[] objArray4 = new Object[0];
                a.D().s(str1, "fetchByRenderTime: renderPosDetailOfRenderPos time line cost "+k1.t(l), objArray4);
                if (i.i != i2 || i.h != i1) {
                   i.h = i1;
                   i.i = i2;
                   if (!PatchProxy.applyVoid(null, i, TimeLineGenerator.class, "11")) {
                      Iterator iterator = i.n.iterator();
                      while (iterator.hasNext()) {
                         if (!iterator.next().d()) {
                            iterator.remove();
                         }
                      }
                   }
                   objArray4 = new Object[0];
                   a.D().s(str1, "fetchByRenderTime: using new width="+i1+" height="+i2, objArray4);
                }
                if (TextUtils.x(str3)) {
                   PostUtils.D(str1, "fetchByTrackTime\(\)", new TimeLineGenerator$TimeLineGeneratorException("fetchByTrackTime\(\) trackPath="+str3+str+trackAssetIn));
                   return null;
                }else {
                   c uoc = new c(trackAssetIn, str3, "", trackAssetOr, true, p1, p2, 0);
                   patchProxyRe.o = p3;
                   patchProxyRe.l = p4;
                   if (i.l != null) {
                      patchProxyRe.m = i4;
                   }
                   patchProxyRe.n = p5;
                   Bitmap uBitmap2 = PatchProxy.applyOneRefs(patchProxyRe, i, TimeLineGenerator.class, "14");
                   if (uBitmap2 != patchProxyRe1) {
                   }else {
                      uBitmap2 = i.d(patchProxyRe, false);
                   }
                   return uBitmap2;
                }
             }
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             uBitmap1 = uBitmap;
          }catch(java.lang.RuntimeException e0){
             ExceptionHandler.handleCaughtException(e0);
             return null;
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             uBitmap1 = null;
          }
          a.D().z(str1, "fetchByRenderTime: renderPosDetailOfRenderPos failed", e0);
          return uBitmap1;
       }
    }
    public final Bitmap d(c p0,boolean p1){
       TimeLineGenerator obj;
       Object[] obj1;
       TimeLineGenerator b2;
       Bitmap uBitmap;
       StringBuilder str2;
       c obj2;
       boolean b3;
       Object[] objArray;
       Bitmap uBitmap2;
       Bitmap uBitmap3;
       d uod3;
       d uod = this;
       String str = p0;
       boolean b = p1;
       a uoa = a.class;
       TimeLineGenerator timeLineGene = TimeLineGenerator.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(timeLineGene)) {
          obj = PatchProxy.applyTwoRefs(str, Boolean.valueOf(p1), uod, timeLineGene, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = uod.p;
       c b1 = str.b;
       c e = str.e;
       Objects.requireNonNull(obj);
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(b1), Double.valueOf(e), obj, uod1, "1");
          if (obj1 != patchProxyRe) {
          }else {
          label_0046 :
             uod1 = obj.a;
             d uod2 = -1;
             if (uod1 == uod2) {
                obj.a = b1;
                obj.b = e;
             }else {
                d c = obj.c;
                if (c == uod2) {
                   obj.c = b1;
                   obj.d = e;
                }else if(b1 < c || (b1 == c && e - obj.d < 0)){
                   uod3 = 1;
                }else {
                   uod3 = null;
                }
                if (uod3) {
                   uod3 = new d();
                   uod3.a = uod1;
                   uod3.b = obj.b;
                   uod3.c = c;
                   uod3.d = obj.d;
                   obj.a();
                   obj.a = b1;
                   obj.b = e;
                   objArray = new Object[0];
                   a.D().w("TimeLineVisibleWindow", "calculateWindow: update start="+obj.a+" "+obj.b, objArray);
                   obj1 = uod3;
                }else {
                   obj.c = b1;
                   obj.d = e;
                }
             }
             obj1 = null;
          }
       }else {
          goto label_0046 ;
       }
       String str1 = "TimeLineGenerator";
       if (obj1 != null) {
          TimeLineGenerator q = uod.q;
          a uoa1 = (obj1.a == q.a && (!obj1.b - q.b && (obj1.c != q.c || obj1.d - q.d)))? 1: null;
          if (uoa1) {
             uod.q = obj1;
             obj1 = new Object[0];
             a.D().w(str1, "fetchByTrackTime: update window="+uod.q, obj1);
          }
       }
       if (!b) {
          b2 = uod.b;
          Objects.requireNonNull(b2);
          uBitmap = PatchProxy.applyOneRefs(str, b2, uoa, "3");
          if (uBitmap != patchProxyRe) {
          }else {
             String str3 = b2.c(str, str.m);
             Object[] objArray2 = new Object[0];
             a.D().s("TimeLineCache", "get, key="+str3, objArray2);
             Bitmap uBitmap5 = b2.c.get(str3);
             if (uBitmap5 != null) {
                objArray2 = new Object[0];
                a.D().s("TimeLineCache", "refresh cache key, key="+str3, objArray2);
                str.f = str3;
             }
             uBitmap = uBitmap5;
          }
       }else {
          uBitmap = null;
       }
       if (uBitmap != null && str.n == null) {
          return uBitmap;
       }else {
          b2 = uod.o;
          if (b2 == null || !(b2.a()).equals(p0.a())) {
             str2 = p0.a();
             obj2 = PatchProxy.applyOneRefs(str2, uod, timeLineGene, "20");
             if (obj2 != patchProxyRe) {
                b3 = obj2.booleanValue();
             }else {
                Iterator iterator = uod.n.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (str2.equals(iterator.next().f)) {
                         b3 = true;
                      }
                   }else {
                      b3 = false;
                   }
                }
             }
             if (!b3) {
                uod.n.add(str);
                if (p0.d()) {
                   objArray = new Object[0];
                   a.D().w(str1, "fetchByRequest: a mustDone request", objArray);
                }
                obj1 = new Object[0];
                a.D().w(str1, "fetchByTrackTime: add pending request "+str, obj1);
             }
          }
          Bitmap uBitmap1 = uod.g(b);
          if (uBitmap1 != null) {
             return uBitmap1;
          }else {
             TimeLineGenerator b4 = uod.b;
             Objects.requireNonNull(b4);
             obj2 = PatchProxy.applyOneRefs(str, b4, uoa, "5");
             if (obj2 != patchProxyRe) {
                uBitmap2 = obj2;
             }else {
                obj2 = str.m;
                obj1 = new Object[0];
                a.D().w("TimeLineCache", "get backup bitmap of rotationDeg"+obj2, obj1);
                str2 = null;
                while (true) {
                   if (str2 < 4) {
                      Bitmap uBitmap4 = b4.c.get(b4.c(str, obj2)+"_b");
                      if (uBitmap4 != null) {
                         Object[] objArray1 = new Object[0];
                         a.D().w("TimeLineCache", "found backup bitmap of rotationDeg"+obj2, objArray1);
                         uBitmap2 = uBitmap4;
                      }else {
                         int i = obj2 + 90;
                         i = i % 360;
                         int i1 = str2 + 1;
                      }
                   }else {
                      uBitmap2 = null;
                   }
                }
             }
             if (uBitmap2 != null) {
                return uBitmap2;
             }else {
                b4 = uod.b;
                Objects.requireNonNull(b4);
                if (PatchProxy.isSupport(uoa)) {
                   uBitmap3 = PatchProxy.applyTwoRefs(str, Boolean.TRUE, b4, uoa, "4");
                   if (uBitmap3 != patchProxyRe) {
                   }else {
                   label_026e :
                      uBitmap3 = b4.a.get(p0.b());
                      if (uBitmap3 != null) {
                         b4.b.put(str.c+str.d, uBitmap3);
                      }else {
                         uBitmap3 = b4.b.get(str.c+str.d);
                      }
                   }
                }else {
                   goto label_026e ;
                }
                return uBitmap3;
             }
          }
       }
    }
    public Bitmap e(int p0,double p1,int p2,int p3,c p4,boolean p5,boolean p6,boolean p7){
       c obj;
       TimeLineGenerator timeLineGene = this;
       int i = p0;
       object oobject = p4;
       TimeLineGenerator timeLineGene1 = TimeLineGenerator.class;
       if (PatchProxy.isSupport(timeLineGene1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Double.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),oobject,Boolean.valueOf(p5),Boolean.valueOf(p6),Boolean.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, timeLineGene1, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[0];
       String str = "TimeLineGenerator";
       a.D().y(str, "fetchByTrackTime\(\) called with: trackIndex = ["+i+"], timePosInTrack = ["+p1+"]", objArray1);
       timeLineGene1 = timeLineGene.m;
       Bitmap uBitmap = null;
       if (timeLineGene1 == null || i < 0) {
          objArray1 = new Object[0];
          a.D().A(str, "fetchByTrackTime: wrong arg trackIndex="+i, objArray1);
          return uBitmap;
       }else if(i >= timeLineGene1.trackAssetsSize()){
          objArray1 = new Object[0];
          a.D().A(str, "fetchByTrackTime: trackIndex is wrong mProject.trackAssetsSize\(\)="+timeLineGene.m.trackAssetsSize(), objArray1);
          return uBitmap;
       }else {
          Object[] objArray2 = new Object[0];
          a.D().s(str, "fetchByTrackTime: mProject.trackAssetsSize\(\)="+timeLineGene.m.trackAssetsSize(), objArray2);
          String str1 = timeLineGene.m.trackAssets(i).assetPath();
          if (TextUtils.x(str1)) {
             objArray1 = new Object[0];
             a.D().A(str, "fetchByTrackTime: cant get trackPath="+str1+" trackIndex="+i, objArray1);
             return uBitmap;
          }else {
             int i1 = timeLineGene.m.trackAssets(i).rotationDeg();
             int i2 = (!p5)? 0: i1;
             TimeLineGenerator timeLineGene2 = (!p2)? timeLineGene.f: p2;
             TimeLineGenerator timeLineGene3 = (!p3)? timeLineGene.g: p3;
             obj = new c(p0, str1, "", p1, p5, timeLineGene2, timeLineGene3, p6);
             if (oobject != null) {
                v14.o = oobject;
             }
             if (timeLineGene.l != null) {
                v14.m = i2;
             }
             v14.l = false;
             return this.d(v14, p7);
          }
       }
    }
    public final Bitmap f(){
       Object obj = PatchProxy.apply(null, this, TimeLineGenerator.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g(false);
    }
    public final Bitmap g(boolean p0){
       ThumbnailGenerator obj;
       Object[] objArray1;
       Object[] objArray2;
       String str2;
       int i1;
       Object[] objArray3;
       boolean b1;
       Object[] objArray4;
       d a;
       Iterator iterator1;
       c uoc = this;
       TimeLineGenerator timeLineGene = TimeLineGenerator.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(timeLineGene)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), uoc, timeLineGene, "23");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "TimeLineGenerator";
       a.D().w(str, "fetchNext\(\) called", objArray);
       String str1 = "fetchNext: getThumbnailGenerator\(\) is null";
       Bitmap uBitmap = null;
       if (this.h() == null) {
          objArray1 = new Object[i];
          a.D().A(str, str1, objArray1);
          return uBitmap;
       }else if(uoc.o != null){
          objArray2 = new Object[i];
          a.D().w(str, "fetchNext: now is fetching "+uoc.o, objArray2);
          return uBitmap;
       }else {
          timeLineGene = uoc.q;
          TimeLineGenerator n = uoc.n;
          Objects.requireNonNull(timeLineGene);
          Bitmap uBitmap1 = PatchProxy.applyOneRefs(n, timeLineGene, d.class, "2");
          if (uBitmap1 != patchProxyRe) {
             str2 = str1;
          }else if(n.isEmpty()){
             str2 = str1;
             uBitmap1 = uBitmap;
          }else {
             long l1 = System.currentTimeMillis();
             Iterator iterator = n.iterator();
             Bitmap uBitmap2 = uBitmap;
             while (true) {
                if (iterator.hasNext()) {
                   c uoc1 = iterator.next();
                   if (uoc1.d()) {
                      objArray4 = new Object[i];
                      a.D().w("TimeLineVisibleWindow", "peekTopPriorityToFetch: mustDone request", objArray4);
                      str2 = str1;
                      i1 = 0;
                   }else {
                      a = timeLineGene.a;
                      String str3 = -1;
                      c uoc2 = (a != str3 && timeLineGene.c != str3)? 1: null;
                      if (uoc2) {
                         uoc2 = uoc1.b;
                         str3 = str1;
                         c e = uoc1.e;
                         iterator1 = iterator;
                         if (uoc2 > a && uoc2 < timeLineGene.c) {
                            str2 = str3;
                         }else if(uoc2 == a){
                            if (a == timeLineGene.c) {
                               str2 = str3;
                               if (e - timeLineGene.b < 0 || e - timeLineGene.d > 0) {
                               }
                            }else {
                               str2 = str3;
                               if (e - timeLineGene.b < 0) {
                               }
                            }
                         }else {
                            str2 = str3;
                            if (uoc2 != timeLineGene.c || e - timeLineGene.d > 0) {
                            }
                         }
                      label_00ed :
                         a uoa = 1;
                      label_00f0 :
                         if (!uoa) {
                            objArray4 = new Object[0];
                            a.D().y("TimeLineVisibleWindow", "peekTopPriorityToFetch: not in range "+uoc1, objArray4);
                         label_0152 :
                            str1 = str2;
                            iterator = iterator1;
                            i = 0;
                            String str4 = null;
                         }
                      }else {
                         str2 = str1;
                         iterator1 = iterator;
                      }
                      if (uBitmap2 == null) {
                         objArray4 = new Object[0];
                         a.D().y("TimeLineVisibleWindow", "peekTopPriorityToFetch: find next="+uoc1, objArray4);
                         uBitmap2 = uoc1;
                      }
                      if (uoc1.c()) {
                         i1 = 0;
                         objArray3 = new Object[i1];
                         a.D().y("TimeLineVisibleWindow", "peekTopPriorityToFetch: find a head of track request="+uoc1, objArray3);
                      }else {
                         goto label_0152 ;
                      }
                   }
                   uBitmap2 = uoc1;
                label_015b :
                   if (uBitmap2 == null) {
                      objArray2 = new Object[i1];
                      a.D().y("TimeLineVisibleWindow", "peekTopPriorityToFetch: no one in window use add order", objArray2);
                      uBitmap1 = n.remove(i1);
                   }else {
                      n.remove(uBitmap2);
                      uBitmap1 = uBitmap2;
                   }
                   i1 = 0;
                   objArray3 = new Object[i1];
                   a.D().s("TimeLineVisibleWindow", "peekTopPriorityToFetch: time line cost "+k1.t(l1)+" size="+n.size(), objArray3);
                   objArray3 = new Object[i1];
                   a.D().y("TimeLineVisibleWindow", "peekTopPriorityToFetch: "+uBitmap1, objArray3);
                label_01b9 :
                   uoc.o = uBitmap1;
                   if (uBitmap1 == null) {
                      objArray1 = new Object[i1];
                      a.D().w(str, "fetchNext: no pending request ", objArray1);
                      PostUtils.x("THUMBNAIL_PREFETCH", "end fetch");
                      FetchFrameManager.i().q();
                      break ;
                   }else {
                      try{
                         FetchFrameManager.i().o();
                         i1 = 0;
                         objArray3 = new Object[i1];
                         a.D().w(str, "fetchNext: do request "+uoc.o, objArray3);
                         obj = this.h();
                         if (obj == null) {
                            objArray1 = new Object[i1];
                            a.D().t(str, str2, objArray1);
                            break ;
                         }else {
                            TimeLineGenerator o = uoc.o;
                            ThumbnailGeneratorRequestBuilder thumbnailGen = obj.newRequestBuilder().setTolerance(0x3fc47ae147ae147b).setProjectRenderFlags(uoc.a).setThumbnailSize(o.h, o.i);
                            if (uoc.k != null) {
                               o = uoc.o;
                               Objects.requireNonNull(o);
                               Object obj1 = PatchProxy.apply(null, o, c.class, "4");
                               boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): (o.c).endsWith(".gif");
                               if (!b) {
                                  b1 = true;
                               label_0252 :
                                  thumbnailGen = thumbnailGen.setUseMetadataRetriever(b1);
                                  TimeLineGenerator o1 = uoc.o;
                                  if (o1.g != null) {
                                     thumbnailGen.setPositionByAssetPositionSec(o1.b, o1.e);
                                     if (uoc.o.j != null) {
                                        thumbnailGen.setProjectRenderFlagOnlyBackgroundPadding(true);
                                     }
                                  }else {
                                     thumbnailGen.setPositionByFilePositionSec(o1.c, o1.e);
                                  }
                                  long l = System.currentTimeMillis();
                                  if (p0) {
                                     return uoc.b(this.h().getThumbnailSync(thumbnailGen.build()), l, false);
                                  }else {
                                     this.h().getThumbnailAsync(thumbnailGen.build(), new a(uoc, l));
                                     break ;
                                  }
                               }
                            }
                            b1 = false;
                            goto label_0252 ;
                         }
                      }catch(java.lang.Exception e0){
                         a.D().z(str, "fetchNext: ", e0);
                         ExceptionHandler.handleCaughtException(e0);
                      }
                   }
                }else {
                   str2 = str1;
                   i1 = 0;
                   goto label_015b ;
                }
             }
          }
          i1 = 0;
          goto label_01b9 ;
       }
    }
    public final ThumbnailGenerator h(){
       Object[] objArray = null;
       TimeLineGenerator obj = PatchProxy.apply(objArray, this, TimeLineGenerator.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          return objArray;
       }
       ThumbnailGenerator thumbnailGen = obj.a();
       if (this.t.get() != thumbnailGen) {
          Object[] objArray1 = new Object[0];
          a.D().s("TimeLineGenerator", "getThumbnailGenerator: has update new generator!", objArray1);
          this.o = objArray;
          this.t = new WeakReference(thumbnailGen);
       }
       return thumbnailGen;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, TimeLineGenerator.class, "18")) {
          return;
       }
       this.q();
       Object[] objArray = new Object[0];
       a.D().s("TimeLineGenerator", "release: ", objArray);
       this.b.a();
       this.e = null;
       this.q.a();
       this.p.a();
       this.r.clear();
       this.s = null;
       return;
    }
    public void j(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineGenerator.class, "2")) {
          return;
       }
       this.k(p0, false);
       return;
    }
    public void k(EditorSdk2V2$VideoEditorProject p0,boolean p1){
       TimeLineGenerator timeLineGene = TimeLineGenerator.class;
       if (PatchProxy.isSupport(timeLineGene) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, timeLineGene, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TimeLineGenerator", "setProject: ", objArray);
       if (this.m != p0) {
          this.r.clear();
       }
       this.m = p0;
       this.p(p1);
       return;
    }
    public void l(c p0){
       this.e = p0;
    }
    public void m(int p0){
       this.a = p0;
    }
    public void n(EditorSdk2V2$VideoEditorProject p0,TimeLineGenerator$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TimeLineGenerator.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TimeLineGenerator", "setThumbnailGenerator: generator="+p1, objArray);
       this.s = p1;
       if (this.m != p0) {
          this.r.clear();
       }
       this.m = p0;
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, TimeLineGenerator.class, "5")) {
          return;
       }
       this.p(false);
       return;
    }
    public void p(boolean p0){
       Object[] objArray;
       TimeLineGenerator timeLineGene = TimeLineGenerator.class;
       if (PatchProxy.isSupport(timeLineGene) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timeLineGene, "6")) {
          return;
       }
       int i = 0;
       if (this.m == null) {
          objArray = new Object[i];
          a.D().A("TimeLineGenerator", "start: mProject set first", objArray);
          return;
       }else {
          long l = System.currentTimeMillis();
          if (this.c == null) {
             if (p0 && this.s != null) {
                objArray = new Object[i];
                a.D().w("TimeLineGenerator", "start: create new ThumbnailGenerator from mThumbnailGeneratorProvider", objArray);
                this.c = this.s.a();
             }else {
                objArray = new Object[i];
                a.D().w("TimeLineGenerator", "start: create new ThumbnailGenerator from VideoEditorSession", objArray);
                this.c = this.d.createThumbnailGenerator(a1.c(), 0x3fe0000000000000, this.f, this.g, 0x989680);
             }
          }
          d0.x(this.c, this.m, true);
          Object[] objArray1 = new Object[i];
          a.D().w("TimeLineGenerator", "thumbnail generator, update project cost "+k1.t(l), objArray1);
          return;
       }
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, TimeLineGenerator.class, "16")) {
          return;
       }
       this.n.clear();
       TimeLineGenerator tc = this.c;
       if (tc != null) {
          tc.release();
          this.c = null;
       }
       Object[] objArray = new Object[0];
       a.D().w("TimeLineGenerator", "stop: ", objArray);
       this.o = null;
       this.b.b();
       FetchFrameManager.i().q();
       return;
    }
}
