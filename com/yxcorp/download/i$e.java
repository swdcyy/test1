package com.yxcorp.download.i$e;
import com.yxcorp.download.i;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;

public class i$e	// class@0011c4
{
    public HandlerThread a;
    public Handler b;
    public long c;
    public String d;
    public String e;
    public String f;
    public final i g;

    public void i$e(i p0){
       this.g = p0;
       super();
       this.a = new HandlerThread("DownloadManager:PreDownloadDispatcher");
       this.c = 0;
       this.d = "";
       this.e = "";
       this.f = "";
    }
}
