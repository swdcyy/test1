package l69.o$a;
import i69.h;
import l69.o;
import java.lang.Object;
import brd.v;
import i69.g;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n69.c;
import h69.g;
import q87.c;
import pb9.p;
import n69.a;
import i69.f;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import pb9.g;
import pb9.q;

public final class o$a implements h	// class@002ca2
{
    public final o a;

    public void o$a(o p0){
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
       g.a(this);
    }
    public void d(String p0,int p1){
       g.k(this, p0, p1);
    }
    public void e(String p0,AICutErrorCode p1){
       g.h(this, p0, p1);
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
       Object[] objArray1;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, o$a.class, str)) {
          return;
       }
       g.e(this);
       o c = this.a.c;
       if (c != null && !PatchProxy.applyVoid(null, c, c.class, str)) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str1 = "AICutMusicRecoManager";
          g.D().w(str1, "frameUploader start", objArray);
          if (c.a == null) {
             if (p.g(i)) {
                objArray1 = new Object[i];
                g.D().w(str1, "init ,isEnableMultipleFrameUpload = true", objArray1);
                c.a = p.e();
             }else {
                objArray1 = new Object[i];
                g.D().w(str1, "init ,isEnableMultipleFrameUpload = false", objArray1);
             }
             c a = c.a;
             if (a != null) {
                a.j(new a(c.b, c.c, c.d, c.e), null);
             }
          }
       }
       return;
    }
}
