package com.yxcorp.utility.AsyncTask$c;
import java.util.concurrent.FutureTask;
import com.yxcorp.utility.AsyncTask;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.lang.String;

public class AsyncTask$c extends FutureTask	// class@00099f
{
    public final AsyncTask b;

    public void AsyncTask$c(AsyncTask p0,Callable p1){
       this.b = p0;
       super(p1);
    }
    public void done(){
       try{
          this.b.n(this.get());
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
          throw new RuntimeException("An error occured while executing doInBackground\(\)", e0.getCause());
       }catch(java.util.concurrent.CancellationException e0){
          this.b.n(null);
       }
       return;
    }
}
