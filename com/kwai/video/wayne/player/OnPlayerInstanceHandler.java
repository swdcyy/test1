package com.kwai.video.wayne.player.OnPlayerInstanceHandler;
import com.kwai.video.wayne.player.InstancePriority;

public interface abstract OnPlayerInstanceHandler	// class@000ca9
{

    boolean hasInstance();
    void onPriorityChanged(InstancePriority p0,InstancePriority p1);
    void onRelease();
    void onRestore();
}
