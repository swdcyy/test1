package com.yxcorp.gifshow.relation.friend.manage.delegate.a$c;
import erd.g;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.c;
import tac.d;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import tac.b;
import rac.a;

public final class a$c implements g	// class@0018bc
{
    public final a b;
    public final BaseFeed c;
    public final boolean d;
    public final boolean e;
    public final User f;

    public void a$c(a p0,BaseFeed p1,boolean p2,boolean p3,User p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       a a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          p0 = this.b;
          a$c tc = this.c;
          Objects.requireNonNull(p0);
          boolean b = true;
          if (!PatchProxy.applyVoidOneRefs(tc, p0, a.class, "8") && tc != null) {
             p0 = r1.w0(tc);
             if (p0 != null) {
                p0 = p0.mFeedFriendInfo;
                if (p0 != null) {
                   p0 = p0.mHasRemovedUser;
                   if (p0 != null) {
                      p0.set(b);
                   }
                }
             }
          }
          p0 = this.c;
          tc = this.d;
          a = this.b.a;
          String str = (a != null && a.F() == b)? "removed": null;
          c.d(p0, tc, str);
          p0 = this.b.a;
          if (p0 != null) {
             tc = this.e;
             a$c tf = this.f;
             if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(tc), tf, null, d.class, "1")) {
                if (tc != null) {
                   if (p0.F()) {
                      i = (tf.isFemale())? 0x7f1031a5: 0x7f1031a7;
                      i.f(R.style.arg_RES_7f11066a, a1.p(i), b);
                   }else if(tf.isFemale()){
                      i = 0x7f1010ec;
                   }else {
                      i = 0x7f1010f1;
                   }
                   i.f(R.style.arg_RES_7f11066a, a1.p(i), b);
                }
                if (p0.F()) {
                   tf.mHasRemoved = b;
                   tf.notifyChanged();
                   p0.g(tf);
                }
                p0.H(new a(5, tf));
             }
          }
       }
       return;
    }
}
