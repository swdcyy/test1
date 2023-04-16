package l02.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l02.a$b;
import nsd.u;
import l02.a$a;
import androidx.collection.LruCache;
import l02.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import io7.c;
import d61.g;
import java.util.LinkedList;
import l02.a$c;
import l02.a$d;
import kotlin.jvm.internal.a;
import v51.a;
import lp3.c;
import lp3.i;
import hf3.a;
import com.kuaishou.protobuf.livestream.nano.SCMultiLiveCommonAuthorInfo;
import lf3.g;
import l02.e;
import java.util.Iterator;
import java.lang.Iterable;
import l02.f;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import l02.e$a;
import pp.c;
import com.kuaishou.android.live.log.b;
import l02.d;
import java.util.Map;
import java.util.HashMap;

public class a extends PresenterV2 implements g	// class@002e4b
{
    public i p;
    public final LruCache q;
    public final LinkedList r;
    public final g s;
    public long t;
    public final e u;
    public static String sLivePresenterClassName = "LiveInteractiveUserTagPresenter";
    public static final c v;
    public static final a$b w;

    static {
       a.w = new a$b(null);
       a.v = a$a.b;
    }
    public void a(){
       super();
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): g.g().a("liveInteractiveUserTagCacheMaxCount", 50);
       this.q = new LruCache(i);
       this.r = new LinkedList();
       this.s = new a$c(this);
       this.u = new a$d(this);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          a.S("liveServiceManager");
       }
       c uoc = tp.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­nnectManager::class.java\)");
       uoc.u().u0(985, SCMultiLiveCommonAuthorInfo.class, this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          a.S("liveServiceManager");
       }
       c uoc = tp.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­nnectManager::class.java\)");
       uoc.u().o(985, this.s);
       this.r.clear();
       this.q.evictAll();
       return;
    }
    public final i P8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj;
    }
    public final e R8(){
       return this.u;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
    public final boolean V8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.x(p0);
    }
    public void W8(String p0,e$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       a.p(p0, "currentUserTag");
       b.Z(a.v, "showUserTagEditDialog, not support");
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.p = obj;
       return;
    }
}
