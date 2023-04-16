package blc.a;
import erd.g;
import blc.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import bf5.e;
import android.view.Window;
import android.app.Activity;
import lnc.i5;

public final class a implements g	// class@000493
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME && d.a(0xded02ea).ho()) {
          i5.j(tb.c.getWindow(), 0xff000000);
       }
       return;
    }
}
