package com.facebook.yoga.b;
import com.facebook.yoga.YogaNodeJNIBase;
import lg.b;
import com.facebook.yoga.YogaNative;
import java.lang.Object;

public class b extends YogaNodeJNIBase	// class@001467
{

    public void b(){
       super();
    }
    public void b(b p0){
       super(p0);
    }
    public void finalize(){
       YogaNodeJNIBase tf = this.f;
       if (tf) {
          this.f = 0;
          YogaNative.jni_YGNodeFreeJNI(tf);
       }
       super.finalize();
       return;
    }
}
