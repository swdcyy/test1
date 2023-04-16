package com.facebook.react.bridge.Promise;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Boolean;

public interface abstract Promise	// class@001215
{

    void reject(String p0);
    void reject(String p0,WritableMap p1);
    void reject(String p0,String p1);
    void reject(String p0,String p1,WritableMap p2);
    void reject(String p0,String p1,Throwable p2);
    void reject(String p0,String p1,Throwable p2,WritableMap p3);
    void reject(String p0,Throwable p1);
    void reject(String p0,Throwable p1,WritableMap p2);
    void reject(Throwable p0);
    void reject(Throwable p0,WritableMap p1);
    void resolve(Object p0);
    void resolveNew(String p0,Boolean p1);
}
