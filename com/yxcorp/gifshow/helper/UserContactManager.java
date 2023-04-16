package com.yxcorp.gifshow.helper.UserContactManager;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class UserContactManager	// class@00162c
{
    public final Map a;
    public final String b;
    public final Map c;
    public Reference d;
    public boolean e;
    public boolean f;
    public static final long g;
    public static final int h;

    static {
       UserContactManager.g = TimeUnit.MILLISECONDS.convert(64, TimeUnit.DAYS);
    }
    public void UserContactManager(){
       super();
       this.a = Collections.EMPTY_MAP;
       this.b = "";
       this.c = new ConcurrentHashMap();
    }
}
