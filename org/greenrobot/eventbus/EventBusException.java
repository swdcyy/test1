package org.greenrobot.eventbus.EventBusException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class EventBusException extends RuntimeException	// class@002121
{
    public static final long serialVersionUID = 0xd79482abcae9c669;

    public void EventBusException(String p0){
       super(p0);
    }
    public void EventBusException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void EventBusException(Throwable p0){
       super(p0);
    }
}
