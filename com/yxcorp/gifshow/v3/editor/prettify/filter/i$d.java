package com.yxcorp.gifshow.v3.editor.prettify.filter.i$d;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;

public class i$d	// class@001174
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Source.values().length];
       try{
          i$d.a = ointArray;
          ointArray[Workspace$Source.CAPTURE.ordinal()] = 1;
          try{
             i$d.a[Workspace$Source.FOLLOW_SHOOT.ordinal()] = 2;
             try{
                i$d.a[Workspace$Source.SAME_FRAME.ordinal()] = 3;
                try{
                   i$d.a[Workspace$Source.KTV_CHORUS.ordinal()] = 4;
                   try{
                      i$d.a[Workspace$Source.IMPORT.ordinal()] = 5;
                      try{
                         i$d.a[Workspace$Source.IMPORT_CLIP.ordinal()] = 6;
                         try{
                            i$d.a[Workspace$Source.IMPORT_MIXED.ordinal()] = 7;
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
