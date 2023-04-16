package hf1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.comments.item.e;
import com.kuaishou.live.common.core.component.comments.item.e$b;

public final class a implements View$OnClickListener	// class@002680
{
    public final e$a b;
    public final LiveAnnounceMessage c;

    public void a(e$a p0,LiveAnnounceMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.n.b.a(this.c);
    }
}
