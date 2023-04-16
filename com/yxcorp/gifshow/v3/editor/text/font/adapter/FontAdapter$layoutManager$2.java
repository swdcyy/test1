package com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$layoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import yuc.c;
import java.util.Objects;

public final class FontAdapter$layoutManager$2 extends Lambda implements a	// class@001437
{
    public final FontAdapter this$0;

    public void FontAdapter$layoutManager$2(FontAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LinearLayoutManager invoke(){
       RecyclerView$LayoutManager obj = PatchProxy.apply(null, this, FontAdapter$layoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.i.B1();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
