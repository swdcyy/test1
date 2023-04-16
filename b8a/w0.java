package b8a.w0;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.m;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.widget.TextView;

public final class w0 implements Runnable	// class@000410
{
    public final m b;
    public final View c;

    public void w0(m p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       w0 tb = this.b;
       w0 tc = this.c;
       Objects.requireNonNull(tb);
       ViewStub viewStub = m1.f(tc, R.id.speed_controller_view_stub);
       View view = (viewStub != null)? viewStub.inflate(): m1.f(tc, R.id.speed_anim_container);
       tb.q = m1.f(view, 0x7f0a046b);
       tb.r = m1.f(view, 0x7f0a3abf);
       tb.t = m1.f(view, 0x7f0a3ac3);
       tb.r.D(R.string.arg_RES_7f100eeb);
       return;
    }
}
