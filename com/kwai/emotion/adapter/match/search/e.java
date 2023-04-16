package com.kwai.emotion.adapter.match.search.e;
import qvb.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ak5.j;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import qvb.n0;
import com.kwai.emotion.adapter.match.search.GifEmotionResponse;
import java.util.Objects;
import java.lang.Integer;
import lk5.b;
import lk5.a;
import cjd.e;
import erd.o;
import com.kwai.emotion.adapter.match.search.d;
import erd.g;
import com.kwai.emotion.adapter.match.search.b;
import cjd.a;
import io.reactivex.internal.functions.Functions;
import com.kwai.emotion.adapter.match.search.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.a;

public class e extends f	// class@000d6a
{
    public String p;
    public boolean q;
    public int r;
    public static final int s;

    public void e(boolean p0,int p1){
       super();
       this.q = p0;
       this.r = p1;
    }
    public t I1(){
       int i1;
       int i2;
       t ot;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.apply(null, this, uoe, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.o();
       String id = QCurrentUser.me().getId();
       e tp = this.p;
       j obj1 = PatchProxy.apply(null, this, uoe, "5");
       int i = 0;
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else if(this.K()){
          i2 = 0;
       label_0042 :
          e tr = this.r;
          Objects.requireNonNull(obj);
          obj1 = j.class;
          if (PatchProxy.isSupport(obj1)) {
             Object[] objArray = new Object[]{"n/emotion/search/weshine",id,tp,Integer.valueOf(i2),Integer.valueOf(tr)};
             ot = PatchProxy.apply(objArray, obj, obj1, "33");
             if (ot != patchProxyRe) {
             label_0081 :
                ot = ot.map(new e()).map(d.b);
                a uoa = PatchProxy.apply(null, this, uoe, "6");
                if (uoa != patchProxyRe) {
                }else if(!this.K() || this.p != null){
                   uoa = Functions.d();
                }else {
                   uoa = a.a(b.b);
                }
                return ot.doOnNext(uoa).onErrorResumeNext(new c(this));
             }
          }
          ot = b.b().a().j("n/emotion/search/weshine", id, tp, i2, tr);
          goto label_0081 ;
       }else {
          i1 = this.L0().mOffset;
       }
       i2 = i1;
       goto label_0042 ;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.release();
       this.a();
       return;
    }
    public void i2(String p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       if (TextUtils.n(p0, this.p)) {
          return;
       }
       this.release();
       this.p = p0;
       if (TextUtils.x(p0) && this.q == null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uoe, "3")) {
             this.p = objArray;
             this.release();
             this.clear();
             this.T1(false);
          }
       }else {
          this.a();
       }
       return;
    }
}
