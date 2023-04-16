package f0a.d;
import qvb.d;
import java.lang.String;
import java.util.ArrayList;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.c;
import psb.a;
import java.lang.Integer;
import cjd.e;
import erd.o;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.findclassmate.SchoolFindClassmatesProfileFeedResponse;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import qvb.a;

public final class d extends d	// class@00226c
{
    public final ArrayList l;
    public final String m;
    public final String n;

    public void d(String p0,String p1){
       super();
       this.m = p0;
       this.n = p1;
       this.l = new ArrayList();
    }
    public t C1(){
       SchoolFindClassmatesProfileFeedResponse schoolFindCl;
       String str;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K()) {
          obj = a.a().v(this.m, this.n, null, 16, null, null).map(new e());
          a.o(obj, "DetailApi.getApiService\(бн\).map\(ResponseFunction\(\)\)");
       }else {
          c uoc = a.a();
          d tm = this.m;
          d tn = this.n;
          if (!this.K() && this.L0() != null) {
             schoolFindCl = this.L0();
             a.m(schoolFindCl);
             str = schoolFindCl.getPrevCursor();
          }else {
             str = objArray;
          }
          if (!this.K() && this.L0() != null) {
             schoolFindCl = this.L0();
             a.m(schoolFindCl);
             objArray = schoolFindCl.getCursor();
          }
          obj = uoc.e(tm, tn, null, 2, str, objArray, 16, null, null).map(new e());
          a.o(obj, "DetailApi.getApiService\(бн\).map\(ResponseFunction\(\)\)");
       }
       return obj;
    }
    public void D1(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
       }else {
          super.D1(p0);
          if (this.K()) {
             this.B1();
          }
       }
       return;
    }
    public void E1(Object p0,List p1){
       SchoolFindClassmatesProfileFeedResponse mPhotos;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
       }else if(p0 != null){
          mPhotos = p0.mPhotos;
          if (mPhotos != null) {
          label_0018 :
             if (!this.K()) {
                this.l.clear();
                this.l.addAll(mPhotos);
             }
             if (this.x1() == 1) {
                this.b.addAll(0, mPhotos);
             }else {
                this.b.addAll(mPhotos);
             }
             mPhotos = null;
             SchoolFindClassmatesProfileFeedResponse mPrevCursor = (p0 != null)? p0.mPrevCursor: mPhotos;
             if (p0 != null) {
                mPhotos = p0.mCursor;
             }
             this.F1(mPrevCursor, mPhotos);
          }
       }
       mPhotos = CollectionsKt__CollectionsKt.E();
       goto label_0018 ;
       return;
    }
    public List d1(){
       a obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.o(obj, "mItems");
       return obj;
    }
    public long y1(){
       return 0;
    }
}
