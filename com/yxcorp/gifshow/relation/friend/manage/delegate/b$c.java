package com.yxcorp.gifshow.relation.friend.manage.delegate.b$c;
import erd.g;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tac.c;
import tac.e;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import tac.b;
import rac.a;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;

public final class b$c implements g	// class@0018c6
{
    public final b b;
    public final BaseFeed c;
    public final boolean d;
    public final boolean e;
    public final User f;

    public void b$c(b p0,BaseFeed p1,boolean p2,boolean p3,User p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          c.d(this.c, this.d, "reverse_removed");
          p0 = this.b.a;
          if (p0 != null) {
             b$c te = this.e;
             b$c tf = this.f;
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(te), tf, null, e.class, "1")) {
                boolean b = true;
                if (te != null) {
                   int i = 0x7f11066a;
                   int i1 = (tf.isFemale())? 0x7f1031ac: 0x7f1031ae;
                   i.f(i, a1.p(i1), b);
                }
                tf.mHasReverseRemoved = b;
                tf.notifyChanged();
                p0.w(tf);
                p0.H(new a(7, tf));
             }
          }
       }
       return;
    }
}
