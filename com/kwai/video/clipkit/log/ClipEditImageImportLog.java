package com.kwai.video.clipkit.log.ClipEditImageImportLog;
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

public class ClipEditImageImportLog extends ClipEditBaseLog	// class@001a8c
{
    public JsonArray mAtlasCropSize;
    public int mAtlasLongSide;
    public long mCostTime;
    public double mDeviceMemory;
    public boolean mImageEditStrategy;
    public JsonArray mLongCropSize;
    public double mMaxImageMemory;
    public double mMinCheckScale;
    public JsonArray mOriginSize;
    public boolean mSingleImport;
    public boolean mSuccess;

    public void ClipEditImageImportLog(){
       super();
       this.mDeviceMemory = 0;
       this.mAtlasLongSide = 0;
       this.mMaxImageMemory = 0;
       this.mMinCheckScale = 0;
       this.mCostTime = 0;
       this.mOriginSize = new JsonArray();
       this.mAtlasCropSize = new JsonArray();
       this.mLongCropSize = new JsonArray();
    }
    public void insertAtlasCropSize(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ClipEditImageImportLog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipEditImageImportLog.class, "2")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("path", p0);
       jsonObject.a0("width", Integer.valueOf(p1));
       jsonObject.a0("height", Integer.valueOf(p2));
       this.mAtlasCropSize.G(jsonObject);
       return;
    }
    public void insertLongCropSize(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ClipEditImageImportLog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipEditImageImportLog.class, "3")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("path", p0);
       jsonObject.a0("width", Integer.valueOf(p1));
       jsonObject.a0("height", Integer.valueOf(p2));
       this.mLongCropSize.G(jsonObject);
       return;
    }
    public void insertOriginSize(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ClipEditImageImportLog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipEditImageImportLog.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("path", p0);
       jsonObject.a0("width", Integer.valueOf(p1));
       jsonObject.a0("height", Integer.valueOf(p2));
       this.mOriginSize.G(jsonObject);
       return;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditImageImportLog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("ImageEditStrategy", this.mImageEditStrategy);
          obj.put("CostTime", this.mCostTime);
          obj.put("Success", this.mSuccess);
          obj.put("SingleImport", this.mSingleImport);
          obj.put("DeviceMemory", this.mDeviceMemory);
          obj.put("AtlasLongSide", this.mAtlasLongSide);
          obj.put("OriginSize", this.mOriginSize);
          obj.put("AtlasCropSize", this.mAtlasCropSize);
          obj.put("LongCropSize", this.mLongCropSize);
          obj.put("MaxImageMemory", this.mMaxImageMemory);
          obj.put("MinCheckScale", this.mMinCheckScale);
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditImageImportLog", "to Json Error", e0);
          return "";
       }
    }
}
