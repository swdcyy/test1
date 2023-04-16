package h2a.n;
import android.view.View$OnClickListener;
import h2a.m$a$b;
import java.lang.Object;
import android.view.View;
import f2a.b;
import android.widget.TextView;
import d2a.b;
import io.reactivex.subjects.PublishSubject;

public final class n implements View$OnClickListener	// class@002551
{
    public final m$a$b b;

    public void n(m$a$b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       m$a$b p = tb.p;
       int i = p.a ^ 0x01;
       p.a = i;
       tb.r.setSelected(i);
       m$a$b p1 = tb.p;
       tb.q.onNext(new b(p1, p1.a));
    }
}
