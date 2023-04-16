package com.kwai.video.waynelive.LivePlayerInitModule;
import java.lang.Object;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.LivePlayerInitModule$1;
import android.content.Context;
import com.kwai.video.waynelive.datasource.LiveDataSourceResolver;
import com.kwai.video.waynelive.mediaplayer.LiveMediaPlayerBuildListener;
import com.kwai.video.waynelive.LivePlayerInitModule$2;
import com.kwai.video.waynelive.wayneplayer.logger.LogReport;
import com.kwai.video.waynelive.wayneplayer.logger.IKSLogReport;
import com.kwai.video.waynelive.debug.DebugLog$LogInterface;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.wayneplayer.WayneDebug;
import com.kwai.video.waynelive.wayneplayer.WayneDebug$Companion;
import java.lang.Boolean;
import android.content.pm.ApplicationInfo;

public class LivePlayerInitModule	// class@000dd3
{
    public static Context sContext;
    public static IKSLogReport sKSLogReport;
    public static LiveDataSourceResolver sLiveDataSourceResolver;
    public static LiveMediaPlayerBuildListener sLiveMediaPlayerBuildListener;
    public static LivePlayerConfigProvider sLivePlayerConfigProvider;
    public static DebugLog$LogInterface sLogImpl;

    public void LivePlayerInitModule(){
       super();
    }
    public static LivePlayerConfigProvider getConfig(){
       Object obj = PatchProxy.apply(null, null, LivePlayerInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LivePlayerInitModule.sLivePlayerConfigProvider == null) {
          LivePlayerInitModule.sLivePlayerConfigProvider = new LivePlayerInitModule$1();
       }
       return LivePlayerInitModule.sLivePlayerConfigProvider;
    }
    public static Context getContext(){
       return LivePlayerInitModule.sContext;
    }
    public static LiveDataSourceResolver getLiveDataSourceResolver(){
       return LivePlayerInitModule.sLiveDataSourceResolver;
    }
    public static LiveMediaPlayerBuildListener getLiveMediaPlayerBuildListener(){
       Object obj = PatchProxy.apply(null, null, LivePlayerInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LivePlayerInitModule.sLiveMediaPlayerBuildListener == null) {
          LivePlayerInitModule.sLiveMediaPlayerBuildListener = new LivePlayerInitModule$2();
       }
       return LivePlayerInitModule.sLiveMediaPlayerBuildListener;
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LivePlayerInitModule.class, "1")) {
          return;
       }
       LivePlayerInitModule.sContext = p0.getApplicationContext();
       if (LivePlayerInitModule.sKSLogReport != null) {
          LogReport.get().setLogger(LivePlayerInitModule.sKSLogReport);
       }
       DebugLog$LogInterface sLogImpl = LivePlayerInitModule.sLogImpl;
       if (sLogImpl != null) {
          DebugLog.setImpl(sLogImpl);
       }
       if (LivePlayerInitModule.isApkInDebug()) {
          WayneDebug.Companion.getInstance().initialize();
       }
       return;
    }
    public static boolean isApkInDebug(){
       Object obj = PatchProxy.apply(null, null, LivePlayerInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (LivePlayerInitModule.sContext.getApplicationInfo().flags & 0x02) {
             b = true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setLiveDataSourceResolver(LiveDataSourceResolver p0){
       LivePlayerInitModule.sLiveDataSourceResolver = p0;
    }
    public static void setLiveMediaPlayerBuildListener(LiveMediaPlayerBuildListener p0){
       LivePlayerInitModule.sLiveMediaPlayerBuildListener = p0;
    }
    public static void setLivePlayerConfigProvider(LivePlayerConfigProvider p0){
       LivePlayerInitModule.sLivePlayerConfigProvider = p0;
    }
    public static void setWayneLogImpl(DebugLog$LogInterface p0){
       LivePlayerInitModule.sLogImpl = p0;
    }
    public static void setWayneLogReport(IKSLogReport p0){
       LivePlayerInitModule.sKSLogReport = p0;
    }
}
