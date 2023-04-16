package com.kuaishou.android.model.feed.o$d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.Object;

public class o$d extends Accessor	// class@000b99
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$d(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public ExtMeta c(){
       return this.c.mExtMeta;
    }
    public void d(ExtMeta p0){
       this.c.mExtMeta = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
