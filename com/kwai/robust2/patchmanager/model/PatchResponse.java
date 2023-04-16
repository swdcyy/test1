package com.kwai.robust2.patchmanager.model.PatchResponse;
import java.io.Serializable;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import org.json.JSONArray;
import java.util.ArrayList;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.util.List;
import com.kwai.robust.RobustException;
import java.lang.Throwable;
import java.util.Iterator;

public class PatchResponse implements Serializable	// class@001424
{
    public List patchList;
    public int result;

    public void PatchResponse(){
       super();
    }
    public static PatchResponse a(JSONObject p0){
       try{
          PatchResponse patchRespons = new PatchResponse();
          patchRespons.result = p0.optInt("result");
          JSONArray jSONArray = p0.optJSONArray("patchList");
          if (jSONArray != null) {
             patchRespons.patchList = new ArrayList();
             for (int i = 0; i < jSONArray.length(); i = i + 1) {
                patchRespons.patchList.add(PatchModel.fromJson(jSONArray.getJSONObject(i)));
             }
          }
          return patchRespons;
       }catch(org.json.JSONException e4){
          throw new RobustException(e4);
       }
    }
    public static PatchResponse fromJsonString(String p0){
       try{
          return PatchResponse.a(new JSONObject(p0));
       }catch(org.json.JSONException e1){
          throw new RobustException(e1);
       }
    }
    public JSONObject toJson(){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("result", this.result);
          JSONArray jSONArray = new JSONArray();
          PatchResponse tpatchList = this.patchList;
          if (tpatchList != null) {
             Iterator iterator = tpatchList.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next().toJson());
             }
          }
          jSONObject.put("patchList", jSONArray);
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
