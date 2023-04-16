package com.yxcorp.gifshow.follow.stagger.recommend.RecommendCardViewHolder$handleRecommendClick$runnable$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import nja.a;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import aja.k;

public final class RecommendCardViewHolder$handleRecommendClick$runnable$1 extends Lambda implements a	// class@001228
{
    public final HomeFollowFragment $fragment;
    public final int $index;
    public final User $user;
    public final a this$0;

    public void RecommendCardViewHolder$handleRecommendClick$runnable$1(a p0,HomeFollowFragment p1,User p2,int p3){
       this.this$0 = p0;
       this.$fragment = p1;
       this.$user = p2;
       this.$index = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, RecommendCardViewHolder$handleRecommendClick$runnable$1.class, "1")) {
          return;
       }
       this.this$0.a();
       k.e(this.$fragment, 1, this.$user.mId, this.$index);
       return;
    }
}
