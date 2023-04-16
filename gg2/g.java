package gg2.g;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.question.f;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import bg2.b$a;
import bg2.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;

public final class g implements Runnable	// class@002b18
{
    public final f b;

    public void g(f p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       RxBus.f.b(new b$a(tb.P8()));
       f v = tb.v;
       Objects.requireNonNull(v);
       if (PatchProxy.applyVoid(null, v, b.class, "1")) {
       }else {
          v.a.showNext();
       }
       return;
    }
}
