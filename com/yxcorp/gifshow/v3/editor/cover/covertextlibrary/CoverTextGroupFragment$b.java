package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class CoverTextGroupFragment$b extends RecyclerView$r	// class@000e47
{
    public final CoverTextGroupFragment a;

    public void CoverTextGroupFragment$b(CoverTextGroupFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(CoverTextGroupFragment$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CoverTextGroupFragment$b.class, "1")) {
          return;
       }
       this.a.dh();
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(CoverTextGroupFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, CoverTextGroupFragment$b.class, "2")) {
          return;
       }
       CoverTextGroupFragment$b ta = this.a;
       CoverTextGroupFragment r = ta.r;
       int i = 1;
       if (r == -1) {
          if (p2 <= 0) {
             i = 0;
          }
          ta.r = i;
       }else if(p2 > 0){
          i = 0;
       }
       if (i != r) {
          ta.dh();
       }
       ta.r = i;
       return;
    }
}
