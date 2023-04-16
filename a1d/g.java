package a1d.g;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.ref.WeakReference;
import k2b.e0;
import w0d.e;
import wkd.b;
import m1d.a;
import m1d.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import a1d.j;
import a1d.l;
import erd.g;
import crd.b;

public final class g implements View$OnClickListener	// class@000027
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       String str1;
       boolean switch;
       String str2;
       Object obj;
       String str3;
       g tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ok, "8")) {
       }else if(PatchProxy.applyVoid(objArray, tb, ok, "16")){
          if (tb.y == null) {
             tb.y = new ProgressFragment();
          }
          tb.y.setCancelable(false);
          tb.y.zh(false);
          ok = tb.y;
          int i = 0x7f1002d7;
          try{
             ok.Ih(i);
             tb.y.show(tb.getActivity().getSupportFragmentManager(), "runner");
          }catch(java.lang.Exception e0){
             tb.y = objArray;
          }
       }
       return;
    }
}
