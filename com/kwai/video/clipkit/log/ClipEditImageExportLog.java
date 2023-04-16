package com.kwai.video.clipkit.log.ClipEditImageExportLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import com.google.gson.JsonArray;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditImageExportLog extends ClipEditBaseLog	// class@001a8b
{
    public long mCostTime;
    public boolean mImageEditStrategy;
    public int mImageType;
    public JsonArray mOriginSize;
    public JsonArray mResizeSize;
    public int mSingleLongSide;
    public boolean mSuccess;

    public void ClipEditImageExportLog(){
       super();
       this.mSingleLongSide = 0;
       this.mCostTime = 0;
       this.mOriginSize = new JsonArray();
       this.mResizeSize = new JsonArray();
    }
    public void insertOriginSize(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ClipEditImageExportLog.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ClipEditImageExportLog.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("path", p0);
       jsonObject.a0("width", Integer.valueOf(p1));
       jsonObject.a0("height", Integer.valueOf(p2));
       jsonObject.a0("exportOriginImage", Integer.valueOf(p3));
       this.mOriginSize.G(jsonObject);
       return;
    }
    public void insertResizeSize(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ClipEditImageExportLog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipEditImageExportLog.class, "2")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("path", p0);
       jsonObject.a0("width", Integer.valueOf(p1));
       jsonObject.a0("height", Integer.valueOf(p2));
       this.mResizeSize.G(jsonObject);
       return;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditImageExportLog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("ImageEditStrategy", this.mImageEditStrategy);
          obj.put("CostTime", this.mCostTime);
          obj.put("Success", this.mSuccess);
          obj.put("ImageType", this.mImageType);
          obj.put("SingleLongSide", this.mSingleLongSide);
          obj.put("OriginSize", this.mOriginSize);
          obj.put("ResizeSize", this.mResizeSize);
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditImageExportLog", "to Json Error", e0);
          return "";
       }
    }
}
