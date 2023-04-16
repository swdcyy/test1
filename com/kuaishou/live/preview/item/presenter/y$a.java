package com.kuaishou.live.preview.item.presenter.y$a;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.kuaishou.live.preview.item.presenter.y;
import java.lang.Object;
import tyc.b3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class y$a implements LiveCoverIconView$f	// class@000e47
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public void a(){
       b3.a(this);
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "1")) {
          return;
       }
       this.a.p.setVisibility(0);
       return;
    }
}
