package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$TYPE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RoundIconTagSpan$TYPE extends Enum	// class@001a14
{
    public final int icon;
    public static final RoundIconTagSpan$TYPE[] $VALUES;
    public static final RoundIconTagSpan$TYPE ANCHOR;
    public static final RoundIconTagSpan$TYPE AT;
    public static final RoundIconTagSpan$TYPE CUSTOM_HASHTAG;
    public static final RoundIconTagSpan$TYPE FEATURE_CAPTION_ANCHOR_NEW;
    public static final RoundIconTagSpan$TYPE HASHTAG;
    public static final RoundIconTagSpan$TYPE KNOWLEDGE;
    public static final RoundIconTagSpan$TYPE KNOWLEDGE_COMMENT;

    static {
       RoundIconTagSpan$TYPE tYPE;
       RoundIconTagSpan$TYPE[] tYPEArray = new RoundIconTagSpan$TYPE[]{tYPE,tYPE,tYPE,tYPE,tYPE,tYPE,tYPE};
       tYPE = new RoundIconTagSpan$TYPE("CUSTOM_HASHTAG", 0, 0x7f080e88);
       RoundIconTagSpan$TYPE.CUSTOM_HASHTAG = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("HASHTAG", 1, 0x7f080e88);
       RoundIconTagSpan$TYPE.HASHTAG = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("AT", 2, 0x7f080e86);
       RoundIconTagSpan$TYPE.AT = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("KNOWLEDGE", 3, 0x7f080a86);
       RoundIconTagSpan$TYPE.KNOWLEDGE = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("KNOWLEDGE_COMMENT", 4, 0x7f080a60);
       RoundIconTagSpan$TYPE.KNOWLEDGE_COMMENT = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("ANCHOR", 5, 0x7f080555);
       RoundIconTagSpan$TYPE.ANCHOR = tYPE;
       tYPE = new RoundIconTagSpan$TYPE("FEATURE_CAPTION_ANCHOR_NEW", 6, 0x7f080aa5);
       RoundIconTagSpan$TYPE.FEATURE_CAPTION_ANCHOR_NEW = tYPE;
       RoundIconTagSpan$TYPE.$VALUES = tYPEArray;
    }
    public void RoundIconTagSpan$TYPE(String p0,int p1,int p2){
       super(p0, p1);
       this.icon = p2;
    }
    public static RoundIconTagSpan$TYPE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RoundIconTagSpan$TYPE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RoundIconTagSpan$TYPE.class, p0);
    }
    public static RoundIconTagSpan$TYPE[] values(){
       Object obj = PatchProxy.apply(null, null, RoundIconTagSpan$TYPE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RoundIconTagSpan$TYPE.$VALUES.clone();
    }
    public final int getIcon(){
       return this.icon;
    }
}
