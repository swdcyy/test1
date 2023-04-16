package com.yxcorp.gifshow.albumcontrol.AlbumAccessControlException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class AlbumAccessControlException extends RuntimeException	// class@001b41
{

    public void AlbumAccessControlException(String p0){
       a.q(p0, "message");
       super(p0);
    }
    public void AlbumAccessControlException(String p0,Throwable p1){
       a.q(p0, "message");
       a.q(p1, "cause");
       super(p0, p1);
    }
    public void AlbumAccessControlException(Throwable p0){
       a.q(p0, "cause");
       super(p0);
    }
}
