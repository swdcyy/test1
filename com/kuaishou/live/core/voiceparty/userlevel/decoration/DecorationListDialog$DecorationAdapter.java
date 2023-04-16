package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog$DecorationAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.util.List;
import sx2.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog$DecorationAdapter$a;

public final class DecorationListDialog$DecorationAdapter extends ViewControllerAdapter	// class@001a7b
{
    public final int j;
    public final f k;

    public void DecorationListDialog$DecorationAdapter(LifecycleOwner p0,Activity p1,int p2,List p3,f p4){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p3, "decorationList");
       a.p(p4, "decorationService");
       super(p0, p1);
       this.j = p2;
       this.k = p4;
       this.O0(p3);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       DecorationListDialog$DecorationAdapter$a uDecorationA1;
       DecorationListDialog$DecorationAdapter uDecorationA = DecorationListDialog$DecorationAdapter.class;
       if (PatchProxy.isSupport(uDecorationA)) {
          uDecorationA1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDecorationA, "1");
          if (uDecorationA1 != PatchProxyResult.class) {
          label_0037 :
             return uDecorationA1;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       uDecorationA1 = new DecorationListDialog$DecorationAdapter$a(this, uFrameLayout);
       goto label_0037 ;
    }
}
