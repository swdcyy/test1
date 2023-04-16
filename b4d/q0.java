package b4d.q0;
import n3d.a;
import b4d.v0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.widget.EditText;
import android.app.Activity;
import android.view.View;
import com.yxcorp.utility.n;

public final class q0 implements a	// class@00038a
{
    public final v0 b;

    public void q0(v0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 1 && (p1 == -1 && (tb.getContext() == null || (!tb.v.isDetached() && (tb.D != null && (tb.v.getDialog() != null && tb.v.getDialog().getWindow() != null)))))) {
          tb.D.requestFocus();
          n.a0(tb.getActivity(), tb.D, 250);
          tb.D.setSelected(1);
       }
    label_0047 :
       return;
    }
}
