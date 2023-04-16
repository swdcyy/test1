package com.yxcorp.gifshow.designermagic.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.designermagic.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import qw9.h;
import q87.c;

public class a$a extends RecyclerView$r	// class@001326
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          Object[] objArray = new Object[0];
          h.D().s("DesignerMagicLogPresenter", "newState == RecyclerView.SCROLL_STATE_IDLE", objArray);
          this.a.S8();
       }
       return;
    }
}
