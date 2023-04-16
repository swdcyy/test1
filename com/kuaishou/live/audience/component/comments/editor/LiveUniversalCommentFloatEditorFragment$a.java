package com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$a;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$e;
import com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment;
import java.lang.Object;
import zx0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public class LiveUniversalCommentFloatEditorFragment$a implements LiveAsrFloatEditorFragment$e	// class@000a99
{
    public final LiveUniversalCommentFloatEditorFragment a;

    public void LiveUniversalCommentFloatEditorFragment$a(LiveUniversalCommentFloatEditorFragment p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment$a.class, "1")) {
          return;
       }
       this.a.m2.add(p0);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment$a.class, "2")) {
          return;
       }
       this.a.m2.remove(p0);
       return;
    }
}
