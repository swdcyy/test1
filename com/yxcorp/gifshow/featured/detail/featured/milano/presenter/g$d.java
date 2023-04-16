package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$d;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import java.lang.Enum;

public class g$d	// class@000f3b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UsePrefetchReason.values().length];
       try{
          g$d.a = ointArray;
          ointArray[UsePrefetchReason.NO_NETWORK.ordinal()] = 1;
          try{
             g$d.a[UsePrefetchReason.POOR_NETWORK.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
