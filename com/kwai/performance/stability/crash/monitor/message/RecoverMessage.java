package com.kwai.performance.stability.crash.monitor.message.RecoverMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.String;

public class RecoverMessage extends ExceptionMessage	// class@001203
{
    public static final long serialVersionUID = 0x77836376a13e3cc3;

    public void RecoverMessage(){
       super();
    }
    public String getTypePrefix(){
       return "RECOVER_";
    }
}
