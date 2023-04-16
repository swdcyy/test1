package com.yxcorp.utility.l$a;
import java.lang.Thread;
import java.io.InputStream;
import java.lang.String;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.Throwable;

public class l$a extends Thread	// class@001411
{
    public InputStream b;

    public void l$a(InputStream p0){
       super("NoopStreamConsumer");
       this.b = p0;
    }
    public void run(){
       try{
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(this.b));
          do {
          } while (uBufferedRea.readLine() != null);
          uBufferedRea.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
}
