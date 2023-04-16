package com.yxcorp.gifshow.relation.friend.manage.delegate.a$d;
import erd.o;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import tac.d;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import tac.b;
import rac.a;

public final class a$d implements o	// class@0018bd
{
    public final a b;
    public final User c;

    public void a$d(a p0,User p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "res");
          boolean b = false;
          if (p0.b() == 1) {
             p0 = this.b.a;
             if (p0 != null) {
                a$d tc = this.c;
                if (!PatchProxy.applyVoidTwoRefs(p0, tc, null, d.class, "2")) {
                   if (p0.F()) {
                      int i = 0x7f11066a;
                      int i1 = (tc.isFemale())? 0x7f10319e: 0x7f10319f;
                      i.f(i, a1.p(i1), true);
                      tc.mHasRemoved = b;
                      tc.notifyChanged();
                      p0.i(tc);
                   }
                   p0.H(new a(4, tc));
                }
             }
             b = true;
          }
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
