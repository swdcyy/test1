package n01.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$b;

public final class c implements View$OnClickListener	// class@003260
{
    public final a b;
    public final int c;
    public final boolean d;

    public void c(a p0,int p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       c tb = this.b;
       c tc = this.c;
       tb.d(tc);
       tb.b.b(tc, this.d);
    }
}
