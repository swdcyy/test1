package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import d0c.d;
import d0c.c;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class TextFontViewBinder$b implements Observer	// class@00142e
{
    public final TextFontViewBinder b;

    public void TextFontViewBinder$b(TextFontViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontViewBinder$b.class, "1")) {
       }else {
          this.b.h.d().clear();
          this.b.h.d().addAll(p0.c());
          TextFontViewBinder$b tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TextFontViewBinder.class, "5")) {
             ListHolder$UpdateType cHANGE = ListHolder$UpdateType.CHANGE;
             if (p0.e() == cHANGE && c.a.a(p0.c().get(p0.b()).i())) {
                tb.D().m0(p0.b(), FontPayload.PROGRESS);
             }else {
                tb.D().O0();
                if (p0.e() == cHANGE) {
                   tb.D().m0(p0.b(), p0.d());
                }else {
                   FontAdapter uFontAdapter = tb.D();
                   Objects.requireNonNull(uFontAdapter, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
                   p0.a(uFontAdapter);
                }
             }
          }
       }
       return;
    }
}
