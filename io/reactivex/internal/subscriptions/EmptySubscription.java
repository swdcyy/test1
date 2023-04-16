package io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.fuseable.l;
import java.lang.Enum;
import java.lang.String;
import cxd.c;
import cxd.d;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class EmptySubscription extends Enum implements l	// class@0014c2
{
    public static final EmptySubscription[] $VALUES;
    public static final EmptySubscription INSTANCE;

    static {
       EmptySubscription uEmptySubscr = new EmptySubscription("INSTANCE", 0);
       EmptySubscription.INSTANCE = uEmptySubscr;
       EmptySubscription[] uEmptySubscr1 = new EmptySubscription[]{uEmptySubscr};
       EmptySubscription.$VALUES = uEmptySubscr1;
    }
    public void EmptySubscription(String p0,int p1){
       super(p0, p1);
    }
    public static void complete(c p0){
       p0.onSubscribe(EmptySubscription.INSTANCE);
       p0.onComplete();
    }
    public static void error(Throwable p0,c p1){
       p1.onSubscribe(EmptySubscription.INSTANCE);
       p1.onError(p0);
    }
    public static EmptySubscription valueOf(String p0){
       return Enum.valueOf(EmptySubscription.class, p0);
    }
    public static EmptySubscription[] values(){
       return EmptySubscription.$VALUES.clone();
    }
    public void cancel(){
    }
    public void clear(){
    }
    public boolean isEmpty(){
       return true;
    }
    public boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public Object poll(){
       return null;
    }
    public void request(long p0){
       SubscriptionHelper.validate(p0);
    }
    public int requestFusion(int p0){
       return (p0 & 0x02);
    }
    public String toString(){
       return "EmptySubscription";
    }
}
