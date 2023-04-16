package com.kwai.library.widget.popup.bubble.BubbleInterface$UiMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BubbleInterface$UiMode extends Enum	// class@000974
{
    public static final BubbleInterface$UiMode[] $VALUES;
    public static final BubbleInterface$UiMode BLACK;
    public static final BubbleInterface$UiMode DEFAULT;
    public static final BubbleInterface$UiMode WHITE;

    static {
       BubbleInterface$UiMode uiMode = new BubbleInterface$UiMode("DEFAULT", 0);
       BubbleInterface$UiMode.DEFAULT = uiMode;
       BubbleInterface$UiMode uiMode1 = new BubbleInterface$UiMode("WHITE", 1);
       BubbleInterface$UiMode.WHITE = uiMode1;
       BubbleInterface$UiMode uiMode2 = new BubbleInterface$UiMode("BLACK", 2);
       BubbleInterface$UiMode.BLACK = uiMode2;
       BubbleInterface$UiMode[] uiModeArray = new BubbleInterface$UiMode[]{uiMode,uiMode1,uiMode2};
       BubbleInterface$UiMode.$VALUES = uiModeArray;
    }
    public void BubbleInterface$UiMode(String p0,int p1){
       super(p0, p1);
    }
    public static BubbleInterface$UiMode valueOf(String p0){
       return Enum.valueOf(BubbleInterface$UiMode.class, p0);
    }
    public static BubbleInterface$UiMode[] values(){
       return BubbleInterface$UiMode.$VALUES.clone();
    }
}
