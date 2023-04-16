package n11.c;
import java.lang.Runnable;
import n11.e;
import java.lang.Object;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import qc2.u;
import lnc.a1;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import android.graphics.PointF;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import qc2.a;

public final class c implements Runnable	// class@003274
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.Q.setVisibility(0);
       RelativeLayout$LayoutParams layoutParams = tb.Q.getLayoutParams();
       layoutParams.height = tb.P.getHeight();
       layoutParams.topMargin = (int)tb.P.getY();
       tb.Q.setLayoutParams(layoutParams);
       if (PatchProxy.applyVoid(null, tb, e.class, "6")) {
       }else if(tb.K.j1 == null){
          int i = (u.a())? a1.d(R.dimen.arg_RES_7f07087a): a1.d(R.dimen.arg_RES_7f070879);
          tb.K.j1.e(LyricsMode.LEFT, ConstraintType.RIGHT_TOP, new PointF((float)(n.k(tb.getActivity()) - a1.d(R.dimen.arg_RES_7f070878)), ((tb.P.getY() + (float)tb.P.getHeight()) + (float)i)), true);
       }
       return;
    }
}
