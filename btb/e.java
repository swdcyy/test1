package btb.e;
import qvb.f;
import zsb.c;
import java.lang.String;
import oec.i;
import btb.e$a;
import qvb.q;
import qvb.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxResponse;
import wkd.b;
import ysb.a;
import cjd.e;
import erd.o;
import btb.d;
import erd.g;
import java.util.List;
import la6.b;
import btb.c;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import ok.h;
import zsb.b;
import ctb.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import btb.b;
import lnc.c3$a;
import lnc.c3;
import java.lang.Boolean;
import btb.a;
import java.lang.Iterable;
import ok.o;
import qk.y;

public class e extends f	// class@00046c
{
    public boolean p;
    public final String q;
    public final c r;
    public final String s;
    public final h t;

    public void e(c p0,String p1,String p2){
       super();
       this.t = new i();
       this.q = p1;
       this.r = p0;
       this.s = p2;
       this.h(new e$a(this));
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return b.a(0x636667f2).c(this.q, objArray, this.s).map(new e()).doOnNext(new d(this));
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public List W1(b p0,List p1){
       int b;
       c uoc = c.class;
       String str = "2";
       List list = PatchProxy.applyTwoRefs(p0, p1, this, e.class, str);
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (this.K()) {
             e tr = this.r;
             tr.g = p0.mPlateSettings;
             this.p = tr.j;
          }
          if (!q.f(list)) {
             e tr1 = this.r;
             Objects.requireNonNull(tr1);
             c uoc1 = PatchProxy.apply(null, tr1, c.class, str);
             if (uoc1 != PatchProxyResult.class) {
             }else if(tr1.i == null){
                tr1.i = new b(tr1);
             }
             uoc1 = tr1.i;
             if (!PatchProxy.applyVoidTwoRefs(list, uoc1, null, uoc, str)) {
                for (b = list.size() - 1; b >= 0; b--) {
                   a uoa = list.get(b);
                   c3.c(uoc1.apply(uoa.b.mPlateId), new b(uoa));
                }
             }
             if (this.p != null) {
                b = this.hasMore();
                if (PatchProxy.isSupport(uoc)) {
                   uoc1 = PatchProxy.applyTwoRefs(list, Boolean.valueOf(b), null, uoc, "4");
                   if (uoc1 != PatchProxyResult.class) {
                      b = uoc1.booleanValue();
                   }else {
                   label_0099 :
                      int i = y.o(list, a.b);
                      if (i) {
                         if (i != -1) {
                            list.add(i, new a(list, 3));
                         }
                      }
                      b = false;
                   }
                }else {
                   goto label_0099 ;
                }
                this.p = b;
             }
          }
       }
       return list;
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(NoticeBoxResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "3")) {
          return;
       }
       super.d2(p0, p1);
       c.a(p1);
       return;
    }
    public boolean i(){
       return false;
    }
}
