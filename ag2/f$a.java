package ag2.f$a;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import ag2.f;
import java.lang.Object;
import dg2.d;
import dg2.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import z61.b;
import androidx.lifecycle.MutableLiveData;
import eg2.b;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2InitConfig;

public class f$a implements j$a	// class@0000cc
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void b(d p0){
       p.f(this, p0);
    }
    public void c(d p0){
       p.e(this, p0);
    }
    public void d(int p0,boolean p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p1.mText = "本场可用x "+p0;
       f$a ta = this.a;
       ta.Q.setValue(ta.R);
       return;
    }
    public void e(d p0,b p1){
       p.d(this, p0, p1);
    }
    public void f(){
       p.g(this);
    }
    public void g(d p0,int p1){
       p.b(this, p0, p1);
    }
    public void h(LiveQuiz2Proto$SCLiveQuiz2InitConfig p0){
       p.c(this, p0);
    }
}
