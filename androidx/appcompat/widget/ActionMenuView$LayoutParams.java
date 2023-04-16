package androidx.appcompat.widget.ActionMenuView$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;

public class ActionMenuView$LayoutParams extends LinearLayoutCompat$LayoutParams	// class@0005d0
{
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;

    public void ActionMenuView$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.c = false;
    }
    public void ActionMenuView$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ActionMenuView$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
    }
    public void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams p0){
       super(p0);
       this.c = p0.c;
    }
}
