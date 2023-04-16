package com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment$b;
import gy2.b$a;
import com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveRecyclerDialogFragment$b implements b$a	// class@001af3
{
    public final LiveRecyclerDialogFragment a;
    public final c b;
    public final String c;

    public void LiveRecyclerDialogFragment$b(LiveRecyclerDialogFragment p0,c p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, LiveRecyclerDialogFragment$b.class, "1")) {
          return;
       }
       LiveRecyclerDialogFragment.Ch(this.a, this.b, this.c);
       return;
    }
}
