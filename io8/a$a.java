package io8.a$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.View;
import com.tachikoma.core.component.view.TKView;
import com.tachikoma.core.component.e;

public class a$a extends RecyclerView$ViewHolder	// class@002700
{
    public TKView a;
    public static final int b;

    public void a$a(Context p0){
       super(new FrameLayout(p0));
    }
    public void a$a(TKView p0){
       super(p0.getView());
       this.a = p0;
    }
}
