package ga9.b;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ec7.a;
import java.util.List;

public interface abstract b	// class@00245e
{

    boolean a(ViewModel p0);
    void d(RecyclerView$ViewHolder p0);
    void e(View p0);
    View f(LayoutInflater p0,ViewGroup p1,Bundle p2);
    void i(a p0,int p1,List p2,ViewModel p3);
    void onDestroy();
}
