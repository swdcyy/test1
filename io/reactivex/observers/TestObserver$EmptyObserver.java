package io.reactivex.observers.TestObserver$EmptyObserver;
import brd.y;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;

public final class TestObserver$EmptyObserver extends Enum implements y	// class@0014e1
{
    public static final TestObserver$EmptyObserver[] $VALUES;
    public static final TestObserver$EmptyObserver INSTANCE;

    static {
       TestObserver$EmptyObserver uEmptyObserv = new TestObserver$EmptyObserver("INSTANCE", 0);
       TestObserver$EmptyObserver.INSTANCE = uEmptyObserv;
       TestObserver$EmptyObserver[] uEmptyObserv1 = new TestObserver$EmptyObserver[]{uEmptyObserv};
       TestObserver$EmptyObserver.$VALUES = uEmptyObserv1;
    }
    public void TestObserver$EmptyObserver(String p0,int p1){
       super(p0, p1);
    }
    public static TestObserver$EmptyObserver valueOf(String p0){
       return Enum.valueOf(TestObserver$EmptyObserver.class, p0);
    }
    public static TestObserver$EmptyObserver[] values(){
       return TestObserver$EmptyObserver.$VALUES.clone();
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
    }
    public void onNext(Object p0){
    }
    public void onSubscribe(b p0){
    }
}
