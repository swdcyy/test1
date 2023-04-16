package com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import java.lang.String;
import java.lang.Integer;

public class ShareInitResponse$ThemeItemElement extends ShareInitResponse$ThemeElement	// class@0016f8
{

    public void ShareInitResponse$ThemeItemElement(String p0,int p1,int p2){
       super();
       this.mFontSize = Integer.valueOf(p1);
       this.mFontColour = p0;
       this.mMinFontSize = Integer.valueOf(p2);
    }
}
