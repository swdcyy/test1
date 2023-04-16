package ava.b;
import jb5.e;
import qvb.f;
import ava.b$a;
import nsd.u;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qvb.a;
import qvb.n0;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import java.lang.Long;
import bva.a;
import bva.b;
import cjd.e;
import erd.o;
import ava.b$b;
import erd.g;
import qvb.n0$a;
import la6.b;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import b06.d;

public final class b extends f implements e	// class@000322
{
    public List p;
    public int q;
    public final List r;
    public final int s;
    public final QPhoto t;
    public static final b$a u;

    static {
       b.u = new b$a(null);
    }
    public void b(List p0,int p1,QPhoto p2){
       a.p(p2, "photo");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.add(p2);
       this.R1(true);
    }
    public t I1(){
       Object[] objArray1;
       HotSpotItem obj1;
       HotSpotItem obj2;
       HotSpotItem obj3;
       Object[] objArray2;
       HotSpotItem hotSpotItem;
       Object[] objArray3;
       HomeFeedResponse mCursor;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          obj = (TextUtils.n(this.L0().mCursor, "no_more"))? objArray: this.L0().mCursor;
          objArray1 = obj;
       }else {
          objArray1 = objArray;
       }
       b tr = this.r;
       String str = 1;
       tr = (tr == null || tr.isEmpty())? 1: null;
       int i = 2;
       if (!tr) {
          b tq = this.q;
          if (this.r.size() > tq) {
             String str1 = "null cannot be cast to non-null type com.yxcorp.gifshow.model.hotspot.HotSpotItem";
             if (this.s == i) {
                obj1 = this.r.get(tq);
                Objects.requireNonNull(obj1, str1);
                obj1 = obj1.mPhotoId;
             }else {
                obj = objArray;
             }
             if (this.s == i) {
                obj2 = this.r.get(this.q);
                Objects.requireNonNull(obj2, str1);
                obj2 = obj2.mServerExpTag;
             }else {
                Object[] objArray4 = objArray;
             }
             if (this.s == i) {
                obj3 = this.r.get(this.q);
                Objects.requireNonNull(obj3, str1);
                obj3 = obj3.mRecoReason;
             }else {
                objArray3 = objArray;
             }
             b ts = this.s;
             if (ts == str) {
                objArray = this.r.get(this.q);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Long");
             }else if(ts == i){
                HotSpotItem obj4 = this.r.get(this.q);
                Objects.requireNonNull(obj4, str1);
                obj4 = obj4.mWordId;
             }
             objArray2 = objArray;
             hotSpotItem = obj3;
             obj3 = obj2;
          label_00c1 :
             b uob = a.a.a();
             tq = this.s;
             if (tq == str) {
                str = "today";
             }else if(tq == i){
                str = "interest";
             }else {
                str = "";
             }
             String str2 = str;
             t ot = uob.a(objArray1, obj1, str2, objArray2, obj3, hotSpotItem).map(new e()).doOnNext(b$b.b);
             a.o(ot, "HotSpotApi.getService\(\).бн_SPOT, it.mLlsid\)\n      }");
             return ot;
          }
       }
       obj = objArray;
       objArray2 = obj;
       objArray3 = objArray2;
       hotSpotItem = objArray3;
       goto label_00c1 ;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       super.K1(p0);
       b tr = this.r;
       a.m(tr);
       int i = tr.size();
       if (this.hasMore() && i > 1) {
          b tq = this.q;
          if (tq < i && (tq == 1 && (this.getItems().isEmpty() || this.getItems().size() <= 1))) {
             this.load();
          }
       }
    label_003d :
       return;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(HomeFeedResponse p0,List p1){
       b tp;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (this.K()) {
          tp = this.p;
          tp = (tp == null || tp.isEmpty())? 1: null;
          if (tp) {
             if (p1 != null) {
                p1.add(0, this.t);
             }
          }else if(p1 != null){
             tp = this.p;
             a.m(tp);
             p1.addAll(0, tp);
          }
          tp = this.p;
          if (tp != null) {
             tp.clear();
          }
       }
    label_003f :
       if (HotSpotExperimentUtils.c()) {
          d.c(p1);
       }else if(this.q == null){
          QPhoto qPhoto = (p1 == null || p1.isEmpty())? 1: null;
          if (!qPhoto && TextUtils.n(p1.get(0).getPhotoId(), this.t.getPhotoId())) {
             p1.remove(0);
          }
       }
       tp = this.r;
       a.m(tp);
       int i = tp.size();
       if (!this.hasMore() && i > 1) {
          b tq = this.q;
          if (tq < (i - 1)) {
             this.q = tq + 1;
             this.R1(1);
          }
       }
       return;
    }
    public boolean i(){
       return false;
    }
    public void k(List p0){
       this.p = p0;
    }
}
