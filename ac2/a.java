package ac2.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import java.lang.Object;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.show.luckystar.util.b;

public final class a implements Runnable	// class@0000ab
{
    public final LiveLuckyStarCurrentInfoFragment b;

    public void a(LiveLuckyStarCurrentInfoFragment p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b.c(tb);
    }
}
