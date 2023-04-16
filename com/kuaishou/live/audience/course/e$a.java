package com.kuaishou.live.audience.course.e$a;
import ds5.c;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;

public class e$a implements c	// class@000bfd
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       b.b(this, p0);
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       if (p0 instanceof KwaiException && p0.getErrorCode() == 623) {
          this.b.X8();
       }
       return;
    }
    public boolean xi(){
       return true;
    }
}
