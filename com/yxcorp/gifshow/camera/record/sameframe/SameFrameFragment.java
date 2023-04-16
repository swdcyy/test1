package com.yxcorp.gifshow.camera.record.sameframe.SameFrameFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import vc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.camera.record.sidebar.h;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kuaishou.viewbinder.ViewBinderOption;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import ug9.d;
import z1.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import gc9.a;
import ug9.f;
import ug9.e;
import ug9.g;
import com.yxcorp.gifshow.camera.record.video.n;
import bh9.r;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import pi9.c;
import nd9.f0;
import yh9.h;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import rh9.d0;
import zh9.k;
import com.yxcorp.gifshow.camera.record.video.h;
import ai9.i;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import com.yxcorp.gifshow.camera.record.sameframe.a;
import lq.i;
import java.lang.StringBuilder;

public class SameFrameFragment extends CameraFragment	// class@000f02
{
    public static final int i1;

    public void SameFrameFragment(){
       super();
    }
    public a Bh(){
       Object obj = PatchProxy.apply(null, this, SameFrameFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public int Ch(){
       return 3;
    }
    public synchronized List ch(){
       List obj = PatchProxy.apply(null, this, SameFrameFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.U0 != null) {
          return this.U0;
       }
       this.V = new h(this.lh(), this.y, this.X0);
       RecordPModuleRegister.f().c("PRETTIFY", new d(this));
       obj = super.ch();
       if (PostExperimentUtils.Q()) {
          obj.add(new a(this.lh(), this.y));
       }
       RecordPModuleRegister.f().c("PRETTIFY", new f(this, obj));
       RecordPModuleRegister.f().c("PRETTIFY", new e(this));
       RecordPModuleRegister.f().c("MAGIC_EMOJI", new g(this, obj));
       obj.add(new n(this.lh(), this.y));
       obj.add(new r(this.lh(), this.y));
       CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
       if (c.e(tZ)) {
          obj.add(new f0(CameraPageType.VIDEO, this.y));
       }
       obj.add(new h(this.lh(), this.y));
       obj.add(new c(this.lh(), this.y, CameraFramePageType.SAME_FRAME));
       obj.add(new a(this.lh(), this.y));
       obj.add(new d0(this.lh(), this.y));
       obj.add(new k(this.lh(), this.y));
       obj.add(new h(this.lh(), this.y));
       obj.add(new i(this.lh(), this.y));
       obj.add(new GrowthFloatingGuideController(this.lh(), this.y));
       return obj;
    }
    public List dh(){
       List obj = PatchProxy.apply(null, this, SameFrameFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.dh();
       obj.add(new a(this.lh(), this.y));
       return obj;
    }
    public int getPage(){
       return 141;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, SameFrameFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       if (i.h()) {
          Object obj1 = i.m().z("toolbox_template_params");
          if (obj1 instanceof String) {
             obj = obj+"&"+obj1;
          }
       }
       return obj;
    }
}
