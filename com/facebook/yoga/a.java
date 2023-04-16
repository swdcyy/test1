package com.facebook.yoga.a;
import lg.c;
import com.facebook.yoga.YogaNative;
import java.lang.Object;

public class a extends c	// class@001462
{

    public void a(){
       super(YogaNative.jni_YGConfigNewJNI());
    }
    public void finalize(){
       c tb = this.b;
       if (tb) {
          this.b = 0;
          YogaNative.jni_YGConfigFreeJNI(tb);
       }
       super.finalize();
       return;
    }
}
