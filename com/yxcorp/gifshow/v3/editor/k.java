package com.yxcorp.gifshow.v3.editor.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import y30.a;
import com.kuaishou.edit.TimeLineGenerator;
import java.util.Map;
import android.util.LruCache;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import java.util.List;
import java.lang.System;
import p16.c;
import java.lang.Double;
import java.lang.Integer;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import voc.h0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.edit.TimeLineGenerator$a;
import voc.g0;
import gq.a;

public final class k	// class@000fb8
{
    public VideoSDKPlayerView a;
    public boolean b;
    public TimeLineGenerator c;
    public static k d;

    public void k(){
       super();
    }
    public static k f(){
       k ok = k.class;
       Object obj = PatchProxy.apply(null, null, ok, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.d == null) {
          _monitor_enter(ok);
          if (k.d == null) {
             k.d = new k();
          }
          _monitor_exit(ok);
       }
       return k.d;
    }
    public void a(boolean p0){
       TimeLineGenerator b;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "3")) {
          return;
       }
       ok = this.c;
       if (ok != null) {
          Objects.requireNonNull(ok);
          a uoa = a.class;
          TimeLineGenerator timeLineGene = TimeLineGenerator.class;
          if (!PatchProxy.isSupport(timeLineGene) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ok, timeLineGene, "17")) {
             if (p0) {
                b = ok.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoid(null, b, uoa, "13")) {
                   b.c.evictAll();
                   Iterator iterator = b.c.snapshot().entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      String key = uEntry.getKey();
                      String str = "_b";
                      if (!key.endsWith(str)) {
                         key = key+str;
                      }
                      b.c.put(key, uEntry.getValue());
                   }
                }
             }else {
                ok.b.b();
             }
             ok.n.clear();
             ok.o = null;
             b = ok.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(null, b, uoa, "2")) {
                b.a.clear();
             }
             ok.r.clear();
             ok.j = System.currentTimeMillis();
          }
       }
       return;
    }
    public Bitmap b(double p0,int p1,int p2,c p3){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyFourRefs(Double.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, this, k.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c(p0, p1, p2, p3, false, false);
    }
    public Bitmap c(double p0,int p1,int p2,c p3,boolean p4,boolean p5){
       Object obj = this;
       int i = p1;
       int i1 = p2;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          Object obj1 = PatchProxy.apply(objArray, obj, ok, "6");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (obj.a == null || obj.c == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("ThumbnailHelper", "getBitmap: mGenerator is not ready", objArray1);
          return null;
       }else {
          double d = p0;
          Object[] objArray2 = new Object[0];
          a.D().y("ThumbnailHelper", "getBitmap: fetchTime: "+d+", width: "+i+", height: "+i1, objArray2);
          int[] ointArray = obj.g(i, i1);
          obj.c.m(0xa00a);
          return obj.c.c(d, ointArray[0], ointArray[1], p3, p4, p5);
       }
    }
    public Bitmap d(int p0,double p1,int p2,int p3,c p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Double.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, ok, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.e(p0, p1, p2, p3, p4, false, true);
    }
    public Bitmap e(int p0,double p1,int p2,int p3,c p4,boolean p5,boolean p6){
       Object obj = this;
       int i = p2;
       int i1 = p3;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Double.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Boolean.valueOf(p5),Boolean.valueOf(p6)};
          Object obj1 = PatchProxy.apply(objArray, obj, ok, "9");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (obj.a == null || obj.c == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("ThumbnailHelper", "getBitmap: mGenerator is not ready", objArray1);
          return null;
       }else {
          double d = p1;
          int i2 = p0;
          Object[] objArray2 = new Object[0];
          a.D().y("ThumbnailHelper", "getBitmap: fetchTime: "+d+", width: "+i+", height: "+i1+",trackIndex:"+i2, objArray2);
          int[] ointArray = obj.g(i, i1);
          obj.c.m(0xa00a);
          return obj.c.e(i2, d, ointArray[0], ointArray[1], p4, true, p6, p5);
       }
    }
    public final int[] g(int p0,int p1){
       int[] obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ok, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int videoWidth = this.a.getVideoWidth();
       int videoHeight = this.a.getVideoHeight();
       int i = 2;
       if (!videoWidth || !videoHeight) {
          obj = new int[i];
          obj[0] = p0;
          obj[1] = p1;
          return obj;
       }else {
          int[] ointArray = new int[i];
          int i1 = (p0 * videoHeight) / videoWidth;
          videoWidth = (videoWidth * p1) / videoHeight;
          if (i1 >= p1) {
             ointArray[0] = p0;
             ointArray[1] = i1;
          }else {
             ointArray[0] = videoWidth;
             ointArray[1] = p1;
          }
          return ointArray;
       }
    }
    public final void h(double p0,int p1,int p2,int p3){
       double d = p0;
       int i = p1;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(Double.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, k.class, "19")) {
          return;
       }
       double d1 = (double)i;
       if (d1 - d >= 0 || PostExperimentUtils.l1()) {
          Object[] objArray = new Object[0];
          a.D().s("ThumbnailHelper", "prefetchNext invalid current: "+i+" total:"+d, objArray);
          return;
       }else {
          h0 oh0 = new h0(this, p0, p1, p2, p3);
          k.f().b(((d1 / (d - 0x3ff0000000000000)) * this.a.getVideoLength()), p2, p3, v13);
          return;
       }
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k tc = this.c;
       if (tc != null) {
          tc.n(null, null);
          this.c.i();
          this.c = null;
       }
       k.d = null;
       return;
    }
    public void j(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "13")) {
          return;
       }
       k tc = this.c;
       if (tc != null) {
          tc.q();
          tc = this.a;
          if (tc != null) {
             tc.replaceThumbnailGenerator();
             this.c.n(this.a.getVideoProject(), new g0(this));
          }
          this.c.k(p0, true);
       }
       return;
    }
    public void k(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "11")) {
          return;
       }
       k tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, TimeLineGenerator.class, "1")) {
             Object[] objArray = new Object[0];
             a.D().w("TimeLineGenerator", "syncThumbnailGeneratorProject", objArray);
             tc.n.clear();
             tc.r.clear();
             tc.m = p0;
          }
       }
       return;
    }
}
