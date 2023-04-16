package q1.h;
import android.graphics.drawable.Drawable$ConstantState;
import q1.f;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import q1.g;

public final class h extends Drawable$ConstantState	// class@002950
{
    public int a;
    public Drawable$ConstantState b;
    public ColorStateList c;
    public PorterDuff$Mode d;

    public void h(h p0){
       super();
       this.c = null;
       this.d = f.h;
       if (p0 != null) {
          this.a = p0.a;
          this.b = p0.b;
          this.c = p0.c;
          this.d = p0.d;
       }
       return;
    }
    public boolean a(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int getChangingConfigurations(){
       h ta = this.a;
       h tb = this.b;
       int changingConf = (tb != null)? tb.getChangingConfigurations(): 0;
       return (ta | changingConf);
    }
    public Drawable newDrawable(){
       return this.newDrawable(null);
    }
    public Drawable newDrawable(Resources p0){
       return new g(this, p0);
    }
}
