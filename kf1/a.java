package kf1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import java.lang.Object;
import android.view.View;
import kf1.f;

public final class a implements View$OnClickListener	// class@002d20
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a a = tb.a;
       if (a != null && !a.b()) {
          tb.a.a();
       }
       return;
    }
}
