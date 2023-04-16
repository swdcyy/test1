package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a implements View$OnClickListener	// class@001230
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.d();
       return;
    }
}
