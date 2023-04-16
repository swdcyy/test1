package djc.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.Object;
import androidx.fragment.app.KwaiDialogFragment;
import qrd.l1;

public final class r implements a	// class@00221d
{
    public final DownloadForwardDialog b;

    public void r(DownloadForwardDialog p0){
       this.b = p0;
    }
    public final Object invoke(){
       this.b.dismissAllowingStateLoss();
       return l1.a;
    }
}
