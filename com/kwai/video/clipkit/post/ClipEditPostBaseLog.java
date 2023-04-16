package com.kwai.video.clipkit.post.ClipEditPostBaseLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditPostBaseLog extends ClipEditBaseLog	// class@001ad8
{
    public String mErrorMsg;
    public int mExportError;
    public boolean mIsFromExternal;
    public String mSessionId;
    public int mUploadError;

    public void ClipEditPostBaseLog(){
       super();
       this.mExportError = 0;
       this.mUploadError = 0;
       this.mIsFromExternal = false;
    }
    public void ClipEditPostBaseLog(String p0,int p1,int p2,String p3,boolean p4){
       super();
       this.mExportError = 0;
       this.mUploadError = 0;
       this.mIsFromExternal = false;
       this.mSessionId = p0;
       this.mErrorMsg = p3;
       this.mIsFromExternal = p4;
       this.mExportError = p1;
       this.mUploadError = p2;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditPostBaseLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("errorMsg", this.mErrorMsg);
          obj.put("fromExternal", this.mIsFromExternal);
          JSONObject jSONObject = new JSONObject();
          obj.put("status", jSONObject);
          String str = "encodeStatus";
          int i = 4;
          int i1 = (this.mExportError != null)? 4: 1;
          jSONObject.put(str, i1);
          str = "uploadStatus";
          if (this.mUploadError == null) {
             i = 1;
          }
          jSONObject.put(str, i);
          if (this.mExportError != null || this.mUploadError != null) {
             JSONObject jSONObject1 = new JSONObject();
             jSONObject.put("error", jSONObject1);
             ClipEditPostBaseLog tmExportErro = this.mExportError;
             if (tmExportErro != null) {
                jSONObject1.put("exportErrorCode", tmExportErro);
                jSONObject1.put("exportErrorMsg", this.mErrorMsg);
             }
             tmExportErro = this.mUploadError;
             if (tmExportErro != null) {
                jSONObject1.put("uploadErrorCode", tmExportErro);
                jSONObject1.put("uploadErrorMsg", this.mErrorMsg);
             }
          }
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditPostBaseLog", "to Json Error", e0);
          return "";
       }
    }
}
