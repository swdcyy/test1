package a.a.a.a.b.a.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import android.os.ConditionVariable;
import a.a.a.a.b.a.b$c;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.lang.String;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Build;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import com.middleware.security.MXSec;
import m.c;
import x38.b;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import a.a.a.a.b.a.b$a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import f.g;
import f.i;
import com.kuaishou.security.kste.export.KSTEResult;
import a.a.a.a.b.a.b$b;
import a.a.a.a.b.a.c$a;
import com.kuaishou.security.kste.export.KSTEResult$Code;
import d.c;
import a.a.a.a.b.e.b$b;
import a.a.a.a.b.e.b;
import java.util.concurrent.ConcurrentHashMap;
import f.m$a;
import java.util.Iterator;
import java.io.File;
import f.m;
import java.util.concurrent.ScheduledFuture;
import com.kuaishou.security.kste.export.InvokeCallback;
import android.util.Base64;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import f.k;
import a.a.a.a.b.a.c;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.HashMap;
import f.l;
import a.a.a.a.b.f.a$a;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public class b	// class@00000d
{
    public InitCommonKSTEParams a;
    public HostAppInfoService b;
    public String c;
    public List d;
    public k e;
    public List f;
    public List g;
    public SecKSTEDidProxy h;
    public ReentrantLock i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ConditionVariable m;
    public Lock n;
    public ConditionVariable o;
    public ConditionVariable p;
    public int q;
    public int r;

    public void b(){
       super();
       this.d = Collections.synchronizedList(new ArrayList());
       this.f = new ArrayList();
       this.g = Collections.synchronizedList(new ArrayList());
       this.i = new ReentrantLock();
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = null;
       this.n = null;
       this.o = null;
       this.p = null;
       this.q = 0;
       this.r = 1;
       this.o = new ConditionVariable(false);
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = new ConditionVariable(false);
       this.n = new ReentrantLock();
       this.p = new ConditionVariable(false);
    }
    public static b b(){
       return b$c.a;
    }
    public static InitCommonKSTEParams d(b p0){
       return p0.a;
    }
    public static boolean e(b p0,boolean p1){
       p0.k = p1;
       return p1;
    }
    public static ConditionVariable f(b p0){
       return p0.o;
    }
    public static boolean h(b p0,boolean p1){
       p0.j = p1;
       return p1;
    }
    public static ConditionVariable i(b p0){
       return p0.p;
    }
    public static String j(b p0){
       return p0.c;
    }
    public static List k(b p0){
       return p0.f;
    }
    public static List m(b p0){
       return p0.d;
    }
    public static List o(b p0){
       return p0.g;
    }
    public int a(InitCommonKSTEParams$Builder p0){
       b tq = this.q;
       if (this.j != null) {
          return tq;
       }
       this.m.open();
       this.k = true;
       InitCommonKSTEParams initCommonKS = p0.build();
       this.a = initCommonKS;
       if (initCommonKS.didProxy() != null) {
          this.h = this.a.didProxy();
       }
       m$c.b("current process running on "+System.getProperty("os.arch")+" "+Build.CPU_ABI2+" "+this.a.initMode()+" did="+this.h.getNewDid());
       KSTEContext$Mode sYNC = KSTEContext$Mode.SYNC;
       if (this.a.initMode() == sYNC) {
          this.p.close();
       }
       MXSec.get().setKSTEWrapper(new c());
       KSTEContext.ksteThreadPool.execute(new b$a(this));
       if (this.a.initMode() == sYNC) {
          m$c.b("will waiting for sync init");
          this.p.block();
          m$c.b("waiting for sync init finish");
       }
       m$c.b("kwlog fetch config over");
       return true;
    }
    public KSTEResult c(g p0,String p1,i p2){
       String str;
       byte[] uobyteArray;
       KSTEResult kSTEResult;
       this.i.lock();
       i j = p2.j;
       if (j == null || (j != null && p2.l == null)) {
          m$c.b(p0.j()+" isLoaded: "+p2.j+" updateRetry:"+p2.l);
          p2.k.close();
          ConditionVariable uConditionVa = new ConditionVariable();
          b$b uob = new b$b(this, p0, p1, p2, uConditionVa);
          KSTEContext.ksteThreadPool.execute(v8);
          uConditionVa.block();
          p1 = p0.j();
          str = " do single fetch bc finish";
       }else {
          m$c.b(p0.j()+" do single blocking");
          p2.k.block();
          p1 = p0.j();
          str = " do single block finish";
       }
       m$c.b(p1+str);
       this.i.unlock();
       int i = 0;
       if (p2.m == c$a.b) {
          uobyteArray = new byte[i];
          kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_OFFLINE, uobyteArray);
       }else if(p2.i != null && p2.j != null){
          m$c.b(p0.j()+" do single invoke");
          kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_OK, c.a(p0.j(), p0.d(), p0.f()));
       }else {
          m$c.d(p0.j()+" can not perform invoke function");
          b.a(b$b.a, "SEC_ERROR_BC_INVOKE_FUNCTION_ERROR "+p2.a+"loadFinishStatus:"+p2.i+" isDoLoaded: "+p2.j, 202);
          uobyteArray = new byte[i];
          kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_FAIL, uobyteArray);
       }
       return kSTEResult;
    }
    public final KSTEResult g(g p0){
       String str = p0.g();
       int i = 0;
       byte[] uobyteArray = new byte[i];
       KSTEResult kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_FAIL, uobyteArray);
       if (!this.t()) {
          b.a(b$b.a, "SEC_INVOKEFUCTION_KSTEINIT_ERROR "+p0.j(), 210);
          return kSTEResult;
       }else {
          String str1 = null;
          ConcurrentHashMap d = m$f.d;
          if (d.size() > 0) {
             str1 = d.get(p0.g());
          }
          m$c.b("invoke function begin working");
          Iterator iterator = this.g.iterator();
          StringBuilder str2 = null;
          while (iterator.hasNext()) {
             i oi = iterator.next();
             if ((oi.a).equals(p0.j())) {
                m$c.b("bitcode object is exists in bcpluginstatus "+oi);
                if (oi.m == c$a.b) {
                   byte[] uobyteArray1 = new byte[i];
                   kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_OFFLINE, uobyteArray1);
                }else {
                   i i1 = oi.i;
                   if (i1 != null && oi.j != null) {
                      kSTEResult = new KSTEResult(KSTEResult$Code.INVOKE_OK, c.a(oi.a, p0.d(), p0.f()));
                   }else if(oi.j != null && i1 == null){
                      if (!new File(oi.h).exists()) {
                         m$c.d("bitcode file is not exitst");
                         b.a(b$b.a, "SEC_ERROR_BC_CACHE_FILE_NOT_EXISTS "+oi.a+"¡¾"+oi.h+"¡¿", 203);
                      }
                   }else {
                      kSTEResult = this.c(p0, str, oi);
                   }
                }
                str2 = 1;
             }
          }
          if (str2 == null) {
             m$c.b("bitcode object not exists in bcpluginstatus we will create new bcHistory");
             i oi1 = new i();
             oi1.h(p0.j());
             oi1.l = i;
             oi1.b(c$a.c);
             this.g.add(oi1);
             kSTEResult = this.c(p0, str, oi1);
          }
          if (p0.h() - -1 > 0) {
             m om = str1.d();
             m$f.d.remove(p0.g());
             if (om.a().isDone()) {
                m$c.b("The timer has expired");
             }else {
                m$c.b("The timer in-process is running");
                om.a().cancel(true);
                KSTEResult$Code iNVOKE_OK = KSTEResult$Code.INVOKE_OK;
                if (kSTEResult.getRetCode() == iNVOKE_OK) {
                   p0.c().onResult(iNVOKE_OK, kSTEResult.getResult());
                }else {
                   byte[] uobyteArray2 = new byte[i];
                   p0.c().onResult(kSTEResult.getRetCode(), uobyteArray2);
                }
             }
             str1.e(true);
          }
          if (!kSTEResult.getResult().length) {
             m$c.d("invoke result is empty");
             b.a(b$b.a, "SEC_ERROR_INVOKE_RESULT_EMPTY "+p0.j()+"input["+Base64.encodeToString(p0.d(), i)+"]", 126);
          }
          return kSTEResult;
       }
    }
    public InitCommonKSTEParams l(){
       return this.a;
    }
    public String n(){
       String str = "";
       b th = this.h;
       if (th != null) {
          str = th.getNewDid();
       }
       if (TextUtils.isEmpty(str)) {
          return this.r().did();
       }else {
          return str;
       }
    }
    public List p(){
       return this.d;
    }
    public k q(){
       return this.e;
    }
    public InitCommonKSTEParams r(){
       return this.a;
    }
    public void s(){
       HashMap hashMap;
       l ol;
       String str2;
       File uFile;
       l ol1;
       File uFile1;
       String str = "";
       String str1 = KSTEContext.mkv.a(c.j0, str);
       this.c = str1;
       a$a uoa = null;
       int i = 1;
       if (!TextUtils.isEmpty(str1) && !(this.c).equals("[]")) {
          try{
             JSONArray jSONArray = new JSONArray(this.c);
             if (jSONArray.length() > 10) {
                b tc = this.c;
                this.c = str;
                KSTEContext.mkv.c(c.j0, str);
                b.a(b$b.a, "SEC_BCVERS_CACHE_REPEAT "+tc, 127);
             }else {
                int i1 = 0;
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                   JSONObject jSONObject = jSONArray.getJSONObject(i2);
                   i oi = new i();
                   oi.h(jSONObject.optString(c.k0, str));
                   oi.f(jSONObject.optInt(c.l0, i1));
                   oi.d(jSONObject.optInt(c.m0, i1));
                   oi.a(jSONObject.optInt(c.n0, 32));
                   oi.c(jSONObject.optString(c.o0, str));
                   oi.e(jSONObject.optString(c.p0, str));
                   oi.g(jSONObject.optString(c.q0, str));
                   oi.b(c$a.a(jSONObject.optInt(c.r0, i)));
                   if (!(oi.j()).isEmpty()) {
                      File uFile2 = new File(oi.j());
                      if (uFile2.exists() && uFile2.length() - uoa > 0) {
                         this.d.add(oi);
                      }
                   }else {
                      b.a(b$b.a, "SEC_PRE_SP_BC_FILE_NOT_EXISTS ", 218);
                   }
                   i2 = i2 + 1;
                }
             }
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
       }
    }
    public boolean t(){
       String str;
       b$b a;
       int i2;
       if (this.j == null) {
          if (this.k == null) {
             this.m.block();
          }
          this.o.block();
       }
       if (this.j == null) {
          this.n.lock();
          if (this.l == null) {
             this.l = true;
             this.m.close();
             this.o.close();
             this.u();
             int i = 0;
             while (this.j == null) {
                this.u();
                int i1 = i + 1;
                if (i > 5) {
                   break ;
                }
                i = i1;
             }
             if (this.j != null) {
                str = "kste initialize retry success";
                m$c.d(str);
                a = b$b.a;
                i2 = 122;
             }else {
                str = "kste initialize retry failure";
                m$c.d(str);
                a = b$b.a;
                i2 = 123;
             }
             b.a(a, str, i2);
          }
          this.n.unlock();
       }
       return this.j;
    }
    public final void u(){
       m$c.b("retry Init kste sdk begin");
       m$c.b("retry Init kste SDK ret="+this.a(this.a.toBuilder().initMode(KSTEContext$Mode.SYNC)));
       return;
    }
}
