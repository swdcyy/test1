package com.kwai.sharelib.model.ShareInitResponse$ThemeCancelElement;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import java.lang.String;
import java.lang.Integer;

public class ShareInitResponse$ThemeCancelElement extends ShareInitResponse$ThemeElement	// class@0016f6
{

    public void ShareInitResponse$ThemeCancelElement(String p0,String p1,String p2,int p3,int p4){
       super();
       this.mFontSize = Integer.valueOf(p3);
       this.mCornerRadius = Integer.valueOf(p4);
       this.mBackgroundColour = p0;
       this.mHighlightedBackgroundColour = p1;
       this.mFontColour = p2;
    }
}
