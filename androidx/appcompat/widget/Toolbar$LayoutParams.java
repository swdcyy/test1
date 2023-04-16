package androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.appcompat.app.ActionBar$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class Toolbar$LayoutParams extends ActionBar$LayoutParams	// class@00062b
{
    public int b;

    public void Toolbar$LayoutParams(int p0){
       super(-2, -1, p0);
    }
    public void Toolbar$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.b = 0;
       this.a = 0x800013;
    }
    public void Toolbar$LayoutParams(int p0,int p1,int p2){
       super(p0, p1);
       this.b = 0;
       this.a = p2;
    }
    public void Toolbar$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
    }
    public void Toolbar$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = 0;
    }
    public void Toolbar$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = 0;
       this.a(p0);
    }
    public void Toolbar$LayoutParams(ActionBar$LayoutParams p0){
       super(p0);
       this.b = 0;
    }
    public void Toolbar$LayoutParams(Toolbar$LayoutParams p0){
       super(p0);
       this.b = 0;
       this.b = p0.b;
    }
    public void a(ViewGroup$MarginLayoutParams p0){
       this.leftMargin = p0.leftMargin;
       this.topMargin = p0.topMargin;
       this.rightMargin = p0.rightMargin;
       this.bottomMargin = p0.bottomMargin;
    }
}
