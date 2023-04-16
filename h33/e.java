package h33.e;
import erd.g;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import com.yxcorp.gifshow.bean.ContactInfo;

public final class e implements g	// class@002c20
{
    public final y b;
    public final SlipSwitchButton c;

    public void e(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.g(p0, this.c);
    }
}
