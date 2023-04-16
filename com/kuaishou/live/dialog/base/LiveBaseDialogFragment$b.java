package com.kuaishou.live.dialog.base.LiveBaseDialogFragment$b;
import gy2.b$a;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveBaseDialogFragment$b implements b$a	// class@001aec
{
    public final LiveBaseDialogFragment a;
    public final c b;
    public final String c;

    public void LiveBaseDialogFragment$b(LiveBaseDialogFragment p0,c p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, LiveBaseDialogFragment$b.class, "1")) {
          return;
       }
       LiveBaseDialogFragment.sh(this.a, this.b, this.c);
       return;
    }
}
