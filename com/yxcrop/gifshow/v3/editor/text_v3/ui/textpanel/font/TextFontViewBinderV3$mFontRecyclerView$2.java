package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$mFontRecyclerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$a;
import god.c;
import androidx.recyclerview.widget.RecyclerView$n;

public final class TextFontViewBinderV3$mFontRecyclerView$2 extends Lambda implements a	// class@000c5a
{
    public final TextFontViewBinderV3 this$0;

    public void TextFontViewBinderV3$mFontRecyclerView$2(TextFontViewBinderV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public final RecyclerView invoke(){
       RecyclerView obj = PatchProxy.apply(null, this, TextFontViewBinderV3$mFontRecyclerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.p.findViewById(R.id.font_rv);
       a.o(obj, "rv");
       obj.setLayoutManager(new GridLayoutManager(this.this$0.p.getContext(), 4, 1, false));
       obj.setHasFixedSize(1);
       c p = c.p;
       obj.addItemDecoration(new TextFontViewBinderV3$a(this.this$0, 4, (((a1.h() - (p.f() * 4)) - (p.d() * 2)) / 3)));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
