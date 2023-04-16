package com.kwai.video.player.loader.LibraryBuiltInIjk;
import com.kwai.video.player.loader.LibraryBuiltIn;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import com.kwai.video.player.KsPlayerCore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import ai7.d;
import com.kwai.video.player.PlayerLibraryLoader;
import java.lang.Number;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import java.lang.Boolean;

public class LibraryBuiltInIjk extends LibraryBuiltIn	// class@000b52
{

    public void LibraryBuiltInIjk(){
       super();
    }
    public KsPlayerCore findCore(PlayerLibraryLoader$FindBestParam p0){
       String str;
       boolean b4;
       PlayerLibraryLoader$FindBestParam obj = PatchProxy.applyOneRefs(p0, this, LibraryBuiltInIjk.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mAemonConfig;
       if (TextUtils.isEmpty(obj)) {
          PlayerLibraryLoader$FindBestParam mProvider = p0.mProvider;
          if (mProvider != null) {
             str = (p0.mIsLive != null)? "playerAemonConfig": "playerVodAemonConfig";
             str = mProvider.getString(str, "");
          }
       }
       boolean b = this.isAemonLoaded();
       boolean b1 = this.isAemonBizSupported(p0, str);
       int dvaVersion = PlayerLibraryLoader.getInstance().getDvaVersion("AemonPlayerDVA");
       boolean b2 = PlayerLibraryLoader.getInstance().hasError("AemonPlayerDVA");
       int i = 0;
       int i1 = (str.contains("-useAemon") || str.contains("-useVodAemon"))? 1: 0;
       boolean b3 = this.isAppVersionMatch(str, p0.getVersionCode());
       int i2 = (i1 && (b1 && b3))? 1: 0;
       if (i2) {
          if (b) {
             b4 = this.isDvaVersionMatch(str, dvaVersion);
          label_0078 :
             dvaVersion = (b && (i2 && b4))? 1: 0;
             if (!dvaVersion) {
                if (!b) {
                   i = (b2)? 5: 1;
                }else if(!i1){
                   i = 2;
                }else if(!b1){
                   i = 3;
                }else if(!b3 || !b4){
                   i = 4;
                }else {
                   i = 100;
                }
             }
             p0.mOutputNoAemonReason = i;
             KsPlayerCore pLAYER_CORE_ = (dvaVersion)? KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX: KsPlayerCore.PLAYER_CORE_IJK;
             return pLAYER_CORE_;
          }else {
             this.loadAemon(str);
          }
       }
       b4 = true;
       goto label_0078 ;
    }
    public KsPlayerCore getCoreBuiltIn(){
       return KsPlayerCore.PLAYER_CORE_IJK;
    }
    public int getPlayerAliveCnt(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInIjk.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return KwaiMediaPlayer.getPlayerAliveCnt();
    }
    public boolean isAemonLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInIjk.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().isLoaded("AemonPlayerDVA");
    }
    public boolean isKwaiplayerLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInIjk.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().isLoaded("KwaiplayerBuiltIn");
    }
    public boolean isWebRTCLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInIjk.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isKwaiplayerLoaded() && PlayerLibraryLoader.getInstance().isLoaded("kpwebrtcDva"))? true: false;
       return b;
    }
    public void loadFromSdcard(){
       if (PatchProxy.applyVoid(null, this, LibraryBuiltInIjk.class, "6")) {
          return;
       }
       PlayerLibraryLoader.getInstance().loadSoFromSdcard("ffmpeg");
       PlayerLibraryLoader.getInstance().loadSoFromSdcard("hodor");
       PlayerLibraryLoader.getInstance().loadSoFromSdcard("KwaiplayerBuiltIn");
       PlayerLibraryLoader.getInstance().loadSoFromSdcard("AemonPlayerBuiltIn");
       PlayerLibraryLoader.getInstance().loadSoFromSdcard("kpwebrtcDva");
       return;
    }
    public void loadWebRTC(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryBuiltInIjk.class, "1")) {
          return;
       }
       if (!this.isWebRTCLoaded()) {
          PlayerLibraryLoader.getInstance().setDvaPriority("kpwebrtcDva", p0);
          PlayerLibraryLoader.getInstance().loadSoFromDva("kpwebrtcDva");
       }
       return;
    }
}
