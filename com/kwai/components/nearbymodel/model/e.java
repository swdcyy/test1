package com.kwai.components.nearbymodel.model.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.components.nearbymodel.model.f;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import java.lang.Object;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;

public class e extends Accessor	// class@000cc7
{
    public final LocalCoverAggregateFeed c;
    public final f d;

    public void e(f p0,LocalCoverAggregateFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoverAggregateMeta;
    }
    public void set(Object p0){
       this.c.mCoverAggregateMeta = p0;
    }
}
