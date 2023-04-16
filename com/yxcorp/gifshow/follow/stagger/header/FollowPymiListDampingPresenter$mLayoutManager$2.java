package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mLayoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class FollowPymiListDampingPresenter$mLayoutManager$2 extends Lambda implements a	// class@001198
{
    public final FollowPymiListDampingPresenter this$0;

    public void FollowPymiListDampingPresenter$mLayoutManager$2(FollowPymiListDampingPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final PymiLayoutManager invoke(){
       PymiLayoutManager obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter$mLayoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PymiLayoutManager(this.this$0.getContext(), 0, 0);
       obj.W0(180.00f);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
