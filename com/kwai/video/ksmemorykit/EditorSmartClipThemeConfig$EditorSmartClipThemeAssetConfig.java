package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;

public class EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig	// class@000903
{
    public double mDuration;
    public double mEndTime;
    public double mMinTrackTime;
    public String mPath;
    public double mStartTime;
    public final EditorSmartClipThemeConfig this$0;

    public void EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig(EditorSmartClipThemeConfig p0,JSONObject p1){
       this.this$0 = p0;
       super();
       this.mEndTime = 0xbff0000000000000;
       if (p1 == null) {
          throw new EditorSdk2InternalErrorException("no assets field");
       }
       this.mPath = p1.getString("path");
       this.mDuration = p1.getDouble("duration");
       this.mMinTrackTime = p1.getDouble("min_track_time");
       this.mStartTime = p1.optDouble("start_time");
       String str = "end_time";
       if (p1.has(str)) {
          this.mEndTime = p1.optDouble(str);
       }
       return;
    }
    public double getDuration(){
       return this.mDuration;
    }
    public double getEndTime(){
       return this.mEndTime;
    }
    public double getMinTrackTime(){
       return this.mMinTrackTime;
    }
    public String getPath(){
       return this.mPath;
    }
    public double getStartTime(){
       return this.mStartTime;
    }
}
