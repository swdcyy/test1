package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.vb.SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.vb.SubtitleTimelineOperatorViewBinder$initViews$2;
import java.lang.Object;
import a17.c;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.util.ClearSheetOperation;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fnd.b;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
import nsd.u;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachActionV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachAction;
import e17.i;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import vmd.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.NullPointerException;

public final class SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1 extends Lambda implements q	// class@000afe
{
    public final SubtitleTimelineOperatorViewBinder$initViews$2 this$0;

    public void SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1(SubtitleTimelineOperatorViewBinder$initViews$2 p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(c p0,View p1,ClearSheetOperation p2){
       View view;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       a.p(p2, "operation");
       boolean i = 1;
       if (p2 == ClearSheetOperation.CLEAR_ALL) {
          if (PostExperimentUtils.G((this.this$0.c.c.o0().u() ^ i))) {
             SubtitleClearActionV3 subtitleClea = new SubtitleClearActionV3(false, true, false, 5, null);
             this.this$0.c.c.t0(p2);
          }else {
             SubtitleClearAction subtitleClea1 = new SubtitleClearAction(false, true, false, 5, null);
             this.this$0.c.c.t0(p2);
          }
       }
       if (PostExperimentUtils.G((this.this$0.c.c.o0().u() ^ i))) {
          this.this$0.c.c.t0(new SubtitleDetachActionV3(i));
       }else {
          this.this$0.c.c.t0(new SubtitleDetachAction(i));
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f104b1e);
       BaseEditor uBaseEditor = this.this$0.c.i.P(EditorItemFunc.SUBTITLE_V2);
       if (uBaseEditor != null) {
          if (!PatchProxy.applyVoid(null, uBaseEditor, a.class, "12")) {
             uBaseEditor.g(i);
             BaseEditorFragment uBaseEditorF = uBaseEditor.n();
             String str = "fragment";
             a.o(uBaseEditorF, str);
             uBaseEditorF = uBaseEditorF.getView();
             a.m(uBaseEditorF);
             a.o(uBaseEditorF, "fragment.view!!");
             uBaseEditorF.height = a1.e(0x439f0000);
             BaseEditorFragment uBaseEditorF1 = uBaseEditor.n();
             a.o(uBaseEditorF1, str);
             view = uBaseEditorF1.getView();
             a.m(view);
             view.requestLayout();
          }
          Fragment uFragment = this.this$0.c.E();
          if (uFragment != null) {
             i = false;
             if (!PatchProxy.isSupport(SubtitleTimelineFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, uFragment, SubtitleTimelineFragment.class, "4")) {
                uFragment.w = i;
                BaseFragment uBaseFragmen = uFragment.fh().q();
                a.o(uBaseFragmen, "editorDelegate.previewFragment");
                e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
                a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
                uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
                uoe.s(uFragment).m();
             }
             PatchProxy.onMethodExit(SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1.class, "1");
             return;
          }else {
             PatchProxy.onMethodExit(SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment");
          }
       }else {
          PatchProxy.onMethodExit(SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.SubtitleEditorV2");
       }
    }
}
