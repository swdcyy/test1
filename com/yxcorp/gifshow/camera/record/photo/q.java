package com.yxcorp.gifshow.camera.record.photo.q;
import java.lang.Object;
import android.view.View;
import android.view.View$OnTouchListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hg9.f1;

public class q	// class@000efa
{
    public int a;
    public int b;

    public void q(){
       super();
    }
    public View$OnTouchListener a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f1(p0, this);
    }
    public q b(int p0){
       this.a = p0;
       return this;
    }
    public q c(int p0){
       this.b = p0;
       return this;
    }
}
