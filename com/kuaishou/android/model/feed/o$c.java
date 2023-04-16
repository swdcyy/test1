package com.kuaishou.android.model.feed.o$c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import java.lang.Object;

public class o$c extends Accessor	// class@000b98
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$c(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public CoverMeta c(){
       return this.c.mCoverMeta;
    }
    public void d(CoverMeta p0){
       this.c.mCoverMeta = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
