package com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$a;
import s3c.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import java.lang.Object;
import s3c.a;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import java.lang.Throwable;

public class n$a implements b	// class@00150c
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.c(this);
    }
    public void b(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "2")) {
          return;
       }
       n$a ta = this.a;
       int b = false;
       ta.N = b;
       if (ta.L != null) {
          ta.L = b;
          int i = 0x7f11066a;
          b = (p0.isPrivate())? 0x7f104efa: 0x7f104efe;
          i.a(i, b);
          n a = this.a.A;
          User$FollowStatus fOLLOW_REQUE = (p0.isPrivate())? User$FollowStatus.FOLLOW_REQUESTING: User$FollowStatus.FOLLOWING;
          f.m(a, fOLLOW_REQUE);
          this.a.B9();
       }
       return;
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       n$a ta = this.a;
       ta.N = true;
       if (ta.L != null) {
          ta.L = false;
          f.m(ta.A, User$FollowStatus.UNFOLLOW);
          this.a.B9();
       }
       return;
    }
}
