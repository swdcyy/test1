package com.yxcorp.gifshow.profile.presenter.profile.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.profile.presenter.profile.y;
import erd.r;
import j4c.c0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import im8.f;

public class z extends PresenterV2	// class@001593
{
    public RecyclerFragment p;
    public RecyclerView q;
    public f r;

    public void z(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       this.q = this.p.h0();
       this.X7(this.p.Vg().j().filter(y.b).subscribe(new c0(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.r = this.x8("PROFILE_HEADER_TOP");
       return;
    }
}
