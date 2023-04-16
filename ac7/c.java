package ac7.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import brd.v;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import brd.g;

public final class c implements PopupInterface$d	// class@0000a2
{
    public final v a;

    public void c(v p0){
       this.a = p0;
    }
    public final void a(c p0,int p1){
       p0 = this.a;
       p0.onNext(Integer.valueOf(1));
       p0.onComplete();
    }
}
