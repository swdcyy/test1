package androidx.appcompat.widget.f;
import a2.b;
import android.content.Context;
import androidx.appcompat.widget.f$b;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserView;
import android.view.ViewGroup;
import java.lang.String;
import androidx.appcompat.widget.a;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import r0.a;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import android.content.pm.PackageManager;
import java.lang.Math;
import android.content.pm.ResolveInfo;
import java.lang.CharSequence;
import android.view.MenuItem;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Intent;

public class f extends b	// class@000649
{
    public int d;
    public final f$b e;
    public final Context f;
    public String g;
    public f$a h;
    public a$f i;

    public void f(Context p0){
       super(p0);
       this.d = 4;
       this.e = new f$b(this);
       this.g = "share_history.xml";
       this.f = p0;
    }
    public View c(){
       ActivityChooserView uActivityCho = new ActivityChooserView(this.f);
       if (!uActivityCho.isInEditMode()) {
          uActivityCho.setActivityChooserModel(a.d(this.f, this.g));
       }
       TypedValue typedValue = new TypedValue();
       this.f.getTheme().resolveAttribute(R.attr.arg_RES_7f0400ec, typedValue, true);
       uActivityCho.setExpandActivityOverflowButtonDrawable(a.d(this.f, typedValue.resourceId));
       uActivityCho.setProvider(this);
       uActivityCho.setDefaultActionButtonContentDescription(R.string.arg_RES_7f100027);
       uActivityCho.setExpandActivityOverflowButtonContentDescription(R.string.arg_RES_7f100026);
       return uActivityCho;
    }
    public void f(SubMenu p0){
       p0.clear();
       a uoa = a.d(this.f, this.g);
       PackageManager packageManag = this.f.getPackageManager();
       int i = uoa.f();
       int i1 = Math.min(i, this.d);
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          ResolveInfo resolveInfo = uoa.e(i2);
          p0.add(0, i2, i2, resolveInfo.loadLabel(packageManag)).setIcon(resolveInfo.loadIcon(packageManag)).setOnMenuItemClickListener(this.e);
       }
       if (i1 < i) {
          p0 = p0.addSubMenu(0, i1, i1, this.f.getString(R.string.arg_RES_7f100012));
          for (i1 = 0; i1 < i; i1 = i1 + 1) {
             ResolveInfo resolveInfo1 = uoa.e(i1);
             p0.add(0, i1, i1, resolveInfo1.loadLabel(packageManag)).setIcon(resolveInfo1.loadIcon(packageManag)).setOnMenuItemClickListener(this.e);
          }
       }
       return;
    }
    public void l(Intent p0){
       p0.addFlags(0x8080000);
    }
}
