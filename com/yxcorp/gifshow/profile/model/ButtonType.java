package com.yxcorp.gifshow.profile.model.ButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonType extends Enum	// class@00137f
{
    public static final ButtonType[] $VALUES;
    public static final ButtonType ADD_FRIEND;
    public static final ButtonType COMMERCIAL;
    public static final ButtonType CREATOR_CENTER;
    public static final ButtonType EDIT_PROFILE;
    public static final ButtonType SHOP;

    static {
       ButtonType uButtonType;
       ButtonType[] uButtonTypeA = new ButtonType[]{uButtonType,uButtonType,uButtonType,uButtonType,uButtonType};
       uButtonType = new ButtonType("COMMERCIAL", 0);
       ButtonType.COMMERCIAL = uButtonType;
       uButtonType = new ButtonType("CREATOR_CENTER", 1);
       ButtonType.CREATOR_CENTER = uButtonType;
       uButtonType = new ButtonType("EDIT_PROFILE", 2);
       ButtonType.EDIT_PROFILE = uButtonType;
       uButtonType = new ButtonType("ADD_FRIEND", 3);
       ButtonType.ADD_FRIEND = uButtonType;
       uButtonType = new ButtonType("SHOP", 4);
       ButtonType.SHOP = uButtonType;
       ButtonType.$VALUES = uButtonTypeA;
    }
    public void ButtonType(String p0,int p1){
       super(p0, p1);
    }
    public static ButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ButtonType.class, p0);
    }
    public static ButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, ButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ButtonType.$VALUES.clone();
    }
}
