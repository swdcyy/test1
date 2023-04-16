package com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import o02.j;
import o02.i;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$c;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$d;
import erd.g;
import android.view.View;
import pw6.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.widget.SpinnerAdapter;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$b;
import android.widget.AdapterView$OnItemSelectedListener;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.HashMap;

public final class LivePlayTestActivity$TestContainerFragment extends BaseFragment	// class@00181e
{
    public Fragment j;
    public b k;
    public View l;
    public Spinner m;
    public HashMap n;
    public static final LivePlayTestActivity$TestContainerFragment$a o;

    static {
       LivePlayTestActivity$TestContainerFragment.o = new LivePlayTestActivity$TestContainerFragment$a(null);
    }
    public void LivePlayTestActivity$TestContainerFragment(){
       super(null, null, null, null, 15, null);
    }
    public final void ch(){
       LivePlayTestActivity$TestContainerFragment tj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayTestActivity$TestContainerFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LivePlayTestActivity$TestContainerFragment.class, "6")) {
          tj = this.k;
          if (tj != null) {
             tj.dispose();
          }
          this.fh(objArray);
       }
       tj = this.j;
       if (tj != null) {
          this.getChildFragmentManager().beginTransaction().u(tj).o();
       }
       return;
    }
    public final LiveAudienceParam dh(LiveStreamFeed p0){
       LiveAudienceParam$a obj = PatchProxy.applyOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceParam$a();
       obj.i(p0.getId());
       obj.g(9);
       obj.j(p0);
       LiveAudienceParam liveAudience = obj.a();
       a.o(liveAudience, "LiveAudienceParam.Builde…eamFeed\)\n        .build\(\)");
       return liveAudience;
    }
    public final void eh(String p0,int p1){
       if (PatchProxy.isSupport(LivePlayTestActivity$TestContainerFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LivePlayTestActivity$TestContainerFragment.class, "8")) {
          return;
       }
       this.fh(i.a().a(p0, null, null).map(new e()).subscribe(new LivePlayTestActivity$TestContainerFragment$c(this, p1), new LivePlayTestActivity$TestContainerFragment$d(this, p0)));
       return;
    }
    public final void fh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment.class, "1")) {
          return;
       }
       this.k = p0;
       LivePlayTestActivity$TestContainerFragment tl = this.l;
       if (tl == null) {
          a.S("loading");
       }
       int i = (p0 != null)? 0: 8;
       tl.setVisibility(i);
       return;
    }
    public final void gh(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment.class, "12")) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.live_play_test_container, p0.g0());
       uoe.o();
       this.j = p0.g0();
       p0.I();
       p0.a0();
       p0.Mg("ACTIVITY_FINISH");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePlayTestActivity$TestContainerFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d09a1, p1, false);
       View view1 = view.findViewById(R.id.loading);
       a.o(view1, "view.findViewById\(R.id.loading\)");
       this.l = view1;
       EditText uEditText = view.findViewById(R.id.input);
       View view2 = view.findViewById(R.id.live_type_spinner);
       a.o(view2, "view.findViewById<Spinner>\(R.id.live_type_spinner\)");
       this.m = view2;
       String str = "spinner";
       if (view2 == null) {
          a.S(str);
       }
       String[] stringArray = new String[]{"None","Lite直播间","简易直播间","详情直播间"};
       view2.setAdapter(new ArrayAdapter(this.requireContext(), 0x109000a, CollectionsKt__CollectionsKt.L(stringArray)));
       LivePlayTestActivity$TestContainerFragment tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tm.setOnItemSelectedListener(new LivePlayTestActivity$TestContainerFragment$b(this, uEditText));
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LivePlayTestActivity$TestContainerFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LivePlayTestActivity$TestContainerFragment.class, "5")) {
          return;
       }
       this.ch();
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, LivePlayTestActivity$TestContainerFragment.class, "15")) {
          LivePlayTestActivity$TestContainerFragment tn = this.n;
          if (tn != null) {
             tn.clear();
          }
       }
       return;
    }
}
