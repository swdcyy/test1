package cdd.j;
import android.view.View$OnClickListener;
import cdd.k;
import java.lang.Object;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;

public final class j implements View$OnClickListener	// class@000537
{
    public final k b;
    public final int c;

    public void j(k p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.p.Hh(this.c, null, true);
    }
}
