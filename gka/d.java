package gka.d;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;

public final class d implements DialogInterface$OnKeyListener	// class@002b09
{
    public final DialogContainerFragment b;

    public void d(DialogContainerFragment p0){
       this.b = p0;
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       DialogContainerFragment b = this.b.B;
       if (b instanceof DialogInterface$OnKeyListener) {
          b.onKey(p0, p1, p2);
       }
       return false;
    }
}
