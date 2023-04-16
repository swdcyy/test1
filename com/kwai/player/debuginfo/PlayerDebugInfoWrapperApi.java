package com.kwai.player.debuginfo.PlayerDebugInfoWrapperApi;
import android.view.View;
import java.lang.String;
import com.kwai.player.debuginfo.OnPluginReportListener;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;

public interface abstract PlayerDebugInfoWrapperApi	// class@0012e2
{

    View getPlayerView();
    void replaceExtraInfo(String p0,String p1,int p2);
    void setReportListener(OnPluginReportListener p0);
    void startMonitor(KwaiPlayerDebugInfoProvider p0);
    void stopMonitor();
}
