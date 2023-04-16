package i91.j;
import ht.c;
import java.util.List;
import java.lang.String;
import kt.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import jw4.a;
import i91.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lt.b;
import i91.k;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Float;
import kt.a;
import w51.a;
import z1.a;
import i91.j$a;
import java.lang.Runnable;
import ekd.k1;

public final class j implements c	// class@002865
{
    public c a;
    public b b;
    public final List c;

    public void j(List p0,String p1,c p2){
       a.p(p0, "mLogTags");
       a.p(p1, "aryaSign");
       a.p(p2, "param");
       super();
       this.c = p0;
       a uoa = m.a(p1);
       k ok = PatchProxy.apply(null, this, j.class, "16");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(this);
       }
       c uoc = uoa.d(p2, ok);
       this.a = uoc;
       b.S(p0, "create audio player engine", "player instance : ", uoc);
       return;
    }
    public int a(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       oj = this.a;
       p0 = (oj != null)? oj.a(p0): -1;
       return p0;
    }
    public boolean b(){
       j obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public void c(float p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oj, "6")) {
          return;
       }
       oj = this.a;
       if (oj != null) {
          oj.c(p0);
       }
       return;
    }
    public int d(){
       j obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.d(): -1;
       return i;
    }
    public int e(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       oj = this.a;
       p0 = (oj != null)? oj.e(p0): -1;
       return p0;
    }
    public int f(){
       j obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.f(): -1;
       return i;
    }
    public boolean g(int p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       oj = this.a;
       boolean b = (oj != null)? oj.g(p0, p1): false;
       return b;
    }
    public String getSessionId(){
       String sessionId;
       j obj = PatchProxy.apply(null, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          sessionId = obj.getSessionId();
          if (sessionId != null) {
          label_001d :
             return sessionId;
          }
       }
       sessionId = "";
       goto label_001d ;
    }
    public boolean h(){
       j obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null)? obj.h(): false;
       return b;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "14")) {
          return;
       }
       a.p(p0, "aryaPlayerAudioBuffer");
       if (a.A()) {
          return;
       }
       j ta = this.a;
       if (ta != null) {
          ta.i(p0);
       }
       return;
    }
    public boolean isPlaying(){
       j obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null)? obj.isPlaying(): false;
       return b;
    }
    public final void j(Object p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       k1.p(new j$a(p1, p0), this);
       return;
    }
    public final void k(boolean p0,String p1){
       j ta;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "15")) {
          return;
       }
       if (p0) {
          ta = this.a;
          if (ta != null) {
             ta.stopPlay();
          }
       }
       b.T(this.c, "innerReleaseAudioPlayer", "releaseReason ", p1, "player instance : ", this.a);
       ta = this.a;
       if (ta != null) {
          ta.release();
       }
       this.a = null;
       return;
    }
    public final void l(b p0){
       this.b = p0;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "12")) {
          return;
       }
       this.b = objArray;
       this.k(true, " real release ");
       k1.n(this);
       return;
    }
    public boolean startPlay(){
       j obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.A()) {
          return b;
       }
       obj = this.a;
       if (obj != null) {
          b = obj.startPlay();
       }
       return b;
    }
    public boolean stopPlay(){
       j obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null)? obj.stopPlay(): false;
       return b;
    }
}
