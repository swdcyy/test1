package com.kwai.framework.exceptionhandler.safemode.ExtraMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.String;

public class ExtraMessage extends ExceptionMessage	// class@001540
{
    public int anrCount;
    public int continuousAbnormalExitCount;
    public int continuousCrashCount;
    public int crashCount;
    public int reallyForegroundAbnormalExitCnt;
    public int userRequestExitCount;
    public static final long serialVersionUID = 0x17335257650f5157;

    public void ExtraMessage(){
       super();
    }
    public String getTypePrefix(){
       return "EXTRA_";
    }
}
