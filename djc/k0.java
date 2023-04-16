package djc.k0;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Objects;

public final class k0 implements DialogInterface$OnKeyListener	// class@002201
{
    public final ForwardGridSectionWithImPanelFragment b;

    public void k0(ForwardGridSectionWithImPanelFragment p0){
       this.b = p0;
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       boolean b;
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 4) {
          b = true;
          if (p2.getAction() == b) {
             tb.ii();
          label_0016 :
             return b;
          }
       }
       b = false;
       goto label_0016 ;
    }
}
