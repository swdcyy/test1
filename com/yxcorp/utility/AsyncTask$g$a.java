package com.yxcorp.utility.AsyncTask$g$a;
import java.lang.Runnable;
import com.yxcorp.utility.AsyncTask$g;
import java.lang.Object;

public class AsyncTask$g$a implements Runnable	// class@0009a3
{
    public final Runnable b;
    public final AsyncTask$g c;

    public void AsyncTask$g$a(AsyncTask$g p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.run();
       this.c.a();
    }
}
