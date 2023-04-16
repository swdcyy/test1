package com.kuaishou.live.common.core.component.pk.b$b;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import java.lang.Enum;

public class b$b	// class@001734
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePkResource$PkSkinResource.values().length];
       try{
          b$b.a = ointArray;
          ointArray[LivePkResource$PkSkinResource.VOICE_PARTY_PK_RESOURCE_FINAL_WIN.ordinal()] = 1;
          try{
             b$b.a[LivePkResource$PkSkinResource.VOICE_PARTY_PK_RESOURCE_FINAL_TIE.ordinal()] = 2;
             try{
                b$b.a[LivePkResource$PkSkinResource.PK_RESOURCE_NORMAL_WIN.ordinal()] = 3;
                try{
                   b$b.a[LivePkResource$PkSkinResource.PK_RESOURCE_NORMAL_LOSE.ordinal()] = 4;
                   try{
                      b$b.a[LivePkResource$PkSkinResource.PK_RESOURCE_NORMAL_TIE.ordinal()] = 5;
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
