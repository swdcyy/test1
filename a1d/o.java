package a1d.o;
import android.view.View$OnClickListener;
import a1d.r;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.ref.WeakReference;
import k2b.e0;
import w0d.e;
import wkd.b;
import m1d.a;
import m1d.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import okhttp3.MultipartBody$Part;
import ojd.e;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import a1d.p;
import a1d.s;
import erd.g;
import crd.b;

public final class o implements View$OnClickListener	// class@000045
{
    public final r b;

    public void o(r p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       Object obj;
       String str1;
       o tb = this.b;
       Objects.requireNonNull(tb);
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, or, "5")) {
       }else {
          String str = TextUtils.G(tb.x).toString();
          boolean switch = tb.w.getSwitch();
          if (!PatchProxy.applyVoid(objArray, tb, or, "8")) {
             if (tb.z == null) {
                tb.z = new ProgressFragment();
             }
             tb.z.setCancelable(false);
             tb.z.zh(false);
             or = tb.z;
             int i = 0x7f1002d7;
             try{
                or.Ih(i);
                tb.z.show(tb.getActivity().getSupportFragmentManager(), "runner");
             }catch(java.lang.Exception e0){
                tb.z = objArray;
             }
          }
       }
       return;
    }
}
