package b8a.m1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import im8.f;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.String;

public final class m1 implements View$OnClickListener	// class@0003c8
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void m1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m1 tb = this.b;
       Objects.requireNonNull(tb);
       tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.USER_DISABLE;
       tb.c9().set(Boolean.TRUE);
       tb.G9();
       tb.r.setEnabled(false);
       Boolean fALSE = Boolean.FALSE;
       tb.F.onNext(fALSE);
       tb.q9(tb.s.getText().toString());
       SlidePlayAutoPlayNextPresenter j = tb.J;
       if (j != null) {
          j.set(fALSE);
       }
       return;
    }
}
