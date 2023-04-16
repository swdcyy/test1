package com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$c;
import zbc.c;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zbc.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import hcc.j0;
import java.lang.Integer;

public class MissUUserProfileAndNoticeFragment$c implements c	// class@001a00
{
    public final MissUUserProfileAndNoticeFragment a;

    public void MissUUserProfileAndNoticeFragment$c(MissUUserProfileAndNoticeFragment p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUUserProfileAndNoticeFragment$c.class, "1")) {
          return;
       }
       this.h(p0);
       return;
    }
    public void c(User p0){
       b.b(this, p0);
    }
    public void d(User p0){
       b.a(this, p0);
    }
    public void f(User p0){
       b.c(this, p0);
    }
    public void g(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUUserProfileAndNoticeFragment$c.class, "2")) {
          return;
       }
       this.h(p0);
       return;
    }
    public final void h(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUUserProfileAndNoticeFragment$c.class, "3")) {
          return;
       }
       MissUUserProfileAndNoticeFragment$c ta = this.a;
       Objects.requireNonNull(ta);
       StringBuilder str = PatchProxy.applyOneRefs(p0, ta, MissUUserProfileAndNoticeFragment.class, "15");
       if (str != PatchProxyResult.class) {
       }else {
          str = "";
          if (p0.mMissURelation != null) {
             for (int i = 0; i < p0.mMissURelation.size(); i = i + 1) {
                if (i > 0) {
                   str = str+",";
                }
                str = str+p0.mMissURelation.get(i);
             }
          }
          str = str;
       }
       UserListParam mNoticeType = this.a.F.mNoticeType;
       if (!PatchProxy.isSupport(j0.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(810), str, Integer.valueOf(mNoticeType), null, j0.class, "1")) {
          j0.m(p0, 810, str, mNoticeType, 0);
       }
       return;
    }
}
