package com.kwai.performance.stability.crash.monitor.message.Backtrace;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public final class Backtrace implements Serializable	// class@0011f7
{
    public List mBacktraces;
    public int mFrame;
    public static final long serialVersionUID = 0x33444510438ff17d;

    public void Backtrace(){
       super();
       this.mBacktraces = new ArrayList();
    }
}
