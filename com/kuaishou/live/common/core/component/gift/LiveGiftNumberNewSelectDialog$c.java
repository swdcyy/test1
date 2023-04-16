package com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$c;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class LiveGiftNumberNewSelectDialog$c extends RecyclerView$ViewHolder implements d	// class@001132
{
    public TextView b;
    public TextView c;
    public TextView d;

    public void LiveGiftNumberNewSelectDialog$c(View p0){
       super(p0);
       g.b(p0, LiveGiftNumberNewSelectDialog$c.class.getCanonicalName());
       this.doBindView(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberNewSelectDialog$c.class, "1")) {
          return;
       }
       this.b = p0.findViewById(0x7f0a222b);
       this.c = p0.findViewById(0x7f0a222c);
       this.d = p0.findViewById(0x7f0a1a78);
       return;
    }
}
