package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import epc.b;
import epc.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.HandlerViewV2;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$tagContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$c;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$d;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$e;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$f;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$g;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fpc.a;

public final class TimelineViewHolder extends RecyclerView$ViewHolder	// class@000de4
{
    public final int a;
    public final ThumbnailView b;
    public final ThumbnailViewV2 c;
    public final HandlerViewV2 d;
    public final FrameLayout e;
    public final KwaiImageView f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public a j;
    public a k;
    public int l;
    public int m;
    public Boolean n;
    public Boolean o;
    public Integer p;
    public final p q;
    public final int r;
    public long s;
    public final a t;

    public void TimelineViewHolder(View p0,b p1,a p2){
       a.p(p0, "itemView");
       a.p(p1, "onTimelineClickListener");
       super(p0);
       this.t = p2;
       this.a = a1.e(2.00f);
       View view = p0.findViewById(R.id.thumbnail_view);
       a.o(view, "itemView.findViewById\(R.id.thumbnail_view\)");
       this.b = view;
       View view1 = p0.findViewById(R.id.thumbnail_view_v2);
       a.o(view1, "itemView.findViewById\(R.id.thumbnail_view_v2\)");
       this.c = view1;
       View view2 = p0.findViewById(R.id.handler_view);
       a.o(view2, "itemView.findViewById\(R.id.handler_view\)");
       this.d = view2;
       View view3 = p0.findViewById(R.id.select_view);
       a.o(view3, "itemView.findViewById\(R.id.select_view\)");
       this.e = view3;
       view3 = p0.findViewById(R.id.transition_item_view);
       a.o(view3, "itemView.findViewById\(R.id.transition_item_view\)");
       this.f = view3;
       View view4 = p0.findViewById(R.id.transition_select_view);
       a.o(view4, "itemView.findViewById\(R.id.transition_select_view\)");
       this.g = view4;
       view4 = p0.findViewById(R.id.left_gap);
       a.o(view4, "itemView.findViewById\(R.id.left_gap\)");
       this.h = view4;
       view4 = p0.findViewById(R.id.right_gap);
       a.o(view4, "itemView.findViewById\(R.id.right_gap\)");
       this.i = view4;
       this.l = -1;
       this.m = -1;
       this.q = s.c(new TimelineViewHolder$tagContainer$2(p0));
       this.r = 10;
       if (PostExperimentUtils.R0()) {
          view1.setOnClickListener(new TimelineViewHolder$a(this, p1));
          if (PostExperimentUtils.V0()) {
             view1.setOnTouchListener(new TimelineViewHolder$b(p1));
             view1.setOnLongClickListener(new TimelineViewHolder$c(this, p1));
          }
          view1.setVisibility(0);
       }else {
          view.setOnClickListener(new TimelineViewHolder$d(this, p1));
          if (PostExperimentUtils.V0()) {
             view.setOnTouchListener(new TimelineViewHolder$e(p1));
             view.setOnLongClickListener(new TimelineViewHolder$f(this, p1));
          }
          view.setVisibility(0);
       }
       view3.setOnClickListener(new TimelineViewHolder$g(this, p1));
       if (p2 != null) {
          Objects.requireNonNull(view2);
          if (!PatchProxy.applyVoidOneRefs(p2, view2, HandlerViewV2.class, "2")) {
             a.p(p2, "listener");
             view2.i = p2;
          }
       }
       return;
    }
    public final TimeLineTagContainer a(){
       Object obj = PatchProxy.apply(null, this, TimelineViewHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final boolean b(){
       Object[] objArray = null;
       TimelineViewHolder obj = PatchProxy.apply(objArray, this, TimelineViewHolder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       int i = 1;
       if (obj != null) {
          if (obj != null) {
             objArray = obj.j();
          }
          obj = this.k;
          a.m(obj);
          if (!(a.g(objArray, obj.j()) ^ i)) {
             i = false;
          }
       }
       return i;
    }
    public final boolean c(){
       boolean b;
       TimelineViewHolder obj = PatchProxy.apply(null, this, TimelineViewHolder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj != null) {
          TimelineViewHolder tk = this.k;
          a.m(tk);
          if (!obj.c() - tk.c()) {
             obj = this.j;
             if (obj != null) {
                tk = this.k;
                a.m(tk);
                if (!obj.b() - tk.b()) {
                   b = false;
                label_0042 :
                   return b;
                }
             }
          }
       }
       b = true;
       goto label_0042 ;
    }
}
