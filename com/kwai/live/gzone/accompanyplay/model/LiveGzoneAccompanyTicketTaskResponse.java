package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyTicketTaskResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGzoneAccompanyTicketTaskResponse implements Serializable, b	// class@000c42
{
    public String mAccompanyTaskRefreshTips;
    public List mAccompanyTasks;
    public int mAccompanyTicketCount;
    public static final long serialVersionUID = 0x39cc31dfc6febe87;

    public void LiveGzoneAccompanyTicketTaskResponse(){
       super();
    }
    public List getItems(){
       return this.mAccompanyTasks;
    }
    public boolean hasMore(){
       return false;
    }
}
