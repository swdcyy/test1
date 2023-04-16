package a31.a;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeGuideDialog;
import java.lang.Object;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;

public final class a implements Runnable	// class@000037
{
    public final LiveAudienceShakeGuideDialog b;

    public void a(LiveAudienceShakeGuideDialog p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       x.E(tb);
    }
}
