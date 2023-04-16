package com.kuaishou.merchant.live.marketing.sandeago.start.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.marketing.sandeago.start.p;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import java.lang.Object;
import java.lang.Long;

public class j extends Accessor	// class@001a67
{
    public final LiveAnchorStartSandeagoFragment$b c;
    public final p d;

    public void j(p p0,LiveAnchorStartSandeagoFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Long.valueOf(this.c.o);
    }
    public void set(Object p0){
       this.c.o = p0.longValue();
    }
}
