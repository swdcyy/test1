package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$b;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$e;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import java.lang.Object;
import zx0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public class LiveAsrFloatEditorFragment$b implements LiveAsrFloatEditorFragment$e	// class@000a91
{
    public final LiveAsrFloatEditorFragment a;

    public void LiveAsrFloatEditorFragment$b(LiveAsrFloatEditorFragment p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment$b.class, "1")) {
          return;
       }
       this.a.E1.add(p0);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment$b.class, "2")) {
          return;
       }
       this.a.E1.remove(p0);
       return;
    }
}
