package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$n;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import dha.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$n implements Observer	// class@0011a3
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$n(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter$n.class, "1")) {
       }else if(p0 != null){
          p0 = (p0.a != null && (p0.b == null && p0.c == null))? 1: null;
          if (p0) {
             p0 = this.b.d9().q();
             a.o(p0, "mPymiFragment.pageList");
             if (p0.isEmpty()) {
                this.b.n9();
             }
          }
       }
       return;
    }
}
