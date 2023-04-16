package com.kuaishou.live.preview.item.presenter.n$e;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$c;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.Pair;
import cl3.m;
import com.kuaishou.live.preview.item.presenter.l;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.app.Activity;
import p51.d;
import java.lang.Math;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;

public class n$e implements LiveAutoPlay$c	// class@000e35
{
    public final n a;

    public void n$e(n p0){
       this.a = p0;
       super();
    }
    public void onVideoSizeChanged(int p0,int p1){
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(n$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, n$e.class, "1")) {
          return;
       }
       n$e ta = this.a;
       Objects.requireNonNull(ta);
       n$e obj = PatchProxy.apply(null, ta, n.class, "9");
       if (obj != PatchProxyResult.class) {
          ta = obj.intValue();
       }else {
          int i = ta.v.getLayoutParams().topMargin + k0.a(ta.s.p(), l.a).or(Integer.valueOf(0)).intValue();
          ViewGroup viewGroup = ta.m8().findViewById(R.id.hot_live_volume_layout_v2);
          ta = (viewGroup != null)? ((n.p(viewGroup)[1] - i) - d.b(ta.getActivity())) - n.P: n.N;
       }
       if (ta >= n.N) {
          obj = this.a;
          obj.z = true;
          obj.A = Math.min(ta, n.O);
          ta.x = new Pair(Integer.valueOf(p0), Integer.valueOf(p1));
       }else {
          Object[] objArray = new Object[0];
          a.C().s("LiveSimplePlayGzoneCameraPresenter", "cameraAreaHeight="+ta+" < MIN_HEIGHT", objArray);
          p0.z = false;
       }
       n$e ta1 = this.a;
       if (ta1.H != null) {
          n u = ta1.u;
          if (u != null && !u.getVisibility()) {
             ta1 = this.a;
             ta1.a9(ta1.H);
          }
       }
       return;
    }
}
