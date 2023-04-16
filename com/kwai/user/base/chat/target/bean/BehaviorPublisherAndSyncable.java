package com.kwai.user.base.chat.target.bean.BehaviorPublisherAndSyncable;
import xl8.d;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import xl8.c;
import java.lang.Object;
import yl8.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.w;
import t45.d;
import brd.z;

public abstract class BehaviorPublisherAndSyncable extends DefaultSyncable implements d	// class@001974
{
    public DefaultObservable mDefaultObservable;
    public static final long serialVersionUID = 0xd95334a3ffd41601;

    public void BehaviorPublisherAndSyncable(){
       super();
       this.mDefaultObservable = new DefaultObservable();
    }
    public void notifyChanged(){
       c.a(this);
    }
    public void notifyChanged(Object p0){
       this.notifyChanged(p0);
    }
    public void notifyChanged(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BehaviorPublisherAndSyncable.class, "5")) {
          return;
       }
       this.mDefaultObservable.notifyChanged(p0);
       return;
    }
    public t observable(){
       Object obj = PatchProxy.apply(null, this, BehaviorPublisherAndSyncable.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.observeOnMain(true, false);
    }
    public t observe(boolean p0){
       if (PatchProxy.isSupport(BehaviorPublisherAndSyncable.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, BehaviorPublisherAndSyncable.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return t.merge(t.just(this), this.mDefaultObservable.mPublisher.hide());
       }else {
          return this.mDefaultObservable.mPublisher.hide();
       }
    }
    public t observeOnMain(boolean p0){
       if (PatchProxy.isSupport(BehaviorPublisherAndSyncable.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, BehaviorPublisherAndSyncable.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.observeOnMain(p0, false);
    }
    public t observeOnMain(boolean p0,boolean p1){
       if (PatchProxy.isSupport(BehaviorPublisherAndSyncable.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, BehaviorPublisherAndSyncable.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p1) {
             return t.merge(t.just(this), this.mDefaultObservable.mPublisher.observeOn(d.a));
          }else {
             return t.merge(t.just(this), this.mDefaultObservable.mPublisher.hide()).observeOn(d.a);
          }
       }else {
          return this.mDefaultObservable.mPublisher.observeOn(d.a);
       }
    }
}
