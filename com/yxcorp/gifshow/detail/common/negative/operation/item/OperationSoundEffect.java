package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSoundEffect;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import sz9.u;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import ez9.c;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSoundEffect$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import ez9.d;
import kf5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.j;
import androidx.fragment.app.Fragment;
import ez9.b;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class OperationSoundEffect extends w0	// class@001486
{
    public final BaseFragment C;
    public final QPhoto D;
    public final u E;
    public final c F;
    public final m0 G;
    public final SlidePageConfig H;

    public void OperationSoundEffect(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("sound_effect");
       this.G = p0;
       this.H = p1;
       this.C = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.D = mPhoto;
       a.o(mPhoto, "mPhoto");
       u ou = new u(PlayerPanelConfigHelper.a(), mPhoto);
       this.E = ou;
       this.F = new c(ou, p1);
       this.T(R.string.arg_RES_7f100f2d);
       this.L(R.drawable.arg_RES_7f080b22);
       this.R(true);
       this.Q(OperationSoundEffect$1.INSTANCE);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, OperationSoundEffect.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j()) {
          OperationSoundEffect tD = this.D;
          a.o(tD, "mPhoto");
          if (d.a.a(tD, this.G) && f.s()) {
             b = true;
          label_0034 :
             return b;
          }
       }
       b = false;
       goto label_0034 ;
    }
    public void d(w0 p0,g p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationSoundEffect.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       a uoa = this.t();
       int i = 0;
       if (uoa != null) {
          Boolean uBoolean = uoa.invoke();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_002d :
             OperationSoundEffect tD = this.D;
             a.o(tD, "mPhoto");
             String photoId = tD.getPhotoId();
             a.o(photoId, "mPhoto.photoId");
             RxBus.f.b(new j((b ^ 0x01), photoId, this.C.hashCode()));
             OperationSoundEffect tD1 = this.D;
             a.o(tD1, "mPhoto");
             OperationSoundEffect tC = this.C;
             a.o(tC, "mFragment");
             Pair[] pairArray = new Pair[]{r0.a("sound_effect", "PANORAMIC_SOUND"),r0.a("sound_effect_status", this.F.d((b ^ 1)))};
             b.a.c(tD1, tC, t0.M(pairArray));
             return;
          }
       }
       b = 0;
       goto label_002d ;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, OperationSoundEffect.class, "3")) {
          return;
       }
       OperationSoundEffect tD = this.D;
       a.o(tD, "mPhoto");
       OperationSoundEffect tC = this.C;
       a.o(tC, "mFragment");
       this.F.c(tD, tC, this.F.b());
       return;
    }
}
