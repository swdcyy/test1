package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$m;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xl8.b;

public final class FollowPymiListDampingPresenter$m implements Observer	// class@001197
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$m(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter$m.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.J = true;
          }
          this.b.N.d(p0);
       }
       return;
    }
}
