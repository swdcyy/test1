package com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public class GameCenterDownloadParams implements Serializable	// class@00129b
{
    public GameCenterDownloadParams$DownloadAction mAction;
    public String mCallback;
    public String mDownloadId;
    public String mDownloadUrl;
    public String mExtraInfo;
    public long mFileSize;
    public String mGameIconUrl;
    public String mGameName;
    public boolean mIsShowDialog;
    public String mLogParam;
    public String mMd5;
    public String mPackageName;
    public long mPackageVersion;
    public String mResourceGamePackageName;
    public String mSignature;
    public String mSource;
    public String mSpecifiedDownloadPath;
    public String mSpecifiedFileName;
    public String mSupportAppStore;
    public static final long serialVersionUID = 0xe7029305542d814d;

    public void GameCenterDownloadParams(){
       super();
    }
    public static boolean isActionStartUpdate(GameCenterDownloadParams$DownloadAction p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GameCenterDownloadParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (GameCenterDownloadParams$DownloadAction.START.equals(p0) || GameCenterDownloadParams$DownloadAction.UPDATE.equals(p0))? true: false;
       return b;
    }
    public static boolean isActionStartUpdateResume(GameCenterDownloadParams$DownloadAction p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GameCenterDownloadParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!GameCenterDownloadParams$DownloadAction.START.equals(p0) && (GameCenterDownloadParams$DownloadAction.UPDATE.equals(p0) || GameCenterDownloadParams$DownloadAction.RESUME.equals(p0)))? true: false;
       return b;
    }
    public boolean isGameResource(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mDownloadId) && (this.mDownloadId).endsWith("_resource"))? true: false;
       return b;
    }
    public JSONObject toLogParam(){
       JSONObject obj = PatchProxy.apply(null, this, GameCenterDownloadParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject(this.mLogParam);
       }catch(java.lang.Exception e0){
          obj = new JSONObject();
          obj.put("logParams", this.mLogParam);
       }catch(java.lang.Exception e0){
       }
    }
}
