package com.smile.gifmaker.mvps.utils.SyncableProvider;
import tl8.d;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import java.lang.Class;
import tl8.c;
import java.util.Set;
import java.lang.String;
import brd.t;
import im8.e;
import java.util.Iterator;
import yl8.b;
import erd.g;
import java.util.HashMap;

public abstract class SyncableProvider extends DefaultSyncable implements d	// class@000fc4
{
    public a mAccessorWrapper;
    public static final long serialVersionUID = 0x4789349afe3a517e;

    public void SyncableProvider(){
       super();
       this.mAccessorWrapper = Accessors.d().e(this);
    }
    public Object a(Class p0){
       return c.b(this, p0);
    }
    public Set c(){
       return c.a(this);
    }
    public void d(String p0,Object p1){
       c.f(this, p0, p1);
    }
    public void e(Class p0,Object p1){
       c.d(this, p0, p1);
    }
    public Object get(String p0){
       return c.c(this, p0);
    }
    public final a getAccessors(){
       return this.mAccessorWrapper;
    }
    public void set(Object p0){
       c.e(this, p0);
    }
    public final void setUpBizId(String p0,Object p1){
       if (p1 instanceof DefaultSyncable && p1.mBizId == null) {
          p1.mBizId = p0;
       }
       return;
    }
    public final void setupAccessors(){
       this.mAccessorWrapper = Accessors.d().e(this);
    }
    public void startSyncWithActivity(t p0){
       if (this.mInSync != null) {
          return;
       }
       super.startSyncWithActivity(p0);
       Iterator iterator = e.a(this).iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          this.setUpBizId(this.getBizId(), obj);
          if (obj instanceof b) {
             obj.startSyncWithActivity(p0);
          }
       }
       return;
    }
    public void startSyncWithFragment(t p0,g p1){
       if (this.mInSync != null) {
          return;
       }
       super.startSyncWithFragment(p0, p1);
       Iterator iterator = e.a(this).iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          this.setUpBizId(this.getBizId(), obj);
          if (obj instanceof b) {
             obj.startSyncWithFragment(p0);
          }
       }
       return;
    }
    public final void sync(SyncableProvider p0){
       Object obj;
       if (this.getClass() != p0.getClass()) {
          return;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = e.a(p0).iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof b) {
             hashMap.put(obj.getClass(), obj);
          }
       }
       iterator = e.a(this).iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof b) {
             Object obj1 = hashMap.get(obj.getClass());
             if (obj1 instanceof b) {
                obj.sync(obj1);
             }
          }
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
