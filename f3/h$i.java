package f3.h$i;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import f3.h;
import android.graphics.drawable.VectorDrawable;
import f3.g;
import android.content.res.Resources;
import android.content.res.Resources$Theme;

public class h$i extends Drawable$ConstantState	// class@001fcd
{
    public final Drawable$ConstantState a;

    public void h$i(Drawable$ConstantState p0){
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
       h oh = new h();
       oh.b = this.a.newDrawable();
       return oh;
    }
    public Drawable newDrawable(Resources p0){
       h oh = new h();
       oh.b = this.a.newDrawable(p0);
       return oh;
    }
    public Drawable newDrawable(Resources p0,Resources$Theme p1){
       h oh = new h();
       oh.b = this.a.newDrawable(p0, p1);
       return oh;
    }
}
