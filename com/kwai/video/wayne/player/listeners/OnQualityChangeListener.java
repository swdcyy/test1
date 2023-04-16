package com.kwai.video.wayne.player.listeners.OnQualityChangeListener;
import java.util.List;

public interface abstract OnQualityChangeListener	// class@000d30
{

    void onRealQualityIdSelect(int p0,boolean p1);
    void onRepresentationListReady(List p0);
    void onUserSwitchEnd(int p0);
    void onUserSwitchQualityStart(int p0,int p1);
}
