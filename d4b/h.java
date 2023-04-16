package d4b.h;
import d4b.a;
import d4b.h$a;
import nsd.u;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import d4b.a$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.HashMap;
import java.lang.System;
import d4b.i;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import d4b.j;
import erd.o;
import java.util.concurrent.TimeUnit;
import d4b.k;
import t45.d;
import d4b.l;
import d4b.m;
import erd.g;
import crd.b;

public final class h implements a	// class@002431
{
    public final MagicBusinessId a;
    public final a$a b;
    public final MagicEmoji c;
    public final MagicEmojiPageConfig d;
    public long e;
    public boolean f;
    public static final ExecutorService g;
    public static final h$a h;

    static {
       h.h = new h$a(null);
       h.g = c.f("MagicRepository");
    }
    public void h(MagicBusinessId p0,MagicEmoji p1,MagicEmojiPageConfig p2,a$a p3){
       a.p(p0, "businessId");
       a.p(p1, "emoji");
       a.p(p3, "listener");
       super();
       this.a = p0;
       this.b = p3;
       this.c = p1;
       this.d = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       if (this.f != null) {
          this.e = k1.i();
       }
       return;
    }
    public void n(){
       Object[] objArray1;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       h tc = this.c;
       String str = "MagicRepository";
       if (tc.mNoMore != null || tc.mTabType == 6) {
          objArray1 = new Object[0];
          b.D().w(str, "noMore: "+this.c.mName+"  lastIndex: "+this.c.mLoadIndex, objArray1);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oh, "3") || this.f != null){
          this.f = true;
          this.e = 0;
          this.b.onLoading();
          objArray1 = new Object[0];
          b.D().w(str, "requestPageAndSaveData: "+this.c.mName, objArray1);
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = new HashMap();
          System.currentTimeMillis();
          ExecutorService g = h.g;
          t.fromCallable(new i(this, objectRef)).subscribeOn(b.b(g)).flatMap(new j(this)).timeout(15, TimeUnit.SECONDS).observeOn(b.b(g)).map(new k(this, objectRef)).observeOn(d.a).subscribe(new l(this), new m(this));
       }
       return;
    }
}
