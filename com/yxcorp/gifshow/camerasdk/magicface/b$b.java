package com.yxcorp.gifshow.camerasdk.magicface.b$b;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$EffectType;
import java.lang.Enum;

public class b$b	// class@001036
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ILiveImageHelper$EffectType.values().length];
       try{
          b$b.a = ointArray;
          ointArray[ILiveImageHelper$EffectType.kEffectTypeBeauty.ordinal()] = 1;
          try{
             b$b.a[ILiveImageHelper$EffectType.kEffectTypeFaceMagic.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
