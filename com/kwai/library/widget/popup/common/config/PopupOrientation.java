package com.kwai.library.widget.popup.common.config.PopupOrientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PopupOrientation extends Enum	// class@000991
{
    public static final PopupOrientation[] $VALUES;
    public static final PopupOrientation ORIENTATION_LANDSCAPE;
    public static final PopupOrientation ORIENTATION_PORTRAIT;
    public static final PopupOrientation ORIENTATION_UNDEFINED;

    static {
       PopupOrientation popupOrienta = new PopupOrientation("ORIENTATION_UNDEFINED", 0);
       PopupOrientation.ORIENTATION_UNDEFINED = popupOrienta;
       PopupOrientation popupOrienta1 = new PopupOrientation("ORIENTATION_PORTRAIT", 1);
       PopupOrientation.ORIENTATION_PORTRAIT = popupOrienta1;
       PopupOrientation popupOrienta2 = new PopupOrientation("ORIENTATION_LANDSCAPE", 2);
       PopupOrientation.ORIENTATION_LANDSCAPE = popupOrienta2;
       PopupOrientation[] popupOrienta3 = new PopupOrientation[]{popupOrienta,popupOrienta1,popupOrienta2};
       PopupOrientation.$VALUES = popupOrienta3;
    }
    public void PopupOrientation(String p0,int p1){
       super(p0, p1);
    }
    public static PopupOrientation valueOf(String p0){
       return Enum.valueOf(PopupOrientation.class, p0);
    }
    public static PopupOrientation[] values(){
       return PopupOrientation.$VALUES.clone();
    }
}
