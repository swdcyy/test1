package com.facebook.drawee.controller.AbstractDraweeController$a;
import xb.h$a;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.lang.Object;
import java.lang.String;
import kc.b;

public class AbstractDraweeController$a implements h$a	// class@001082
{
    public final AbstractDraweeController a;

    public void AbstractDraweeController$a(AbstractDraweeController p0){
       this.a = p0;
       super();
    }
    public void a(){
       AbstractDraweeController$a ta = this.a;
       AbstractDraweeController mLoggingList = ta.mLoggingListener;
       if (mLoggingList != null) {
          mLoggingList.b(ta.mId);
       }
       return;
    }
    public void b(){
       AbstractDraweeController$a ta = this.a;
       AbstractDraweeController mLoggingList = ta.mLoggingListener;
       if (mLoggingList != null) {
          mLoggingList.a(ta.mId);
       }
       return;
    }
}
