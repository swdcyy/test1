package gs2.f;
import java.lang.Runnable;
import ut2.c;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class f implements Runnable	// class@002b94
{
    public final c b;
    public final Music c;

    public void f(c p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f102e4c));
       if (tb != null) {
          tb.a(tc);
       }
       return;
    }
}
