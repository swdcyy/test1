package dg2.d;
import p91.m;
import java.lang.Object;
import eg2.b;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import eg2.c;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import java.util.Objects;
import java.lang.StringBuilder;

public class d	// class@002511
{
    public m a;
    public c b;
    public b c;
    public int d;
    public int e;
    public String f;
    public byte[] g;
    public PublishSubject h;
    public String i;

    public void d(m p0){
       super();
       this.c = new b();
       this.h = PublishSubject.g();
       this.a = p0;
    }
    public int a(){
       return this.e;
    }
    public b b(){
       return this.c;
    }
    public int c(){
       d obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj == null)? 0: obj.a;
       return i;
    }
    public String d(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       String str = (obj == null)? "": obj.a;
       return str;
    }
    public boolean e(){
       d tb = this.b;
       boolean b = (tb != null && this.c.a == tb.b)? true: false;
       return b;
    }
    public void f(int p0){
       this.e = (p0 >= 0)? p0: 0;
       return;
    }
    public void g(b p0){
       this.c = p0;
    }
    public void h(LiveQuiz2Proto$LiveQuiz2Model p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (this.b == null && p0 != null) {
          c uoc = new c();
          this.b = uoc;
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(p0, uoc, c.class, "1")) {
             uoc.a = p0.liveQuizId;
             uoc.b = p0.totalQuestions;
          }
       }
       return;
    }
    public void i(String p0){
       this.f = p0;
    }
    public void j(int p0){
       this.d = (p0 >= 0)? p0: 0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveQuizAudienceContext{, mCurrentLiveQuizSheet="+this.b+", mCurrentLiveQuizQuestion="+this.c+", mSponsorLogoPicUrl=\'"+this.i+'''+'}';
    }
}
