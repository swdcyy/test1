package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import jn9.b;
import god.c;

public final class TextFontViewBinderV3$a extends RecyclerView$n	// class@000c54
{
    public final int a;
    public final int b;
    public final TextFontViewBinderV3 c;

    public void TextFontViewBinderV3$a(TextFontViewBinderV3 p0,int p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TextFontViewBinderV3$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childAdapter = p2.getChildAdapterPosition(p1);
       TextFontViewBinderV3$a ta = this.a;
       int i = this.c.h.m().size() / ta;
       int i1 = childAdapter % ta;
       int i2 = childAdapter / ta;
       TextFontViewBinderV3$a tb = this.b;
       p0.left = (i1 * tb) / ta;
       p0.right = tb - (((i1 + 1) * tb) / ta);
       if (childAdapter < ta) {
          p0.top = c.p.b();
       }
       p0.bottom = (i2 == i)? c.p.b(): c.p.a();
       return;
    }
}
