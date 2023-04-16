package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$a;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.a1;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;

public final class ProfileFollowElement$a implements b1	// class@001432
{
    public final ProfileFollowElement a;

    public void ProfileFollowElement$a(ProfileFollowElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowElement$a.class, "2")) {
          return;
       }
       a1.a(this);
       this.a.C = true;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowElement$a.class, "3")) {
          return;
       }
       a1.g(this);
       this.a.C = false;
       return;
    }
    public void c(boolean p0){
       a1.b(this, p0);
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       a1.f(this, p0);
    }
    public void f(boolean p0){
       a1.d(this, p0);
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowElement$a.class, "1")) {
          return;
       }
       a1.c(this);
       ProfileFollowElement.n0(this.a).b();
       return;
    }
}
