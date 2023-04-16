package com.kuaishou.merchant.live.marketing.sandeago.start.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.marketing.sandeago.start.p;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class a extends Accessor	// class@001a5e
{
    public final LiveAnchorStartSandeagoFragment$b c;
    public final p d;

    public void a(p p0,LiveAnchorStartSandeagoFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
