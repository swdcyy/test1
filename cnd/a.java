package cnd.a;
import and.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.CalculateIndexRecyclerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import f9c.b;
import java.util.Objects;
import cnd.a$a;
import cnd.a$b;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import xld.a;
import java.lang.Double;
import java.lang.Math;
import ekd.q;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$refreshDurationIfNeeded$1;
import msd.l;
import trd.y;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData$a;
import cnd.a$c;
import java.lang.Runnable;
import java.util.Collection;
import vvc.a;
import uvc.a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import cnd.a$d;
import gnd.c;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import gnd.d;
import u2.f;

public final class a extends a implements a	// class@000343
{
    public final f c;
    public final CalculateIndexRecyclerView d;
    public final EditDecorationContainerViewV2 e;
    public final Fragment f;

    public void a(Fragment p0,View p1,Fragment p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "previewFragment");
       super(p1);
       this.f = p0;
       this.c = b.a(p0);
       View view = p1.findViewById(R.id.subtitle_content);
       a.o(view, "rootView.findViewById\(R.id.subtitle_content\)");
       this.d = view;
       p1 = p2.requireView().findViewById(R.id.new_text_decoration_editor_view);
       a.o(p1, "previewFragment.requireV¡­t_decoration_editor_view\)");
       this.e = p1;
       view.setLayoutManager(new OffsetLinearLayoutManager(view.getContext()));
       view.setAdapter(new SubtitleTextAdapter(new ArrayList()));
       new b().b(view);
       RecyclerView$Adapter adapter = view.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
       adapter.e = new a$a(this);
       view.x(new a$b(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.c.o0().A() == SubtitleStatus.SUCCESS) {
          RecyclerView$Adapter adapter = this.d.getAdapter();
          Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
          double d = this.c.o0().m();
          List list = this.c.o0().i();
          SubtitleTextAdapter subtitleText = SubtitleTextAdapter.class;
          if (!PatchProxy.isSupport(subtitleText) || !PatchProxy.applyVoidTwoRefs(Double.valueOf(d), list, adapter, subtitleText, "7")) {
             a.p(list, "content");
             if (Math.abs((adapter.h - d))) {
                adapter.h = d;
                ArrayList uArrayList = q.b(list);
                a.o(uArrayList, "copy");
                y.K0(uArrayList, new SubtitleTextAdapter$refreshDurationIfNeeded$1(d));
                adapter.f = 0;
                adapter.g = uArrayList;
                uArrayList.add(NewTextBaseElementData.Q.a());
                adapter.k0();
             }
          }
       }
       return;
    }
    public final Fragment D(){
       return this.f;
    }
    public void O7(a p0,a p1){
       RecyclerView$Adapter adapter;
       RecyclerView$Adapter adapter1;
       Object obj = this;
       List obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, a.class, "2")) {
          return;
       }
       a.p(obj1, "newState");
       a.p(obj2, "lastState");
       if (p0.A() == p1.A() || (p0.A() == SubtitleStatus.SUCCESS || (p0.E() && !p1.E()))) {
          adapter = obj.d.getAdapter();
          Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
          SubtitleTextAdapter.N0(adapter, p0.i(), p0.m(), 0, 4, null);
       }
       if (p0.s() != p1.s() && !p0.s()) {
          obj.d.scrollToPosition(p0.z());
          obj.d.C(p0.z());
          obj.d.postDelayed(new a$c(obj, obj1), 100);
       }
       if ((p0.i().isEmpty() ^ 0x01) && p0.E()) {
          adapter1 = obj.d.getAdapter();
          Objects.requireNonNull(adapter1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
          if (p0.z() != adapter1.K0() && (!p0.s() && !p1.s())) {
             adapter = obj.d.getAdapter();
             Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
             int i = adapter.K0();
             if (a.a(a.a, p0.a().c(), p1.a().c(), 0, 4, null) || (p0.a().d() != UpdateTo.PLAYER || p0.z() != i)) {
                if (p0.E() && !p1.E()) {
                   obj.d.scrollToPosition(p0.z());
                   obj.d.C(p0.z());
                }else {
                   a d = obj.d;
                   int i1 = p0.z();
                   Objects.requireNonNull(d);
                   if (!PatchProxy.isSupport(CalculateIndexRecyclerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), d, CalculateIndexRecyclerView.class, "1")) {
                      int i2 = d.B(i1, false);
                      Object[] objArray = new Object[false];
                      a.D().s("CalculateIndexRecyclerView", "smoothScrollToTargetIndex: "+i2+" index: "+i1, objArray);
                      d.A(false, i2);
                   }
                }
             }
             obj.d.postDelayed(new a$d(obj, obj1), 100);
          }
       }
    label_0169 :
       obj1 = p0.i();
       adapter1 = obj.d.getAdapter();
       Objects.requireNonNull(adapter1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
       h.b(new c(obj1, p1.i())).e(new d(adapter1, obj1));
       return;
    }
}
