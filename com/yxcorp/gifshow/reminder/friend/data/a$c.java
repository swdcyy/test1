package com.yxcorp.gifshow.reminder.friend.data.a$c;
import ok.x;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.n0;

public final class a$c implements x	// class@001a84
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, a$c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(this.b.K());
       }
       return uBoolean;
    }
}
