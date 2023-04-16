package com.yxcorp.utility.AsyncTask$f;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yxcorp.utility.AsyncTask$e;
import java.lang.Object;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.utility.AsyncTask$Status;

public class AsyncTask$f extends Handler	// class@0009a2
{

    public void AsyncTask$f(){
       super(Looper.getMainLooper());
    }
    public void handleMessage(Message p0){
       Message obj = p0.obj;
       p0 = p0.what;
       if (p0 != 1) {
          if (p0 == 2) {
             obj.a.l(obj.b);
          }
       }else {
          AsyncTask$e a = obj.a;
          object oobject = obj.b[0];
          if (a.g()) {
             a.i(oobject);
          }else {
             a.j(oobject);
          }
          a.d = AsyncTask$Status.FINISHED;
       }
       return;
    }
}
