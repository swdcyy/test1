package com.kuaishou.merchant.live.marketing.sandeago.k;
import erd.o;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.model.RecycleSandeagoOpenState;
import java.util.Objects;
import n64.v;
import io.reactivex.g;
import brd.t;

public final class k implements o	// class@001a41
{
    public final o b;
    public final String c;
    public final UserInfo d;

    public void k(o p0,String p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new v(tb, p0, this.c, this.d));
    }
}
