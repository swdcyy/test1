package com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import pm8.a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.widget.LiveVoicePartyPanelLoadingMaskView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import ot2.f;
import java.lang.Runnable;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$a;

public class LiveVoicePartyActionsView extends FrameLayout	// class@001784
{
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public List j;
    public Map k;
    public RecyclerView l;
    public LiveVoicePartyActionsView$a m;
    public LiveVoicePartyPanelLoadingMaskView n;
    public ActionsController$a o;
    public boolean p;
    public a q;
    public f2 r;
    public int s;
    public boolean t;
    public static final int u;

    public void LiveVoicePartyActionsView(Context p0){
       super(p0);
       this.b = "LiveVoicePartyActionRecyclerView";
       this.c = 0x134820f;
       this.d = 0x1347e14;
       this.e = a1.d(0x7f0709fb);
       this.f = a1.d(0x7f0709f6);
       this.g = a1.d(0x7f0709f5) + (a1.d(0x7f0709f3) * 2);
       this.h = a1.d(0x7f0709fa);
       this.i = 3;
       this.p = false;
       this.t = a.j0();
       this.b();
    }
    public void LiveVoicePartyActionsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "LiveVoicePartyActionRecyclerView";
       this.c = 0x134820f;
       this.d = 0x1347e14;
       this.e = a1.d(0x7f0709fb);
       this.f = a1.d(0x7f0709f6);
       this.g = a1.d(0x7f0709f5) + (a1.d(0x7f0709f3) * 2);
       this.h = a1.d(0x7f0709fa);
       this.i = 3;
       this.p = false;
       this.t = a.j0();
       this.b();
    }
    public void LiveVoicePartyActionsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "LiveVoicePartyActionRecyclerView";
       this.c = 0x134820f;
       this.d = 0x1347e14;
       this.e = a1.d(0x7f0709fb);
       this.f = a1.d(0x7f0709f6);
       this.g = a1.d(0x7f0709f5) + (a1.d(0x7f0709f3) * 2);
       this.h = a1.d(0x7f0709fa);
       this.i = 3;
       this.p = false;
       this.t = a.j0();
       this.b();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyActionsView.class, "3")) {
          return;
       }
       this.n.c();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyActionsView.class, "4")) {
          return;
       }
       RecyclerView recyclerView = new RecyclerView(this.getContext());
       this.l = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       this.addView(this.l, new FrameLayout$LayoutParams(-1, -2));
       LiveVoicePartyActionsView$a uoa = new LiveVoicePartyActionsView$a(this);
       this.m = uoa;
       this.l.setAdapter(uoa);
       this.n = new LiveVoicePartyPanelLoadingMaskView(this.getContext());
       this.addView(this.n, new FrameLayout$LayoutParams(this.n.getLoadingViewWidth(), -1));
       this.n.setVisibility(8);
       return;
    }
    public void c(List p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyActionsView.class, "1")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.Z(oTHER, "LiveVoicePartyActionRecyclerView updateActions");
       this.j = p0;
       this.k = p1;
       this.p = q.f(p0) ^ 1;
       this.m.k0();
       if (!PatchProxy.applyVoid(null, this, LiveVoicePartyActionsView.class, "5") && this.t == null) {
          LiveVoicePartyActionsView tj = this.j;
          if (tj != null && (tj.size() && (((this.j.size() * this.g) + ((this.j.size() - 1) * this.f)) + (this.e * 2)) > this.getWidth())) {
             b.Z(oTHER, "show sliding guide of mic seat actions");
             this.l.scrollToPosition((this.j.size() - 1));
             this.postDelayed(new f(this), 1000);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean(b.d("user")+"liveVoicePartyMicSeatActionSlidingGuideHasShown", 1);
             g.a(uEditor);
             this.t = true;
          }
       }
    label_00a1 :
       return;
    }
    public void setActionCallBack(ActionsController$a p0){
       this.o = p0;
    }
}
