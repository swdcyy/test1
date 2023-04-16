package b4d.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.m;
import java.lang.Runnable;
import android.widget.EditText;
import android.view.View;
import com.yxcorp.gifshow.widget.EmojiEditText;

public class n extends PresenterV2	// class@000382
{
    public EmojiEditText p;

    public void n(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       n tp = this.p;
       if (tp != null) {
          tp.post(new m(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a0ca8);
       return;
    }
}
