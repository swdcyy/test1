package com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;
import k47.f;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$mViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.widget.FrameLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.view.View;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import qrd.l1;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.widget.Button;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import m47.g;
import java.util.Set;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p47.b$a;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import java.util.Collection;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import u37.d;
import u37.e;
import brd.t;
import m47.c;
import erd.g;
import cjd.e;
import erd.o;
import m47.d;
import erd.a;
import m47.e;
import m47.f;
import crd.b;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$b;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$c;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$d;

public final class LiveGzoneCompetitionScheduleFilterPopup extends f	// class@000cc1
{
    public RecyclerView A;
    public View B;
    public SelectShapeButton C;
    public FrameLayout D;
    public final p E;
    public j F;
    public b$a G;
    public RecyclerView z;

    public void LiveGzoneCompetitionScheduleFilterPopup(FragmentActivity p0){
       a.p(p0, "activity");
       super(p0);
       this.E = s.c(new LiveGzoneCompetitionScheduleFilterPopup$mViewModel$2(p0));
    }
    public static final FrameLayout o0(LiveGzoneCompetitionScheduleFilterPopup p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mTipsContainer");
       }
       return p0;
    }
    public int d0(){
       return 0x7f0d0bad;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneCompetitionScheduleFilterPopup.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(442.00f);
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneCompetitionScheduleFilterPopup.class, "2")) {
          return;
       }
       super.f0(p0, p1);
       if (p0 != null) {
          View view = p0.findViewById(R.id.live_gzone_competition_game_tips_container);
          a.o(view, "view.findViewById\(R.id.l¡­tion_game_tips_container\)");
          this.D = view;
          view = p0.findViewById(R.id.live_gzone_competition_game_filter_game_rv);
          View view1 = view;
          a.o(view1, "this");
          view1.setLayoutManager(new LinearLayoutManager(this.l0()));
          a.o(view, "view.findViewById<Recycl¡­rPopup.mActivity\)\n      }");
          this.z = view1;
          view = p0.findViewById(R.id.live_gzone_competition_game_filter_detail_rv);
          view1 = view;
          a.o(view1, "this");
          view1.setLayoutManager(new LinearLayoutManager(this.l0()));
          a.o(view, "view.findViewById<Recycl¡­rPopup.mActivity\)\n      }");
          this.A = view1;
          view = p0.findViewById(R.id.live_gzone_competition_game_filter_reset_btn);
          view.setOnClickListener(this);
          a.o(view, "view.findViewById<View>\(¡­eduleFilterPopup\)\n      }");
          this.B = view;
          p0 = p0.findViewById(R.id.live_gzone_competition_game_filter_confirm_btn);
          view = p0;
          view.setOnClickListener(this);
          a.o(p0, "view.findViewById<Select¡­eFilterPopup\)\n          }");
          this.C = view;
       }
       this.q0();
       return;
    }
    public void m0(c p0,int p1){
       if (PatchProxy.isSupport(LiveGzoneCompetitionScheduleFilterPopup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveGzoneCompetitionScheduleFilterPopup.class, "4")) {
          return;
       }
       a.p(p0, "popup");
       LiveGzoneCompetitionScheduleFilterPopup tG = this.G;
       if (tG != null) {
          tG.a(CollectionsKt___CollectionsKt.G5(this.p0().s0()), false);
       }
       return;
    }
    public void n0(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionScheduleFilterPopup.class, "3")) {
          return;
       }
       g og = 0x7f0a1ecb;
       b$a uoa = null;
       if (p0 != null && p0.intValue() == og) {
          g og1 = this.p0();
          Objects.requireNonNull(og1);
          if (!PatchProxy.applyVoid(uoa, og1, g.class, "7")) {
             og1.h.clear();
             og1.a.postValue(og1.i);
             og1.d.setValue(CollectionsKt___CollectionsKt.J5(og1.h));
          }
       }else {
          og = 0x7f0a1ec7;
          if (p0 != null && p0.intValue() == og) {
             LiveGzoneCompetitionScheduleFilterPopup tG = this.G;
             if (tG != null) {
                tG.a(CollectionsKt___CollectionsKt.G5(this.p0().s0()), true);
             }
             this.G = uoa;
             this.o();
          }
       }
       return;
    }
    public final g p0(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneCompetitionScheduleFilterPopup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getValue();
    }
    public final void q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneCompetitionScheduleFilterPopup.class, "7")) {
          return;
       }
       this.p0().q0().observe(this.l0(), new LiveGzoneCompetitionScheduleFilterPopup$a(this));
       g og = this.p0();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoid(objArray, og, g.class, "2")) {
          og.g = e.b().w().doOnSubscribe(new c(og)).map(new e()).doOnComplete(new d(og)).subscribe(new e(og), new f(og));
       }
       this.p0().p0().observe(this.l0(), new LiveGzoneCompetitionScheduleFilterPopup$b(this));
       this.p0().r0().observe(this.l0(), new LiveGzoneCompetitionScheduleFilterPopup$c(this));
       this.p0().c.observe(this.l0(), new LiveGzoneCompetitionScheduleFilterPopup$d(this));
       return;
    }
}
