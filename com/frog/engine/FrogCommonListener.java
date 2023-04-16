package com.frog.engine.FrogCommonListener;
import java.lang.String;
import org.json.JSONArray;
import com.frog.engine.jsobject.FrogLoggerObject;
import java.util.Map;

public interface abstract FrogCommonListener	// class@0014f2
{

    void onJSException(String p0,int p1,int p2,String p3,String p4);
    void onLog(String p0,JSONArray p1);
    void onReport(FrogLoggerObject p0);
    void onReportPerformanceWithKey(String p0,Map p1);
    boolean useConsoleMode();
}
