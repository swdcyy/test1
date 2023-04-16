package gg2.f;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.core.show.quiz.question.f;
import java.lang.Object;
import android.view.View;
import ya1.f0;
import java.util.Objects;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;

public final class f implements LiveViewFlipper$a	// class@002b17
{
    public final f b;

    public void f(f p0){
       this.b = p0;
    }
    public void a(View p0,int p1){
       f0.a(this, p0, p1);
    }
    public final void b(View p0,int p1){
       f tb = this.b;
       Objects.requireNonNull(tb);
       p0.setText(String.valueOf(tb.P8()));
    }
}
