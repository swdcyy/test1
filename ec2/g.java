package ec2.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.openresult.LiveLuckyStarOpenResultFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.show.luckystar.util.b;

public final class g implements View$OnClickListener	// class@0026e4
{
    public final LiveLuckyStarOpenResultFragment b;

    public void g(LiveLuckyStarOpenResultFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       b.c(tb);
    }
}
