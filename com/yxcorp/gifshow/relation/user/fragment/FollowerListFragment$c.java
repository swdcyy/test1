package com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment$c;
import s2b.a;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hcc.j0;
import hcc.h;
import com.yxcorp.gifshow.relation.user.fragment.a;
import java.util.Collection;
import ok.o;
import com.google.common.collect.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hcc.y;
import com.kwai.framework.model.user.User;

public class FollowerListFragment$c implements a	// class@0019fc
{
    public final FollowerListFragment a;

    public void FollowerListFragment$c(FollowerListFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowerListFragment$c.class, "1")) {
          return;
       }
       j0.h(p0, false);
       h.b(this.a.Ph(), p0);
       y.a(e.c(p0, a.b), this.a);
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
