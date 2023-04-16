package jk5.a;
import jk5.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public class a implements c	// class@002c3e
{

    public void a(){
       super();
    }
    public void a(int p0){
    }
    public void b(int p0,Throwable p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "2")) {
          return;
       }
       a.p(p1, "e");
       return;
    }
    public void c(int p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p1, "destinationDir");
       a.p(p2, "fileName");
       a.p(p3, "targetFilePath");
       return;
    }
    public void onProgress(int p0,long p1,long p2){
    }
    public void onStart(int p0){
    }
}
