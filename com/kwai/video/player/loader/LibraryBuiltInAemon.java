package com.kwai.video.player.loader.LibraryBuiltInAemon;
import com.kwai.video.player.loader.LibraryBuiltIn;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import com.kwai.video.player.KsPlayerCore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ai7.d;
import java.lang.CharSequence;
import com.kwai.video.player.PlayerLibraryLoader;
import java.lang.Number;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Boolean;

public class LibraryBuiltInAemon extends LibraryBuiltIn	// class@000b51
{

    public void LibraryBuiltInAemon(){
       super();
    }
    public KsPlayerCore findCore(PlayerLibraryLoader$FindBestParam p0){
       String str1;
       PlayerLibraryLoader$FindBestParam obj = PatchProxy.applyOneRefs(p0, this, LibraryBuiltInAemon.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mProvider;
       String str = "";
       if (obj != null) {
          if (p0.mIsLive != null) {
             str1 = "playerHotfixLive";
          }else if(p0.mIsHls != null){
             str1 = "playerHotfixHls";
          }else {
             str1 = "playerHotfixVod";
          }
          str = obj.getString(str1, str);
       }
       boolean b = this.isAppVersionMatch(str, p0.getVersionCode());
       int i = 1;
       boolean b1 = (str.contains("-useAemon") || (str.contains("-useVodAemon") && b))? true: false;
       boolean b2 = this.isAemonBizSupported(p0, str);
       int b3 = PlayerLibraryLoader.getInstance().isLoaded("AemonPlayerDVA");
       boolean dvaVersion = PlayerLibraryLoader.getInstance().getDvaVersion("AemonPlayerDVA");
       if (b1 && b2) {
          if (b3) {
             if (this.isDvaVersionMatch(str, dvaVersion)) {
                return KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX;
             }else {
                PlayerLibraryLoader.getInstance().log("AemonDvaVersionNotMatch..skip");
             }
          }else {
             this.loadAemon(str);
          }
       }
       b = (!str.contains("-useIjk") || (b || !b2))? true: false;
       b3 = PlayerLibraryLoader.getInstance().getDvaVersion("KwaiplayerDVA");
       dvaVersion = PlayerLibraryLoader.getInstance().isLoaded("KwaiplayerDVA");
       if (b) {
          if (dvaVersion) {
             if (!str.contains("-useIjk") || !this.isDvaVersionMatch(str, b3)) {
                i = 0;
             }
             if (!b2) {
                return KsPlayerCore.PLAYER_CORE_IJK;
             }else if(i){
                return KsPlayerCore.PLAYER_CORE_IJK;
             }else {
                PlayerLibraryLoader.getInstance().log("IjkDvaVersionNotMatch..skip");
             }
          }else {
             this.loadIjk(str);
          }
       }
       return KsPlayerCore.PLAYER_CORE_AEMON;
    }
    public KsPlayerCore getCoreBuiltIn(){
       return KsPlayerCore.PLAYER_CORE_AEMON;
    }
    public int getPlayerAliveCnt(){
       KsPlayerCore obj = PatchProxy.apply(null, this, LibraryBuiltInAemon.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (PlayerLibraryLoader.getInstance().isLoaded("AemonPlayerDVA"))? KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX: KsPlayerCore.PLAYER_CORE_AEMON;
       return AemonMediaPlayerAdapter.getStaticMethod(obj).getPlayerAliveCnt();
    }
    public boolean isAemonLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInAemon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().isLoaded("AemonPlayerBuiltIn");
    }
    public boolean isKwaiplayerLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInAemon.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().isLoaded("KwaiplayerDVA");
    }
    public boolean isWebRTCLoaded(){
       Object obj = PatchProxy.apply(null, this, LibraryBuiltInAemon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PlayerLibraryLoader.getInstance().isLoaded("kpwebrtcDva") && (PlayerLibraryLoader.isUseAemonWebRTC() || this.isKwaiplayerLoaded()))? true: false;
       return b;
    }
    public void loadFromSdcard(){
       if (PatchProxy.applyVoid(null, this, LibraryBuiltInAemon.class, "6")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryBuiltInAemon.class, "1")) {
          return;
       }
       if (!this.isWebRTCLoaded()) {
          String str = "kpwebrtcDva";
          PlayerLibraryLoader.getInstance().setDvaPriority(str, p0);
          PlayerLibraryLoader.getInstance().loadSoFromDva(str);
       }
       if (!PlayerLibraryLoader.isUseAemonWebRTC() && !this.isKwaiplayerLoaded()) {
          PlayerLibraryLoader.getInstance().setDvaPriority("KwaiplayerDVA", p0);
          PlayerLibraryLoader.getInstance().loadSoFromDva("KwaiplayerDVA");
       }
       return;
    }
}
