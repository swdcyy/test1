package cz2.b$a;
import cz2.d;
import cz2.b;
import java.lang.Object;
import pz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pz2.i;
import cz2.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kz2.a;
import hz2.c;
import java.lang.Boolean;
import hz2.b;
import java.util.Map;
import hz2.a;
import hz2.b$a;
import fg6.a;
import iz2.a;
import com.google.gson.Gson;
import zy2.a;
import java.util.Set;
import java.lang.Integer;

public final class b$a implements d	// class@00240b
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "5")) {
          return;
       }
       a.p(p0, "renderTask");
       b k = this.a.k;
       if (k != null) {
          k.a(p0);
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       b k = this.a.k;
       if (k != null) {
          k.b(p0);
       }
       return;
    }
    public void c(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "reason");
       b k = this.a.k;
       if (k != null) {
          k.c(p0, p1);
       }
       return;
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "4")) {
          return;
       }
       a.p(p0, "task");
       if (b.V2(this.a) != null && (!TextUtils.x(p0.getExtraInfo()) && !p0.E())) {
          b.S(this.a.j, "[onEffectRenderStarted] ", "localRender ExtraInfo", p0.getExtraInfo());
          b.V2(this.a).C0(p0, p0.getExtraInfo());
          if (p0 instanceof a) {
             a uoa = p0;
             b.V2(this.a).C0(p0, uoa.K());
             b.S(this.a.j, "[onEffectRenderStarted]", "jsonStringToYtech", uoa.K());
          }
       }
       b k = this.a.k;
       if (k != null) {
          k.e(p0);
       }
       return;
    }
    public void g(c p0,boolean p1,String p2,c p3){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, b$a.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.p(p3, "renderRecord");
       b k = this.a.k;
       if (k != null) {
          k.d(p0, p1, p2);
       }
       if (p1) {
          b.a.a(p3, this.a.q.a());
       }
       return;
    }
    public void onReceivedEffectEvent(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "6")) {
          return;
       }
       a.p(p1, "eventJson");
       Object obj = a.a.h(p1, a.class);
       a.o(obj, "Gsons.KWAI_GSON.fromJson¡­omSdk::class.java\n      \)");
       if (obj == null) {
          b.r(this.a.j, "[onReceivedEffectEvent] onReceivedEffectEvent message is null");
          return;
       }else if(p0 == null){
          b.P(this.a.j, "[onReceivedEffectEvent] effectTask is null");
          return;
       }else if(obj.mRequestType == 3010 && this.a.p.H() == p0){
          this.a.p.D();
          b.P(this.a.j, "[onReceivedEffectEvent] renderingTask === effectTask");
          return;
       }else if(obj.mRequestType == 3008 && (p0 instanceof a && (p0.E() == 1 && b.V2(this.a) != null))){
          b.V2(this.a).C0(p0, p0.getExtraInfo());
          a uoa = p0;
          b.V2(this.a).C0(p0, uoa.K());
          b.S(this.a.j, "[onEffectRenderStarted]", "jsonStringToYtech", uoa.K());
       }
    label_009d :
       if (!p0.C().contains(Integer.valueOf(obj.mRequestType))) {
          b.P(this.a.j, "[onReceivedEffectEvent] effectTask cannot handle ReqType");
          return;
       }else {
          p0.g(p1, obj.mRequestType);
          return;
       }
    }
}
