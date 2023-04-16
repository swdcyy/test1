package com.kwai.android.common.bean.PushData;
import java.io.Serializable;
import java.lang.Object;

public class PushData implements Serializable	// class@00097f
{
    public int badgeCount;
    public String body;
    public String channelId;
    public String groupId;
    public boolean groupSummary;
    public long priority;
    public String pushBack;
    public boolean pushForeground;
    public String pushId;
    public String showId;
    public String title;
    public String uri;
    public static final long serialVersionUID = 0xbcbd2e4d66120383;

    public void PushData(){
       super();
       this.badgeCount = -1;
       this.pushForeground = true;
    }
}
