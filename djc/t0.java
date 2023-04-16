package djc.t0;
import djc.w;
import androidx.fragment.app.Fragment;
import djc.s0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import djc.t0$a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import zf6.k;
import java.lang.Boolean;

public final class t0 implements w	// class@002221
{
    public final Fragment b;
    public final s0 c;

    public void t0(Fragment p0,s0 p1){
       a.p(p0, "fragment");
       a.p(p1, "data");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final s0 a(){
       return this.c;
    }
    public View da(){
       Object obj = PatchProxy.apply(null, this, t0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void doBindView(View p0){
       t0 ot0 = t0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot0, "1")) {
          return;
       }
       if (p0 != null) {
          if (!PatchProxy.applyVoid(null, this, ot0, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHARE_DATA_REWARD_BANNER";
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = uElementPack;
             u1.g0(showEvent);
          }
          p0.setOnClickListener(new t0$a(this, p0));
          TextView textView = p0.findViewById(R.id.share_title);
          View view = p0.findViewById(R.id.share_icon);
          a.o(view, "findViewById\(R.id.share_icon\)");
          if (textView != null) {
             textView.setText(this.c.b);
          }
          view.L(this.c.a);
          if (k.d()) {
             p0.setBackgroundResource(R.color.arg_RES_7f06018a);
          }else {
             p0.setBackgroundResource(R.color.arg_RES_7f06202e);
          }
       }
       return;
    }
    public boolean p9(){
       Object obj = PatchProxy.apply(null, this, t0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int y0(){
       return 0x7f0d0497;
    }
}
