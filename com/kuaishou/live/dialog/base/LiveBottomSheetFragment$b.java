package com.kuaishou.live.dialog.base.LiveBottomSheetFragment$b;
import gy2.b$a;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveBottomSheetFragment$b implements b$a	// class@001af0
{
    public final LiveBottomSheetFragment a;
    public final c b;
    public final String c;

    public void LiveBottomSheetFragment$b(LiveBottomSheetFragment p0,c p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, LiveBottomSheetFragment$b.class, "1")) {
          return;
       }
       LiveBottomSheetFragment.Jh(this.a, this.b, this.c);
       return;
    }
}
