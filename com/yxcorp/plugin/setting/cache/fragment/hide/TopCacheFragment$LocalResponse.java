package com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment$LocalResponse;
import la6.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class TopCacheFragment$LocalResponse implements b	// class@000839
{
    public final List mItems;

    public void TopCacheFragment$LocalResponse(List p0){
       a.p(p0, "mItems");
       super();
       this.mItems = p0;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
