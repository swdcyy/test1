package com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker$PageStay;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LeaveApplicationTracker$PageStay implements Serializable	// class@001074
{
    public long mTime;
    public String mUrl;
    public static final long serialVersionUID = 0xfdcf27e4c6458e98;

    public void LeaveApplicationTracker$PageStay(String p0,long p1){
       super();
       this.mUrl = p0;
       this.mTime = p1;
    }
}
