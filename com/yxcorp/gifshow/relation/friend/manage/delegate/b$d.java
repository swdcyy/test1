package com.yxcorp.gifshow.relation.friend.manage.delegate.b$d;
import erd.o;
import com.yxcorp.gifshow.relation.friend.manage.delegate.b;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import tac.e;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import tac.b;
import rac.a;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;

public final class b$d implements o	// class@0018c7
{
    public final b b;
    public final User c;

    public void b$d(b p0,User p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, b$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "res");
          boolean b = false;
          if (p0.b() == 1) {
             p0 = this.b.a;
             if (p0 != null) {
                b$d tc = this.c;
                if (!PatchProxy.applyVoidTwoRefs(p0, tc, null, e.class, "2")) {
                   int i = 0x7f11066a;
                   int i1 = (tc.isFemale())? 0x7f1031a0: 0x7f1031a1;
                   i.f(i, a1.p(i1), true);
                   tc.mHasReverseRemoved = b;
                   tc.notifyChanged();
                   p0.D(tc);
                   p0.H(new a(6, tc));
                }
             }
             b = true;
          }
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
