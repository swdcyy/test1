package com.yxcorp.gifshow.camerasdk.recorder.b;
import aj9.b;
import qi9.f;
import j65.e;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import qi9.q1;
import java.lang.Object;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import aj9.d;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.concurrent.CountDownLatch;
import java.lang.InterruptedException;
import java.lang.StringBuilder;
import v16.b;
import java.util.Set;
import java.lang.Integer;
import java.lang.Float;
import java.util.Iterator;
import java.lang.Long;
import com.kwai.camerasdk.models.RecordingStats;
import com.kwai.camerasdk.ErrorCode$Result;
import java.util.Collection;
import v16.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.io.File;
import java.lang.Math;
import aj9.e;
import java.lang.Runnable;
import com.kwai.camerasdk.video.VideoFrame;
import com.yxcorp.gifshow.camerasdk.recorder.b$b;
import java.util.Objects;
import com.yxcorp.gifshow.camerasdk.recorder.b$c;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.camerasdk.recorder.b$a;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import aj9.f;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class b extends e implements b, f	// class@001046
{
    public long a;
    public int b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public d h;
    public List i;
    public final VideoContext j;
    public final Set k;
    public final Set l;
    public CountDownLatch m;
    public boolean n;
    public boolean o;
    public Handler p;
    public b$b q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final List w;

    public void b(VideoContext p0,int p1,int p2){
       super();
       this.i = new CopyOnWriteArrayList();
       this.k = new CopyOnWriteArraySet();
       this.l = new CopyOnWriteArraySet();
       this.t = 0;
       this.u = 0;
       this.w = new ArrayList();
       this.j = p0;
       this.p = new Handler(Looper.getMainLooper());
       this.r = p1;
       this.s = p2;
       Object[] objArray = new Object[0];
       q1.C().w("camerasdkmemory", "RecorderHelper create", objArray);
    }
    public boolean B(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.i.isEmpty()) {
          obj = this.h;
          if (obj == null || obj.a != null) {
             b = false;
          label_0028 :
             return b;
          }
       }
       b = true;
       goto label_0028 ;
    }
    public d C(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj;
       }
       if (this.i.isEmpty()) {
          return objArray;
       }
       obj = this.i;
       return obj.get((obj.size() - 1));
    }
    public final a D(){
       a uoa;
       b obj = PatchProxy.apply(null, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          try{
             obj.await();
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public void E(boolean p0){
       b th1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderHelper", "cancelRecording\(\) called with: cancelAll = ["+p0+"]", objArray);
       b.m();
       this.m(true);
       this.n = false;
       b th = this.h;
       if (th != null) {
          d a = th.a;
          if (a != -1) {
             this.b(a);
             this.h.a();
             this.k();
             return;
          }
       }
       if (p0 || this.i.size() == 1) {
          this.n();
          this.b(-1);
          this.k();
          return;
       }else if(!this.i.isEmpty()){
          int i = this.i.size() - true;
          this.h = this.i.remove(i);
          this.b(i);
          th1 = this.h;
          if (th1 != null) {
             th1.a();
          }
       }
       if (!this.w.isEmpty()) {
          th1 = this.w;
          th1.remove((th1.size() - true));
       }
       this.k();
       return;
    }
    public void F(int p0){
       this.u = p0;
    }
    public void G(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       if (!this.k.contains(p0)) {
          this.k.add(p0);
       }
       return;
    }
    public void H(int p0,int p1){
       this.r = p0;
       this.s = p1;
    }
    public void I(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.k.remove(p0);
       return;
    }
    public void a(int p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uob, "17")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "22")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "15")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "23")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public void e(int p0,float p1,int p2,long p3){
       boolean b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, b.class, "16")) {
          return;
       }
       b = (p1 - 0x3f800000 < 0)? true: false;
       this.o = b;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1, p2, p3);
       }
       return;
    }
    public void f(int p0,boolean p1,float p2,RecordingStats p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Float.valueOf(p2), p3, this, b.class, "21")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1, p2, p3);
       }
       this.m(true);
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.finalize();
       Object[] objArray = new Object[0];
       q1.C().w("camerasdkmemory", "RecorderHelper finalize", objArray);
       return;
    }
    public void h(int p0,String p1,RecordingStats p2){
       d a;
       ArrayList uArrayList;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("RecorderHelper", "onFinished\(\) called", objArray);
       if (p0 == ErrorCode$Result.kOk.getCode()) {
          int i1 = (int)p2.getDurationMs();
          String str = "14";
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, uob, str)) {
             uArrayList = new ArrayList(this.i);
             if (!uArrayList.isEmpty()) {
                int i4 = (uArrayList.size() == 1)? 0: uArrayList.get((uArrayList.size() - 2)).e;
                uArrayList.e = i4 + i1;
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p2, this, uob, "11")) {
             b.m();
             if (this.g != null) {
                Object[] objArray1 = null;
                if (!PatchProxy.applyVoid(objArray1, objArray1, b.class, "23") && !PatchProxy.applyVoid(objArray1, objArray1, a.class, str)) {
                   SharedPreferences sharedPrefer = a.f();
                   SharedPreferences$Editor uEditor = sharedPrefer.edit();
                   String str1 = "record_success_cnt:4_fps_v1";
                   g.b(uEditor.putInt(str1, (sharedPrefer.getInt(str1, i) + true)));
                }
             }
             this.n = i;
             b th = this.h;
             float f = 0;
             if (th != null) {
                a = th.a;
                if (a != -1) {
                   this.f(a, i, f, p2);
                }
             }
             uArrayList = new ArrayList(this.i);
             if (uArrayList.isEmpty()) {
                this.f(i, i, f, p2);
             }else {
                int i2 = uArrayList.size();
                int i3 = i2 - 1;
                d uod = uArrayList.get(i3);
                if (uod.d < true) {
                   this.f(i3, i, f, p2);
                }else if(i2 > 1 && uArrayList.get((i2 - 2)).d == uod.d){
                   this.f(i3, i, f, p2);
                }else if(new File(uod.c).length() <= 0){
                   this.f(i3, i, f, p2);
                }else {
                   uod.f = p2.getAvgBitrate();
                   uod.g = p2.getAvgFps();
                   uod.h = p2.getMaxFps();
                   uod.i = p2.getMinFps();
                   Object[] objArray2 = new Object[i];
                   q1.C().w("RecorderHelper", "avgFps = "+uod.g+" maxFps = "+uod.h+" curSegment.minFps = "+uod.i, objArray2);
                   this.f(i3, true, Math.min(0x3f800000, (((float)this.u + (float)uod.e) / (float)this.b)), p2);
                }
             }
          }
       }else {
          Object[] objArray3 = new Object[i];
          q1.C().t("RecorderHelper", "onFinished error : errorCode = "+p0+" errorMessage = "+p1, objArray3);
          this.p.post(new e(this, p0, p1));
       }
       return;
    }
    public void i(long p0,long p1,boolean p2,VideoFrame p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), p3, this, b.class, "9")) {
          return;
       }
       b$b uob = null;
       b tq = this.q;
       if (tq == null || tq.b != null) {
          this.q = new b$b(this);
          uob = 1;
       }
       tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.isSupport(b$b.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Boolean.valueOf(p2), null, tq, b$b.class, "1")) {
          b$c uoc = new b$c(p0, p2, null, null);
          tq.c.add(PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Boolean.valueOf(p2), null, tq, b$b.class, "1"));
       }
       if (uob != null) {
          this.p.post(this.q);
       }
       return;
    }
    public void j(MediaRecorderCallbackFrameType p0,VideoFrame p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "18")) {
          return;
       }
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (this.i.isEmpty()) {
          this.e(0, ((float)this.u / (float)this.b), 0, 0);
       }else {
          b ti = this.i;
          d uod = ti.get((ti.size() - 1));
          this.e(uod.a, (((float)this.u + (float)uod.e) / (float)this.b), 0, (long)this.h.e);
       }
       return;
    }
    public boolean l(){
       return this.n;
    }
    public final void m(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "12")) {
          return;
       }
       if (p0) {
          b tm = this.m;
          if (tm != null) {
             tm.countDown();
             this.m = null;
          }
       }else {
          this.m = new CountDownLatch(1);
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.a = 0;
       this.i.clear();
       this.j.m0();
       this.c = 0;
       this.d = 0;
       this.e = 20;
       this.m(true);
       this.o = false;
       this.t = 0;
       this.w.clear();
       return;
    }
    public void stopRecording(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b.m();
       if (this.h == null) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderHelper", "stopRecording\(\) called, last recorded duration: "+this.h.e, objArray);
       b th = this.h;
       if (th.a != this.i.size()) {
          th.a();
          return;
       }else if(th.d < 1){
          th.a();
          return;
       }else if(TextUtils.isEmpty(th.c)){
          this.h.a();
          return;
       }else if(!new File(this.h.c).exists()){
          this.h.a();
          return;
       }else if(this.i.isEmpty()){
          this.i = new CopyOnWriteArrayList();
       }
       this.i.add(this.h);
       this.h = null;
       return;
    }
}
