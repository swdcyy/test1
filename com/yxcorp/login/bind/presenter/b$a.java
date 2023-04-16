package com.yxcorp.login.bind.presenter.b$a;
import du5.c;
import com.yxcorp.login.bind.presenter.b;
import java.lang.Object;
import java.util.HashMap;
import du5.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.login.bind.presenter.a;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import sc4.a;
import erd.a;
import e1d.a;
import com.yxcorp.login.bind.presenter.c;
import erd.g;
import java.lang.Integer;
import e17.i;

public class b$a implements c	// class@001a65
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void c(HashMap p0){
       b.b(this, p0);
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       b c = this.a.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, c, a.class, "5")) {
          b9.a(c.r);
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Jh(c.n8(R.string.arg_RES_7f103667));
          a s = c.s;
          if (s != null) {
             progressFrag.show(s.getChildFragmentManager(), "progress");
          }
          c.r = b.a(0x5cfaafff).S(p0, p1).map(new e()).doFinally(new a(progressFrag)).subscribe(new a(c), new c(c));
       }
       return;
    }
    public void onFailed(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0) {
          if (p0 == 427) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103404);
          }
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1004b4);
       }
       return;
    }
}
