package com.kwai.player.debuginfo.IRecoDebugInfo;
import android.view.View;
import java.lang.String;
import java.util.Map;
import com.kwai.player.debuginfo.OnPluginReportListener;

public interface abstract IRecoDebugInfo	// class@0012df
{

    View getRecoView();
    void render(String p0,int p1);
    void render(Map p0,int p1);
    void renderErrorMsg(String p0,int p1);
    void renderExtraInfo(String p0,int p1);
    void reset();
    void setReportListener(OnPluginReportListener p0);
}
