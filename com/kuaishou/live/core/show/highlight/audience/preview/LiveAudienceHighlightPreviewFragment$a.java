package com.kuaishou.live.core.show.highlight.audience.preview.LiveAudienceHighlightPreviewFragment$a;
import kq5.b;
import com.kuaishou.live.core.show.highlight.audience.preview.LiveAudienceHighlightPreviewFragment;
import java.lang.Object;
import androidx.fragment.app.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import kq5.a;

public class LiveAudienceHighlightPreviewFragment$a implements b	// class@000be5
{
    public final LiveAudienceHighlightPreviewFragment a;

    public void LiveAudienceHighlightPreviewFragment$a(LiveAudienceHighlightPreviewFragment p0){
       this.a = p0;
       super();
    }
    public void a(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceHighlightPreviewFragment$a.class, "2")) {
          return;
       }
       this.a.u.remove(p0);
       return;
    }
    public void b(){
       a.a(this);
    }
    public void c(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceHighlightPreviewFragment$a.class, "1")) {
          return;
       }
       this.a.u.add(p0);
       return;
    }
}
