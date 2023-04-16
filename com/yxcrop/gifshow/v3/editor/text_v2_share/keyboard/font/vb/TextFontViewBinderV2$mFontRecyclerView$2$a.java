package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$mFontRecyclerView$2$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$mFontRecyclerView$2;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import java.util.List;
import jn9.b;
import lnc.a1;

public final class TextFontViewBinderV2$mFontRecyclerView$2$a extends RecyclerView$n	// class@000ba3
{
    public final TextFontViewBinderV2$mFontRecyclerView$2 a;

    public void TextFontViewBinderV2$mFontRecyclerView$2$a(TextFontViewBinderV2$mFontRecyclerView$2 p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TextFontViewBinderV2$mFontRecyclerView$2$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childAdapter = p2.getChildAdapterPosition(p1);
       int i = this.a.this$0.e.m().size();
       if (!childAdapter) {
          p0.left = a1.e(13.00f);
          p0.right = 0;
       }else {
          i--;
          if (childAdapter == i) {
             p0.left = 0;
             p0.right = a1.e(13.00f);
          }else {
             p0.left = 0;
             p0.right = 0;
          }
       }
       return;
    }
}
