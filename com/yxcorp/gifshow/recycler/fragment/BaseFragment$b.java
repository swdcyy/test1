package com.yxcorp.gifshow.recycler.fragment.BaseFragment$b;
import erd.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BaseFragment$b implements g	// class@001796
{
    public final BaseFragment b;

    public void BaseFragment$b(BaseFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment$b.class, "1")) {
       }else {
          a.o(p0, "selected");
          if (p0.booleanValue()) {
             this.b.u();
          }else {
             this.b.c0();
          }
       }
       return;
    }
}
