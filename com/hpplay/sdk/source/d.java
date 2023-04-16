package com.hpplay.sdk.source.d;
import android.os.IInterface;

public interface abstract d implements IInterface	// class@000669
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
