package com.kwai.video.westeros.v2.faceless.FaceMagicController$2;
import com.kwai.video.westeros.models.EffectCommandType;
import java.lang.Enum;

public class FaceMagicController$2	// class@0010c5
{
    public static final int[] $SwitchMap$com$kwai$video$westeros$models$EffectCommandType;

    static {
       int[] ointArray = new int[EffectCommandType.values().length];
       try{
          FaceMagicController$2.$SwitchMap$com$kwai$video$westeros$models$EffectCommandType = ointArray;
          ointArray[EffectCommandType.kSwitchLookupEffect.ordinal()] = 1;
          try{
             FaceMagicController$2.$SwitchMap$com$kwai$video$westeros$models$EffectCommandType[EffectCommandType.kSetMakeupResource.ordinal()] = 2;
             try{
                FaceMagicController$2.$SwitchMap$com$kwai$video$westeros$models$EffectCommandType[EffectCommandType.kSetGroupEffect.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
