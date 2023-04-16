package com.yxcorp.utility.Log$b$a;
import com.yxcorp.utility.Log$b;
import java.lang.Object;
import com.yxcorp.utility.Log$LEVEL;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.yxcorp.utility.Log$a;
import java.lang.Enum;
import android.util.Log;
import java.lang.CharSequence;
import android.text.TextUtils;

public class Log$b$a implements Log$b	// class@0013f8
{

    public void Log$b$a(){
       super();
    }
    public void a(Log$LEVEL p0,String p1,String p2,Throwable p3){
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
       return;
    }
}
