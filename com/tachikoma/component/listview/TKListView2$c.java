package com.tachikoma.component.listview.TKListView2$c;
import com.tachikoma.component.listview.TKListView2$LayoutMode;
import java.lang.Enum;

public class TKListView2$c	// class@000d0d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TKListView2$LayoutMode.values().length];
       try{
          TKListView2$c.a = ointArray;
          ointArray[TKListView2$LayoutMode.LIST.ordinal()] = 1;
          try{
             TKListView2$c.a[TKListView2$LayoutMode.GRID.ordinal()] = 2;
             try{
                TKListView2$c.a[TKListView2$LayoutMode.WATERFALL.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
