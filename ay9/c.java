package ay9.c;
import erd.g;
import ay9.q;
import java.lang.Object;
import com.kwai.slide.play.detail.information.caption.k$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import ay9.h;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$a;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import java.lang.String;
import java.lang.CharSequence;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import ay9.a;
import android.content.DialogInterface$OnDismissListener;

public final class c implements g	// class@0002ef
{
    public final q b;

    public void c(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (tb.v.equals(tb.A.getCurrentPhoto()) && tb.K == null) {
          tb.I.F(false, 23);
          CaptionDialogFragment uCaptionDial = new CaptionDialogFragment(new h(tb));
          tb.J = uCaptionDial;
          uCaptionDial.qh(false);
          Bundle uBundle = new Bundle();
          uBundle.putCharSequence("username", p0.a);
          uBundle.putCharSequence("caption", p0.b);
          tb.J.setArguments(uBundle);
          tb.J.Cb(tb.w.getChildFragmentManager(), "CaptionDialogFragment");
          tb.v0(true);
          tb.J.k0(new a(tb));
       }
       return;
    }
}
