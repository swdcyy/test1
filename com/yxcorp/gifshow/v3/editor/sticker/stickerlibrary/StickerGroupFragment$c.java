package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;

public class StickerGroupFragment$c extends RecyclerView$n	// class@001293
{
    public int a;
    public int b;

    public void StickerGroupFragment$c(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, StickerGroupFragment$c.class, "1")) {
          return;
       }
       StickerGroupFragment$c tb = this.b;
       p0.left = tb / 2;
       p0.right = tb / 2;
       if (p2.getChildAdapterPosition(p1) < this.a) {
          p0.top = n.c(a.b(), 24.00f);
       }
       p0.bottom = n.c(a.b(), 24.00f);
       return;
    }
}
