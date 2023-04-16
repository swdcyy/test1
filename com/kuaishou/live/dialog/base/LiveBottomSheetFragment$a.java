package com.kuaishou.live.dialog.base.LiveBottomSheetFragment$a;
import gy2.b$a;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveBottomSheetFragment$a implements b$a	// class@001aef
{
    public final LiveBottomSheetFragment a;
    public final c b;
    public final String c;

    public void LiveBottomSheetFragment$a(LiveBottomSheetFragment p0,c p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, LiveBottomSheetFragment$a.class, "1")) {
          return;
       }
       LiveBottomSheetFragment.Ih(this.a, this.b, this.c);
       return;
    }
}
