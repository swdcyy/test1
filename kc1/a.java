package kc1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;

public final class a implements View$OnClickListener	// class@002cf3
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       tb.c.b(tb.b, p0);
    }
}
