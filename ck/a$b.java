package ck.a$b;
import android.graphics.drawable.Drawable$ConstantState;
import ck.a;
import ck.a$a;
import android.graphics.drawable.Drawable;

public class a$b extends Drawable$ConstantState	// class@000d15
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a$b(a p0,a$a p1){
       super(p0);
    }
    public int getChangingConfigurations(){
       return 0;
    }
    public Drawable newDrawable(){
       return this.a;
    }
}
