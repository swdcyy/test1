package com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$a;
import nsd.u;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$mContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import dx2.h;
import com.kwai.robust.PatchProxy;
import android.view.View;
import crd.b;
import dx2.p;
import qu2.a;
import co2.f2;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import brd.t;
import cjd.e;
import erd.o;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$b;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$c;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.os.Bundle;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$onCreate$1;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import msd.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.HashMap;

public final class VoicePartyTheaterTubeTabFragment extends BaseFragment	// class@001a3e
{
    public LiveVoicePartyTheaterCommonConfig$TheaterTab j;
    public final p k;
    public h l;
    public b m;
    public HashMap n;
    public static final String o;
    public static final VoicePartyTheaterTubeTabFragment$a p;

    static {
       VoicePartyTheaterTubeTabFragment.p = new VoicePartyTheaterTubeTabFragment$a(null);
       VoicePartyTheaterTubeTabFragment.o = a.C(m0.d(VoicePartyTheaterTubeTabFragment.class).o(), "_tab_conf");
    }
    public void VoicePartyTheaterTubeTabFragment(){
       super(null, null, null, null, 15, null);
       this.k = s.c(super(this));
       this.l = h.a;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeTabFragment.class, "6")) {
          return;
       }
       BaseFragment uBaseFragmen = this.eh();
       if (uBaseFragmen != null) {
          uBaseFragmen.bh(false);
       }
       return;
    }
    public final void ch(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeTabFragment.class, "8")) {
          return;
       }
       VoicePartyTheaterTubeTabFragment tm = this.m;
       if (tm != null && !tm.isDisposed()) {
          tm = this.m;
          if (tm != null) {
             tm.dispose();
          }
       }
       p op = this.dh();
       a.o(op, "mContext");
       String liveStreamId = op.d().getLiveStreamId();
       p op1 = this.dh();
       a.o(op1, "mContext");
       f2 uof2 = op1.g();
       a.o(uof2, "mContext.voicePartyContext");
       String str = uof2.y();
       e uoe = LiveVoicePartyApi.e();
       VoicePartyTheaterTubeTabFragment tj = this.j;
       if (tj == null) {
          a.S("mTabConfig");
       }
       this.m = uoe.n(liveStreamId, str, tj.mTabId).map(new e()).observeOn(a.c()).subscribe(new VoicePartyTheaterTubeTabFragment$b(this, p0), new VoicePartyTheaterTubeTabFragment$c(this, p0));
       return;
    }
    public final p dh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeTabFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final BaseFragment eh(){
       Fragment obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeTabFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getChildFragmentManager().findFragmentById(R.id.content_container);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeTabFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       VoicePartyTheaterTubeTabFragment$a p = VoicePartyTheaterTubeTabFragment.p;
       Bundle uBundle = this.requireArguments();
       a.o(uBundle, "requireArguments\(\)");
       VoicePartyTheaterTubeTabFragment$onCreate$1 oonCreate$1 = new VoicePartyTheaterTubeTabFragment$onCreate$1(this);
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidTwoRefs(uBundle, oonCreate$1, p, VoicePartyTheaterTubeTabFragment$a.class, "2")) {
          Serializable serializable = SerializableHook.getSerializable(uBundle, VoicePartyTheaterTubeTabFragment.o);
          a.m(serializable);
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig.TheaterTab");
          oonCreate$1.invoke(serializable);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyTheaterTubeTabFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d16f5, p1, false);
       View view1 = view.findViewById(R.id.loading_container);
       a.o(view1, "rootView.findViewById\(R.id.loading_container\)");
       this.ch(view1);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeTabFragment.class, "4")) {
          return;
       }
       VoicePartyTheaterTubeTabFragment tm = this.m;
       if (tm != null && !tm.isDisposed()) {
          tm = this.m;
          if (tm != null) {
             tm.dispose();
          }
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeTabFragment.class, "11")) {
       }else {
          VoicePartyTheaterTubeTabFragment tn = this.n;
          if (tn != null) {
             tn.clear();
          }
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeTabFragment.class, "5")) {
          return;
       }
       BaseFragment uBaseFragmen = this.eh();
       if (uBaseFragmen != null) {
          uBaseFragmen.bh(true);
       }
       return;
    }
}
