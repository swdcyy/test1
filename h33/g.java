package h33.g;
import erd.g;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import com.yxcorp.gifshow.bean.ContactInfo;
import java.util.Objects;

public final class g implements g	// class@002c22
{
    public final y b;
    public final SlipSwitchButton c;

    public void g(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.hasContactItem()) {
          tb.g(p0, tc);
       }else {
          tb.f(tc);
       }
       return;
    }
}
