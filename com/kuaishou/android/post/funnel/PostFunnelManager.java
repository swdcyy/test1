package com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.android.post.funnel.PostFunnelManager$c;
import android.os.Looper;
import com.kuaishou.android.post.funnel.PostFunnelManager$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bizmonitor.framework.funnel.a;
import wkd.b;
import j80.c;
import java.io.File;
import lq.i;
import lq.l;
import v46.b;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import mu.k;
import mu.b;
import com.kuaishou.bizmonitor.framework.funnel.a$e;
import qkd.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import laa.m0;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.SessionContext;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.post.funnel.PostFunnelManager$recoverLocalFunnelAndUpload$1$2;
import msd.l;
import android.os.Handler;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kuaishou.android.post.funnel.PostFunnelManager$e;
import java.lang.Runnable;
import ekd.k1;
import lnc.p3;
import q87.c;
import com.kwai.feature.post.funnel.PostCommonFunnel;

public class PostFunnelManager	// class@000eb4
{
    public final String a;
    public final int b;
    public final long c;
    public long d;
    public boolean e;
    public final String f;
    public final Handler g;
    public final PostFunnelManager$d h;
    public static String i;
    public static final PostFunnelManager$a j;

    static {
       PostFunnelManager.j = new PostFunnelManager$a(null);
       PostFunnelManager.i = "";
    }
    public void PostFunnelManager(){
       super();
       this.a = "PostFunnelManager";
       this.c = 3000;
       this.f = "funnel";
       this.g = new PostFunnelManager$c(this, Looper.getMainLooper());
       this.h = new PostFunnelManager$d(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager.class, "1")) {
          return;
       }
       a.f().k(b.a(-1504323719).h(this.f));
       this.h();
       i.m().f(this.h);
       return;
    }
    public final boolean b(){
       return this.e;
    }
    public final void c(String p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager.class, "8")) {
          return;
       }
       a.p(p0, "fileDir");
       if (StringsKt__StringsKt.O2(PostFunnelManager.i, p0, false, 2, null)) {
          return;
       }
       String str = "";
       File uFile = a.f().g(str, uob, str);
       if (!uFile.exists()) {
          return;
       }
       a$e uoe = a.f().e(a.f().h(uob, str));
       if (uoe != null) {
          uoe.e = p0;
       }
       a.o(uFile, "srcFile");
       File uFile1 = new File(p0, uFile.getName());
       if (!uFile1.exists()) {
          b.W(uFile, uFile1);
       }
       p0 = uFile1.getAbsolutePath();
       a.o(p0, "dstFile.absolutePath");
       PostFunnelManager.i = p0;
       return;
    }
    public final b d(){
       k ok;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, PostFunnelManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(PostFunnelManager.i)) {
          ok = a.f().h(uob, "");
          a.o(ok, "FunnelManager.getInstanc¡­stFunnel::class.java, \"\"\)");
          return ok;
       }else {
          ok = a.f().i(PostFunnelManager.i, uob, "");
          a.o(ok, "FunnelManager.getInstanc¡­stFunnel::class.java, \"\"\)");
          return ok;
       }
    }
    public final void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager.class, "7")) {
          return;
       }
       a.p(p0, "draft");
       File uFile = p0.f0();
       a.o(uFile, "draft.rootDirectory");
       a.f().j(uFile.getAbsolutePath(), b.class, "", true).j();
       a.f().k(b.a(-1504323719).h(this.f));
       Workspace workspace = p0.v();
       if (workspace != null) {
          SessionContext sessionConte = workspace.getSessionContext();
          a.o(sessionConte, "it.sessionContext");
          List historyTaskI = sessionConte.getHistoryTaskIdList();
          if (!q.f(historyTaskI)) {
             StringBuilder str = "[";
             a.o(historyTaskI, "list");
             int i = 0;
             Iterator iterator = historyTaskI.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                SessionContext sessionConte1 = workspace.getSessionContext();
                a.o(sessionConte1, "it.sessionContext");
                int i2 = sessionConte1.getHistoryTaskIdList().size() - true;
                str = (i == i2)? str+obj+"]": str+obj+",";
                i = i1;
             }
             this.d().l(new PostFunnelManager$recoverLocalFunnelAndUpload$1$2(str));
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager.class, "6")) {
          return;
       }
       this.g.removeMessages(this.b);
       if (i.h()) {
          i.m().U(this.h);
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager.class, "5")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       if (!uActivityCon.h()) {
          this.g.removeMessages(this.b);
          this.e = true;
          return;
       }else {
          this.e = false;
          k1.o(new PostFunnelManager$e(this));
          return;
       }
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager.class, "2")) {
          return;
       }
       this.i();
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w(this.a, "triggerAutoSave", objArray);
       PostCommonFunnel.b.a();
       a.f().d(this.d());
       this.g();
       return;
    }
}
