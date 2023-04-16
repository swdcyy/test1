package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import im8.g;
import a51.c;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r22.b;
import p22.a;
import h22.d;
import p22.a$a;
import r22.a;
import h22.c;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;
import q22.c;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h22.e;
import msd.l;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.l;
import q22.b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView;
import xh3.g;
import com.kuaishou.live.core.show.activityredpacket.mvvm.viewbinding.LiveActivityRedPacketFragmentViewBinding$bindViewModel$2;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xh3.b;
import com.kuaishou.live.core.show.activityredpacket.view.LiveNineImageView;
import android.graphics.drawable.Drawable;
import z22.e;
import o22.b;
import java.lang.Integer;
import com.kuaishou.live.core.show.activityredpacket.o$b;
import com.kuaishou.live.core.show.activityredpacket.a0$b;
import com.kuaishou.live.core.show.activityredpacket.k$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.activityredpacket.y;
import java.util.Map;
import java.util.HashMap;

public class LiveActivityRedPacketFragment$b extends c implements g	// class@00092f
{
    public m A;
    public LiveActivityRedPacketService B;
    public LiveActivityRedPacketPresenter$e C;
    public b D;
    public a E;
    public final a v;
    public o$b w;
    public k$b x;
    public a0$b y;
    public a z;
    public static String sLivePresenterClassName = "LiveActivityRedPacketFragment$LiveActivityRedPacketRootPresenter";

    public void LiveActivityRedPacketFragment$b(a p0){
       super();
       this.v = p0;
    }
    public void E8(){
       LiveActivityRedPacketFragment$b uob = LiveActivityRedPacketFragment$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       b uob1 = b.class;
       LiveActivityRedPacketFragment$b uob2 = 1;
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          a uoa = new a();
          this.E = uoa;
          uoa.a(uob1, new d(this));
          this.E.a(a.class, new c(this));
          b uob4 = new ViewModelProvider(this, this.E).get(uob1);
          c uoc = new c(this.m8(), new e(this));
          if (!PatchProxy.applyVoidTwoRefs(this, uob4, uoc, c.class, "1")) {
             a.p(this, "lifecycleOwner");
             a.p(uob4, "viewModel");
             l.d(uoc.a, this, uob4.a, uob2);
             uoc.a.setOnClickListener(new b(uoc, uob4));
             g.a(uoc.a.getContentTextView(), this, uob4.b);
             g.c(uoc.a.getContentTextView(), this, uob4.d, LiveActivityRedPacketFragmentViewBinding$bindViewModel$2.INSTANCE);
             b.a(uoc.a.getLeftIconView(), this, uob4.e);
             e.a(uoc.a.getBackGroundView(), this, uob4.f, uoc.a.getDefaultBackgroundDrawable());
          }
       }
       int i = this.D.b.getValue().intValue();
       LiveActivityRedPacketFragment$b uob3 = null;
       if (i != uob2) {
          if (i != 2) {
             this.w.a(this.v, this.D, this.E);
          }else {
             this.y.a(this.D, uob3);
          }
       }else {
          this.x.a(this.D, uob3);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketFragment$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveActivityRedPacketFragment$b.class, new y());
       }else {
          obj.put(LiveActivityRedPacketFragment$b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketFragment$b.class, "1")) {
          return;
       }
       this.w = this.q8(o$b.class);
       this.x = this.q8(k$b.class);
       this.y = this.q8(a0$b.class);
       return;
    }
}
