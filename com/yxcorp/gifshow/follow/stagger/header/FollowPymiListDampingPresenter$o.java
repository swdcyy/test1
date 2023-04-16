package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$o;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o0b.a;
import nl8.a;
import java.lang.Long;
import com.kwai.framework.model.feed.BaseFeed;
import crd.b;
import com.yxcorp.gifshow.follow.stagger.header.c;
import androidx.lifecycle.Observer;

public final class FollowPymiListDampingPresenter$o implements g	// class@0011a4
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$o(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter$o.class, "1")) {
       }else if(this.b.V8().a(Long.valueOf(this.b.m9()), "FOLLOW_BAR_FEED", BaseFeed.class) != null){
          p0 = this.b.E;
          if (p0 != null) {
             p0.dispose();
          }
          this.b.V8().c(Long.valueOf(this.b.m9()), "FOLLOW_BAR_FEED", BaseFeed.class, new c(this));
       }
       return;
    }
}
