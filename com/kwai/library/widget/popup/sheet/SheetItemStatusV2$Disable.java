package com.kwai.library.widget.popup.sheet.SheetItemStatusV2$Disable;
import com.kwai.library.widget.popup.sheet.SheetItemStatusV2;
import java.lang.String;
import nsd.u;
import a17.m;

public final class SheetItemStatusV2$Disable extends SheetItemStatusV2	// class@0009a3
{

    public void SheetItemStatusV2$Disable(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemTextColor(){
       return 0x7f062155;
    }
    public int getItemTextColor(m p0){
       int itemTextColo;
       p0 = (p0 != null)? p0.g: this.getItemTextColor();
       return p0;
    }
    public boolean isEnableClick(){
       return false;
    }
}
