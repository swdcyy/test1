package com.kuaishou.android.model.feed.o$f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import java.lang.Object;

public class o$f extends Accessor	// class@000b9b
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$f(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public ContentAggregateWeakFeed$AggregateContentInfo c(){
       return this.c.mRightBottomInfo;
    }
    public void d(ContentAggregateWeakFeed$AggregateContentInfo p0){
       this.c.mRightBottomInfo = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
