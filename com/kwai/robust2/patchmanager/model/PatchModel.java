package com.kwai.robust2.patchmanager.model.PatchModel;
import java.io.Serializable;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;
import com.kwai.robust.RobustException;
import java.lang.Throwable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;

public class PatchModel implements Serializable	// class@001423
{
    public String downloadUrl;
    public String featureName;
    public String featureVersion;
    public boolean isRollback;
    public String md5;
    public String patchId;
    public long patchSize;
    public List replacePatchIds;
    public String robustId;
    public static final long serialVersionUID = 0xe8d2c6f68e18ca96;

    public void PatchModel(){
       super();
       this.isRollback = false;
       this.featureName = "";
       this.featureVersion = "";
    }
    public static PatchModel fromJson(JSONObject p0){
       try{
          PatchModel patchModel = new PatchModel();
          patchModel.patchId = p0.optString("patchId");
          patchModel.robustId = p0.optString("robustId");
          patchModel.downloadUrl = p0.optString("downloadUrl");
          patchModel.md5 = p0.optString("md5");
          patchModel.patchSize = p0.optLong("patchSize");
          patchModel.isRollback = p0.optBoolean("rollback");
          JSONArray jSONArray = p0.optJSONArray("replacePatchIds");
          if (jSONArray != null) {
             patchModel.replacePatchIds = new ArrayList();
             for (int i = 0; i < jSONArray.length(); i = i + 1) {
                patchModel.replacePatchIds.add(jSONArray.getString(i));
             }
          }
          patchModel.featureName = p0.optString("featureName");
          patchModel.featureVersion = p0.optString("featureVersion");
          return patchModel;
       }catch(org.json.JSONException e5){
          throw new RobustException(e5);
       }
    }
    public static PatchModel fromJsonString(String p0){
       try{
          return PatchModel.fromJson(new JSONObject(p0));
       }catch(org.json.JSONException e1){
          throw new RobustException(e1);
       }
    }
    public boolean isFeaturePatch(){
       boolean b = (!TextUtils.x(this.featureName) && !TextUtils.x(this.featureVersion))? true: false;
       return b;
    }
    public boolean isMatchFeatureName(String p0){
       return (TextUtils.k(this.featureName)).equals(TextUtils.k(p0));
    }
    public boolean isMatchFeatureVersion(String p0){
       return (TextUtils.k(this.featureVersion)).equals(TextUtils.k(p0));
    }
    public JSONObject toJson(){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("patchId", this.patchId);
          jSONObject.put("robustId", this.robustId);
          jSONObject.put("downloadUrl", this.downloadUrl);
          jSONObject.put("md5", this.md5);
          jSONObject.put("patchSize", this.patchSize);
          jSONObject.put("rollback", this.isRollback);
          JSONArray jSONArray = new JSONArray();
          PatchModel treplacePatc = this.replacePatchIds;
          if (treplacePatc != null) {
             Iterator iterator = treplacePatc.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next());
             }
          }
          jSONObject.put("replacePatchIds", jSONArray);
          jSONObject.put("featureName", this.featureName);
          jSONObject.put("featureVersion", this.featureVersion);
          return jSONObject;
       }catch(org.json.JSONException e0){
          throw new RobustException(e0);
       }
    }
    public String toJsonString(){
       return this.toJson().toString();
    }
    public String toString(){
       return this.toJsonString();
    }
}
