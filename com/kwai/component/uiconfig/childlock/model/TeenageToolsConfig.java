package com.kwai.component.uiconfig.childlock.model.TeenageToolsConfig;
import java.io.Serializable;
import java.lang.Object;

public class TeenageToolsConfig implements Serializable	// class@000bd8
{
    public String mActionUrl;
    public String mCorner1;
    public String mCorner2;
    public String mDesc;
    public int mDisplayMode;
    public String mIconUrl;
    public static final long serialVersionUID = 0xc78eab13e353f7eb;

    public void TeenageToolsConfig(){
       super();
    }
    public boolean isDisplayModeMatch(boolean p0){
       TeenageToolsConfig tmDisplayMod;
       if (p0) {
          tmDisplayMod = this.mDisplayMode;
          if (tmDisplayMod == 2 || tmDisplayMod == 3) {
             return true;
          }
       }else {
          tmDisplayMod = this.mDisplayMode;
          if (tmDisplayMod == true || tmDisplayMod == 3) {
             return true;
          }
       }
       return false;
    }
}
