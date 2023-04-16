package com.kwai.component.upgrade.b;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import k2b.u1;
import com.kwai.component.upgrade.a;
import com.kwai.component.upgrade.f;
import ai5.g;
import zjd.a;
import java.lang.Runnable;
import ekd.k1;

public class b	// class@000bfd
{

    public void b(){
       super();
    }
    public static void a(FragmentActivity p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Ih(R.string.arg_RES_7f103667).setCancelable(true);
       progressFrag.show(p0.getSupportFragmentManager(), "runner");
       u1.Q("ks://upgrade_user_trigger", "");
       a uoa = new a(progressFrag, p0, p1);
       if (!PatchProxy.applyVoidOneRefs(uoa, null, f.class, "3")) {
          k1.o(new g(uoa));
       }
       return;
    }
}
