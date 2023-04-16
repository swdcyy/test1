package com.kuaishou.android.model.feed.o$a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.AggregateV6Model;
import java.lang.Object;

public class o$a extends Accessor	// class@000b96
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$a(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public AggregateV6Model c(){
       return this.c.mAggregateV6Model;
    }
    public void d(AggregateV6Model p0){
       this.c.mAggregateV6Model = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
