package a11.e;
import androidx.lifecycle.Observer;
import a11.l;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;

public final class e implements Observer	// class@00001e
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          tb.a.a(1, a1.p(R.string.arg_RES_7f102d72));
       }
       return;
    }
}
