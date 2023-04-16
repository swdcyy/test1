package com.kwai.video.wayne.player.listeners.CacheListener;
import com.kwai.video.wayne.player.CacheReceipt;

public interface abstract CacheListener	// class@000d27
{

    void onCancelled(CacheReceipt p0);
    void onCompleted(CacheReceipt p0);
    void onFailed(CacheReceipt p0);
    void onFragmentCompleted(CacheReceipt p0);
    void onProgress(CacheReceipt p0);
}
