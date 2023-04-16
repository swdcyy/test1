package com.kwai.live.gzone.turntable.b;
import y8c.g;
import y43.a;
import com.kwai.live.gzone.turntable.b$b;
import io.reactivex.subjects.PublishSubject;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.turntable.b$a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.turntable.b$c;
import ml8.c;

public class b extends g	// class@000e33
{
    public PublishSubject w;
    public b$b x;
    public a y;
    public b$a z;

    public void b(a p0,b$b p1){
       super();
       this.w = PublishSubject.g();
       this.y = p0;
       this.x = p1;
    }
    public f$b d1(f$b p0){
       b$a obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null) {
          obj = new b$a(this, p0);
          this.z = obj;
          obj.h = this.w;
          obj.i = this.x;
          obj.j = this.y;
       }
       return this.z;
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0bf8), new b$c(this));
    }
    public PublishSubject r1(){
       return this.w;
    }
}
