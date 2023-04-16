package c66.n;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import c66.m;
import ok.x;
import java.lang.Object;
import com.kwai.framework.preference.startup.SystemStatCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class n extends ConfigAutoParseJsonConsumer	// class@000660
{

    public void n(){
       super(m.b);
    }
    public void b(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = b.a.edit();
          b = (p0.mAnonymShotEnabled != null)? true: false;
          uEditor.putBoolean("GuestShotEnabled", b);
          uEditor.putInt("ConnectionTimeout", p0.mConnectionTimeout);
          b = (p0.mCopyDisabled != null)? true: false;
          uEditor.putBoolean("cm_cp_disabled", b);
          uEditor.putBoolean("DisableInitDFP", p0.mDisableInitDFP);
          uEditor.putBoolean("DisablePatch", p0.mDisablePatch);
          uEditor.putBoolean("EnableAdvancedMakeup", p0.mEnableAdvancedMakeup);
          b = (p0.mEnableMediaRecorder != null)? true: false;
          uEditor.putBoolean("serverEnableMediaRecorder", b);
          uEditor.putInt("feed_cover_prefetch_count", p0.mFeedCoverPrefetchCount);
          uEditor.putInt("VideoReadTimeOut", p0.mMovTimeout);
          uEditor.putInt("phonecode_interval", p0.mPhonecodeInterval);
          uEditor.putInt("PicTimeout", p0.mPicTimeout);
          b = (p0.mPrefferMediaRecorder != null)? true: false;
          uEditor.putBoolean("PrefferMediaRecorder", b);
          uEditor.putInt("default_home_type", p0.mShowTab);
          uEditor.putInt("tag_hash_type", p0.mTagHashType);
          uEditor.putInt("units_int", p0.mUnitsInt);
          uEditor.putLong("UpdatePromoteInterval", p0.mUpdatePromoteInterval);
          uEditor.putLong("UpgradeNeedStartupTime", p0.mUpgradeNeedStartupTime);
          b = (p0.mUploadLogRs != null)? true: false;
          uEditor.putBoolean("UploadLogRs", b);
          b = (p0.mUsCmdSwitch != null)? true: false;
          uEditor.putBoolean("allow_adv_private_option", b);
          uEditor.putInt("UseDebugUrl", p0.mUseDebugUrl);
          uEditor.putInt("videoCacheMinFrames", p0.mVideoCacheMinFrames);
          uEditor.putLong("videoSeekMinDuration", p0.mVideoSeekMinDuration);
          g.a(uEditor);
          p0 = p0.mUnits;
          if (p0 != null && p0.equals("imperial")) {
             b.M(1);
          }else {
             b.M(0);
          }
       }
       return;
    }
}
