package com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import amd.c;
import yld.j;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import faa.a;
import java.lang.StringBuilder;
import xld.a;
import q87.c;
import tnd.b;
import tnd.c;
import k2b.e0;

public final class TextTimelineViewBinderV3$b extends m	// class@000b5b
{
    public final TextTimelineViewBinderV3 c;

    public void TextTimelineViewBinderV3$b(TextTimelineViewBinderV3 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTimelineViewBinderV3$b.class, "1")) {
          return;
       }
       a.p(p0, "view");
       TextTimelineViewBinderV3$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, TextTimelineViewBinderV3.class, "5")) {
          c uoc = tc.P().o0();
          tc.E().R();
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("TextTimelineViewBinderV3", "isPhotoMovie="+uoc.t()+", duration="+uoc.n(), objArray);
          b.a(tc.P(), i);
       }
       a = c.a;
       j k = this.c.k;
       Objects.requireNonNull(k, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(k, a, c.class, "6")) {
          a.p(k, "iLogPage");
          a.d(k, "EDIT_ADD_TEXT");
       }
       return;
    }
}
