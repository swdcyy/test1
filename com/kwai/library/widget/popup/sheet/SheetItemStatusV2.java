package com.kwai.library.widget.popup.sheet.SheetItemStatusV2;
import a17.i;
import java.lang.Enum;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Primary;
import java.lang.String;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Highlight;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Supplement;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Disable;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Warning;
import nsd.u;
import java.lang.Class;
import java.lang.Object;
import a17.m;
import a17.h;

public abstract class SheetItemStatusV2 extends Enum implements i	// class@0009a8
{
    public static final SheetItemStatusV2[] $VALUES;
    public static final SheetItemStatusV2 Disable;
    public static final SheetItemStatusV2 Highlight;
    public static final SheetItemStatusV2 Primary;
    public static final SheetItemStatusV2 Supplement;
    public static final SheetItemStatusV2 Warning;

    static {
       SheetItemStatusV2$Primary primary;
       SheetItemStatusV2$Highlight highlight;
       SheetItemStatusV2$Supplement supplement;
       SheetItemStatusV2$Disable uDisable;
       SheetItemStatusV2$Warning warning;
       SheetItemStatusV2[] sheetItemSta = new SheetItemStatusV2[]{primary,highlight,supplement,uDisable,warning};
       primary = new SheetItemStatusV2$Primary("Primary", 0);
       SheetItemStatusV2.Primary = primary;
       highlight = new SheetItemStatusV2$Highlight("Highlight", 1);
       SheetItemStatusV2.Highlight = highlight;
       supplement = new SheetItemStatusV2$Supplement("Supplement", 2);
       SheetItemStatusV2.Supplement = supplement;
       uDisable = new SheetItemStatusV2$Disable("Disable", 3);
       SheetItemStatusV2.Disable = uDisable;
       warning = new SheetItemStatusV2$Warning("Warning", 4);
       SheetItemStatusV2.Warning = warning;
       SheetItemStatusV2.$VALUES = sheetItemSta;
    }
    public void SheetItemStatusV2(String p0,int p1){
       super(p0, p1);
    }
    public void SheetItemStatusV2(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static SheetItemStatusV2 valueOf(String p0){
       return Enum.valueOf(SheetItemStatusV2.class, p0);
    }
    public static SheetItemStatusV2[] values(){
       return SheetItemStatusV2.$VALUES.clone();
    }
    public int getItemTextColor(m p0){
       return h.a(this, p0);
    }
}
