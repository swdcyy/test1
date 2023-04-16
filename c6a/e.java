package c6a.e;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qvb.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import psb.c;
import psb.a;
import cjd.e;
import erd.o;
import qvb.n0$a;
import java.util.List;
import e17.i;
import com.yxcorp.gifshow.detail.school.SchoolSquareResponse;
import la6.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.CommonMeta;

public final class e extends f	// class@000565
{
    public String p;
    public String q;
    public String r;
    public int s;
    public boolean t;

    public void e(){
       super();
       this.p = "";
    }
    public void e(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.add(p0);
       this.p = p0.getPhotoId();
    }
    public void e(String p0){
       super();
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.p = p0;
       return;
    }
    public t I1(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K()) {
          this.q = objArray;
          this.r = objArray;
       }
       obj = a.a().E(this.s, this.p, this.q, this.r).map(new e());
       a.o(obj, "DetailApi.getApiService\(бн .map\(ResponseFunction\(\)\)");
       return obj;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.t = this.K();
       super.K1(p0);
       if (this.t != null) {
          List items = this.getItems();
          int i = (items != null)? items.size(): 0;
          if (!i && this.s != null) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10443d);
             this.s = 0;
             this.a();
          }
       }
    label_0039 :
       return;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(SchoolSquareResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       String mPcursor = (p0 != null)? p0.getMPcursor(): null;
       this.q = mPcursor;
       mPcursor = (p0 != null)? p0.getMContext(): null;
       this.r = mPcursor;
       if (p1 != null) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             CommonMeta commonMeta = iterator.next().getCommonMeta();
             if (commonMeta != null) {
                String mLlsid = (p0 != null)? p0.getMLlsid(): null;
                commonMeta.mListLoadSequenceID = mLlsid;
             }
          }
       }
       return;
    }
}
