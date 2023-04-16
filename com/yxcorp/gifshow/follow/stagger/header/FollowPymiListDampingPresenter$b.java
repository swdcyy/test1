package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle$State;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import o0b.a;
import nl8.a;
import java.lang.Long;
import java.lang.Boolean;
import xha.a;

public final class FollowPymiListDampingPresenter$b implements Runnable	// class@00118c
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$b(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowPymiListDampingPresenter$b.class, "1")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "bindUserBanner recyclerView post");
       Lifecycle lifecycle = this.b.d9().getLifecycle();
       a.o(lifecycle, "mPymiFragment.lifecycle");
       if (!lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          return;
       }
       this.b.o9();
       FollowPymiListDampingPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, FollowPymiListDampingPresenter.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = tb.V8().b(Long.valueOf(tb.X8()), "FOLLOW_PULL_DOWN", Boolean.TYPE, Boolean.FALSE);
          a.o(obj, "ksDataCenter.getValue\(pa¡­:class.java,\n      false\)");
       }
       if (obj.booleanValue()) {
          this.b.V8().d(Long.valueOf(this.b.X8()), "FOLLOW_PULL_DOWN", Boolean.FALSE);
          a.f("PULL_TO_REFRESH");
       }else {
          a.f("OTHER");
       }
       return;
    }
}
