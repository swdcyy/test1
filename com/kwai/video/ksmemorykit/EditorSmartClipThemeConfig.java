package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import org.json.JSONArray;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig;

public class EditorSmartClipThemeConfig	// class@000909
{
    public List mPhotoEffectList;
    public List mProjectEffectList;
    public List mTrackEffectList;
    public EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig mTransitionConfig;

    public void EditorSmartClipThemeConfig(JSONObject p0){
       int i1;
       super();
       this.mPhotoEffectList = new ArrayList();
       this.mProjectEffectList = new ArrayList();
       this.mTrackEffectList = new ArrayList();
       JSONArray jSONArray = p0.optJSONArray("photo_effect");
       int i = 0;
       if (jSONArray != null) {
          for (i1 = 0; i1 < jSONArray.length(); i1 = i1 + 1) {
             this.mPhotoEffectList.add(new EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig(this, jSONArray.getJSONObject(i1)));
          }
       }
       jSONArray = p0.optJSONArray("project_effect");
       if (jSONArray != null) {
          for (i1 = 0; i1 < jSONArray.length(); i1 = i1 + 1) {
             this.mProjectEffectList.add(new EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig(this, jSONArray.getJSONObject(i1)));
          }
       }
       jSONArray = p0.optJSONArray("track_effect");
       if (jSONArray != null) {
          for (; i < jSONArray.length(); i = i + 1) {
             this.mTrackEffectList.add(new EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig(this, jSONArray.getJSONObject(i)));
          }
       }
       this.mTransitionConfig = new EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig(this, p0.getJSONObject("transition_config"));
       return;
    }
    public List getPhotoEffectList(){
       return this.mPhotoEffectList;
    }
    public List getProjectEffectList(){
       return this.mProjectEffectList;
    }
    public List getTrackEffectList(){
       return this.mTrackEffectList;
    }
    public EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig getTransitionConfig(){
       return this.mTransitionConfig;
    }
}
