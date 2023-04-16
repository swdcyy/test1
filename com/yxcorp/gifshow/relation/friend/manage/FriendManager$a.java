package com.yxcorp.gifshow.relation.friend.manage.FriendManager$a;
import ok.o;
import java.util.List;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FriendManager$a implements o	// class@0018b0
{
    public final List b;

    public void FriendManager$a(List p0){
       this.b = p0;
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.m(p0);
          b = this.b.contains(p0);
       }
       return b;
    }
}
