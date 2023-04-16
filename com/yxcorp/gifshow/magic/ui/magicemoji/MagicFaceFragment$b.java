package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;

public class MagicFaceFragment$b extends RecyclerView$r	// class@001bb1
{
    public final MagicFaceFragment a;

    public void MagicFaceFragment$b(MagicFaceFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       MagicFaceFragment$b uob = MagicFaceFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p1 == 1 || !p1) {
          this.c(p0);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(MagicFaceFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MagicFaceFragment$b.class, "2")) {
          return;
       }
       this.c(p0);
       return;
    }
    public final void c(RecyclerView p0){
       MagicFaceFragment$b uob = MagicFaceFragment$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       MagicFaceFragment s = this.a.s;
       if (s != null) {
          Object obj = PatchProxy.applyOneRefs(p0, this, uob, "4");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.getLayoutManager().c();
          s.s1(i);
       }
       return;
    }
}
