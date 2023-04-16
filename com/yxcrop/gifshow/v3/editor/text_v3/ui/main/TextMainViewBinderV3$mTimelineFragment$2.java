package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$mTimelineFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;

public final class TextMainViewBinderV3$mTimelineFragment$2 extends Lambda implements a	// class@000c49
{
    public final EditorDelegate $delegate;
    public final TextMainViewBinderV3 this$0;

    public void TextMainViewBinderV3$mTimelineFragment$2(TextMainViewBinderV3 p0,EditorDelegate p1){
       this.this$0 = p0;
       this.$delegate = p1;
       super(0);
    }
    public final TextTimelineFragmentV3 invoke(){
       TextTimelineFragmentV3 obj = PatchProxy.apply(null, this, TextMainViewBinderV3$mTimelineFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextTimelineFragmentV3((this.this$0.a0().o0().u() ^ 0x01));
       obj.ph(this.$delegate);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
