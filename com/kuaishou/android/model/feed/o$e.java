package com.kuaishou.android.model.feed.o$e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.ContentAggregateWeakMeta;
import java.lang.Object;

public class o$e extends Accessor	// class@000b9a
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$e(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public ContentAggregateWeakMeta c(){
       return this.c.mRankInfo;
    }
    public void d(ContentAggregateWeakMeta p0){
       this.c.mRankInfo = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
