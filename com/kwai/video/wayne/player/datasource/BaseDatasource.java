package com.kwai.video.wayne.player.datasource.BaseDatasource;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.util.VodPlayerUtils;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.player.KwaiRepresentation;

public abstract class BaseDatasource implements IDatasource	// class@000d18
{
    public String TAG;
    public String mCacheKey;
    public String mSelectedQualityType;
    public int mSelectedRepId;
    public String mVideoId;

    public void BaseDatasource(){
       super();
       this.TAG = "BaseDatasource";
       this.mSelectedRepId = -1;
    }
    public String getCacheKey(){
       return this.mCacheKey;
    }
    public String getResourceKey(){
       String obj = PatchProxy.apply(null, this, BaseDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getVideoId();
       if (TextUtils.isEmpty(obj)) {
          obj = VodPlayerUtils.getCacheKey(this.getDatasourceStrUrl());
       }
       return obj;
    }
    public String getSelectedQualityType(){
       return this.mSelectedQualityType;
    }
    public int getSelectedRepId(){
       return this.mSelectedRepId;
    }
    public String getVideoId(){
       return this.mVideoId;
    }
    public void setCacheKey(String p0){
       this.mCacheKey = p0;
    }
    public void setSelectedQualityType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDatasource.class, "2")) {
          return;
       }
       int repIdFromQua = VodPlayerUtils.getRepIdFromQualityType(this.getKwaiManifest(), p0);
       if (repIdFromQua > 0) {
          this.mSelectedQualityType = p0;
          this.mSelectedRepId = repIdFromQua;
       }else {
          DebugLog.e(this.TAG, "do not have this qualityType "+p0);
       }
       return;
    }
    public boolean setSelectedRepId(int p0){
       String obj;
       BaseDatasource uBaseDatasou = BaseDatasource.class;
       if (PatchProxy.isSupport(uBaseDatasou)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBaseDatasou, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = VodPlayerUtils.getQualityTypeFromRepId(this.getKwaiManifest(), p0);
       boolean b = true;
       if (!TextUtils.isEmpty(obj)) {
          this.mSelectedRepId = p0;
          this.mSelectedQualityType = obj;
          return b;
       }else if(p0 == KwaiRepresentation.AUTO_ID){
          this.mSelectedRepId = p0;
          this.mSelectedQualityType = KwaiRepresentation.AUTO_TYPE;
          return b;
       }else {
          DebugLog.e(this.TAG, "do not have this repId "+p0);
          return false;
       }
    }
    public void setVideoId(String p0){
       this.mVideoId = p0;
    }
}
