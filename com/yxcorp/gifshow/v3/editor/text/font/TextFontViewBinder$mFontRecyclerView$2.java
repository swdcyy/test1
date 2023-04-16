package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$mFontRecyclerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
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
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$mFontRecyclerView$2$a;
import androidx.recyclerview.widget.RecyclerView$n;

public final class TextFontViewBinder$mFontRecyclerView$2 extends Lambda implements a	// class@001432
{
    public final TextFontViewBinder this$0;

    public void TextFontViewBinder$mFontRecyclerView$2(TextFontViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public final RecyclerView invoke(){
       RecyclerView obj = PatchProxy.apply(null, this, TextFontViewBinder$mFontRecyclerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.g.findViewById(R.id.font_rv);
       a.o(obj, "rv");
       obj.setLayoutManager(new LinearLayoutManager(this.this$0.e.getContext(), 0, 0));
       obj.setHasFixedSize(true);
       obj.addItemDecoration(new TextFontViewBinder$mFontRecyclerView$2$a(this));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
