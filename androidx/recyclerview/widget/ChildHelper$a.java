package androidx.recyclerview.widget.ChildHelper$a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;

public interface abstract ChildHelper$a	// class@000867
{

    void addView(View p0,int p1);
    RecyclerView$ViewHolder d(View p0);
    void e(View p0);
    void f(View p0,int p1,ViewGroup$LayoutParams p2);
    void g(int p0);
    View getChildAt(int p0);
    int getChildCount();
    int h(View p0);
    void i(View p0);
    void removeAllViews();
    void removeViewAt(int p0);
}
