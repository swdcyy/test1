package com.kuaishou.live.common.core.component.comments.item.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.item.e;
import com.kuaishou.live.common.core.component.comments.item.e$b;

public class b extends m	// class@00109a
{
    public final LiveAnnounceMessage c;
    public final e$a d;

    public void b(e$a p0,LiveAnnounceMessage p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.d.n.b.b(this.c);
       return;
    }
}
