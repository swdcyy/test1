package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$PresentType;
import java.util.ArrayList;
import org.json.JSONArray;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;

public class EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig	// class@000905
{
    public List mAssetsList;
    public boolean mAvoidSubtitle;
    public boolean mAvoidTransition;
    public double mEndTime;
    public boolean mFirstTrackOnly;
    public EditorSmartClipThemeConfig$PresentType mPresentType;
    public EditorSmartClipThemeConfig$RandomType mRandomType;
    public double mStartTime;
    public final EditorSmartClipThemeConfig this$0;

    public void EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig(EditorSmartClipThemeConfig p0,JSONObject p1){
       this.this$0 = p0;
       super();
       this.mEndTime = 0xbff0000000000000;
       if (p1 == null) {
          throw new EditorSdk2InternalErrorException("no track_effect field");
       }
       this.mAvoidTransition = p1.getBoolean("avoid_transition");
       String str = "avoid_subtitle";
       if (p1.has(str)) {
          this.mAvoidSubtitle = p1.getBoolean(str);
       }
       this.mRandomType = EditorSmartClipThemeConfig$RandomType.values()[p1.getInt("random_type")];
       this.mPresentType = EditorSmartClipThemeConfig$PresentType.values()[p1.getInt("present_type")];
       this.mStartTime = p1.optDouble("start_time");
       str = "end_time";
       if (p1.has(str)) {
          this.mEndTime = p1.optDouble(str);
       }
       this.mFirstTrackOnly = p1.optBoolean("first_track_only");
       this.mAssetsList = new ArrayList();
       JSONArray jSONArray = p1.getJSONArray("asset_list");
       for (int i = 0; i < jSONArray.length(); i = i + 1) {
          this.mAssetsList.add(new EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig(p0, jSONArray.getJSONObject(i)));
       }
       return;
    }
    public List getAssetsList(){
       return this.mAssetsList;
    }
    public double getEndTime(){
       return this.mEndTime;
    }
    public EditorSmartClipThemeConfig$PresentType getPresentType(){
       return this.mPresentType;
    }
    public EditorSmartClipThemeConfig$RandomType getRandomType(){
       return this.mRandomType;
    }
    public double getStartTime(){
       return this.mStartTime;
    }
    public boolean isAvoidSubtitle(){
       return this.mAvoidSubtitle;
    }
    public boolean isAvoidTransition(){
       return this.mAvoidTransition;
    }
    public boolean isFirstTrackOnly(){
       return this.mFirstTrackOnly;
    }
}
