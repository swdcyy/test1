package com.kuaishou.live.common.core.component.comments.item.c;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.item.e;
import com.kuaishou.live.common.core.component.comments.item.e$b;

public class c extends ClickableSpan	// class@00109b
{
    public final LiveAnnounceMessage b;
    public final e$a c;

    public void c(e$a p0,LiveAnnounceMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       this.c.n.b.c(tb.mActionType, tb);
       return;
    }
}
