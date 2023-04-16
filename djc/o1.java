package djc.o1;
import djc.w;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import djc.o1$a;
import android.view.View$OnClickListener;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;

public final class o1 implements w	// class@002214
{
    public final String b;
    public final String c;
    public final String d;
    public final KwaiDialogFragment e;

    public void o1(String p0,String p1,String p2,KwaiDialogFragment p3){
       a.p(p0, "bannerText");
       a.p(p1, "buttonText");
       a.p(p2, "scheme");
       a.p(p3, "fragment");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final KwaiDialogFragment a(){
       return this.e;
    }
    public View da(){
       Object obj = PatchProxy.apply(null, this, o1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void doBindView(View p0){
       o1 oo1 = o1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo1, "1")) {
          return;
       }
       if (p0 != null) {
          TextView textView = p0.findViewById(R.id.share_title);
          TextView textView1 = p0.findViewById(R.id.share_btn);
          if (textView != null) {
             textView.setText(this.b);
          }
          if (textView1 != null) {
             textView1.setText(this.c);
          }
          p0.setOnClickListener(new o1$a(this, p0));
       }
       if (!PatchProxy.applyVoid(null, this, oo1, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHARE_EARN_GOLD_BANNER";
          u1.u0(5, uElementPack, null);
       }
       return;
    }
    public boolean p9(){
       Object obj = PatchProxy.apply(null, this, o1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int y0(){
       return 0x7f0d14fc;
    }
}
