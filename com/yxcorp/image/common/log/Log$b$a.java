package com.yxcorp.image.common.log.Log$b$a;
import com.yxcorp.image.common.log.Log$b;
import java.lang.Object;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.common.log.Log;
import com.yxcorp.image.common.log.Log$a;
import java.lang.Enum;
import android.util.Log;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class Log$b$a implements Log$b	// class@001373
{

    public void Log$b$a(){
       super();
    }
    public void a(Log$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, Log$b$a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, Log.class, "3")) {
          int i = Log$a.a[p0.ordinal()];
          if (i != 4) {
             if (i == 6) {
                if (p3 == null) {
                   Log.wtf(p1, p2);
                }else if(TextUtils.isEmpty(p2)){
                   Log.wtf(p1, p3);
                }else {
                   Log.wtf(p1, p2, p3);
                }
             }
          }else if(p3 == null){
             TextUtils.isEmpty(p2);
          }
       }
       return;
    }
}
