package com.kwai.video.stannis.Stannis$LogParam;
import java.lang.Object;

public class Stannis$LogParam	// class@000be9
{
    public String filePath;
    public boolean isConsoleEnable;
    public boolean isFileEnable;
    public StannisLogObserver logCb;
    public int logLevel;
    public int maxFileNum;
    public int maxFileSize;

    public void Stannis$LogParam(){
       super();
       this.logLevel = 0;
       this.isConsoleEnable = true;
       this.isFileEnable = false;
       this.maxFileSize = 0x500000;
       this.maxFileNum = 3;
       this.logCb = null;
    }
}
