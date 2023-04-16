package jf1.q;
import android.view.View$OnClickListener;
import jf1.s;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.comments.b$a;

public final class q implements View$OnClickListener	// class@002b7b
{
    public final s b;
    public final GiftMessage c;

    public void q(s p0,GiftMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.a.a(this.c);
    }
}
