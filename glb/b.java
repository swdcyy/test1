package glb.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import glb.a;
import ok.x;
import java.lang.Object;
import oa0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import oe6.g;
import com.yxcorp.gifshow.model.config.PartUploadConfig;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import java.lang.Enum;
import oe6.e;
import org.greenrobot.eventbus.a;
import vs5.c;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.prettify.PrettifyPlugin;
import com.kwai.feature.post.api.startup.PostBeautyConfig;

public class b extends ConfigAutoParseJsonConsumer	// class@002b21
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putString("coCreateInfo", b.e(p0.mCoCreateInfo));
          uEditor.putString("coinProgress", b.e(p0.mCoinTaskConfig));
          uEditor.putBoolean("DisableParallelShoot", p0.mDisableParallelShoot);
          uEditor.putBoolean("disableRickonUpload", p0.mDisableRickonUpload);
          uEditor.putBoolean(b.d("user")+"DisableSameFrameFeature", p0.mDisableSameFrameFeature);
          uEditor.putFloat("editor_sdk_statistic_ratio", p0.mEditorSDKStatisticRatio);
          uEditor.putBoolean("enableAvatarPost", p0.mEnableAvatarPost);
          uEditor.putBoolean("enableBgPost", p0.mEnableBgPost);
          uEditor.putBoolean("enableKsBeautify", p0.mEnableKsBeautify);
          uEditor.putBoolean("enableRelatedHotspot", p0.mEnableRelatedHotspot);
          uEditor.putString("frameUpload", b.e(p0.mFrameUpload));
          uEditor.putInt("KtvAccompanyVolumeForMultiPiece", p0.mKtvAccompanyVolumeForMultiPiece);
          uEditor.putString("lipsSyncConfig", b.e(p0.mLipsSyncConfig));
          uEditor.putString(b.d("user")+"longVideoConfig", b.e(p0.mLongVideoEditConfig));
          uEditor.putString("MemoryActivityConfig", b.e(p0.mMemoryActivityConfig));
          uEditor.putBoolean("MerchantShareEntryEnabled", p0.mMerchantShareEntryEnabled);
          uEditor.putString("posterBeautyConfig", b.e(p0.mPostBeautyConfig));
          uEditor.putString("posterActivityTabInfo", b.e(p0.mPosterActivityTabInfo));
          uEditor.putString("posterEditFrameConfig", b.e(p0.mPosterEditFrameConfig));
          uEditor.putString("publishTaskInfo", b.e(p0.mPublishTaskInfo));
          uEditor.putString("recordReversionConfig", b.e(p0.mRecordReversionConfig));
          uEditor.putString("recreationConfig", b.e(p0.mRecreationConfig));
          uEditor.putString("rickonExperimentConfig", p0.mRickonExperimentConfig);
          uEditor.putBoolean("ShareCustomEntryEnabled", p0.mShareCustomEntryEnabled);
          uEditor.putString("storyFrameUpload", b.e(p0.mStoryFrameUpload));
          uEditor.putString("uploadNoticeInfo", p0.mUploadNoticeInfo);
          uEditor.putBoolean("video_edit_music_on", p0.mVideoEditMusicOn);
          uEditor.putString("visibilityExpirationConfig", b.e(p0.visibilityExpirationConfig));
          g.a(uEditor);
          b mPartUploadC = p0.mPartUploadConfig;
          if (mPartUploadC == null) {
             mPartUploadC = new PartUploadConfig();
          }
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putBoolean("data_network_segment_on", mPartUploadC.mDataNetOn);
          uEditor1.putInt("segment_max_thread", mPartUploadC.mMaxThread);
          uEditor1.putBoolean("segment_upload_first", mPartUploadC.mPartFileUploadFirst);
          uEditor1.putBoolean("segment_on", mPartUploadC.mPartFileUploadOn);
          uEditor1.putLong("part_file_upload_threshold", mPartUploadC.mThreshold);
          uEditor1.putInt("WholeUploadMaxSize", mPartUploadC.mWholeUploadMaxSize);
          g.a(uEditor1);
          e.v0(LiveStreamStatus.parseFrom(p0.mLiveStream).name());
          a.d().k(new c(LiveStreamStatus.parseFrom(p0.mLiveStream)));
          d.a(0x76e9c37c).zy(p0.mPostBeautyConfig);
       }
       return;
    }
}
