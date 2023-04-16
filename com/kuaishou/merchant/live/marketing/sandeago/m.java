package com.kuaishou.merchant.live.marketing.sandeago.m;
import erd.o;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRelationModel;
import java.util.Objects;
import n64.w;
import io.reactivex.g;
import brd.t;

public final class m implements o	// class@001a43
{
    public final o b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public void m(o p0,String p1,String p2,String p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       w ow = new w(tb, p0, this.c, this.d, this.e, this.f);
       return t.create(p0);
    }
}
