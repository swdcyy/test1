package androidx.appcompat.app.ActionBar$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public class ActionBar$LayoutParams extends ViewGroup$MarginLayoutParams	// class@000554
{
    public int a;

    public void ActionBar$LayoutParams(int p0){
       super(-2, -1, p0);
    }
    public void ActionBar$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = 0;
       this.a = 0x800013;
    }
    public void ActionBar$LayoutParams(int p0,int p1,int p2){
       super(p0, p1);
       this.a = 0;
       this.a = p2;
    }
    public void ActionBar$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d);
       this.a = typedArray.getInt(0, 0);
       typedArray.recycle();
    }
    public void ActionBar$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void ActionBar$LayoutParams(ActionBar$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.a = p0.a;
    }
}
