package com.smile.gifmaker.mvps.utils.DefaultObservable;
import xl8.d;
import java.io.Serializable;
import io.reactivex.subjects.PublishSubject;
import mrd.c;
import java.lang.Object;
import java.io.ObjectInputStream;
import xl8.c;
import brd.y;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;

public class DefaultObservable implements d, Serializable	// class@000fc1
{
    public c mPublisher;
    public static final long serialVersionUID = 0xbf58c6abee10ae93;

    public void DefaultObservable(){
       super(PublishSubject.g());
    }
    public void DefaultObservable(c p0){
       super();
       this.mPublisher = p0;
    }
    private void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.mPublisher = PublishSubject.g();
    }
    public void notifyChanged(){
       c.a(this);
    }
    public void notifyChanged(Object p0){
       this.mPublisher.onNext(p0);
    }
    public t observable(){
       return this.mPublisher.observeOn(a.c());
    }
}
