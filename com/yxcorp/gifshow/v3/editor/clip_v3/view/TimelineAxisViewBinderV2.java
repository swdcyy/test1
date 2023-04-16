package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2;
import npc.e;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import opc.f;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipRootLayout;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$playerTimeView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$totalTime$2;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$initTimelineCallback$1;
import epc.a;
import npc.i;
import epc.b;
import npc.j;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;
import npc.k;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$d;
import npc.d;
import bpc.c;
import com.kwai.robust.PatchProxyResult;
import bpc.f;
import java.lang.Boolean;
import java.util.Objects;
import dpc.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a1;
import dpc.i;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineStatus;
import cpc.a;
import cpc.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import bpc.a;
import java.lang.System;
import android.widget.TextView;
import ooc.f1;
import java.lang.CharSequence;
import uvc.a;
import fpc.a;
import yoc.f;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class TimelineAxisViewBinderV2 extends a implements e	// class@000e21
{
    public final f c;
    public final TimelineViewV2 d;
    public ClipRootLayout e;
    public final p f;
    public final p g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public boolean m;
    public final Fragment n;
    public final Fragment o;

    public void TimelineAxisViewBinderV2(Fragment p0,Fragment p1,View p2){
       a.p(p0, "previewFragment");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p2);
       this.n = p0;
       this.o = p1;
       ViewModel viewModel = ViewModelProviders.of(p0).get(f.class);
       a.o(viewModel, "ViewModelProviders.of\(pr¡­pViewModelV2::class.java\)");
       this.c = viewModel;
       TimelineViewV2 timelineView = p2.findViewById(R.id.timeline_core_view);
       this.d = timelineView;
       View view = p2.findViewById(R.id.clip_root_view);
       a.o(view, "rootView.findViewById\(R.id.clip_root_view\)");
       this.e = view;
       this.f = s.c(new TimelineAxisViewBinderV2$playerTimeView$2(this));
       this.g = s.c(new TimelineAxisViewBinderV2$totalTime$2(this));
       if (PatchProxy.applyVoid(null, this, TimelineAxisViewBinderV2.class, "3")) {
       }else {
          timelineView.setSegmentDragListener(new TimelineAxisViewBinderV2$initTimelineCallback$1(this));
          timelineView.setTimelineClickListener(new i(this));
          timelineView.setTimelineScrollChange(new j(this));
          timelineView.L(new k(this));
       }
       return;
    }
    public void a(){
       d.a(this);
    }
    public void p(c p0,c p1){
       int b;
       a uoa;
       f a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TimelineAxisViewBinderV2 timelineAxis = TimelineAxisViewBinderV2.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, timelineAxis, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (this.k == null && p0.i()) {
          f uof = p0.e();
          TimelineAxisViewBinderV2 obj = PatchProxy.applyTwoRefs(p0, p1, this, timelineAxis, "5");
          int i = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p0.i() && p0.i() != p1.i()){
             b = true;
          }else {
             b = false;
          }
          String str = 2;
          Object[] objArray = null;
          if (b) {
             obj = this.d;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoid(objArray, obj, TimelineViewV2.class, "15")) {
                TimelineViewV2 c = obj.C;
                String str1 = "segmentRecyclerView";
                if (c == null) {
                   a.S(str1);
                }
                c.setAdapter(obj.getSegmentAdapter());
                int i3 = (a1.h() - TimelineViewV2.O) / str;
                TimelineViewV2 c1 = obj.C;
                if (c1 == null) {
                   a.S(str1);
                }
                c1.addItemDecoration(new i(obj, i3));
             }
          }
          this.d.Y(uof.f());
          if (this.d.getStatus() == TimelineStatus.DRAGGING) {
             this.d.S(p0.e().c());
          }else {
             uoa = b.b(p1.e().f(), uof.f());
             Log.b("TimelineAxisViewBinder", "update Segment diffResult: "+uoa);
             b = uoa.b();
             if (b != i) {
                if (b != str) {
                   if (b != 3) {
                      this.i = i;
                      this.j = i;
                      this.d.M();
                   }else {
                      this.j = i;
                      this.d.Q();
                   }
                }else if(uoa.a() > 0 && (uoa.a() < uof.f().size() && (!p0.c().i() && this.d.P(uoa.a())))){
                   this.d.U();
                   this.e.setInterceptAllEvent(i);
                   this.d.R(uoa.a());
                   this.k = i;
                }else {
                   this.i = i;
                   this.j = i;
                   this.d.Q();
                }
             }else if((System.currentTimeMillis() - this.l) - (long)100 > 0){
                this.d.S(p0.e().c());
                this.l = System.currentTimeMillis();
             }
          }
          double d = p0.e().e();
          TextView textView = PatchProxy.apply(objArray, this, timelineAxis, "2");
          if (textView == patchProxyRe) {
             textView = this.g.getValue();
          }
          a.o(textView, "totalTime");
          textView.setText(f1.d(d));
          uoa = p0.a();
          int i1 = p0.e().c();
          if (i1 >= 0 && i1 <= (p0.e().f().size() - i)) {
             a uoa1 = p0.e().f().get(i1);
             a = f.a;
             double d1 = a.d(p0.e(), uoa);
             Object obj1 = PatchProxy.apply(objArray, this, timelineAxis, "1");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = this.f.getValue();
             }
             a.o(obj1, "playerTimeView");
             obj1.setText(f1.d(a.e(i1, (d1 / uoa1.k()), p0.e().f())));
          }
          Log.b("TimelineAxisViewBinder", "playerState: "+uoa.d()+", "+uoa.c());
          if (this.k != null || (uoa.d() != UpdateTo.TIMELINE && uoa.d() != UpdateTo.BOTH)) {
             i = 0;
          }
          if (i && this.d.getStatus() == TimelineStatus.IDLE) {
             int i2 = b.c(p0.e().f(), uoa.c());
             Log.b("TimelineAxisViewBinder", "real scrollTo: "+i2+' '+this.h+' '+this.i);
             if (this.i != null) {
                this.d.post(new TimelineAxisViewBinderV2$a(i2, this, p0));
                this.i = false;
             }else {
                this.d.W(i2, this.h);
             }
          }
       }
    label_0276 :
       return;
    }
}
