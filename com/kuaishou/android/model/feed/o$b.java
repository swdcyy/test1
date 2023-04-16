package com.kuaishou.android.model.feed.o$b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.feed.o;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;

public class o$b extends Accessor	// class@000b97
{
    public final ContentAggregateWeakFeed c;
    public final o d;

    public void o$b(o p0,ContentAggregateWeakFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public CommonMeta c(){
       return this.c.mCommonMeta;
    }
    public void d(CommonMeta p0){
       this.c.mCommonMeta = p0;
    }
    public Object get(){
       return this.c();
    }
    public void set(Object p0){
       this.d(p0);
    }
}
