package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB$1;
import java.lang.Object;
import a17.c;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.util.ClearSheetOperation;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
import nsd.u;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearAction;
import e17.i;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import java.lang.NullPointerException;

public final class SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1 extends Lambda implements q	// class@000afa
{
    public final SubtitlePanelOperatorVB$1 this$0;

    public void SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1(SubtitlePanelOperatorVB$1 p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(c p0,View p1,ClearSheetOperation p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       a.p(p2, "operation");
       if (p2 == ClearSheetOperation.CLEAR_ALL) {
          if (PostExperimentUtils.G((this.this$0.c.c.o0().u() ^ 0x01))) {
             SubtitleClearActionV3 subtitleClea = new SubtitleClearActionV3(false, false, false, 7, null);
             this.this$0.c.c.t0("sheet");
          }else {
             SubtitleClearAction subtitleClea1 = new SubtitleClearAction(false, false, false, 7, null);
             this.this$0.c.c.t0("sheet");
          }
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f104b1e);
       Fragment uFragment = this.this$0.c.D();
       if (uFragment != null) {
          uFragment.yh();
          PatchProxy.onMethodExit(SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment");
       }
    }
}
