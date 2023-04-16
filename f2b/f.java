package f2b.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import nf6.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public final class f implements Runnable	// class@002874
{
    public final HomeLocalSizerViewPresenter b;
    public final String c;

    public void f(HomeLocalSizerViewPresenter p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Intent intent = b.a(0x66dce92a).a(tb.getActivity(), w0.f(this.c));
       if (intent != null && tb.getActivity() != null) {
          tb.getActivity().startActivity(intent);
       }
       return;
    }
}
