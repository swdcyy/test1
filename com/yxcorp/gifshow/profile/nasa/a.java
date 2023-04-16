package com.yxcorp.gifshow.profile.nasa.a;
import erd.g;
import com.yxcorp.gifshow.profile.nasa.ProfileNasaFragmentContainer;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import f4c.b;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class a implements g	// class@001406
{
    public final ProfileNasaFragmentContainer b;

    public void a(ProfileNasaFragmentContainer p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ProfileNasaFragmentContainer.class, "23")) {
       }else if(p0.a != null && tb.k != null){
          if (tb.K0()) {
             tb.eh();
          }else {
             tb.j = tb.n1().subscribe(new b(tb), Functions.d());
          }
       }
       return;
    }
}
