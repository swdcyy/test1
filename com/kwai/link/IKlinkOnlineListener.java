package com.kwai.link.IKlinkOnlineListener;
import java.lang.String;

public interface abstract IKlinkOnlineListener	// class@000d12
{

    void OnAppIdUpdated(int p0);
    void OnKConfUpdated(long p0);
    void OnLoginFailed(int p0);
    void OnOffline(int p0);
    void OnOnline();
    void OnPushTokenReady(String p0);
    void OnRaceBegin();
    void OnRaceEnd(int p0);
    void OnServerTimeUpdated(long p0);
    void OnShutdown();
}
