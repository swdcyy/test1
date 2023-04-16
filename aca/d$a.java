package aca.d$a;
import i69.h;
import aca.d;
import java.lang.Object;
import brd.v;
import i69.g;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import h69.b;

public final class d$a implements h	// class@00008c
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(v p0){
       g.l(this, p0);
    }
    public void b(Bitmap p0){
       g.c(this, p0);
    }
    public void c(){
    }
    public void d(String p0,int p1){
       g.k(this, p0, p1);
    }
    public void e(String p0,AICutErrorCode p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "failed");
       a.p(p1, "error");
       g.h(this, p0, p1);
       this.a.b.r00(p1);
       return;
    }
    public void f(AICutErrorCode p0){
       g.b(this, p0);
    }
    public void g(int p0){
       g.j(this, p0);
    }
    public void h(String p0){
       g.f(this, p0);
    }
    public void i(String p0,String p1){
       g.g(this, p0, p1);
    }
    public void j(){
       g.i(this);
    }
    public void onFrameResult(Bitmap p0){
       g.d(this, p0);
    }
    public void onStart(){
       g.e(this);
    }
}
