package com.kwai.library.push.model.InAppEvent;
import com.kwai.library.push.model.InAppEvent$Event;
import com.kwai.library.push.model.InAppNotification;
import java.lang.String;
import java.lang.Object;

public class InAppEvent	// class@0008d1
{
    public InAppEvent$Event a;
    public InAppNotification b;
    public final String c;

    public void InAppEvent(InAppEvent$Event p0,InAppNotification p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
}
