package com.kuaishou.live.lite.debuginfo.c$a;
import ds5.c;
import com.kuaishou.live.lite.debuginfo.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ds5.b;
import java.lang.Throwable;

public class c$a implements c	// class@0008d2
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return "DebugView";
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       p1.p = p0.mRequestCostTime;
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
