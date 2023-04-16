package com.kwai.chat.kwailink.log.KLog;
import java.lang.String;
import com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Throwable;

public interface abstract KLog	// class@000a5e
{

    void a(String p0,KLog$KLogLevel p1,String p2,String p3);
    void b(String p0,KLog$KLogLevel p1,String p2,String p3,Throwable p4);
}
