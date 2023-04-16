package com.yxcorp.utility.AsyncTask$b;
import com.yxcorp.utility.AsyncTask$h;
import com.yxcorp.utility.AsyncTask;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Process;

public class AsyncTask$b extends AsyncTask$h	// class@00099e
{
    public final AsyncTask c;

    public void AsyncTask$b(AsyncTask p0){
       this.c = p0;
       super();
    }
    public Object call(){
       this.c.f.set(true);
       Process.setThreadPriority(10);
       AsyncTask$b tc = this.c;
       Object obj = tc.b(this.b);
       tc.m(obj);
       return obj;
    }
}
