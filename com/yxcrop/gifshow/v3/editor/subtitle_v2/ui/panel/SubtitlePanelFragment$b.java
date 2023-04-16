package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$b;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import java.lang.Object;
import zmd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import hnd.f;
import kotlin.jvm.internal.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import and.a;

public final class SubtitlePanelFragment$b implements Observer	// class@000aed
{
    public final SubtitlePanelFragment b;

    public void SubtitlePanelFragment$b(SubtitlePanelFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitlePanelFragment$b.class, str)) {
       }else {
          SubtitlePanelFragment$b tb = this.b;
          Objects.requireNonNull(tb);
          SubtitlePanelFragment subtitlePane = PatchProxy.apply(null, tb, SubtitlePanelFragment.class, str);
          if (subtitlePane != PatchProxyResult.class) {
          }else {
             subtitlePane = tb.G;
             if (subtitlePane == null) {
                a.S("subtitleViewModel");
             }
          }
          a uoa = subtitlePane.u0();
          a.o(p0, "newState");
          this.b.O7(p0, uoa);
          Iterator iterator = this.b.H.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1 instanceof a) {
                uoa1.O7(p0, uoa);
             }
          }
       }
       return;
    }
}
