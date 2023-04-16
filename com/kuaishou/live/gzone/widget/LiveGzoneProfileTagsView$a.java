package com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView;
import java.util.List;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneProfileTagsView$a implements View$OnClickListener	// class@001cf8
{
    public final List b;
    public final LiveGzoneProfileTagsView c;

    public void LiveGzoneProfileTagsView$a(LiveGzoneProfileTagsView p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneProfileTagsView$a.class, "1")) {
          return;
       }
       LiveGzoneProfileTagsView$a tc = this.c;
       tc.l = tc.l ^ 0x01;
       tc.setTags(this.b);
       return;
    }
}
