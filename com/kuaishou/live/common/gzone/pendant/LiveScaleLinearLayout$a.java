package com.kuaishou.live.common.gzone.pendant.LiveScaleLinearLayout$a;
import gz1.c;
import com.kuaishou.live.common.gzone.pendant.LiveScaleLinearLayout;
import android.widget.LinearLayout;
import gz1.a;
import android.view.ViewGroup;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveScaleLinearLayout$a extends c	// class@0017db
{
    public final LiveScaleLinearLayout f;

    public void LiveScaleLinearLayout$a(LiveScaleLinearLayout p0,LinearLayout p1,a p2){
       this.f = p0;
       super(p1, p2);
    }
    public ViewGroup a(Context p0){
       LinearLayout linearLayout = PatchProxy.applyOneRefs(p0, this, LiveScaleLinearLayout$a.class, "2");
       if (linearLayout != PatchProxyResult.class) {
       }else {
          linearLayout = new LinearLayout(p0);
       }
       return linearLayout;
    }
    public void b(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScaleLinearLayout$a.class, "1")) {
       }else {
          this.b.setOrientation(this.f.getOrientation());
       }
       return;
    }
}
