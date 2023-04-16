package com.kwai.component.list.exposed.behavior.f;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.kwai.component.list.exposed.behavior.e;
import erd.r;
import fc5.a;
import erd.g;
import crd.b;

public final class f extends ItemExposedBehavior	// class@0009af
{

    public void f(BaseFragment p0,boolean p1,boolean p2){
       super();
       if (p0.Vg().a() && p1) {
          this.e(false);
       }
       p0.Vg().g().filter(e.b).subscribe(new a(this, p1, p2));
       return;
    }
}
