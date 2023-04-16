package com.android.kwai.platform.notification.core.NotificationConfig;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.StringBuilder;

public final class NotificationConfig	// class@000406
{
    public final List mAllowChannels;
    public final boolean mAllowUnknownChannel;
    public final List mMigrateStrategy;

    public void NotificationConfig(){
       super(null, null, false, 7, null);
    }
    public void NotificationConfig(List p0,List p1,boolean p2){
       a.p(p0, "mAllowChannels");
       a.p(p1, "mMigrateStrategy");
       super();
       this.mAllowChannels = p0;
       this.mMigrateStrategy = p1;
       this.mAllowUnknownChannel = p2;
    }
    public void NotificationConfig(List p0,List p1,boolean p2,int p3,u p4){
       ArrayList uArrayList = null;
       ArrayList uArrayList1 = (p3 & 0x01)? new ArrayList(): uArrayList;
       if (p3 & 0x02) {
          uArrayList = new ArrayList();
       }
       if (p3 & 0x04) {
          p2 = true;
       }
       super(uArrayList1, uArrayList, p2);
       return;
    }
    public final List a(){
       return this.mAllowChannels;
    }
    public final boolean b(){
       return this.mAllowUnknownChannel;
    }
    public final List c(){
       return this.mMigrateStrategy;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof NotificationConfig && (a.g(this.mAllowChannels, p0.mAllowChannels) && (a.g(this.mMigrateStrategy, p0.mMigrateStrategy) && this.mAllowUnknownChannel == p0.mAllowUnknownChannel)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NotificationConfig tmAllowChann = this.mAllowChannels;
       int i = 0;
       int i1 = (tmAllowChann != null)? tmAllowChann.hashCode(): 0;
       i1 = i1 * 31;
       NotificationConfig tmMigrateStr = this.mMigrateStrategy;
       if (tmMigrateStr != null) {
          i = tmMigrateStr.hashCode();
       }
       i1 = (i1 + i) * 31;
       NotificationConfig tmAllowUnkno = this.mAllowUnknownChannel;
       if (tmAllowUnkno != null) {
          tmAllowUnkno = 1;
       }
       return (i1 + tmAllowUnkno);
    }
    public String toString(){
       return "NotificationConfig\(mAllowChannels="+this.mAllowChannels+", mMigrateStrategy="+this.mMigrateStrategy+", mAllowUnknownChannel="+this.mAllowUnknownChannel+"\)";
    }
}
