package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import org.json.JSONArray;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;

public class EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig	// class@000906
{
    public double mDuration;
    public EditorSmartClipThemeConfig$RandomType mRandomType;
    public List mTransitionList;
    public final EditorSmartClipThemeConfig this$0;

    public void EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig(EditorSmartClipThemeConfig p0,JSONObject p1){
       this.this$0 = p0;
       super();
       if (p1 == null) {
          throw new EditorSdk2InternalErrorException("no transition field");
       }
       JSONArray jSONArray = p1.optJSONArray("transition_list");
       this.mTransitionList = new ArrayList();
       for (int i = 0; i < jSONArray.length(); i = i + 1) {
          this.mTransitionList.add(Integer.valueOf(jSONArray.getInt(i)));
       }
       this.mDuration = p1.getDouble("duration");
       this.mRandomType = EditorSmartClipThemeConfig$RandomType.values()[p1.getInt("random_type")];
       return;
    }
    public double getDuration(){
       return this.mDuration;
    }
    public EditorSmartClipThemeConfig$RandomType getRandomType(){
       return this.mRandomType;
    }
    public List getTransitionList(){
       return this.mTransitionList;
    }
}
