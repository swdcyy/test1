package com.kwai.components.nearbymodel.model.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import fi5.k;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;
import com.kwai.components.nearbymodel.model.e;
import com.kuaishou.android.model.mix.ExtMeta;
import fi5.l;
import fi5.m;
import mm8.a;

public final class f implements b	// class@000cc8
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new k(this, p1));
       p0.h(LocalCoverAggregateFeed$CoverAggregateMeta.class, new e(this, p1));
       ExtMeta uExtMeta = ExtMeta.class;
       l ol = new l(this, p1);
       try{
          p0.h(uExtMeta, ol);
          p0.h(LocalCoverAggregateFeed.class, new m(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
