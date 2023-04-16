package com.kuaishou.webkit.ConsoleMessage;
import java.lang.String;
import com.kuaishou.webkit.ConsoleMessage$MessageLevel;
import java.lang.Object;

public class ConsoleMessage	// class@001246
{
    public ConsoleMessage$MessageLevel mLevel;
    public int mLineNumber;
    public String mMessage;
    public String mSourceId;

    public void ConsoleMessage(String p0,String p1,int p2,ConsoleMessage$MessageLevel p3){
       super();
       this.mMessage = p0;
       this.mSourceId = p1;
       this.mLineNumber = p2;
       this.mLevel = p3;
    }
    public int lineNumber(){
       return this.mLineNumber;
    }
    public String message(){
       return this.mMessage;
    }
    public ConsoleMessage$MessageLevel messageLevel(){
       return this.mLevel;
    }
    public String sourceId(){
       return this.mSourceId;
    }
}
