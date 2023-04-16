package com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$BackgroundColorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BubbleHintNewStyleFragment$BackgroundColorType extends Enum	// class@0017f6
{
    public static final BubbleHintNewStyleFragment$BackgroundColorType[] $VALUES;
    public static final BubbleHintNewStyleFragment$BackgroundColorType BLACK;
    public static final BubbleHintNewStyleFragment$BackgroundColorType WHITE;

    static {
       BubbleHintNewStyleFragment$BackgroundColorType uBackgroundC = new BubbleHintNewStyleFragment$BackgroundColorType("WHITE", 0);
       BubbleHintNewStyleFragment$BackgroundColorType.WHITE = uBackgroundC;
       BubbleHintNewStyleFragment$BackgroundColorType uBackgroundC1 = new BubbleHintNewStyleFragment$BackgroundColorType("BLACK", 1);
       BubbleHintNewStyleFragment$BackgroundColorType.BLACK = uBackgroundC1;
       BubbleHintNewStyleFragment$BackgroundColorType[] uBackgroundC2 = new BubbleHintNewStyleFragment$BackgroundColorType[]{uBackgroundC,uBackgroundC1};
       BubbleHintNewStyleFragment$BackgroundColorType.$VALUES = uBackgroundC2;
    }
    public void BubbleHintNewStyleFragment$BackgroundColorType(String p0,int p1){
       super(p0, p1);
    }
    public static BubbleHintNewStyleFragment$BackgroundColorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BubbleHintNewStyleFragment$BackgroundColorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BubbleHintNewStyleFragment$BackgroundColorType.class, p0);
    }
    public static BubbleHintNewStyleFragment$BackgroundColorType[] values(){
       Object obj = PatchProxy.apply(null, null, BubbleHintNewStyleFragment$BackgroundColorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BubbleHintNewStyleFragment$BackgroundColorType.$VALUES.clone();
    }
}
