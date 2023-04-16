package m01.b$a;
import m01.m;
import m01.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m01.n;
import android.view.View;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import m01.a;
import android.view.View$OnClickListener;
import mk1.w;
import com.kwai.robust.PatchProxyResult;
import mk1.b;
import qk1.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.RelativeLayout;

public class b$a implements m	// class@003099
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(GiftTab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.a.R8(p0).c().performClick();
       return;
    }
    public void b(GiftTab p0,boolean p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       n on = this.a.R8(p0);
       if (p1 == on.f) {
          return;
       }
       on.f = p1;
       uoa = this.a;
       View view = on.c();
       Objects.requireNonNull(uoa);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(view, Boolean.valueOf(p1), uoa, uob, "19")) {
          GiftTab normalGift = GiftTab.NormalGift;
          LiveGiftTitleView liveGiftTitl = uoa.R8(normalGift).c();
          if (p1) {
             view.setVisibility(0);
             uoa.E.setOnClickListener(a.b);
             b s = uoa.s;
             String str = PatchProxy.applyOneRefs(s, null, w.class, "19");
             if (str != PatchProxyResult.class) {
             }else if(s.b.f()){
                str = a1.p(R.string.arg_RES_7f102271);
             }else {
                str = a1.p(R.string.arg_RES_7f10464a);
             }
             liveGiftTitl.setText(str);
          }else {
             view.setVisibility(8);
             uoa.s.m(normalGift);
             liveGiftTitl.setSelected(true);
          }
       }
       return;
    }
}
