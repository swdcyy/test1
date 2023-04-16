package ak4.a$a;
import u07.t$a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseAuthData;

public class a$a extends t$a	// class@00008d
{
    public String B0;
    public PurchaseAuthData C0;

    public void a$a(FragmentActivity p0){
       super(p0);
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
       }else {
          this.L(new PopupInterface$g(R.layout.arg_RES_7f0d0301));
       }
       return;
    }
    public final a$a Y0(String p0){
       this.B0 = p0;
       return this;
    }
    public final a$a Z0(PurchaseAuthData p0){
       this.C0 = p0;
       return this;
    }
}
