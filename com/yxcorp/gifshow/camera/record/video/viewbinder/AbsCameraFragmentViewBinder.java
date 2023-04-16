package com.yxcorp.gifshow.camera.record.video.viewbinder.AbsCameraFragmentViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.yxcorp.gifshow.camera.record.video.viewbinder.AbsCameraFragmentViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import com.kuaishou.viewbinder.IViewBinder;
import java.util.HashMap;
import com.kuaishou.viewbinder.BaseViewBinder$a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.DefaultRecordBottomBarViewBinder;

public abstract class AbsCameraFragmentViewBinder extends BaseViewBinder	// class@000f97
{
    public BaseRecordButton e;
    public View f;
    public View g;
    public ConstraintLayout h;
    public ViewStub i;
    public ViewStub j;
    public ViewStub k;
    public static final AbsCameraFragmentViewBinder$a l;

    static {
       AbsCameraFragmentViewBinder.l = new AbsCameraFragmentViewBinder$a(null);
    }
    public void AbsCameraFragmentViewBinder(c p0){
       super(p0);
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, AbsCameraFragmentViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.y();
    }
    public final View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbsCameraFragmentViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return PreLoader.getInstance().getOrWait(p0.getContext(), this.y(), p1, false);
    }
    public void x(){
       BaseViewBinder uBaseViewBin = BaseViewBinder.class;
       if (PatchProxy.applyVoid(null, this, AbsCameraFragmentViewBinder.class, "7")) {
          return;
       }
       BaseViewBinder$a uoa = PatchProxy.applyOneRefs("sub_vb_bottom_action_bar", this, uBaseViewBin, "14");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.b.get("sub_vb_bottom_action_bar").d;
       }
       if (!uoa instanceof DefaultRecordBottomBarViewBinder) {
          AbsCameraFragmentViewBinder th = this.h;
          if (!PatchProxy.applyVoidTwoRefs("sub_vb_bottom_action_bar", th, this, uBaseViewBin, "15")) {
             BaseViewBinder$a uoa1 = this.b.get("sub_vb_bottom_action_bar");
             if (uoa1 != null) {
                uoa1.b = th;
             }
          }
       }
       return;
    }
    public abstract int y();
}
