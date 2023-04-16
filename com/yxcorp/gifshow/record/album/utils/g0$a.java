package com.yxcorp.gifshow.record.album.utils.g0$a;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;

public class g0$a	// class@001768
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[Phase.values().length];
       g0$a.b = ointArray;
       try{
          int i = 1;
          ointArray[Phase.CREATE.ordinal()] = i;
          ointArray = new int[Workspace$Type.values().length];
          try{
             g0$a.a = ointArray;
             ointArray[Workspace$Type.SINGLE_PICTURE.ordinal()] = i;
             try{
                g0$a.a[Workspace$Type.KTV_SONG.ordinal()] = 2;
                try{
                   g0$a.a[Workspace$Type.KTV_MV.ordinal()] = 3;
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
