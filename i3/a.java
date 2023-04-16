package i3.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import a2.i0;

public final class a extends RecyclerView$ViewHolder	// class@002175
{

    public void a(FrameLayout p0){
       super(p0);
    }
    public static a a(ViewGroup p0){
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       uFrameLayout.setId(i0.l());
       uFrameLayout.setSaveEnabled(false);
       return new a(uFrameLayout);
    }
    public FrameLayout b(){
       return this.itemView;
    }
}
