package com.oceanlong.home_perf.cache.MerchantHomeCacheManager$b;
import java.util.Comparator;
import java.lang.Object;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager$a;

public final class MerchantHomeCacheManager$b implements Comparator	// class@000aa1
{

    public void MerchantHomeCacheManager$b(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = (p0 != null && p1 != null)? (int)(p1.a() - p0.a()): 0;
       return i;
    }
}
