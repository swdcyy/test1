package f3.c$d;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import f3.c;
import f3.g;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources;
import android.content.res.Resources$Theme;

public class c$d extends Drawable$ConstantState	// class@001fbe
{
    public final Drawable$ConstantState a;

    public void c$d(Drawable$ConstantState p0){
       super();
       this.a = p0;
    }
    public boolean canApplyTheme(){
       return this.a.canApplyTheme();
    }
    public int getChangingConfigurations(){
       return this.a.getChangingConfigurations();
    }
    public Drawable newDrawable(){
       c uoc = new c();
       Drawable uDrawable = this.a.newDrawable();
       uoc.b = uDrawable;
       uDrawable.setCallback(uoc.i);
       return uoc;
    }
    public Drawable newDrawable(Resources p0){
       c uoc = new c();
       Drawable uDrawable = this.a.newDrawable(p0);
       uoc.b = uDrawable;
       uDrawable.setCallback(uoc.i);
       return uoc;
    }
    public Drawable newDrawable(Resources p0,Resources$Theme p1){
       c uoc = new c();
       Drawable uDrawable = this.a.newDrawable(p0, p1);
       uoc.b = uDrawable;
       uDrawable.setCallback(uoc.i);
       return uoc;
    }
}
