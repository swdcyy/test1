package com.kuaishou.live.common.core.basic.widget.LiveWishListItemView$a;
import com.kuaishou.live.common.core.basic.widget.LiveWishListStyle;
import java.lang.Enum;

public class LiveWishListItemView$a	// class@000f2b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveWishListStyle.values().length];
       try{
          LiveWishListItemView$a.a = ointArray;
          ointArray[LiveWishListStyle.GIFT.ordinal()] = 1;
          try{
             LiveWishListItemView$a.a[LiveWishListStyle.RANK.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
