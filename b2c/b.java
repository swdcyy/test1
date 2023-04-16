package b2c.b;
import com.yxcorp.download.k;
import b2c.a;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.yxcorp.download.b;
import b2c.a$b;
import o56.c;
import o56.a;
import android.app.Application;
import java.io.File;
import android.content.Context;
import qkd.a;
import java.lang.Throwable;
import android.content.res.Resources;
import java.lang.Long;
import java.lang.StringBuilder;

public final class b extends k	// class@000397
{
    public final a c;

    public void b(a p0){
       this.c = p0;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "task");
       g.e(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask canceled");
       this.c.d = false;
       p0.removeListener(this);
       a e = this.c.e;
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, "task.targetFilePath");
          e.a(tarFilePath);
       }
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.p(p0, "task");
       g.e(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask completed");
       this.c.d = false;
       p0.removeListener(this);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       a.c(uoc.a(), new File(p0.getTargetFilePath()));
       a e = this.c.e;
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, "task.targetFilePath");
          e.b(tarFilePath, 100);
       }
       e = this.c.e;
       if (e != null) {
          String tarFilePath1 = p0.getTargetFilePath();
          a.o(tarFilePath1, "task.targetFilePath");
          e.e(tarFilePath1);
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       a e;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "e");
       g.d(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask error", p1);
       p1.d = false;
       p0.removeListener(this);
       e = this.c.e;
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, "task.targetFilePath");
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          String str = uApplication.getResources().getString(R.string.arg_RES_7f10160f);
          a.o(str, "AppEnv.getAppContext\(\).r¡­_failed_please_try_again\)");
          e.c(tarFilePath, str);
       }
       return;
    }
    public void g(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "task");
       g.d(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask low storage", null);
       this.c.d = false;
       p0.removeListener(this);
       a e = this.c.e;
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, "task.targetFilePath");
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          String str = uApplication.getResources().getString(R.string.arg_RES_7f1030f3);
          a.o(str, "AppEnv.getAppContext\(\).r¡­\(R.string.low_disk_space\)");
          e.c(tarFilePath, str);
       }
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, b.class, "6")) {
          return;
       }
       a.p(p0, "task");
       if (!p2) {
          return;
       }
       int i = (int)((p1 * (long)100) / p2);
       g.e(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask progress: "+i);
       a e = this.c.e;
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, "task.targetFilePath");
          e.b(tarFilePath, i);
       }
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "task");
       g.e(KsLogProfileTag.BG_DOWNLOAD.appendTag(a.g), "DownloadTask start");
       b tc = this.c;
       tc.d = true;
       a e = tc.e;
       String str = "task.targetFilePath";
       if (e != null) {
          String tarFilePath = p0.getTargetFilePath();
          a.o(tarFilePath, str);
          e.d(tarFilePath);
       }
       e = this.c.e;
       if (e != null) {
          String tarFilePath1 = p0.getTargetFilePath();
          a.o(tarFilePath1, str);
          e.b(tarFilePath1, 0);
       }
       return;
    }
}
