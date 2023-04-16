package com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class TextBubbleConfig$ScaleMode extends Enum	// class@001924
{
    public int id;
    public static final TextBubbleConfig$ScaleMode[] $VALUES;
    public static final TextBubbleConfig$ScaleMode BOTH;
    public static final TextBubbleConfig$ScaleMode FREE;
    public static final TextBubbleConfig$ScaleMode HORIZONTAL;
    public static final TextBubbleConfig$ScaleMode NONE;
    public static final TextBubbleConfig$ScaleMode VERTICAL;

    static {
       TextBubbleConfig$ScaleMode scaleMode = new TextBubbleConfig$ScaleMode("NONE", 0, 0);
       TextBubbleConfig$ScaleMode.NONE = scaleMode;
       TextBubbleConfig$ScaleMode scaleMode1 = new TextBubbleConfig$ScaleMode("HORIZONTAL", 1, 1);
       TextBubbleConfig$ScaleMode.HORIZONTAL = scaleMode1;
       TextBubbleConfig$ScaleMode scaleMode2 = new TextBubbleConfig$ScaleMode("VERTICAL", 2, 2);
       TextBubbleConfig$ScaleMode.VERTICAL = scaleMode2;
       TextBubbleConfig$ScaleMode scaleMode3 = new TextBubbleConfig$ScaleMode("BOTH", 3, 3);
       TextBubbleConfig$ScaleMode.BOTH = scaleMode3;
       TextBubbleConfig$ScaleMode scaleMode4 = new TextBubbleConfig$ScaleMode("FREE", 4, 4);
       TextBubbleConfig$ScaleMode.FREE = scaleMode4;
       TextBubbleConfig$ScaleMode[] scaleModeArr = new TextBubbleConfig$ScaleMode[]{scaleMode,scaleMode1,scaleMode2,scaleMode3,scaleMode4};
       TextBubbleConfig$ScaleMode.$VALUES = scaleModeArr;
    }
    public void TextBubbleConfig$ScaleMode(String p0,int p1,int p2){
       super(p0, p1);
       this.id = p2;
    }
    public static TextBubbleConfig$ScaleMode valueOf(int p0){
       TextBubbleConfig$ScaleMode[] obj;
       object oobject;
       TextBubbleConfig$ScaleMode scaleMode = TextBubbleConfig$ScaleMode.class;
       if (PatchProxy.isSupport(scaleMode)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, scaleMode, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = TextBubbleConfig$ScaleMode.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new IllegalStateException("Cannot find scale mode, value="+p0);
          }
          oobject = obj[i];
          if (oobject.id == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static TextBubbleConfig$ScaleMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextBubbleConfig$ScaleMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextBubbleConfig$ScaleMode.class, p0);
    }
    public static TextBubbleConfig$ScaleMode[] values(){
       Object obj = PatchProxy.apply(null, null, TextBubbleConfig$ScaleMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextBubbleConfig$ScaleMode.$VALUES.clone();
    }
}
