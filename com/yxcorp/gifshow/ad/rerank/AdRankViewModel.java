package com.yxcorp.gifshow.ad.rerank.AdRankViewModel;
import q49.i;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.ad.rerank.AdRankViewModel$RankState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.ad.rerank.AdRankManager;
import kotlin.jvm.internal.a;
import q49.h;
import java.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class AdRankViewModel extends ViewModel implements i	// class@0017c7
{
    public final MutableLiveData b;
    public long c;
    public int d;
    public AdRankViewModel$RankState e;
    public int f;

    public void AdRankViewModel(){
       super();
       this.b = new MutableLiveData();
       this.e = AdRankViewModel$RankState.NORMAL;
    }
    public void k(long p0){
       AdRankViewModel uAdRankViewM = AdRankViewModel.class;
       if (PatchProxy.isSupport(uAdRankViewM) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAdRankViewM, "2")) {
          return;
       }
       long l = this.c + p0;
       this.c = l;
       if (AdRankManager.d.c(l)) {
          this.b.setValue(Long.valueOf(this.c));
       }
       return;
    }
    public final long o0(){
       return this.c;
    }
    public final AdRankViewModel$RankState p0(){
       return this.e;
    }
    public final MutableLiveData q0(){
       return this.b;
    }
    public final void r0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRankViewModel.class, "5")) {
          return;
       }
       a.p(p0, "str");
       int i = (!p0.length())? 1: 0;
       if (i) {
          p0 = "«Âø’÷ÿ÷√";
       }
       this.v0(p0);
       this.c = 0;
       this.d = 0;
       this.e = AdRankViewModel$RankState.NORMAL;
       return;
    }
    public final void s0(int p0){
       this.f = p0;
    }
    public final void t0(AdRankViewModel$RankState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRankViewModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void u0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRankViewModel.class, "3")) {
          return;
       }
       String str = "reason";
       a.p(p0, str);
       h c = h.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidThreeRefs("THANOS_TIMER", this, p0, c, h.class, "1")) {
          a.p("THANOS_TIMER", "key");
          a.p(this, "timer");
          a.p(p0, str);
          h.a.put("THANOS_TIMER", new WeakReference(this));
          c.b(p0);
       }
       return;
    }
    public final void v0(String p0){
       Map a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRankViewModel.class, "4")) {
          return;
       }
       String str = "reason";
       a.p(p0, str);
       h c = h.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidTwoRefs("THANOS_TIMER", p0, c, h.class, "2")) {
          a.p("THANOS_TIMER", "key");
          a.p(p0, str);
          a = h.a;
          a.remove("THANOS_TIMER");
          if (a.isEmpty()) {
             c.c(p0);
          }
       }
       return;
    }
}
