package com.kuaishou.android.model.feed.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import mm8.a;
import com.kuaishou.android.model.mix.AggregateV6Model;
import com.kuaishou.android.model.feed.o$a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.feed.o$b;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.feed.o$c;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.feed.o$d;
import com.kuaishou.android.model.mix.ContentAggregateWeakMeta;
import com.kuaishou.android.model.feed.o$e;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import com.kuaishou.android.model.feed.o$f;
import com.kuaishou.android.model.feed.o$g;

public final class o implements b	// class@000b9d
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       this.c(p0, p1);
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public final void c(a p0,ContentAggregateWeakFeed p1){
       p0.h(AggregateV6Model.class, new o$a(this, p1));
       p0.h(CommonMeta.class, new o$b(this, p1));
       p0.h(CoverMeta.class, new o$c(this, p1));
       p0.h(ExtMeta.class, new o$d(this, p1));
       p0.h(ContentAggregateWeakMeta.class, new o$e(this, p1));
       ContentAggregateWeakFeed$AggregateContentInfo uAggregateCo = ContentAggregateWeakFeed$AggregateContentInfo.class;
       o$f uof = new o$f(this, p1);
       try{
          p0.h(uAggregateCo, uof);
          p0.h(ContentAggregateWeakFeed.class, new o$g(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public b init(){
       return a.b(this);
    }
}
