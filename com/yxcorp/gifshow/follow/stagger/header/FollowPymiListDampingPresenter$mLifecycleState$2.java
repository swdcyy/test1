package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mLifecycleState$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;

public final class FollowPymiListDampingPresenter$mLifecycleState$2 extends Lambda implements a	// class@001199
{
    public final FollowPymiListDampingPresenter this$0;

    public void FollowPymiListDampingPresenter$mLifecycleState$2(FollowPymiListDampingPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final FragmentCompositeLifecycleState invoke(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter$mLifecycleState$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FragmentCompositeLifecycleState(this.this$0.d9());
    }
    public Object invoke(){
       return this.invoke();
    }
}
