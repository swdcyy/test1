package com.yxcorp.gifshow.decoration.widget.DecorationContainerView$c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$ActionMode;
import java.lang.Enum;

public class DecorationContainerView$c	// class@0012b5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DecorationContainerView$ActionMode.values().length];
       try{
          DecorationContainerView$c.a = ointArray;
          ointArray[DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE.ordinal()] = 1;
          try{
             DecorationContainerView$c.a[DecorationContainerView$ActionMode.SELECT.ordinal()] = 2;
             try{
                DecorationContainerView$c.a[DecorationContainerView$ActionMode.UN_SELECT.ordinal()] = 3;
                try{
                   DecorationContainerView$c.a[DecorationContainerView$ActionMode.SINGLE_TAP_CUSTOM_BUTTON.ordinal()] = 4;
                   try{
                      DecorationContainerView$c.a[DecorationContainerView$ActionMode.DELETE.ordinal()] = 5;
                      try{
                         DecorationContainerView$c.a[DecorationContainerView$ActionMode.SINGLE_TAP_BLANK_SCREEN.ordinal()] = 6;
                         try{
                            DecorationContainerView$c.a[DecorationContainerView$ActionMode.DOWN_TO_NEW_ITEM.ordinal()] = 7;
                         }catch(java.lang.NoSuchFieldError e0){
                         }
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
