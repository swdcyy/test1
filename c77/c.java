package c77.c;
import c77.r;
import c77.d;
import java.lang.Object;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.String;
import android.net.Uri;
import android.content.Context;
import vq5.d;

public final class c implements r	// class@0004f8
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 && (ta.v != null && a1.i(ta.getActivity()))) {
          ta.r.r4(ta.v.toString(), ta.getActivity());
          ta.v = null;
       }
    label_0027 :
       return;
    }
}
