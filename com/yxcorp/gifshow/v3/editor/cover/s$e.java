package com.yxcorp.gifshow.v3.editor.cover.s$e;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.cover.s;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class s$e extends RecyclerView$r	// class@000ed3
{
    public final s a;

    public void s$e(s p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(s$e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, s$e.class, "1")) {
          return;
       }
       if (p1 == 1) {
          this.a.R8();
       }
       return;
    }
}
