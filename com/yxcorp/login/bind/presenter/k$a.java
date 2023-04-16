package com.yxcorp.login.bind.presenter.k$a;
import java.lang.Runnable;
import com.yxcorp.login.bind.presenter.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import e1d.i;
import e1d.j;
import erd.g;
import crd.b;

public class k$a implements Runnable	// class@001a7f
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       if (!this.b.getActivity().isFinishing()) {
          k$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, k.class, "2")) {
             b.a(0x5cfaafff).F().map(new e()).subscribe(new i(tb), new j(tb));
          }
       }
       return;
    }
}
