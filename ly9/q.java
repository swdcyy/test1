package ly9.q;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import gr7.h;
import ly9.g;
import java.lang.Object;
import ly9.o;
import ly9.p;
import ly9.n;
import hr7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import ny9.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import ly9.l;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import io.reactivex.subjects.PublishSubject;

public class q	// class@002ec6
{
    public final c a;
    public final h b;
    public final g c;
    public final g d;
    public final g e;
    public final g f;

    public void q(c p0,h p1,g p2){
       super();
       this.d = new o(this);
       this.e = new p(this);
       this.f = new n(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(a p0){
       g og;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "4")) {
          return;
       }
       List items = this.a.getItems();
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(items, p0, obj, e.class, "6");
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = y.y(items, new a(p0)).orNull();
       }
       if (this.c instanceof l) {
          int i = 0;
          if (e.j(obj1) || e.k(obj1)) {
             og = new g(i, obj);
             og.c = 2;
             og.e = obj1.mUser;
             og.d = i;
             this.c.i.onNext(og);
          }else if(e.l(obj1)){
             og = new g(i, obj);
             og.c = 5;
             og.e = obj1.mUser;
             og.d = i;
             this.c.i.onNext(og);
          }else if(e.m(obj1)){
             og = new g(i, obj);
             og.c = 6;
             og.e = obj1.mUser;
             og.d = i;
             this.c.i.onNext(og);
          }else if(e.g(obj1) || e.h(obj1)){
             og = new g(i, obj1.mComment);
             og.c = i;
             og.d = i;
             this.c.i.onNext(og);
          }else if(e.n(obj1)){
             og = new g(i, obj);
             og.c = 9;
             og.d = i;
             this.c.i.onNext(og);
          }
       }
       return;
    }
}
