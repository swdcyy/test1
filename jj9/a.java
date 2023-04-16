package jj9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jj9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.component.feedstaggercard.model.CardStyle;
import lnc.a1;
import ekd.m1;

public class a extends PresenterV2	// class@002aed
{
    public View p;
    public CardStyle q;

    public void a(){
       super();
       this.U7(new b());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
       int i = (this.q.isCornerCard != null)? 0: a1.d(R.dimen.arg_RES_7f07031b);
       layoutParams.height = i;
       this.p.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0e1a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("HOT_CHANNEL_CARD_STYLE");
       return;
    }
}
