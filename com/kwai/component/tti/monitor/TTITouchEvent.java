package com.kwai.component.tti.monitor.TTITouchEvent;
import java.io.Serializable;
import java.lang.Object;

public class TTITouchEvent implements Serializable	// class@000bcc
{
    public int eventType;
    public long time;

    public void TTITouchEvent(int p0,long p1){
       super();
       this.eventType = p0;
       this.time = p1;
    }
}
