package a69.c;
import qvb.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import z59.a;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import com.yxcorp.gifshow.aggregate.model.AggregateFeedResponse;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends f	// class@00004d
{
    public int p;
    public String q;
    public String r;
    public String s;

    public void c(){
       super();
    }
    public t I1(){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = b.a(0x53352bb2);
       c tq = this.q;
       c tp = this.p;
       String str = TextUtils.k(this.r);
       Object obj2 = PatchProxy.apply(objArray, this, uoc, "3");
       if (obj2 != patchProxyRe) {
          objArray1 = obj2;
       }else if(!this.K() && this.L0() != null){
          objArray = this.L0().getCursor();
       }
       objArray1 = objArray;
       return obj1.c(tq, tp, str, objArray1, this.s).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(AggregateFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       int i = (q.f(p1))? 0: p1.size();
       int i1 = (q.f(p0.getItems()))? i: p0.getItems().size() + i;
       int i2 = i;
       while (i2 < i1) {
          int i3 = i2 - i;
          QPhoto qPhoto = p0.getItems().get(i3);
          if (qPhoto != null) {
             qPhoto.setPosition(i2);
             qPhoto.setListLoadSequenceID(p0.mLlsid);
          }
          i2 = i2 + 1;
       }
       super.d2(p0, p1);
       return;
    }
}
