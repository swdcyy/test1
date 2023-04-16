package com.kwai.player.debuginfo.IDebugView;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;

public interface abstract IDebugView	// class@0012dd
{

    void hide();
    void show();
    void startMonitor(KwaiPlayerDebugInfoProvider p0);
    void stopMonitor();
}
