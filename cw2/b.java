package cw2.b;
import java.lang.Runnable;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView;
import android.widget.ImageView;
import bw2.b;

public final class b implements Runnable	// class@0023ec
{
    public final int b;
    public final LottieAnimationView c;
    public final int d;
    public final int e;

    public void b(int p0,LottieAnimationView p1,int p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       b tc = this.c;
       b td = this.d;
       int i = td - (tc.getWidth() / 2);
       int i1 = this.e - td;
       tc.setTranslationX((float)b.a((this.b - (tc.getWidth() / 2)), i, (i1 - (tc.getWidth() / 2))));
    }
}
