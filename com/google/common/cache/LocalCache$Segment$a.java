package com.google.common.cache.LocalCache$Segment$a;
import java.lang.Runnable;
import com.google.common.cache.LocalCache$Segment;
import java.lang.Object;
import com.google.common.cache.LocalCache$k;
import xk.d;
import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.lang.String;
import java.lang.Throwable;
import java.util.logging.Logger;

public class LocalCache$Segment$a implements Runnable	// class@00174c
{
    public final Object b;
    public final int c;
    public final LocalCache$k d;
    public final d e;
    public final LocalCache$Segment f;

    public void LocalCache$Segment$a(LocalCache$Segment p0,Object p1,int p2,LocalCache$k p3,d p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       this.f.getAndRecordStats(this.b, this.c, this.d, this.e);
       return;
    }
}
