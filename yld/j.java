package yld.j;
import yld.l;
import ei0.a;
import android.view.View;
import amd.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import voc.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tnd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import android.widget.Button;
import yld.j$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import yld.i;
import android.view.View$OnClickListener;
import yld.f;
import yld.g;
import yld.h;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import wnd.j;
import com.yxcorp.gifshow.widget.adv.model.f;
import yld.e;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.a;
import jod.a;
import java.util.List;
import yld.j$b;
import java.lang.Runnable;
import yld.j$c;
import java.util.ArrayList;
import uvc.a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ooc.f1;
import zld.b;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import zld.c;
import u2.f;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.Number;
import java.lang.Boolean;
import fnd.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import zld.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView;

public class j extends a implements l	// class@002a65
{
    public final EditDecorationContainerViewV2 c;
    public final TimelineCoreView d;
    public final View e;
    public final Button f;
    public final Button g;
    public a h;
    public final j$a i;
    public final c j;
    public final Fragment k;
    public final VideoSDKPlayerView l;
    public final o m;
    public final boolean n;

    public void j(View p0,c p1,Fragment p2,VideoSDKPlayerView p3,o p4,boolean p5){
       a.p(p0, "rootView");
       a.p(p1, "viewModel");
       a.p(p2, "fragment");
       a.p(p3, "sdkPlayerView");
       a.p(p4, "editorContext");
       super(p0);
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       View view = b.b(p2).getView();
       a.m(view);
       view = view.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "findPreviewFragment\(frag¡­t_decoration_editor_view\)");
       this.c = view;
       view = p0.findViewById(R.id.timeline_core_view);
       a.o(view, "rootView.findViewById\(R.id.timeline_core_view\)");
       this.d = view;
       View view1 = p0.findViewById(R.id.directly_to_start_or_end_mask_view);
       a.o(view1, "rootView.findViewById\(R.¡­o_start_or_end_mask_view\)");
       this.e = view1;
       View view2 = p0.findViewById(R.id.directly_to_video_start_btn);
       a.o(view2, "rootView.findViewById\(R.¡­ectly_to_video_start_btn\)");
       this.f = view2;
       p0 = p0.findViewById(R.id.directly_to_video_end_btn);
       a.o(p0, "rootView.findViewById\(R.¡­irectly_to_video_end_btn\)");
       this.g = p0;
       j$a uoa = new j$a(this);
       this.i = uoa;
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
       }else {
          view.setVisibility(0);
          view.getTimeLineView().setTimelineListener(uoa);
          view.getPlayStatusView().setOnClickListener(new i(this));
       }
       if (!PatchProxy.applyVoid(null, this, j.class, "8")) {
          view1.setOnClickListener(new f(this));
          view2.setOnClickListener(new g(this));
          p0.setOnClickListener(new h(this));
       }
       return;
    }
    public void j(View p0,c p1,Fragment p2,VideoSDKPlayerView p3,o p4,boolean p5,int p6,u p7){
       boolean b = (p6 & 0x20)? false: p5;
       super(p0, p1, p2, p3, p4, b);
       return;
    }
    public void B(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       EditorTimeLineView timeLineView = this.d.getTimeLineView();
       ITimelineView$d uod = PatchProxy.apply(objArray, this, oj, "7");
       if (uod != PatchProxyResult.class) {
       }else {
          f i = this.m.d().i;
          a.o(i, "editorContext.timelineSavedData.mTimelineConfig");
          uod = j.a.b(i);
          uod.g = new e(this);
          uod.b(this.d.getCenterIndicator(), objArray);
       }
       timeLineView.e(uod);
       this.d.getTimeLineView().setTimelineListener(this.i);
       this.d.b(false);
       if (!this.S()) {
          this.T(this.j.o0().r().b());
       }
       if (this.S()) {
          this.d.post(new j$b(this));
       }else {
          this.U();
       }
       this.d.postDelayed(new j$c(this), 100);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "3")) {
          return;
       }
       this.d.getTimeLineView().setTimelineListener(objArray);
       this.d.getTimeLineView().s(new ArrayList());
       return;
    }
    public final void D(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "5")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       double d = p0.a().c();
       if (p0.a().d() == UpdateTo.BOTH || p0.a().d() == UpdateTo.TIMELINE) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("timeline_tag", "Text player time: "+p0.a().c()+' '+"updateTo: "+p0.a().d(), objArray);
          f1.a(this.d.getTimeLineView(), p0.a().c(), i);
          if (this.Q()) {
             double d1 = this.L();
             if (this.l.isPlaying() && d - d1 >= 0) {
                Object[] objArray1 = new Object[i];
                a.D().w("DecorationTimelineViewBinder", "pause in photo movie end, currentTime="+d+", "+"photoMovieDuration="+d1, objArray1);
                this.l.pause();
             }
          }
       }
       boolean b = p0.a().e();
       if (b != p1.a().e()) {
          this.d.b(b);
       }
       List list = p0.r().b();
       List list1 = p1.r().b();
       c uoc = new c(this.d, list, list1, p0.n());
       h.b(new b(list, list1)).e(b);
       return;
    }
    public final EditDecorationContainerViewV2 E(){
       return this.c;
    }
    public final View F(){
       return this.e;
    }
    public final Button G(){
       return this.g;
    }
    public final Button H(){
       return this.f;
    }
    public final a I(){
       return this.h;
    }
    public final TimelineCoreView J(){
       return this.d;
    }
    public final double K(){
       Object obj = PatchProxy.apply(null, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return ((double)this.j.o0().c().size() * 2.00f);
    }
    public final double L(){
       Object obj = PatchProxy.apply(null, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (this.K() - 0x3fa999999999999a);
    }
    public final VideoSDKPlayerView M(){
       return this.l;
    }
    public final double N(){
       Object obj = PatchProxy.apply(null, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (this.Q())? this.K(): this.j.o0().m();
       return d;
    }
    public final c P(){
       return this.j;
    }
    public final boolean Q(){
       Object obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.o0().t();
    }
    public final boolean R(){
       return this.n;
    }
    public boolean S(){
       return this instanceof c;
    }
    public final void T(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "14")) {
          return;
       }
       a.p(p0, "rangeList");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa.s()) {
             a.a(uoa, this.j.o0().n(), this.d);
          }
       }
       return;
    }
    public final void U(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.d.getTimeLineView().v(this.j.o0().r().b()).E();
       return;
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       this.D(p0, p1);
       if (p0.o() != p1.o()) {
          Object[] objArray = new Object[0];
          a.D().s("timeline_tag", "Text notify!!!", objArray);
          this.T(p0.r().b());
          this.d.getTimeLineView().v(p0.r().b()).E();
       }
       return;
    }
}
