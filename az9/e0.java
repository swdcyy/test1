package az9.e0;
import erd.g;
import az9.i0;
import java.lang.Object;
import com.kwai.slide.play.detail.negative.feedback.content.FeedbackAnim;
import java.util.Objects;
import e1a.e;
import qp7.b;

public final class e0 implements g	// class@000322
{
    public final i0 b;

    public void e0(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FeedbackAnim.HIDE) {
          p0 = tb.y;
          Objects.requireNonNull(p0);
          p0.c(4, false);
          tb.b0();
       }
       return;
    }
}
