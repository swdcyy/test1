package com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$attachTo$1;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource;
import java.lang.Object;
import com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$attachTo$1$input$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.io.InputStream;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;

public final class LocalResDataSource$attachTo$1 implements IMediaDataSource	// class@000870
{
    public long a;
    public final p b;
    public final LocalResDataSource c;

    public void LocalResDataSource$attachTo$1(LocalResDataSource p0){
       this.c = p0;
       super();
       this.b = s.c(new LocalResDataSource$attachTo$1$input$2(this));
    }
    public final InputStream a(){
       return this.b.getValue();
    }
    public void close(){
       try{
          this.a().close();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public long getSize(){
       try{
          return (long)this.a().available();
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public int readAt(long p0,byte[] p1,int p2,int p3){
       int i;
       if (p1 != null) {
          try{
             if (this.a - p0 < 0) {
                this.a().skip((p0 - this.a));
             }else {
                this.a().reset();
                this.a().skip(p0);
             }
             this.a = p0;
             i = this.a().read(p1, p2, p3);
             this.a = this.a + (long)i;
          }catch(java.lang.Exception e4){
             i = Log.e("LocalDataSource", "read at", e4);
          }
       }else {
          i = -1;
       }
    }
}
