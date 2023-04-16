package com.smile.gifmaker.mvps.utils.DefaultSyncable;
import yl8.b;
import java.io.Serializable;
import tl8.a;
import java.lang.Object;
import java.io.ObjectInputStream;
import yl8.a;
import java.lang.Class;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Collection;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import erd.g;
import java.lang.RuntimeException;
import java.util.Map;
import brd.t;

public abstract class DefaultSyncable implements b, Serializable	// class@000fc2
{
    public String mBizId;
    public g mConsumer;
    public boolean mInSync;
    public static final a sSyncClassLocal;
    public static final long serialVersionUID;

    static {
       DefaultSyncable.sSyncClassLocal = new a();
    }
    public void DefaultSyncable(){
       super();
       this.mInSync = false;
    }
    private void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
    }
    public void b(){
       a.a(this);
    }
    public void fireSync(){
       if (this.mInSync == null) {
          return;
       }
       Class class = this.getClass();
       List list = DefaultSyncable.sSyncClassLocal.a(class);
       if (list != null) {
          LinkedList linkedList = new LinkedList();
          _monitor_enter(class);
          LinkedList linkedList1 = new LinkedList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             b uob = weakReferenc.get();
             if (uob != null) {
                if (uob != this) {
                   String bizId = uob.getBizId();
                   if (bizId == null) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException(this.getSyncableInfo(uob)));
                   }else if(bizId.equals(this.getBizId())){
                      linkedList.add(uob);
                   }
                }
             }else {
                linkedList1.add(weakReferenc);
             }
          }
          list.removeAll(linkedList1);
          _monitor_exit(class);
          Iterator iterator1 = linkedList.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().onSync(this);
          }
       }
       return;
    }
    public String getBizId(){
       return this.mBizId;
    }
    public final String getSyncableInfo(b p0){
       String str = new Gson().q(p0);
       return "Syncable "+p0+" bizId can\'t be null! "+str;
    }
    public void onSync(b p0){
       DefaultSyncable tmConsumer = this.mConsumer;
       if (tmConsumer != null) {
          try{
             tmConsumer.accept(p0);
          }catch(java.lang.Exception e3){
             throw new RuntimeException("DefaultSyncable.onSync error", e3);
          }
       }
       this.sync(p0);
       return;
    }
    public void startSync(g p0){
       if (this.mInSync != null) {
          return;
       }
       Class class = this.getClass();
       _monitor_enter(class);
       if (this.mInSync != null) {
          _monitor_exit(class);
          return;
       }else {
          a sSyncClassLo = DefaultSyncable.sSyncClassLocal;
          List list = sSyncClassLo.a(class);
          if (list == null) {
             list = new LinkedList();
             sSyncClassLo.a.put(class, list);
          }
          this.mConsumer = p0;
          list.add(new WeakReference(this));
          this.mInSync = true;
          _monitor_exit(class);
          return;
       }
    }
    public void startSyncWithActivity(t p0){
       this.startSync(null);
    }
    public void startSyncWithFragment(t p0){
       this.startSyncWithFragment(p0, null);
    }
    public void startSyncWithFragment(t p0,g p1){
       this.startSync(p1);
    }
}
