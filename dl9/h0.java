package dl9.h0;
import u07.u;
import dl9.m0;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.emotionsdk.customize.CustomizeEmotionActivity;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class h0 implements u	// class@001f66
{
    public final m0 b;

    public void h0(m0 p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       CustomizeEmotionActivity.F2();
       tb.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
    }
}
