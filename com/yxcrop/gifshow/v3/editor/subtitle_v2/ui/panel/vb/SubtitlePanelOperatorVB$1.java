package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB$1;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1;
import android.app.Activity;
import msd.q;
import gnd.b;
import vmd.c;
import java.util.Objects;
import k2b.e0;

public final class SubtitlePanelOperatorVB$1 extends m	// class@000afb
{
    public final SubtitlePanelOperatorVB c;

    public void SubtitlePanelOperatorVB$1(SubtitlePanelOperatorVB p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitlePanelOperatorVB$1.class, "1")) {
          return;
       }
       FragmentActivity activity = this.c.D().getActivity();
       if (activity != null) {
          a.o(activity, "it");
          b.b(activity, new SubtitlePanelOperatorVB$1$doClick$$inlined$let$lambda$1(this));
          Fragment uFragment = this.c.D();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          c.a.e(uFragment);
       }
       return;
    }
}
