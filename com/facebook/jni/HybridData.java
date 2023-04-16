package com.facebook.jni.HybridData;
import java.lang.String;
import gg.a;
import java.lang.Object;
import com.facebook.jni.HybridData$Destructor;

public class HybridData	// class@00115b
{
    public HybridData$Destructor mDestructor;

    static {
       a.c("fbjni");
    }
    public void HybridData(){
       super();
       this.mDestructor = new HybridData$Destructor(this);
    }
    public synchronized void a(){
       this.mDestructor.a();
    }
}
