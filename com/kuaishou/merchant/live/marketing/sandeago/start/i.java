package com.kuaishou.merchant.live.marketing.sandeago.start.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.marketing.sandeago.start.p;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class i extends Accessor	// class@001a66
{
    public final LiveAnchorStartSandeagoFragment$b c;
    public final p d;

    public void i(p p0,LiveAnchorStartSandeagoFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
