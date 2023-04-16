package hy0.u;
import ya1.j;
import u07.t$a;
import ya1.j$b;
import hy0.t;
import v07.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class u extends j	// class@0027b7
{
    public final View$OnClickListener h;

    public void u(t$a p0,j$b p1){
       super(p0, p1);
       this.h = new t(this);
    }
    public void J0(a p0,int p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ou, "1")) {
          return;
       }
       super.J0(p0, p1);
       this.g.setOnClickListener(this.h);
       p0.itemView.findViewById(R.id.live_check_area).setOnClickListener(this.h);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.J0(p0, p1);
    }
}
