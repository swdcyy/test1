package com.kwai.library.push.model.PushViewStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PushViewStyle extends Enum	// class@0008d5
{
    public static final PushViewStyle[] $VALUES;
    public static final PushViewStyle NORMAL;
    public static final PushViewStyle V2;
    public static final PushViewStyle V3;

    static {
       PushViewStyle pushViewStyl = new PushViewStyle("NORMAL", 0);
       PushViewStyle.NORMAL = pushViewStyl;
       PushViewStyle pushViewStyl1 = new PushViewStyle("V2", 1);
       PushViewStyle.V2 = pushViewStyl1;
       PushViewStyle pushViewStyl2 = new PushViewStyle("V3", 2);
       PushViewStyle.V3 = pushViewStyl2;
       PushViewStyle[] pushViewStyl3 = new PushViewStyle[]{pushViewStyl,pushViewStyl1,pushViewStyl2};
       PushViewStyle.$VALUES = pushViewStyl3;
    }
    public void PushViewStyle(String p0,int p1){
       super(p0, p1);
    }
    public static PushViewStyle valueOf(String p0){
       return Enum.valueOf(PushViewStyle.class, p0);
    }
    public static PushViewStyle[] values(){
       return PushViewStyle.$VALUES.clone();
    }
}
