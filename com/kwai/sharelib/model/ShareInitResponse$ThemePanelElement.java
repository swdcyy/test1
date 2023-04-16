package com.kwai.sharelib.model.ShareInitResponse$ThemePanelElement;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import java.lang.String;
import java.lang.Integer;

public class ShareInitResponse$ThemePanelElement extends ShareInitResponse$ThemeElement	// class@0016f9
{

    public void ShareInitResponse$ThemePanelElement(String p0,String p1,int p2){
       super();
       this.mSeparatorColour = p0;
       this.mBackgroundColour = p1;
       this.mCornerRadius = Integer.valueOf(p2);
    }
}
