package com.kuaishou.live.gzone.widget.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$c;

public class a extends m	// class@001cfd
{
    public final LiveGzoneAuthorAuthenticationTagResponse$Tag c;
    public final LiveGzoneProfileTagsView d;

    public void a(LiveGzoneProfileTagsView p0,LiveGzoneAuthorAuthenticationTagResponse$Tag p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       LiveGzoneProfileTagsView m = this.d.m;
       if (m != null) {
          m.a(this.c);
       }
       return;
    }
}
