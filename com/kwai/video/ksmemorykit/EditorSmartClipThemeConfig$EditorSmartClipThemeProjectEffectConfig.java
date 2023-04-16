package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$PresentType;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import java.util.ArrayList;
import org.json.JSONArray;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;

public class EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig	// class@000904
{
    public List mAssetsList;
    public double mEndTime;
    public double mMaxTimeGap;
    public double mMinTimeGap;
    public EditorSmartClipThemeConfig$PresentType mPresentType;
    public EditorSmartClipThemeConfig$RandomType mRandomType;
    public double mStartTime;
    public final EditorSmartClipThemeConfig this$0;

    public void EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig(EditorSmartClipThemeConfig p0,JSONObject p1){
       this.this$0 = p0;
       super();
       this.mEndTime = 0xbff0000000000000;
       if (p1 == null) {
          throw new EditorSdk2InternalErrorException("no project_effect field");
       }
       this.mMinTimeGap = p1.getDouble("min_time_gap");
       this.mMaxTimeGap = p1.getDouble("max_time_gap");
       this.mPresentType = EditorSmartClipThemeConfig$PresentType.values()[p1.optInt("present_type")];
       this.mRandomType = EditorSmartClipThemeConfig$RandomType.values()[p1.getInt("random_type")];
       this.mStartTime = p1.optDouble("start_time");
       String str = "end_time";
       if (p1.has(str)) {
          this.mEndTime = p1.optDouble(str);
       }
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
    public double getMaxTimeGap(){
       return this.mMaxTimeGap;
    }
    public double getMinTimeGap(){
       return this.mMinTimeGap;
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
}
