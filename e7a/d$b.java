package e7a.d$b;
import android.view.View$OnLongClickListener;
import e7a.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.text.ClipboardManager;
import java.lang.CharSequence;
import android.widget.TextView;
import e17.i;

public final class d$b implements View$OnLongClickListener	// class@002082
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       CharSequence text;
       p0 = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Activity activity = this.b.getActivity();
       a.m(activity);
       activity = activity.getSystemService("clipboard");
       Objects.requireNonNull(activity, "null cannot be cast to non-null type android.text.ClipboardManager");
       d u = this.b.u;
       text = (u != null)? u.getText(): null;
       activity.setText(text);
       i.a(R.style.arg_RES_7f110669, 0x7f100831);
       return false;
    }
}
