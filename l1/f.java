package l1.f;
import java.lang.String;
import java.lang.CharSequence;
import android.os.Bundle;
import java.util.Set;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import android.app.RemoteInput;
import android.app.RemoteInput$Builder;
import android.os.Build$VERSION;
import l1.f$a;

public final class f	// class@0024f4
{
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public void f(String p0,CharSequence p1,CharSequence[] p2,boolean p3,int p4,Bundle p5,Set p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       if (this.g() != 2 || this.d()) {
          return;
       }
       throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
    }
    public static RemoteInput a(f p0){
       RemoteInput$Builder uBuilder = new RemoteInput$Builder(p0.j()).setLabel(p0.i()).setChoices(p0.f()).setAllowFreeFormInput(p0.d()).addExtras(p0.h());
       if (Build$VERSION.SDK_INT >= 29) {
          uBuilder.setEditChoicesBeforeSending(p0.g());
       }
       return uBuilder.build();
    }
    public static RemoteInput[] b(f[] p0){
       if (p0 == null) {
          return null;
       }
       RemoteInput[] remoteInputA = new RemoteInput[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          remoteInputA[i] = f.a(p0[i]);
       }
       return remoteInputA;
    }
    public static f c(RemoteInput p0){
       f$a uoa = new f$a(p0.getResultKey());
       uoa.f(p0.getLabel());
       uoa.d(p0.getChoices());
       uoa.c(p0.getAllowFreeFormInput());
       uoa.a(p0.getExtras());
       if (Build$VERSION.SDK_INT >= 29) {
          uoa.e(p0.getEditChoicesBeforeSending());
       }
       return uoa.b();
    }
    public boolean d(){
       return this.d;
    }
    public Set e(){
       return this.g;
    }
    public CharSequence[] f(){
       return this.c;
    }
    public int g(){
       return this.e;
    }
    public Bundle h(){
       return this.f;
    }
    public CharSequence i(){
       return this.b;
    }
    public String j(){
       return this.a;
    }
    public boolean k(){
       boolean b = (!this.d() && (this.f() == null || (!this.f().length && (this.e() != null && !this.e().isEmpty()))))? true: false;
       return b;
    }
}
