package e8a.o0;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaRecoReasonPymkDialogResponse;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaPymkDialogFragment;
import java.util.Collection;
import ekd.q;
import java.util.List;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class o0 implements g	// class@0020c5
{
    public final ProgressFragment b;
    public final String c;
    public final GifshowActivity d;

    public void o0(ProgressFragment p0,String p1,GifshowActivity p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       o0 tc = this.c;
       o0 td = this.d;
       this.b.dismiss();
       if (p0 != null && !q.f(p0.mUserList)) {
          new NasaPymkDialogFragment(p0.mTitle, p0.mUserList, tc).Cb(td.getSupportFragmentManager(), "THANOS_PYMK_DIALOG_FRAGMENT_TAG");
       }
       return;
    }
}
