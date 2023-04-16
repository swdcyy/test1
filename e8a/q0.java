package e8a.q0;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;

public final class q0 implements DialogInterface$OnDismissListener	// class@0020d0
{
    public final j b;
    public final GifshowActivity c;

    public void q0(j p0,BaseEditorFragment p1,GifshowActivity p2){
       super();
       this.b = p0;
       this.c = p2;
    }
    public final void onDismiss(DialogInterface p0){
       q0 tb = this.b;
       tb.e.onNext(Boolean.FALSE);
       tb.f.onNext(new ChangeScreenVisibleEvent(tb.c, ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.SHOW_COMMENT));
       KwaiDialogFragment.o.remove(this.c.getSupportFragmentManager());
    }
}
