package m64.a;
import is3.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.util.Map;
import java.lang.Boolean;
import java.util.Iterator;
import hs3.a;
import js3.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import hs3.c;
import com.kuaishou.merchant.api.live.sandeabiz.LiveAnchorSandeaBizService;
import android.text.TextUtils;

public abstract class a implements a	// class@003423
{
    public Map a;
    public Map b;
    public Map c;
    public Map d;
    public List e;
    public LiveAnchorSandeaBizService f;

    public void a(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new HashMap();
       this.c = new ConcurrentHashMap();
       this.d = new HashMap();
       this.e = new ArrayList();
    }
    public void A(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       this.e.clear();
       if (!q.f(p0)) {
          this.e.addAll(p0);
       }
       return;
    }
    public void B(String p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "13")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, null, this, uoa, "3")) {
          a.u(MerchantLiveLogBiz.LIVE_SANDEAGO, "BaseSandeaManager", "setCurrentSandeago", "liveStreamId", p0, "sandeaId", null);
          this.c.remove(p0);
       }
       return;
    }
    public void b(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 == this.x(p0)) {
          return;
       }
       a.u(MerchantLiveLogBiz.LIVE_SANDEAGO, "BaseSandeaManager", "setModeSwitch", "liveStreamId", p0, "isOpened", Boolean.valueOf(p1));
       this.a.put(p0, Boolean.valueOf(p1));
       _monitor_enter(this);
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "8")) {
          _monitor_exit(this);
       }else if(this.b.containsKey(p0)){
          Iterator iterator = this.b.get(p0).iterator();
          while (iterator.hasNext()) {
             iterator.next().C4(p0, p1);
          }
       }
       _monitor_exit(this);
       return;
    }
    public List d(){
       return this.e;
    }
    public void e(String p0,a p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "12")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       p1.a = p2.a;
       p1.b = p2.b;
       p1.c = p2.c;
       if (!TextUtils.x(p0)) {
          p1.d = this.x(p0);
       }
       if (p1.d != null && p1.b == null) {
          p1.d = false;
          if (!TextUtils.x(p0)) {
             this.b(p0, false);
          }
          this.B(p0);
       }
       return;
    }
    public void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       a.u(MerchantLiveLogBiz.LIVE_SANDEAGO, "BaseSandeaManager", "setCurrentSandeago", "liveStreamId", p0, "sandeaId", p1);
       if (p1 == null) {
          this.c.remove(p0);
       }else {
          this.c.put(p0, p1);
       }
       return;
    }
    public String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get(p0);
    }
    public synchronized void i(String p0,c p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "7")) {
          return;
       }
       if (this.d.get(p0) != null && this.d.get(p0) == p1) {
          this.d.remove(p0);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "10") && this.b.containsKey(p0)) {
          this.b.get(p0).remove(p1);
       }
       this.a.remove(p0);
       return;
    }
    public synchronized void k(String p0,c p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
          return;
       }
       this.d.put(p0, p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "9")) {
          if (!this.b.containsKey(p0)) {
             this.b.put(p0, new ArrayList());
          }
          this.b.get(p0).add(p1);
       }
       return;
    }
    public LiveAnchorSandeaBizService o(){
       return this.f;
    }
    public void p(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (this.b.containsKey(p0)) {
          this.b.get(p0).remove(p1);
       }
       return;
    }
    public void q(LiveAnchorSandeaBizService p0){
       this.f = p0;
    }
    public void s(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       if (!this.b.containsKey(p0)) {
          this.b.put(p0, new ArrayList());
       }
       this.b.get(p0).add(p1);
       return;
    }
    public boolean u(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.g(p0)) ^ 0x01);
    }
    public boolean x(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.containsKey(p0))? this.a.get(p0).booleanValue(): false;
       return b;
    }
}
