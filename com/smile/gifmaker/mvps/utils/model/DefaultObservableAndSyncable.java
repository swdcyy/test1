package com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import xl8.d;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import yl8.b;
import java.lang.Object;
import brd.t;

public abstract class DefaultObservableAndSyncable extends DefaultSyncable implements d	// class@000fc5
{
    public DefaultObservable mDefaultObservable;
    public static final long serialVersionUID = 0xe56ce59c60c769b6;

    public void DefaultObservableAndSyncable(){
       super();
       this.mDefaultObservable = new DefaultObservable();
    }
    public void notifyChanged(){
       this.notifyChanged(this);
    }
    public void notifyChanged(Object p0){
       this.notifyChanged(p0);
    }
    public void notifyChanged(b p0){
       this.mDefaultObservable.notifyChanged(p0);
    }
    public t observable(){
       return this.mDefaultObservable.observable();
    }
}
