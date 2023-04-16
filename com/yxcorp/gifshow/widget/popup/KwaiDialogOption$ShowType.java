package com.yxcorp.gifshow.widget.popup.KwaiDialogOption$ShowType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KwaiDialogOption$ShowType extends Enum	// class@0019a0
{
    public static final KwaiDialogOption$ShowType[] $VALUES;
    public static final KwaiDialogOption$ShowType SHOW_ANYWAY;
    public static final KwaiDialogOption$ShowType SHOW_OR_DISCARD;
    public static final KwaiDialogOption$ShowType SHOW_OR_ENQUEUE;

    static {
       KwaiDialogOption$ShowType showType = new KwaiDialogOption$ShowType("SHOW_ANYWAY", 0);
       KwaiDialogOption$ShowType.SHOW_ANYWAY = showType;
       KwaiDialogOption$ShowType showType1 = new KwaiDialogOption$ShowType("SHOW_OR_ENQUEUE", 1);
       KwaiDialogOption$ShowType.SHOW_OR_ENQUEUE = showType1;
       KwaiDialogOption$ShowType showType2 = new KwaiDialogOption$ShowType("SHOW_OR_DISCARD", 2);
       KwaiDialogOption$ShowType.SHOW_OR_DISCARD = showType2;
       KwaiDialogOption$ShowType[] showTypeArra = new KwaiDialogOption$ShowType[]{showType,showType1,showType2};
       KwaiDialogOption$ShowType.$VALUES = showTypeArra;
    }
    public void KwaiDialogOption$ShowType(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiDialogOption$ShowType valueOf(String p0){
       return Enum.valueOf(KwaiDialogOption$ShowType.class, p0);
    }
    public static KwaiDialogOption$ShowType[] values(){
       return KwaiDialogOption$ShowType.$VALUES.clone();
    }
}
