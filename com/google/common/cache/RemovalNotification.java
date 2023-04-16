package com.google.common.cache.RemovalNotification;
import java.util.AbstractMap$SimpleImmutableEntry;
import java.lang.Object;
import com.google.common.cache.RemovalCause;
import ok.n;

public final class RemovalNotification extends AbstractMap$SimpleImmutableEntry	// class@001781
{
    public final RemovalCause cause;
    public static final long serialVersionUID;

    public void RemovalNotification(Object p0,Object p1,RemovalCause p2){
       super(p0, p1);
       n.j(p2);
       this.cause = p2;
    }
    public static RemovalNotification create(Object p0,Object p1,RemovalCause p2){
       return new RemovalNotification(p0, p1, p2);
    }
    public RemovalCause getCause(){
       return this.cause;
    }
    public boolean wasEvicted(){
       return this.cause.wasEvicted();
    }
}
