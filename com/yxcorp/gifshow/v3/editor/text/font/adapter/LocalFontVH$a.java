package com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH;
import d0c.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import zuc.c;

public final class LocalFontVH$a implements View$OnClickListener	// class@00143a
{
    public final LocalFontVH b;
    public final d c;

    public void LocalFontVH$a(LocalFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalFontVH$a.class, "1")) {
          return;
       }
       if (!this.c.l()) {
          LocalFontVH$a tb = this.b;
          LocalFontVH d = tb.d;
          if (d != null) {
             d.D1(true, tb.getAdapterPosition(), this.c);
          }
       }
       return;
    }
}
