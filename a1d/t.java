package a1d.t;
import java.lang.Runnable;
import a1d.r$b;
import java.lang.Object;
import a1d.r;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class t implements Runnable	// class@000056
{
    public final r$b b;

    public void t(r$b p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       r$b b = tb.b;
       float f = (float)0x7f0702ef;
       int i = n.c(tb.b.getContext(), f);
       b.y.A(w0.c(b.A), i, n.c(tb.b.getContext(), f));
       tb.b.S8();
    }
}
