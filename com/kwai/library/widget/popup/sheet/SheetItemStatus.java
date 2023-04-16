package com.kwai.library.widget.popup.sheet.SheetItemStatus;
import a17.i;
import java.lang.Enum;
import com.kwai.library.widget.popup.sheet.SheetItemStatus$Highlight;
import java.lang.String;
import com.kwai.library.widget.popup.sheet.SheetItemStatus$Disable;
import com.kwai.library.widget.popup.sheet.SheetItemStatus$Enable;
import com.kwai.library.widget.popup.sheet.SheetItemStatus$Primary;
import nsd.u;
import java.lang.Class;
import java.lang.Object;
import a17.m;
import a17.h;

public abstract class SheetItemStatus extends Enum implements i	// class@0009a2
{
    public static final SheetItemStatus[] $VALUES;
    public static final SheetItemStatus Disable;
    public static final SheetItemStatus Enable;
    public static final SheetItemStatus Highlight;
    public static final SheetItemStatus Primary;

    static {
       SheetItemStatus$Highlight highlight;
       SheetItemStatus$Disable uDisable;
       SheetItemStatus$Enable uEnable;
       SheetItemStatus$Primary primary;
       SheetItemStatus[] sheetItemSta = new SheetItemStatus[]{highlight,uDisable,uEnable,primary};
       highlight = new SheetItemStatus$Highlight("Highlight", 0);
       SheetItemStatus.Highlight = highlight;
       uDisable = new SheetItemStatus$Disable("Disable", 1);
       SheetItemStatus.Disable = uDisable;
       uEnable = new SheetItemStatus$Enable("Enable", 2);
       SheetItemStatus.Enable = uEnable;
       primary = new SheetItemStatus$Primary("Primary", 3);
       SheetItemStatus.Primary = primary;
       SheetItemStatus.$VALUES = sheetItemSta;
    }
    public void SheetItemStatus(String p0,int p1){
       super(p0, p1);
    }
    public void SheetItemStatus(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static SheetItemStatus valueOf(String p0){
       return Enum.valueOf(SheetItemStatus.class, p0);
    }
    public static SheetItemStatus[] values(){
       return SheetItemStatus.$VALUES.clone();
    }
    public int getItemTextColor(m p0){
       return h.a(this, p0);
    }
}
