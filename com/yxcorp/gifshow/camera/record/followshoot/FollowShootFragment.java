package com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import vc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lq.i;
import java.util.List;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.sidebar.h;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kuaishou.viewbinder.ViewBinderOption;
import ekd.j0;
import gh9.d;
import com.yxcorp.gifshow.camera.record.followshoot.a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import hd9.c;
import z1.a;
import hd9.e;
import hd9.f;
import hd9.d;
import com.yxcorp.gifshow.camera.record.video.n;
import bh9.r;
import pi9.c;
import nd9.f0;
import hf9.f;
import hf9.f$b;
import com.yxcorp.gifshow.camera.record.album.b0;
import hd9.g;
import wc9.t;
import yh9.h;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import rh9.d0;
import zh9.k;
import com.yxcorp.gifshow.camera.record.video.h;
import ai9.i;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import id9.d;
import java.lang.StringBuilder;

public class FollowShootFragment extends CameraFragment	// class@000dc5
{
    public static final int i1;

    public void FollowShootFragment(){
       super();
    }
    public a Bh(){
       a obj = PatchProxy.apply(null, this, FollowShootFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a(true);
       obj.b(true);
       return obj;
    }
    public int Ch(){
       return 4;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, FollowShootFragment.class, "3")) {
          return;
       }
       super.P1();
       if (i.h()) {
          i.m().i();
       }
       return;
    }
    public synchronized List ch(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, FollowShootFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.U0 != null) {
          return this.U0;
       }
       if (this.getActivity() != null) {
          objArray = this.getActivity().getIntent();
       }
       this.V = new h(this.lh(), this.y, this.X0);
       boolean b = false;
       if (j0.g(objArray, "pauseToEditPage") && j0.a(objArray, "pauseToEditPage", b)) {
          this.y.n(d.class, a.a);
          this.Ph(true, b);
       }
       RecordPModuleRegister.f().c("PRETTIFY", new c(this));
       obj = super.ch();
       RecordPModuleRegister.f().c("MAGIC_EMOJI", new e(this, obj));
       RecordPModuleRegister.f().c("PRETTIFY", new f(this, obj));
       RecordPModuleRegister.f().c("PRETTIFY", new d(this));
       obj.add(new n(this.lh(), this.y));
       obj.add(new r(this.lh(), this.y));
       CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
       if (c.e(tZ)) {
          obj.add(new f0(CameraPageType.VIDEO, this.y));
       }
       if (f.N.a(objArray)) {
          obj.add(new f(this.lh(), this.y));
       }else {
          obj.add(new b0(this.lh(), this.y, b));
       }
       RecordPModuleRegister.f().c("MUSIC", new g(this, obj));
       obj.add(new t(this.lh(), this.y));
       obj.add(new h(this.lh(), this.y));
       obj.add(new c(this.lh(), this.y, CameraFramePageType.FOLLOW_SHOOT));
       obj.add(new a(this.lh(), this.y));
       obj.add(new d0(this.lh(), this.y));
       obj.add(new k(this.lh(), this.y));
       obj.add(new h(this.lh(), this.y));
       obj.add(new i(this.lh(), this.y));
       obj.add(new GrowthFloatingGuideController(this.lh(), this.y));
       return obj;
    }
    public List dh(){
       List obj = PatchProxy.apply(null, this, FollowShootFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.dh();
       obj.add(new d(this.lh(), this.y));
       return obj;
    }
    public int getPage(){
       return 282;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, FollowShootFragment.class, "4");
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
