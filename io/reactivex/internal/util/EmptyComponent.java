package io.reactivex.internal.util.EmptyComponent;
import brd.k;
import brd.y;
import brd.p;
import brd.d0;
import brd.d;
import cxd.d;
import crd.b;
import java.lang.Enum;
import java.lang.String;
import cxd.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public final class EmptyComponent extends Enum implements k, y, p, d0, d, d, b	// class@0014c8
{
    public static final EmptyComponent[] $VALUES;
    public static final EmptyComponent INSTANCE;

    static {
       EmptyComponent uEmptyCompon = new EmptyComponent("INSTANCE", 0);
       EmptyComponent.INSTANCE = uEmptyCompon;
       EmptyComponent[] uEmptyCompon1 = new EmptyComponent[]{uEmptyCompon};
       EmptyComponent.$VALUES = uEmptyCompon1;
    }
    public void EmptyComponent(String p0,int p1){
       super(p0, p1);
    }
    public static y asObserver(){
       return EmptyComponent.INSTANCE;
    }
    public static c asSubscriber(){
       return EmptyComponent.INSTANCE;
    }
    public static EmptyComponent valueOf(String p0){
       return Enum.valueOf(EmptyComponent.class, p0);
    }
    public static EmptyComponent[] values(){
       return EmptyComponent.$VALUES.clone();
    }
    public void cancel(){
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       return true;
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       a.l(p0);
    }
    public void onNext(Object p0){
    }
    public void onSubscribe(b p0){
       p0.dispose();
    }
    public void onSubscribe(d p0){
       p0.cancel();
    }
    public void onSuccess(Object p0){
    }
    public void request(long p0){
    }
}
