package io.reactivex.internal.util.NotificationLite;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import brd.y;
import io.reactivex.internal.util.NotificationLite$ErrorNotification;
import java.lang.Throwable;
import cxd.c;
import io.reactivex.internal.util.NotificationLite$DisposableNotification;
import crd.b;
import io.reactivex.internal.util.NotificationLite$SubscriptionNotification;
import cxd.d;
import java.lang.Class;

public final class NotificationLite extends Enum	// class@0014d0
{
    public static final NotificationLite[] $VALUES;
    public static final NotificationLite COMPLETE;

    static {
       NotificationLite notification = new NotificationLite("COMPLETE", 0);
       NotificationLite.COMPLETE = notification;
       NotificationLite[] notification1 = new NotificationLite[]{notification};
       NotificationLite.$VALUES = notification1;
    }
    public void NotificationLite(String p0,int p1){
       super(p0, p1);
    }
    public static boolean accept(Object p0,y p1){
       if (p0 == NotificationLite.COMPLETE) {
          p1.onComplete();
          return true;
       }else if(p0 instanceof NotificationLite$ErrorNotification){
          p1.onError(p0.e);
          return true;
       }else {
          p1.onNext(p0);
          return false;
       }
    }
    public static boolean accept(Object p0,c p1){
       if (p0 == NotificationLite.COMPLETE) {
          p1.onComplete();
          return true;
       }else if(p0 instanceof NotificationLite$ErrorNotification){
          p1.onError(p0.e);
          return true;
       }else {
          p1.onNext(p0);
          return false;
       }
    }
    public static boolean acceptFull(Object p0,y p1){
       boolean b = true;
       if (p0 == NotificationLite.COMPLETE) {
          p1.onComplete();
          return b;
       }else if(p0 instanceof NotificationLite$ErrorNotification){
          p1.onError(p0.e);
          return b;
       }else if(p0 instanceof NotificationLite$DisposableNotification){
          p1.onSubscribe(p0.d);
          return false;
       }else {
          p1.onNext(p0);
          return false;
       }
    }
    public static boolean acceptFull(Object p0,c p1){
       boolean b = true;
       if (p0 == NotificationLite.COMPLETE) {
          p1.onComplete();
          return b;
       }else if(p0 instanceof NotificationLite$ErrorNotification){
          p1.onError(p0.e);
          return b;
       }else if(p0 instanceof NotificationLite$SubscriptionNotification){
          p1.onSubscribe(p0.s);
          return false;
       }else {
          p1.onNext(p0);
          return false;
       }
    }
    public static Object complete(){
       return NotificationLite.COMPLETE;
    }
    public static Object disposable(b p0){
       return new NotificationLite$DisposableNotification(p0);
    }
    public static Object error(Throwable p0){
       return new NotificationLite$ErrorNotification(p0);
    }
    public static b getDisposable(Object p0){
       return p0.d;
    }
    public static Throwable getError(Object p0){
       return p0.e;
    }
    public static d getSubscription(Object p0){
       return p0.s;
    }
    public static Object getValue(Object p0){
       return p0;
    }
    public static boolean isComplete(Object p0){
       boolean b = (p0 == NotificationLite.COMPLETE)? true: false;
       return b;
    }
    public static boolean isDisposable(Object p0){
       return p0 instanceof NotificationLite$DisposableNotification;
    }
    public static boolean isError(Object p0){
       return p0 instanceof NotificationLite$ErrorNotification;
    }
    public static boolean isSubscription(Object p0){
       return p0 instanceof NotificationLite$SubscriptionNotification;
    }
    public static Object next(Object p0){
       return p0;
    }
    public static Object subscription(d p0){
       return new NotificationLite$SubscriptionNotification(p0);
    }
    public static NotificationLite valueOf(String p0){
       return Enum.valueOf(NotificationLite.class, p0);
    }
    public static NotificationLite[] values(){
       return NotificationLite.$VALUES.clone();
    }
    public String toString(){
       return "NotificationLite.Complete";
    }
}
