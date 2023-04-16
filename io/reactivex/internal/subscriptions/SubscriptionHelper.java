package io.reactivex.internal.subscriptions.SubscriptionHelper;
import cxd.d;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.functions.a;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import java.lang.Class;

public final class SubscriptionHelper extends Enum implements d	// class@0014c5
{
    public static final SubscriptionHelper[] $VALUES;
    public static final SubscriptionHelper CANCELLED;

    static {
       SubscriptionHelper subscription = new SubscriptionHelper("CANCELLED", 0);
       SubscriptionHelper.CANCELLED = subscription;
       SubscriptionHelper[] subscription1 = new SubscriptionHelper[]{subscription};
       SubscriptionHelper.$VALUES = subscription1;
    }
    public void SubscriptionHelper(String p0,int p1){
       super(p0, p1);
    }
    public static boolean cancel(AtomicReference p0){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (p0.get() != cANCELLED) {
          d andSet = p0.getAndSet(cANCELLED);
          if (andSet != cANCELLED) {
             if (andSet != null) {
                andSet.cancel();
             }
             return true;
          }
       }
       return false;
    }
    public static void deferredRequest(AtomicReference p0,AtomicLong p1,long p2){
       d uod = p0.get();
       if (uod != null) {
          uod.request(p2);
       }else if(SubscriptionHelper.validate(p2)){
          b.a(p1, p2);
          d uod1 = p0.get();
          if (uod1 != null) {
             long andSet = p1.getAndSet(0);
             if (andSet) {
                uod1.request(andSet);
             }
          }
       }
       return;
    }
    public static boolean deferredSetOnce(AtomicReference p0,AtomicLong p1,d p2){
       if (!SubscriptionHelper.setOnce(p0, p2)) {
          return false;
       }
       long andSet = p1.getAndSet(0);
       if (andSet) {
          p2.request(andSet);
       }
       return true;
    }
    public static boolean isCancelled(d p0){
       boolean b = (p0 == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public static boolean replace(AtomicReference p0,d p1){
       while (true) {
          d uod = p0.get();
          if (uod == SubscriptionHelper.CANCELLED) {
             if (p1 != null) {
                p1.cancel();
                break ;
             }
             break ;
          }else {
             if (p0.compareAndSet(uod, p1)) {
                return true;
             }
             continue ;
          }
       }
       return false;
    }
    public static void reportMoreProduced(long p0){
       a.l(new ProtocolViolationException("More produced than requested: "+p0));
    }
    public static void reportSubscriptionSet(){
       a.l(new ProtocolViolationException("Subscription already set!"));
    }
    public static boolean set(AtomicReference p0,d p1){
       while (true) {
          d uod = p0.get();
          if (uod == SubscriptionHelper.CANCELLED) {
             if (p1 != null) {
                p1.cancel();
             }
             return false;
          }else {
             if (p0.compareAndSet(uod, p1)) {
                if (uod != null) {
                   uod.cancel();
                   break ;
                }
                break ;
             }
          }
       }
       return true;
    }
    public static boolean setOnce(AtomicReference p0,d p1){
       a.c(p1, "s is null");
       if (p0.compareAndSet(null, p1)) {
          return true;
       }
       p1.cancel();
       if (p0.get() != SubscriptionHelper.CANCELLED) {
          SubscriptionHelper.reportSubscriptionSet();
       }
       return false;
    }
    public static boolean setOnce(AtomicReference p0,d p1,long p2){
       if (!SubscriptionHelper.setOnce(p0, p1)) {
          return false;
       }
       p1.request(p2);
       return true;
    }
    public static boolean validate(long p0){
       if (p0 - null > 0) {
          return true;
       }
       a.l(new IllegalArgumentException("n > 0 required but it was "+p0));
       return false;
    }
    public static boolean validate(d p0,d p1){
       if (p1 == null) {
          a.l(new NullPointerException("next is null"));
          return false;
       }else if(p0 != null){
          p1.cancel();
          SubscriptionHelper.reportSubscriptionSet();
          return false;
       }else {
          return true;
       }
    }
    public static SubscriptionHelper valueOf(String p0){
       return Enum.valueOf(SubscriptionHelper.class, p0);
    }
    public static SubscriptionHelper[] values(){
       return SubscriptionHelper.$VALUES.clone();
    }
    public void cancel(){
    }
    public void request(long p0){
    }
}
