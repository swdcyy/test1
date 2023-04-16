package com.kwai.feature.component.screenshot.ScreenshotUserEvent;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;

public class ScreenshotUserEvent	// class@00127f
{
    public final String mScreenshotPath;
    public final Uri mScreenshotUri;
    public static Uri mLastShotUri;

    public void ScreenshotUserEvent(Uri p0,String p1){
       super();
       this.mScreenshotUri = p0;
       ScreenshotUserEvent.mLastShotUri = p0;
       this.mScreenshotPath = p1;
    }
    public static Uri getLastShotUri(){
       return ScreenshotUserEvent.mLastShotUri;
    }
    public String getScreenshotPath(){
       return this.mScreenshotPath;
    }
    public Uri getScreenshotUri(){
       return this.mScreenshotUri;
    }
}
