package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$e;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import kotlin.jvm.internal.a;
import wkd.b;
import hn5.f0;

public final class UserNameElement$e implements b1	// class@001464
{
    public final UserNameElement a;

    public void UserNameElement$e(UserNameElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
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
       int i;
       if (PatchProxy.applyVoid(null, this, UserNameElement$e.class, "1")) {
          return;
       }
       a1.e(this);
       if (UserNameElement.n0(this.a).isMine()) {
          if (UserNameElement.n0(this.a).getPhotoMeta() == null) {
             i = 0;
          }else {
             PhotoMeta photoMeta = UserNameElement.n0(this.a).getPhotoMeta();
             a.m(photoMeta);
             photoMeta = photoMeta.mViewCount;
          }
          b.a(0x238e5b38).c(UserNameElement.n0(this.a).getPhotoId(), i);
       }
       return;
    }
    public void h(){
       a1.c(this);
    }
}
