package com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$ttsFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TextTimelineViewBinderV3$ttsFragment$2 extends Lambda implements a	// class@000b5c
{
    public final TextTimelineViewBinderV3 this$0;

    public void TextTimelineViewBinderV3$ttsFragment$2(TextTimelineViewBinderV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextTTSFragmentV3 invoke(){
       TextTTSFragmentV3 obj = PatchProxy.apply(null, this, TextTimelineViewBinderV3$ttsFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextTTSFragmentV3(this.this$0.t);
       TextTimelineViewBinderV3 s = this.this$0.s;
       if (!PatchProxy.applyVoidOneRefs(s, obj, TextTTSFragmentV3.class, "5")) {
          a.p(s, "<set-?>");
          obj.s = s;
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
