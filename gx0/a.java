package gx0.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.blessingbag.LiveAudienceBlessingBagNoticeView;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Boolean;
import d61.l0;

public final class a implements View$OnClickListener	// class@002596
{
    public final LiveAudienceBlessingBagNoticeView b;

    public void a(LiveAudienceBlessingBagNoticeView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       if (tb.getHasChecked()) {
          tb.setHasChecked(false);
          e.K.i(Boolean.FALSE);
       }else {
          tb.setHasChecked(true);
          e.K.i(Boolean.TRUE);
       }
       return;
    }
}
