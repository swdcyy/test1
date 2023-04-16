package com.hpplay.sdk.source.api.ILelinkPlayerListener;

public interface abstract ILelinkPlayerListener	// class@000638
{

    void onCompletion();
    void onError(int p0,int p1);
    void onInfo(int p0,int p1);
    void onLoading();
    void onPause();
    void onPositionUpdate(long p0,long p1);
    void onSeekComplete(int p0);
    void onStart();
    void onStop();
    void onVolumeChanged(float p0);
}
