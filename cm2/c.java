package cm2.c;
import android.view.View$OnClickListener;
import cm2.b$c;
import java.lang.Object;
import android.view.View;
import cm2.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import cm2.b$a;

public final class c implements View$OnClickListener	// class@000559
{
    public final b$c b;

    public void c(b$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       c tb = this.b;
       b uob = b.class;
       b$c w = tb.w;
       if (w.D != null && (w.s1() && tb.w.y != null)) {
          tb.m8().setSelected(true);
          tb.s.setSelected(true);
          w = tb.w;
          b$c q = tb.q;
          Objects.requireNonNull(w);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(q), w, uob, "5")) {
             w.A = q;
             w.u1();
          }
          w = tb.w;
          LiveVoteContext mOptions = w.B.mVote.mOptions;
          Object obj = PatchProxy.apply(null, w, uob, "6");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(TextUtils.x(w.z)){
             i = w.A;
          }else {
             i = w.A - 1;
          }
          w = tb.w;
          w.D.a(w.B.mVote.mVoteId, mOptions.get(i).mOptionId);
          tb.P8();
       }
    label_0083 :
       return;
    }
}
