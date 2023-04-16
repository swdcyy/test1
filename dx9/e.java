package dx9.e;
import erd.g;
import com.yxcorp.gifshow.detail.comment.limitcomment.i$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import e17.i;
import com.yxcorp.gifshow.detail.comment.limitcomment.i;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class e implements g	// class@001feb
{
    public final i$a b;
    public final boolean c;

    public void e(i$a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       tb.a.r.setOnSwitchChangeListener(null);
       tb.a.r.setSwitch((this.c ^ 0x01));
       p0 = tb.a;
       p0.r.setOnSwitchChangeListener(p0.t);
    }
}
