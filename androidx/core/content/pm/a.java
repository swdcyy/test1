package androidx.core.content.pm.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import android.os.Parcelable;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import android.content.pm.ApplicationInfo;
import androidx.core.graphics.drawable.IconCompat;
import android.os.PersistableBundle;
import java.lang.StringBuilder;
import androidx.core.app.f;
import m1.a;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo$Builder;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import java.util.Set;
import android.os.Build$VERSION;
import android.app.Person;
import android.content.LocusId;

public class a	// class@000712
{
    public Context a;
    public String b;
    public String c;
    public Intent[] d;
    public ComponentName e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public IconCompat i;
    public boolean j;
    public f[] k;
    public Set l;
    public a m;
    public boolean n;
    public int o;
    public PersistableBundle p;
    public long q;
    public UserHandle r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public void a(){
       super();
       this.x = true;
    }
    public Intent a(Intent p0){
       a td = this.d;
       p0.putExtra("android.intent.extra.shortcut.INTENT", td[(td.length - 1)]).putExtra("android.intent.extra.shortcut.NAME", this.f.toString());
       if (this.i != null) {
          Drawable uDrawable = null;
          if (this.j != null) {
             PackageManager packageManag = this.a.getPackageManager();
             a te = this.e;
             if (te != null) {
                try{
                   uDrawable = packageManag.getActivityIcon(te);
                }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                }
             }
          }
       label_003d :
          this.i.f(p0, uDrawable, this.a);
       }
       return p0;
    }
    public final PersistableBundle b(){
       if (this.p == null) {
          this.p = new PersistableBundle();
       }
       a tk = this.k;
       if (tk != null && tk.length > 0) {
          this.p.putInt("extraPersonCount", tk.length);
          for (int i = 0; i < this.k.length; i = i1) {
             int i1 = i + 1;
             this.p.putPersistableBundle("extraPerson_"+i1, this.k[i].l());
          }
       }
       tk = this.m;
       if (tk != null) {
          this.p.putString("extraLocusId", tk.a());
       }
       this.p.putBoolean("extraLongLived", this.n);
       return this.p;
    }
    public String c(){
       return this.b;
    }
    public a d(){
       return this.m;
    }
    public CharSequence e(){
       return this.f;
    }
    public ShortcutInfo f(){
       ShortcutInfo$Builder uBuilder = new ShortcutInfo$Builder(this.a, this.b).setShortLabel(this.f).setIntents(this.d);
       a ti = this.i;
       if (ti != null) {
          uBuilder.setIcon(ti.J(this.a));
       }
       if (!TextUtils.isEmpty(this.g)) {
          uBuilder.setLongLabel(this.g);
       }
       if (!TextUtils.isEmpty(this.h)) {
          uBuilder.setDisabledMessage(this.h);
       }
       ti = this.e;
       if (ti != null) {
          uBuilder.setActivity(ti);
       }
       ti = this.l;
       if (ti != null) {
          uBuilder.setCategories(ti);
       }
       uBuilder.setRank(this.o);
       ti = this.p;
       if (ti != null) {
          uBuilder.setExtras(ti);
       }
       if (Build$VERSION.SDK_INT >= 29) {
          ti = this.k;
          if (ti != null && ti.length > 0) {
             int len = ti.length;
             Person[] personArray = new Person[len];
             for (int i = 0; i < len; i = i + 1) {
                personArray[i] = this.k[i].j();
             }
             uBuilder.setPersons(personArray);
          }
          ti = this.m;
          if (ti != null) {
             uBuilder.setLocusId(ti.c());
          }
          uBuilder.setLongLived(this.n);
       }else {
          uBuilder.setExtras(this.b());
       }
       return uBuilder.build();
    }
}
