package com.kuaishou.webkit.SafeBrowsingResponse;
import java.lang.Object;

public abstract class SafeBrowsingResponse	// class@001257
{

    public void SafeBrowsingResponse(){
       super();
    }
    public abstract void backToSafety(boolean p0);
    public abstract void proceed(boolean p0);
    public abstract void showInterstitial(boolean p0);
}
