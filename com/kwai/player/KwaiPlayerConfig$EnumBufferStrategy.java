package com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiPlayerConfig$EnumBufferStrategy extends Enum	// class@0012d3
{
    public final int value;
    public static final KwaiPlayerConfig$EnumBufferStrategy[] $VALUES;
    public static final KwaiPlayerConfig$EnumBufferStrategy LINEAR_INCREASE_BUFFER_STRATEGY;
    public static final KwaiPlayerConfig$EnumBufferStrategy LOG_INCREASE_BUFFER_STRATEGY;

    static {
       KwaiPlayerConfig$EnumBufferStrategy uEnumBufferS = new KwaiPlayerConfig$EnumBufferStrategy("LINEAR_INCREASE_BUFFER_STRATEGY", 0, 1);
       KwaiPlayerConfig$EnumBufferStrategy.LINEAR_INCREASE_BUFFER_STRATEGY = uEnumBufferS;
       KwaiPlayerConfig$EnumBufferStrategy uEnumBufferS1 = new KwaiPlayerConfig$EnumBufferStrategy("LOG_INCREASE_BUFFER_STRATEGY", 1, 2);
       KwaiPlayerConfig$EnumBufferStrategy.LOG_INCREASE_BUFFER_STRATEGY = uEnumBufferS1;
       KwaiPlayerConfig$EnumBufferStrategy[] uEnumBufferS2 = new KwaiPlayerConfig$EnumBufferStrategy[]{uEnumBufferS,uEnumBufferS1};
       KwaiPlayerConfig$EnumBufferStrategy.$VALUES = uEnumBufferS2;
    }
    public void KwaiPlayerConfig$EnumBufferStrategy(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static KwaiPlayerConfig$EnumBufferStrategy valueOf(int p0){
       if (p0 == 1) {
          return KwaiPlayerConfig$EnumBufferStrategy.LINEAR_INCREASE_BUFFER_STRATEGY;
       }
       if (p0 != 2) {
          return null;
       }
       return KwaiPlayerConfig$EnumBufferStrategy.LOG_INCREASE_BUFFER_STRATEGY;
    }
    public static KwaiPlayerConfig$EnumBufferStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiPlayerConfig$EnumBufferStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiPlayerConfig$EnumBufferStrategy.class, p0);
    }
    public static KwaiPlayerConfig$EnumBufferStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiPlayerConfig$EnumBufferStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiPlayerConfig$EnumBufferStrategy.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
