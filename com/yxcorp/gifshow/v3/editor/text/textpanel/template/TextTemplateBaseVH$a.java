package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH;
import ypc.a;
import huc.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class TextTemplateBaseVH$a implements View$OnClickListener	// class@0014dc
{
    public final TextTemplateBaseVH b;
    public final a c;
    public final b d;

    public void TextTemplateBaseVH$a(TextTemplateBaseVH p0,a p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateBaseVH$a.class, "1")) {
          return;
       }
       this.c.u(0);
       this.b.d(this.c);
       this.d.b(this.b.getAdapterPosition());
       return;
    }
}
