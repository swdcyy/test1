package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$c;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class LiveGiftNumberSelectDialog$c extends RecyclerView$ViewHolder implements d	// class@001223
{
    public TextView b;
    public TextView c;
    public View d;
    public View e;

    public void LiveGiftNumberSelectDialog$c(View p0){
       super(p0);
       g.b(p0, LiveGiftNumberSelectDialog$c.class.getCanonicalName());
       this.doBindView(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberSelectDialog$c.class, "1")) {
          return;
       }
       this.b = p0.findViewById(0x7f0a222b);
       this.c = p0.findViewById(0x7f0a222c);
       this.d = p0.findViewById(0x7f0a222d);
       this.e = p0.findViewById(0x7f0a222e);
       return;
    }
}
