package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class StickerGroupFragment$a extends RecyclerView$r	// class@001291
{
    public final StickerGroupFragment a;

    public void StickerGroupFragment$a(StickerGroupFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(StickerGroupFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StickerGroupFragment$a.class, "1")) {
          return;
       }
       this.a.dh();
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(StickerGroupFragment$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, StickerGroupFragment$a.class, "2")) {
          return;
       }
       StickerGroupFragment$a ta = this.a;
       StickerGroupFragment p = ta.p;
       int i = 1;
       if (p == -1) {
          if (p2 <= 0) {
             i = 0;
          }
          ta.p = i;
       }else if(p2 > 0){
          i = 0;
       }
       if (i != p) {
          ta.dh();
       }
       ta.p = i;
       return;
    }
}
