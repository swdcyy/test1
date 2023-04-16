package com.kwai.feature.api.social.reminder.push.PopConfig;
import java.lang.Object;

public final class PopConfig	// class@0011bf
{
    public final boolean enableShowPop;
    public final int showPopMaxCount;
    public final int showPopPhotoCount;

    public void PopConfig(){
       super(false, false, false);
    }
    public void PopConfig(boolean p0,int p1,int p2){
       super();
       this.enableShowPop = p0;
       this.showPopPhotoCount = p1;
       this.showPopMaxCount = p2;
    }
}
