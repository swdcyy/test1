package androidx.recyclerview.widget.n;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;
import android.view.View;
import java.lang.String;
import java.lang.StringBuilder;

public class n	// class@00092a
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    public void n(){
       super();
       this.a = true;
       this.f = 0;
       this.g = 0;
    }
    public boolean a(RecyclerView$y p0){
       n tc = this.c;
       boolean b = (tc >= null && tc < p0.c())? true: false;
       return b;
    }
    public View b(RecyclerView$t p0){
       this.c = this.c + this.d;
       return p0.o(this.c);
    }
    public String toString(){
       return "LayoutState{mAvailable="+this.b+", mCurrentPosition="+this.c+", mItemDirection="+this.d+", mLayoutDirection="+this.e+", mStartLine="+this.f+", mEndLine="+this.g+'}';
    }
}
