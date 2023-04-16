package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$c;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$c;
import android.text.Editable;
import android.widget.EditText;
import msd.l;

public final class GrowthTestViewHolder$c$a implements View$OnClickListener	// class@001571
{
    public final GrowthTestViewHolder$c b;
    public final b c;

    public void GrowthTestViewHolder$c$a(GrowthTestViewHolder$c p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$c$a.class, "1")) {
          return;
       }
       b$c f = this.c.f;
       GrowthTestViewHolder$c c = this.b.c;
       Editable text = (c != null)? c.getText(): null;
       f.invoke(String.valueOf(text));
       return;
    }
}
