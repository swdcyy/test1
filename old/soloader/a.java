package old.soloader.a;
import old.soloader.e;
import android.content.Context;
import java.io.File;
import java.lang.String;
import android.os.Parcel;
import old.soloader.i;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import old.soloader.i$f;
import old.soloader.a$a;

public class a extends e	// class@002009
{
    public final int i;

    public void a(Context p0,File p1,String p2,int p3){
       super(p0, p2, p1, "^lib/\([^/]+\)/\([^/]+\\.so\)$");
       this.i = p3;
    }
    public byte[] g(){
       ApplicationInfo nativeLibrar;
       File canonicalFil = this.g.getCanonicalFile();
       Parcel parcel = Parcel.obtain();
       byte b = 2;
       parcel.writeByte(b);
       parcel.writeString(canonicalFil.getPath());
       parcel.writeLong(canonicalFil.lastModified());
       i tc = this.c;
       PackageManager packageManag = tc.getPackageManager();
       int i = 0;
       PackageInfo versionCode = (packageManag != null)? packageManag.getPackageInfo(tc.getPackageName(), i).versionCode: 0;
    }
    public i$f i(){
       return new a$a(this, this);
    }
}
