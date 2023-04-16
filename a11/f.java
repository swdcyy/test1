package a11.f;
import androidx.lifecycle.Observer;
import a11.l;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import java.lang.CharSequence;
import nf1.c;
import lnc.a1;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import a11.m;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;

public final class f implements Observer	// class@00001f
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "2")) {
       }else if(p0 != null){
          tb.a.b();
          tb.a.setContentText(p0.mVipGradeContentText);
          tb.a.setLevelIcon(c.b.B1(p0.a, a1.d(R.dimen.arg_RES_7f0702a4)));
          tb.a.setScoreProgressMax((int)p0.mVipGradeTotalScores);
          tb.a.setPredictedScoreProgressMax((int)p0.mVipGradeTotalScores);
          tb.c.h.setValue(Integer.valueOf((int)p0.mVipGradeScores));
       }else {
          tb.a.a(2, a1.p(R.string.arg_RES_7f102d6d));
       }
       return;
    }
}
