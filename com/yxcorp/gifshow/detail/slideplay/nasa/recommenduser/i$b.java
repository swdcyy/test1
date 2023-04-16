package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i$b;
import tca.a;
import java.util.List;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import java.lang.Throwable;
import e17.i;

public final class i$b implements a	// class@001770
{
    public final List a;
    public final WeakReference b;

    public void i$b(List p0,Runnable p1){
       super();
       this.a = p0;
       this.b = new WeakReference(p1);
    }
    public void a(int p0,Map p1){
       if (PatchProxy.isSupport2(i$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, i$b.class, "1")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             User user = iterator.next();
             Integer integer = p1.get(user.getId());
             if (integer == null || integer.intValue() != 1) {
                PatchProxy.onMethodExit(i$b.class, "1");
                return;
             }else {
                f.m(user, User$FollowStatus.FOLLOWING);
             }
          }else if(this.b.get() != null){
             this.b.get().run();
             break ;
          }
          break ;
       }
       PatchProxy.onMethodExit(i$b.class, "1");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b.class, "2")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       PatchProxy.onMethodExit(i$b.class, "2");
       return;
    }
}
