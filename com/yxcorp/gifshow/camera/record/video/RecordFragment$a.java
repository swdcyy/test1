package com.yxcorp.gifshow.camera.record.video.RecordFragment$a;
import qi9.f;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.camerasdk.j;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nkd.a;
import java.util.Objects;
import java.util.List;
import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.yxcorp.gifshow.camera.record.video.RecordFragment$c;
import java.lang.Float;
import java.lang.Long;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.camerasdk.models.RecordingStats;
import oh9.u0;
import java.lang.Runnable;
import ekd.k1;

public class RecordFragment$a implements f	// class@000f6f
{
    public final RecordFragment a;

    public void RecordFragment$a(RecordFragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0,float p1){
    }
    public void b(int p0){
       RecordFragment$a uoa = RecordFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.a;
       uoa.F = false;
       if (p0 == -1) {
          VideoContext videoContext = uoa.q.y();
          if (videoContext != null) {
             videoContext.a2();
          }
       }
       return;
    }
    public void c(int p0){
       boolean b;
       RecordFragment$a uoa = RecordFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          VideoContext videoContext = this.a.q.y();
          if (videoContext != null) {
             FragmentActivity activity = this.a.getActivity();
             VideoContext videoContext1 = VideoContext.class;
             if (!PatchProxy.applyVoidOneRefs(activity, videoContext, videoContext1, "10")) {
                a obj = PatchProxy.apply(null, videoContext, videoContext1, "11");
                int i = 1;
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(videoContext.b.b != null){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                   videoContext = videoContext.b;
                   Objects.requireNonNull(videoContext);
                   obj = videoContext.c;
                   _monitor_enter(obj);
                   videoContext.c.clear();
                   SensorManager systemServic = activity.getSystemService("sensor");
                   videoContext.b = systemServic;
                   Sensor defaultSenso = systemServic.getDefaultSensor(3);
                   if (defaultSenso != null) {
                      videoContext.b.registerListener(videoContext, defaultSenso, 3);
                   }
                   defaultSenso = videoContext.b.getDefaultSensor(i);
                   if (defaultSenso != null) {
                      videoContext.b.registerListener(videoContext, defaultSenso, 3);
                   }
                   defaultSenso = videoContext.b.getDefaultSensor(9);
                   if (defaultSenso != null) {
                      videoContext.b.registerListener(videoContext, defaultSenso, 3);
                   }
                   defaultSenso = videoContext.b.getDefaultSensor(4);
                   if (defaultSenso != null) {
                      videoContext.b.registerListener(videoContext, defaultSenso, 3);
                   }
                   _monitor_exit(obj);
                }
             }
          }
       }
       return;
    }
    public void d(int p0){
       RecordFragment$a uoa = RecordFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.a.rh(p0);
       return;
    }
    public void e(int p0,float p1,int p2,long p3){
       RecordFragment g;
       RecordFragment$c uoc = RecordFragment$c.class;
       if (PatchProxy.isSupport(RecordFragment$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, RecordFragment$a.class, "2")) {
          return;
       }
       this.a.X7(p0, p1);
       if (p1 - 0x3f800000 >= 0) {
          g = this.a.G;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, uoc, "1") && g.b > 0) {
             g.a();
             g.c.q.stopRecording();
          }
       }else {
          g = this.a.G;
          Objects.requireNonNull(g);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p3), g, uoc, "2")) {
             g.a = p3;
             RecordFragment$c b = g.b;
             if (b > 0 && p3 - b >= 0) {
                Object[] objArray = new Object[0];
                a.D().w("AvSync", "mStopVideoRecordingDuration = "+g.b+" mCurrentVideoRecordingDuration = "+g.a, objArray);
                g.a();
                g.c.q.stopRecording();
             }
          }
       }
       return;
    }
    public void f(int p0,boolean p1,float p2,RecordingStats p3){
       if (PatchProxy.isSupport(RecordFragment$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Float.valueOf(p2), p3, this, RecordFragment$a.class, "3")) {
          return;
       }
       k1.o(new u0(this, p3));
       return;
    }
}
