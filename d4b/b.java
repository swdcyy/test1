package d4b.b;
import d4b.a;
import d4b.b$a;
import nsd.u;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.MagicEmoji;
import d4b.a$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.List;
import java.lang.System;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.HashMap;
import java.util.ArrayList;
import d4b.c;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import d4b.d;
import erd.o;
import d4b.e;
import t45.d;
import d4b.f;
import d4b.g;
import erd.g;
import crd.b;

public final class b implements a	// class@00242a
{
    public final MagicBusinessId a;
    public final a$a b;
    public final MagicEmoji c;
    public long d;
    public boolean e;
    public static final ExecutorService f;
    public static final b$a g;

    static {
       b.g = new b$a(null);
       b.f = c.f("MagicLocalRepository");
    }
    public void b(MagicBusinessId p0,MagicEmoji p1,a$a p2){
       a.p(p0, "businessId");
       a.p(p1, "emoji");
       a.p(p2, "listener");
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       if (this.e != null) {
          this.d = k1.i();
       }
       return;
    }
    public void n(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       b tc = this.c;
       int i = 0;
       String str = "MagicLocalRepository";
       if (tc.mNoMore != null || tc.mTabType == 6) {
          Object[] objArray1 = new Object[i];
          b.D().A(str, "noMore: "+this.c.mName+"  lastIndex: "+this.c.mLoadIndex, objArray1);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uob, "3") || this.e != null){
          b = true;
          this.e = b;
          this.d = 0;
          Object[] objArray2 = new Object[i];
          b.D().w(str, "requestAndSaveData: "+this.c.mName+" lastIndex: "+this.c.mLoadIndex, objArray2);
          Ref$IntRef intRef = new Ref$IntRef();
          tc = this.c;
          int i1 = tc.mLoadIndex + 75;
          intRef.element = i1;
          if (i1 > tc.mMagicFaces.size()) {
             intRef.element = this.c.mMagicFaces.size();
          }
          b tc1 = this.c;
          if (intRef.element <= tc1.mLoadIndex) {
             tc1.mNoMore = b;
          }else {
             this.b.onLoading();
             System.currentTimeMillis();
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = new HashMap();
             Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
             objectRef1.element = new HashMap();
             Ref$ObjectRef objectRef2 = new Ref$ObjectRef();
             objectRef2.element = new ArrayList();
             ExecutorService f = b.f;
             t.fromCallable(new c(this, objectRef2, intRef, objectRef1)).subscribeOn(b.b(f)).flatMap(new d(this, objectRef, objectRef1)).observeOn(b.b(f)).map(new e(this, intRef, objectRef2, objectRef)).observeOn(d.a).subscribe(new f(this), new g(this));
          }
       }
       return;
    }
}
