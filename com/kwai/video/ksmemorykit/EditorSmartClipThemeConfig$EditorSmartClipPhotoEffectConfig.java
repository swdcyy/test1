package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import org.json.JSONObject;
import java.lang.Object;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import java.lang.String;
import java.util.ArrayList;
import org.json.JSONArray;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;

public class EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig	// class@000902
{
    public List mAssetsList;
    public EditorSmartClipThemeConfig$RandomType mRandomType;
    public final EditorSmartClipThemeConfig this$0;

    public void EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig(EditorSmartClipThemeConfig p0,JSONObject p1){
       this.this$0 = p0;
       super();
       if (p1 == null) {
          throw new EditorSdk2InternalErrorException("no photo_effect field");
       }
       this.mRandomType = EditorSmartClipThemeConfig$RandomType.values()[p1.getInt("random_type")];
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
    public EditorSmartClipThemeConfig$RandomType getRandomType(){
       return this.mRandomType;
    }
}
