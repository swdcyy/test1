package com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import java.lang.Throwable;
import hzb.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public class BubbleThrowable extends Throwable	// class@001007
{
    public final a errorInfo;
    public final boolean notRecordUnAvailable;

    public void BubbleThrowable(a p0,Throwable p1,boolean p2){
       a.p(p0, "errorInfo");
       super(p1);
       this.errorInfo = p0;
       this.notRecordUnAvailable = p2;
    }
    public void BubbleThrowable(a p0,Throwable p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final a getErrorInfo(){
       return this.errorInfo;
    }
    public final boolean getNotRecordUnAvailable(){
       return this.notRecordUnAvailable;
    }
}
