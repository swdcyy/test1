package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mScrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mScrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;

public final class FollowPymiListDampingPresenter$mScrollListener$2$a extends RecyclerView$r	// class@00119c
{
    public final FollowPymiListDampingPresenter$mScrollListener$2 a;

    public void FollowPymiListDampingPresenter$mScrollListener$2$a(FollowPymiListDampingPresenter$mScrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       FollowPymiListDampingPresenter$mScrollListener$2$a omScrollList = FollowPymiListDampingPresenter$mScrollListener$2$a.class;
       if (PatchProxy.isSupport(omScrollList) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, omScrollList, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "onScrollStateChanged scroll state idle");
       this.a.this$0.o9();
       return;
    }
}
