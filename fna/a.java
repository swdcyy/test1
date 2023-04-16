package fna.a;
import java.lang.Object;
import cra.c0;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.util.ArrayList;
import android.content.pm.PackageInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.pm.PackageManager;
import android.app.Application;
import java.lang.CharSequence;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

public final class a	// class@00296e
{
    public int a;
    public String b;
    public Drawable c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public c0 j;
    public c0 k;
    public c0 l;
    public List m;
    public List n;
    public List o;

    public void a(){
       super();
       this.b = "";
       this.d = "";
       this.e = "";
       Long longx = Long.valueOf(0);
       Boolean fALSE = Boolean.FALSE;
       GrowthCleanerTag uNDEFINED = GrowthCleanerTag.UNDEFINED;
       this.j = new c0(null, longx, fALSE, uNDEFINED);
       this.k = new c0(null, longx, fALSE, uNDEFINED);
       this.l = new c0(null, longx, fALSE, uNDEFINED);
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.o = new ArrayList();
    }
    public final void a(PackageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Application b = a.B;
       if (b != null) {
          PackageManager packageManag = b.getPackageManager();
          if (packageManag != null && p0 != null) {
             PackageInfo applicationI = p0.applicationInfo;
             if (applicationI != null) {
                this.b = applicationI.loadLabel(packageManag).toString();
                this.c = applicationI.loadIcon(packageManag);
                ApplicationInfo flags = applicationI.flags;
                boolean b1 = false;
                boolean b2 = (flags & 0x01)? true: false;
                this.f = b2;
                if (flags & 0x02) {
                   b1 = true;
                }
                this.i = b1;
                this.g = applicationI.uid;
             }
             PackageInfo packageName = p0.packageName;
             String str = "";
             if (packageName == null) {
                packageName = str;
             }
             this.d = packageName;
             p0 = p0.versionName;
             if (p0 != null) {
                str = p0;
             }
             this.e = str;
          }
       }
       return;
    }
}
