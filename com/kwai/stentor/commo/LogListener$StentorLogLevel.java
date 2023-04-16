package com.kwai.stentor.commo.LogListener$StentorLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LogListener$StentorLogLevel extends Enum	// class@001908
{
    public static final LogListener$StentorLogLevel[] $VALUES;
    public static final LogListener$StentorLogLevel DEBUG;
    public static final LogListener$StentorLogLevel ERROR;
    public static final LogListener$StentorLogLevel INFO;

    static {
       LogListener$StentorLogLevel stentorLogLe = new LogListener$StentorLogLevel("DEBUG", 0);
       LogListener$StentorLogLevel.DEBUG = stentorLogLe;
       LogListener$StentorLogLevel stentorLogLe1 = new LogListener$StentorLogLevel("INFO", 1);
       LogListener$StentorLogLevel.INFO = stentorLogLe1;
       LogListener$StentorLogLevel stentorLogLe2 = new LogListener$StentorLogLevel("ERROR", 2);
       LogListener$StentorLogLevel.ERROR = stentorLogLe2;
       LogListener$StentorLogLevel[] stentorLogLe3 = new LogListener$StentorLogLevel[]{stentorLogLe,stentorLogLe1,stentorLogLe2};
       LogListener$StentorLogLevel.$VALUES = stentorLogLe3;
    }
    public void LogListener$StentorLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static LogListener$StentorLogLevel valueOf(String p0){
       return Enum.valueOf(LogListener$StentorLogLevel.class, p0);
    }
    public static LogListener$StentorLogLevel[] values(){
       return LogListener$StentorLogLevel.$VALUES.clone();
    }
}
