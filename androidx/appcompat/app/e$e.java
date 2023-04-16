package androidx.appcompat.app.e$e;
import androidx.appcompat.app.ActionBar$c;
import androidx.appcompat.app.e;
import java.lang.CharSequence;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import android.content.res.Resources;
import android.content.Context;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import r0.a;
import androidx.appcompat.app.ActionBar$d;

public class e$e extends ActionBar$c	// class@000593
{
    public ActionBar$d a;
    public Object b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public View g;
    public final e h;

    public void e$e(e p0){
       this.h = p0;
       super();
       this.f = -1;
    }
    public CharSequence a(){
       return this.e;
    }
    public View b(){
       return this.g;
    }
    public Drawable c(){
       return this.c;
    }
    public int d(){
       return this.f;
    }
    public Object e(){
       return this.b;
    }
    public CharSequence f(){
       return this.d;
    }
    public void g(){
       this.h.M(this);
    }
    public ActionBar$c h(int p0){
       this.i(this.h.d.getResources().getText(p0));
       return this;
    }
    public ActionBar$c i(CharSequence p0){
       this.e = p0;
       e$e tf = this.f;
       if (tf >= null) {
          this.h.l.l(tf);
       }
       return this;
    }
    public ActionBar$c j(int p0){
       this.k(LayoutInflater.from(this.h.x()).inflate(p0, null));
       return this;
    }
    public ActionBar$c k(View p0){
       this.g = p0;
       e$e tf = this.f;
       if (tf >= null) {
          this.h.l.l(tf);
       }
       return this;
    }
    public ActionBar$c l(int p0){
       this.m(a.d(this.h.d, p0));
       return this;
    }
    public ActionBar$c m(Drawable p0){
       this.c = p0;
       e$e tf = this.f;
       if (tf >= null) {
          this.h.l.l(tf);
       }
       return this;
    }
    public ActionBar$c n(ActionBar$d p0){
       this.a = p0;
       return this;
    }
    public ActionBar$c o(Object p0){
       this.b = p0;
       return this;
    }
    public ActionBar$c p(int p0){
       this.q(this.h.d.getResources().getText(p0));
       return this;
    }
    public ActionBar$c q(CharSequence p0){
       this.d = p0;
       e$e tf = this.f;
       if (tf >= null) {
          this.h.l.l(tf);
       }
       return this;
    }
    public ActionBar$d r(){
       return this.a;
    }
    public void s(int p0){
       this.f = p0;
    }
}
