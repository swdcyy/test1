package com.kwai.user.base.intimate.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import crd.b;
import wkd.b;
import xu7.a;
import brd.t;
import cjd.e;
import erd.o;
import yu7.a;
import erd.g;

public class b	// class@001991
{
    public IntimateResponse a;
    public final List b;

    public void b(){
       super();
       this.b = new CopyOnWriteArrayList();
    }
    public final List a(){
       return this.b;
    }
    public IntimateRelationInfo b(int p0){
       Iterator obj;
       IntimateRelationInfo intimateRela;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          intimateRela = obj.next();
          if (intimateRela.mType == p0) {
             break ;
          }
       }
       return intimateRela;
    }
    public IntimateRelationInfo c(int p0){
       Iterator obj;
       IntimateRelationInfo intimateRela;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return IntimateRelationInfo.DEFAULT();
          }
          intimateRela = obj.next();
          if (intimateRela.mType == p0) {
             break ;
          }
       }
       return intimateRela;
    }
    public b d(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-312968496).b().map(new e()).doOnNext(new a(this)).subscribe();
    }
}
