package com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$EffectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ILiveImageHelper$EffectType extends Enum	// class@001030
{
    public static final ILiveImageHelper$EffectType[] $VALUES;
    public static final ILiveImageHelper$EffectType kEffectTypeBeauty;
    public static final ILiveImageHelper$EffectType kEffectTypeFaceMagic;

    static {
       ILiveImageHelper$EffectType uEffectType = new ILiveImageHelper$EffectType("kEffectTypeBeauty", 0);
       ILiveImageHelper$EffectType.kEffectTypeBeauty = uEffectType;
       ILiveImageHelper$EffectType uEffectType1 = new ILiveImageHelper$EffectType("kEffectTypeFaceMagic", 1);
       ILiveImageHelper$EffectType.kEffectTypeFaceMagic = uEffectType1;
       ILiveImageHelper$EffectType[] uEffectTypeA = new ILiveImageHelper$EffectType[]{uEffectType,uEffectType1};
       ILiveImageHelper$EffectType.$VALUES = uEffectTypeA;
    }
    public void ILiveImageHelper$EffectType(String p0,int p1){
       super(p0, p1);
    }
    public static ILiveImageHelper$EffectType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ILiveImageHelper$EffectType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ILiveImageHelper$EffectType.class, p0);
    }
    public static ILiveImageHelper$EffectType[] values(){
       Object obj = PatchProxy.apply(null, null, ILiveImageHelper$EffectType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ILiveImageHelper$EffectType.$VALUES.clone();
    }
}
