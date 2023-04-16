package com.kwai.video.player.KlogObserver$KlogParam;
import java.lang.Object;

public class KlogObserver$KlogParam	// class@000acf
{
    public String filePath;
    public boolean isConsoleEnable;
    public boolean isExternal;
    public boolean isFileEnable;
    public KlogObserver logCb;
    public int logLevel;
    public int maxFileNum;
    public int maxFileSize;
    public long nativeLogFunctionPtr;

    public void KlogObserver$KlogParam(){
       super();
       this.logLevel = 0;
       this.isConsoleEnable = true;
       this.isFileEnable = false;
       this.maxFileSize = 0x500000;
       this.maxFileNum = 3;
       this.logCb = null;
       this.nativeLogFunctionPtr = 0;
       this.isExternal = false;
    }
}
