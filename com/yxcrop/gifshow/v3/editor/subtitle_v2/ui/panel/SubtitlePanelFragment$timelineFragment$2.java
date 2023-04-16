package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$timelineFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;

public final class SubtitlePanelFragment$timelineFragment$2 extends Lambda implements a	// class@000aee
{
    public final SubtitlePanelFragment this$0;

    public void SubtitlePanelFragment$timelineFragment$2(SubtitlePanelFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final SubtitleTimelineFragment invoke(){
       SubtitleTimelineFragment obj = PatchProxy.apply(null, this, SubtitlePanelFragment$timelineFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SubtitleTimelineFragment();
       EditorDelegate uEditorDeleg = this.this$0.kh();
       a.o(uEditorDeleg, "editorDelegate");
       obj.ph(uEditorDeleg);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
