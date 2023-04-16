package androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState;
import java.lang.Object;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.c;
import android.content.Context;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.e;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.c$a;
import android.util.TypedValue;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import u0.d;
import ll8.c$b;
import android.content.res.TypedArray;

public final class AppCompatDelegateImpl$PanelFeatureState	// class@00056f
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ViewGroup g;
    public View h;
    public View i;
    public e j;
    public c k;
    public Context l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Bundle t;
    public Bundle u;

    public void AppCompatDelegateImpl$PanelFeatureState(int p0){
       super();
       this.a = p0;
       this.q = false;
    }
    public k a(j$a p0){
       if (this.j == null) {
          return null;
       }
       if (this.k == null) {
          c uoc = new c(this.l, 0x7f0d0010);
          this.k = uoc;
          uoc.l(p0);
          this.j.b(this.k);
       }
       return this.k.m(this.g);
    }
    public boolean b(){
       boolean b = false;
       if (this.h == null) {
          return b;
       }
       if (this.i != null) {
          return true;
       }
       if (this.k.d().getCount() > 0) {
          b = true;
       }
       return b;
    }
    public void c(e p0){
       AppCompatDelegateImpl$PanelFeatureState tj = this.j;
       if (p0 == tj) {
          return;
       }
       if (tj != null) {
          tj.Q(this.k);
       }
       this.j = p0;
       if (p0 != null) {
          tj = this.k;
          if (tj != null) {
             p0.b(tj);
          }
       }
       return;
    }
    public void d(Context p0){
       TypedValue typedValue = new TypedValue();
       Resources$Theme theme = p0.getResources().newTheme();
       theme.setTo(p0.getTheme());
       theme.resolveAttribute(R.attr.arg_RES_7f0400d5, typedValue, true);
       TypedValue resourceId = typedValue.resourceId;
       if (resourceId != null) {
          theme.applyStyle(resourceId, true);
       }
       theme.resolveAttribute(R.attr.arg_RES_7f04068a, typedValue, true);
       typedValue = typedValue.resourceId;
       if (typedValue != null) {
          theme.applyStyle(typedValue, true);
       }else {
          theme.applyStyle(R.style.arg_RES_7f110335, true);
       }
       d uod = new d(p0, 0);
       uod.getTheme().setTo(theme);
       this.l = uod;
       TypedArray typedArray = uod.obtainStyledAttributes(c$b.t);
       this.b = typedArray.getResourceId(84, 0);
       this.f = typedArray.getResourceId(true, 0);
       typedArray.recycle();
       return;
    }
}
