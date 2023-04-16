package com.yxcorp.gifshow.designermagic.v2.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.designermagic.v2.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class a$a extends RecyclerView$r	// class@00132c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
