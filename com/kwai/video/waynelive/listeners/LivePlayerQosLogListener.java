package com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;
import org.json.JSONObject;
import java.lang.String;

public interface abstract LivePlayerQosLogListener	// class@000dfd
{

    void onLiveAdaptiveQosStat(JSONObject p0);
    void onLogEvent(String p0);
    void onQosStat(JSONObject p0);
}
