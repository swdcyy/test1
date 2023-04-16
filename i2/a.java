package i2.a;
import android.view.View;
import android.util.AttributeSet;
import java.lang.Object;
import android.content.Context;
import ll8.c$b;
import android.content.res.TypedArray;

public class a	// class@002163
{
    public int a;

    public void a(View p0,AttributeSet p1,int p2,int p3){
       super();
       if (p1 != null) {
          TypedArray typedArray = p0.getContext().obtainStyledAttributes(p1, c$b.v0, p2, p3);
          this.a = typedArray.getInteger(0, Integer.MAX_VALUE);
          typedArray.recycle();
       }
       return;
    }
    public int a(){
       return this.a;
    }
}
