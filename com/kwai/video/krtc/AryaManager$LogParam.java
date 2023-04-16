package com.kwai.video.krtc.AryaManager$LogParam;
import java.lang.Object;

public class AryaManager$LogParam	// class@000738
{
    public String filePath;
    public boolean isConsoleEnable;
    public boolean isFileEnable;
    public AryaLogObserver logCb;
    public int logLevel;
    public int maxFileNum;
    public int maxFileSize;

    public void AryaManager$LogParam(){
       super();
       this.logLevel = 1;
       this.isConsoleEnable = false;
       this.isFileEnable = false;
       this.maxFileSize = 5120;
       this.maxFileNum = 3;
       this.logCb = null;
    }
}
