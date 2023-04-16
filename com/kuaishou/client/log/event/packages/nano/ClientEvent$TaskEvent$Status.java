package com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent$Status;
import java.lang.annotation.Annotation;

public interface abstract ClientEvent$TaskEvent$Status implements Annotation	// class@001379
{
    public static final int CANCEL = 9;
    public static final int FAIL = 8;
    public static final int FINISH = 10;
    public static final int PAUSE = 3;
    public static final int PENDING = 5;
    public static final int PROCESSING = 6;
    public static final int RESUME = 4;
    public static final int RETRY = 2;
    public static final int START = 1;
    public static final int SUCCESS = 7;
    public static final int UNKNOWN1;

}
