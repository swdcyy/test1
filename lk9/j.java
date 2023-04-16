package lk9.j;
import u07.u;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.emotionsdk.customize.CustomizeEmotionActivity;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class j implements u	// class@002dfe
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       j tb = this.b;
       Objects.requireNonNull(tb);
       CustomizeEmotionActivity.F2();
       tb.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
    }
}
