package com.kuaishou.PostDiskManagerConfig;
import java.io.Serializable;
import java.lang.Object;

public class PostDiskManagerConfig implements Serializable	// class@00076f
{
    public int mAutoDownloadNeedMinSpace;
    public int mCheckInterval;
    public boolean mCleanPostCacheAfterExit;
    public int mCleanPostCacheWhenLeft;
    public List mPostDirs;
    public List mSdDirsToSize;
    public int mTriggerCleanSpace;
    public static final long serialVersionUID = 0xfe49d706cd909d41;

    public void PostDiskManagerConfig(){
       super();
       this.mCleanPostCacheWhenLeft = 100;
       this.mCleanPostCacheAfterExit = false;
       this.mAutoDownloadNeedMinSpace = 300;
    }
    public boolean isEmpty(){
       boolean b = (this.mCheckInterval <= null)? true: false;
       return b;
    }
}
