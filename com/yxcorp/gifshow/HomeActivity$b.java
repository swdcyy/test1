package com.yxcorp.gifshow.HomeActivity$b;
import com.yxcorp.gifshow.w$b;
import com.yxcorp.gifshow.HomeActivity;
import java.lang.Object;
import android.app.Activity;
import uv8.o1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import wkd.b;
import com.yxcorp.gifshow.w;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import java.util.Objects;
import java.lang.Boolean;
import y96.c;
import y96.m;

public class HomeActivity$b implements w$b	// class@0012e7
{
    public final HomeActivity a;

    public void HomeActivity$b(HomeActivity p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0){
    }
    public void b(){
       o1.a(this);
    }
    public void c(int p0,String p1){
       boolean b;
       HomeActivity$b uob = HomeActivity$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       o0 l = n.L;
       if (l instanceof b) {
          int launchSource = b.a(-1343064608).getLaunchSource();
          b = b.b();
          boolean b1 = (b.c() != HuaweiSuperAppPrelaunchStage.USER_LAUNCH)? true: false;
          Objects.requireNonNull(l);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(launchSource), p1, Boolean.valueOf(b), Boolean.valueOf(b1), l, b.class, "14")) {
             c.b();
             l.u.mLaunchSource = launchSource;
             l.u.mLaunchPushId = p1;
             p1.mIsAppPrelaunch = b;
             p1.mIsAppPrelaunching = b1;
             l.k();
          }
       }
       return;
    }
    public void d(Activity p0){
       o1.c(this, p0);
    }
    public void e(Activity p0){
       o1.b(this, p0);
    }
}
