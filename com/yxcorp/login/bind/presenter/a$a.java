package com.yxcorp.login.bind.presenter.a$a;
import com.yxcorp.login.bind.presenter.a$b;
import com.yxcorp.login.bind.presenter.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import crd.b;
import lnc.b9;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import sc4.a;
import erd.a;
import e1d.b;
import sfc.a;
import erd.g;

public class a$a implements a$b	// class@001a61
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uoa1, "3")) {
          Activity activity = uoa.getActivity();
          if (activity != null) {
             ProgressFragment progressFrag = new ProgressFragment();
             progressFrag.Jh(uoa.n8(R.string.arg_RES_7f103667));
             progressFrag.show(uoa.s.getChildFragmentManager(), "progress");
             b9.a(uoa.q);
             uoa.q = b.a(0x5cfaafff).r(p0).map(new e()).doFinally(new a(progressFrag)).subscribe(new b(uoa, activity), new a());
          }
       }
       return;
    }
}
