package com.tkruntime.v8.V8Trace$ILogger;
import com.tkruntime.v8.V8;
import java.lang.String;

public interface abstract V8Trace$ILogger	// class@000fcd
{

    void addCommunicationCost(V8 p0,float p1);
    void beginSection(V8 p0,String p1,String p2);
    void beginSection(String p0,String p1,String p2);
    void endSection(V8 p0);
    void endSection(String p0,String p1,String p2);
    void traceLog(String p0);
}
