package com.kwai.video.clipkit.log.ClipEditImagePreviewLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.util.Map;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditImagePreviewLog extends ClipEditBaseLog	// class@001a8d
{
    public double mDeviceMemory;
    public boolean mImageEditStrategy;
    public String mImagePath;
    public int mImageType;
    public int mMaxScreenWidth;
    public int mOriginSizeHeight;
    public int mOriginSizeWidth;
    public int mPos;
    public int mPreviewSizeHeight;
    public int mPreviewSizeWidth;
    public ArrayList mProjects;
    public int mResizeOptionHeight;
    public int mResizeOptionWidth;
    public int mScreenHeight;
    public int mScreenWidth;
    public Map mStatsMap;
    public int mTargetScreenWidth;
    public int mUserCropHeight;
    public int mUserCropWidth;

    public void ClipEditImagePreviewLog(){
       super();
       this.mPos = 0;
       this.mDeviceMemory = 0;
       this.mOriginSizeHeight = 0;
       this.mOriginSizeWidth = 0;
       this.mUserCropHeight = 0;
       this.mUserCropWidth = 0;
       this.mScreenHeight = 0;
       this.mScreenWidth = 0;
       this.mMaxScreenWidth = 0;
       this.mTargetScreenWidth = 0;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditImagePreviewLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("ImageEditStrategy", this.mImageEditStrategy);
          obj.put("Pos", this.mPos);
          obj.put("DeviceMemory", this.mDeviceMemory);
          obj.put("ImageType", this.mImageType);
          obj.put("ImagePath", this.mImagePath);
          obj.put("OriginSizeHeight", this.mOriginSizeHeight);
          obj.put("OriginSizeWidth", this.mOriginSizeWidth);
          obj.put("UserCropHeight", this.mUserCropHeight);
          obj.put("UserCropWidth", this.mUserCropWidth);
          obj.put("ScreenHeight", this.mScreenHeight);
          obj.put("ScreenWidth", this.mScreenWidth);
          obj.put("ResizeOptionHeight", this.mResizeOptionHeight);
          obj.put("ResizeOptionWidth", this.mResizeOptionWidth);
          obj.put("PreviewSizeHeight", this.mPreviewSizeHeight);
          obj.put("PreviewSizeWidth", this.mPreviewSizeWidth);
          obj.put("MaxScreenWidth", this.mMaxScreenWidth);
          obj.put("TargetScreenWidth", this.mTargetScreenWidth);
          if (this.mStatsMap != null) {
             obj.put("qos", new JSONObject(this.mStatsMap));
          }
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditImagePreviewLog", "to Json Error", e0);
          return "";
       }
    }
}
