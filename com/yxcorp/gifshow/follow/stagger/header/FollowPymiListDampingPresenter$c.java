package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$c;
import qvb.q;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$c implements q	// class@00118d
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$c(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(FollowPymiListDampingPresenter$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, FollowPymiListDampingPresenter$c.class, "1")) {
          return;
       }
       if (p0) {
          i oi = this.b.d9().q();
          a.o(oi, "mPymiFragment.pageList");
          if (oi.isEmpty()) {
             this.b.n9();
          }
       }
       return;
    }
}
