package com.kwai.video.wayne.hodor.mid.IPreloadTaskSwitcher;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import java.lang.String;

public interface abstract IPreloadTaskSwitcher	// class@000c9a
{

    AbstractHodorPreloadTask getNextTask();
    void setCacheKey(String p0);
    void setLastSelectRepId(int p0);
}
