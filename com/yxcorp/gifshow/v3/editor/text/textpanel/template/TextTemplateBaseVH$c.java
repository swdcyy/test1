package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH;
import ypc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import kotlin.jvm.internal.a;
import android.view.View;
import gvc.a$a;

public final class TextTemplateBaseVH$c implements Runnable	// class@0014de
{
    public final TextTemplateBaseVH b;
    public final a c;

    public void TextTemplateBaseVH$c(TextTemplateBaseVH p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextTemplateBaseVH$c.class, "1")) {
          return;
       }
       TextTemplateBaseVH$c tb = this.b;
       TextTemplateBaseVH g = tb.g;
       if (g != null) {
          RecyclerView$ViewHolder itemView = tb.itemView;
          a.o(itemView, "itemView");
          g.a(itemView, this.c, this.b.getAdapterPosition());
       }
       return;
    }
}
