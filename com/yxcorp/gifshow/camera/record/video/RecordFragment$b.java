package com.yxcorp.gifshow.camera.record.video.RecordFragment$b;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.System;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import j8c.a;
import q87.c;
import java.util.Objects;
import java.lang.Long;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class RecordFragment$b extends d	// class@000f70
{
    public final long y;
    public final RecordFragment z;

    public void RecordFragment$b(RecordFragment p0,FragmentActivity p1){
       this.z = p0;
       super(p1);
       this.y = System.currentTimeMillis();
    }
    public Object b(Object[] p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, RecordFragment$b.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("CameraBaseFragment", "make recordInfo", objArray);
          uoa = this.z.yh();
       }
       return uoa;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RecordFragment$b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "make recordInfo cancel", objArray);
       RecordFragment$b tz = this.z;
       RecordFragment$b ty = this.y;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(RecordFragment.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(ty), tz, RecordFragment.class, "28")) {
          FragmentActivity activity = tz.getActivity();
          if (activity != null) {
             Object[] objArray1 = new Object[]{"encode_type",CameraLogger.c(tz.q.P()),"cost",Long.valueOf((System.currentTimeMillis() - ty))};
             PostUtils.onEvent(activity.getUrl(), "cancel_recording", objArray1);
             tz.q.resumePreview();
             tz.zh();
             tz.P1();
          }
       }
       super.h();
       this.z.E = false;
       return;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordFragment$b.class, "4")) {
       }else {
          super.j(p0);
          Object[] objArray = new Object[0];
          a.D().w("CameraBaseFragment", "make recordInfo finish", objArray);
          this.z.xh(p0);
          p0.E = false;
       }
       return;
    }
    public void r(ProgressFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordFragment$b.class, "1")) {
          return;
       }
       p0.Gh(true);
       p0.Ah(R.dimen.arg_RES_7f07025f, 0x7f07025f);
       return;
    }
}
