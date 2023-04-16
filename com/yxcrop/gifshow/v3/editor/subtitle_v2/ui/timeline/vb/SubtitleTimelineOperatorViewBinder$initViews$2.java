package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.vb.SubtitleTimelineOperatorViewBinder$initViews$2;
import com.yxcorp.gifshow.widget.m;
import fnd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.vb.SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1;
import android.app.Activity;
import msd.q;
import gnd.b;
import vmd.c;
import java.util.Objects;
import k2b.e0;

public final class SubtitleTimelineOperatorViewBinder$initViews$2 extends m	// class@000aff
{
    public final b c;

    public void SubtitleTimelineOperatorViewBinder$initViews$2(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTimelineOperatorViewBinder$initViews$2.class, "1")) {
          return;
       }
       FragmentActivity activity = this.c.E().getActivity();
       if (activity != null) {
          a.o(activity, "it");
          b.b(activity, new SubtitleTimelineOperatorViewBinder$initViews$2$doClick$$inlined$let$lambda$1(this));
          Fragment uFragment = this.c.E();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          c.a.e(uFragment);
       }
       return;
    }
}
