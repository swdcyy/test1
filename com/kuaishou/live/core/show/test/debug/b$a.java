package com.kuaishou.live.core.show.test.debug.b$a;
import ds5.c;
import com.kuaishou.live.core.show.test.debug.b;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Throwable;

public class b$a implements c	// class@0011a0
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       p1.s = p0.mRequestCostTime;
    }
    public void ff(QLivePlayConfig p0){
       b.b(this, p0);
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
