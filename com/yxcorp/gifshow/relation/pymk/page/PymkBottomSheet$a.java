package com.yxcorp.gifshow.relation.pymk.page.PymkBottomSheet$a;
import f7c.d;
import com.yxcorp.gifshow.relation.pymk.page.PymkBottomSheet;
import com.kwai.framework.model.user.RecoUser;
import a7c.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;

public class PymkBottomSheet$a extends d	// class@00194f
{
    public final PymkBottomSheet f;

    public void PymkBottomSheet$a(PymkBottomSheet p0){
       this.f = p0;
       super();
    }
    public void Z3(RecoUser p0,h p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PymkBottomSheet$a.class, "1")) {
          return;
       }
       p2.setBackgroundResource(R.color.arg_RES_7f0617bc);
       View[] viewArray = new View[]{p2.findViewById(0x7f0a0be0)};
       n.Z(8, viewArray);
       return;
    }
}
