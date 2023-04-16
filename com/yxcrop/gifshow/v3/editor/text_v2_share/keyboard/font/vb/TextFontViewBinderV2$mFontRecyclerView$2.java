package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$mFontRecyclerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$mFontRecyclerView$2$a;
import androidx.recyclerview.widget.RecyclerView$n;

public final class TextFontViewBinderV2$mFontRecyclerView$2 extends Lambda implements a	// class@000ba4
{
    public final TextFontViewBinderV2 this$0;

    public void TextFontViewBinderV2$mFontRecyclerView$2(TextFontViewBinderV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final RecyclerView invoke(){
       RecyclerView obj = PatchProxy.apply(null, this, TextFontViewBinderV2$mFontRecyclerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.m.findViewById(R.id.font_rv);
       a.o(obj, "rv");
       obj.setLayoutManager(new LinearLayoutManager(this.this$0.l.getContext(), 0, 0));
       obj.setHasFixedSize(true);
       obj.addItemDecoration(new TextFontViewBinderV2$mFontRecyclerView$2$a(this));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
