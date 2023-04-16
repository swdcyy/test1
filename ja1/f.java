package ja1.f;
import java.lang.Object;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.UUID;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class f	// class@002a6b
{
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String[] e;
    public String f;
    public String g;
    public DownloadTask$DownloadTaskType h;
    public boolean i;
    public String j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public long q;
    public long r;

    public void f(){
       super();
       this.h = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.k = -1;
       this.l = true;
       this.m = true;
       this.n = "";
       this.o = "undefined";
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.p = str;
    }
    public void f(u p0){
       super();
       this.h = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.k = -1;
       this.l = true;
       this.m = true;
       this.n = "";
       this.o = "undefined";
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.p = str;
    }
    public final String a(){
       return this.f;
    }
    public final String b(){
       return this.j;
    }
    public final String c(){
       return this.o;
    }
    public final String d(){
       return this.d;
    }
    public final String e(){
       return this.a;
    }
    public final String f(){
       return this.n;
    }
    public final boolean g(){
       return this.m;
    }
    public final boolean h(){
       return this.c;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.o = p0;
       return;
    }
    public final void j(boolean p0){
       this.m = p0;
    }
}
