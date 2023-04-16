package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder;
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
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$playerTimeView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$totalTime$2;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$initTimelineCallback$1;
import epc.a;
import npc.f;
import epc.b;
import npc.g;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;
import npc.h;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$d;
import npc.d;
import bpc.c;
import com.kwai.robust.PatchProxyResult;
import bpc.f;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineStatus;
import cpc.a;
import cpc.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import bpc.a;
import android.widget.TextView;
import ooc.f1;
import java.lang.CharSequence;
import uvc.a;
import fpc.a;
import yoc.f;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class TimelineAxisViewBinder extends a implements e	// class@000e1a
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
    public boolean l;
    public final Fragment m;
    public final Fragment n;

    public void TimelineAxisViewBinder(Fragment p0,Fragment p1,View p2){
       a.p(p0, "previewFragment");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p2);
       this.m = p0;
       this.n = p1;
       ViewModel viewModel = ViewModelProviders.of(p0).get(f.class);
       a.o(viewModel, "ViewModelProviders.of\(pr¡­pViewModelV2::class.java\)");
       this.c = viewModel;
       TimelineViewV2 timelineView = p2.findViewById(R.id.timeline_core_view);
       this.d = timelineView;
       View view = p2.findViewById(R.id.clip_root_view);
       a.o(view, "rootView.findViewById\(R.id.clip_root_view\)");
       this.e = view;
       this.f = s.c(new TimelineAxisViewBinder$playerTimeView$2(this));
       this.g = s.c(new TimelineAxisViewBinder$totalTime$2(this));
       if (PatchProxy.applyVoid(null, this, TimelineAxisViewBinder.class, "3")) {
       }else {
          timelineView.setSegmentDragListener(new TimelineAxisViewBinder$initTimelineCallback$1(this));
          timelineView.setTimelineClickListener(new f(this));
          timelineView.setTimelineScrollChange(new g(this));
          timelineView.L(new h(this));
       }
       return;
    }
    public void a(){
       d.a(this);
    }
    public void p(c p0,c p1){
       int i1;
       f a;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TimelineAxisViewBinder timelineAxis = TimelineAxisViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, timelineAxis, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (this.k != null) {
          return;
       }
       f uof = p0.e();
       this.d.Y(uof.f());
       int i = 1;
       if (this.d.getStatus() == TimelineStatus.DRAGGING) {
          this.d.S(p0.e().c());
       }else {
          a uoa2 = b.b(p1.e().f(), uof.f());
          Log.b("TimelineAxisViewBinder", "update Segment diffResult: "+uoa2);
          i1 = uoa2.b();
          if (i1 != i) {
             if (i1 != 2) {
                if (i1 != 3) {
                   this.i = i;
                   this.j = i;
                   this.d.M();
                }else {
                   this.j = i;
                   this.d.Q();
                }
             }else if(uoa2.a() > 0 && (uoa2.a() < uof.f().size() && (!p0.c().i() && this.d.P(uoa2.a())))){
                this.d.U();
                this.e.setInterceptAllEvent(i);
                this.d.R(uoa2.a());
                this.k = i;
             }else {
                this.i = i;
                this.j = i;
                this.d.Q();
             }
          }else {
             this.d.S(p0.e().c());
          }
       }
       double d = p0.e().e();
       Object[] objArray = null;
       TextView textView = PatchProxy.apply(objArray, this, timelineAxis, "2");
       if (textView == patchProxyRe) {
          textView = this.g.getValue();
       }
       a.o(textView, "totalTime");
       textView.setText(f1.d(d));
       a uoa = p0.a();
       i1 = p0.e().c();
       if (i1 >= 0 && i1 <= (p0.e().f().size() - i)) {
          a uoa1 = p0.e().f().get(i1);
          a = f.a;
          double d1 = a.d(p0.e(), uoa);
          TextView textView1 = PatchProxy.apply(objArray, this, timelineAxis, "1");
          if (textView1 == patchProxyRe) {
             textView1 = this.f.getValue();
          }
          a.o(textView1, "playerTimeView");
          textView1.setText(f1.d(a.e(i1, (d1 / uoa1.k()), p0.e().f())));
       }
       Log.b("TimelineAxisViewBinder", "playerState: "+uoa.d()+", "+uoa.c());
       b = false;
       if (this.k != null || (uoa.d() != UpdateTo.TIMELINE && uoa.d() != UpdateTo.BOTH)) {
          i = 0;
       }
       if (i && this.d.getStatus() == TimelineStatus.IDLE) {
          int i2 = b.c(p0.e().f(), uoa.c());
          Log.b("TimelineAxisViewBinder", "real scrollTo: "+i2+' '+this.h+' '+this.i);
          if (this.i != null) {
             this.d.post(new TimelineAxisViewBinder$a(i2, this, p0));
             this.i = b;
          }else {
             this.d.W(i2, this.h);
          }
       }
       return;
    }
}
