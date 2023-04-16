package com.yxcorp.gifshow.v3.editor.prettify.makeup.c$c;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;

public class c$c	// class@001193
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Source.values().length];
       try{
          c$c.a = ointArray;
          ointArray[Workspace$Source.CAPTURE.ordinal()] = 1;
          try{
             c$c.a[Workspace$Source.FOLLOW_SHOOT.ordinal()] = 2;
             try{
                c$c.a[Workspace$Source.SAME_FRAME.ordinal()] = 3;
                try{
                   c$c.a[Workspace$Source.KTV_CHORUS.ordinal()] = 4;
                   try{
                      c$c.a[Workspace$Source.IMPORT.ordinal()] = 5;
                      try{
                         c$c.a[Workspace$Source.IMPORT_CLIP.ordinal()] = 6;
                         try{
                            c$c.a[Workspace$Source.IMPORT_MIXED.ordinal()] = 7;
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
