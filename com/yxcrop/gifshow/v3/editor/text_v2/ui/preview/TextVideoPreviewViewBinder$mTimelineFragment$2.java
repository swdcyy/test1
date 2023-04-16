package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$mTimelineFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;

public final class TextVideoPreviewViewBinder$mTimelineFragment$2 extends Lambda implements a	// class@000b32
{
    public final EditorDelegate $editorDelegate;

    public void TextVideoPreviewViewBinder$mTimelineFragment$2(EditorDelegate p0){
       this.$editorDelegate = p0;
       super(0);
    }
    public final TextTimelineFragmentV3 invoke(){
       TextTimelineFragmentV3 obj = PatchProxy.apply(null, this, TextVideoPreviewViewBinder$mTimelineFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextTimelineFragmentV3(false);
       obj.ph(this.$editorDelegate);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
