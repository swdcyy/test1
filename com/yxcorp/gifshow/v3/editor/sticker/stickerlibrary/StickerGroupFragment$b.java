package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import android.util.Pair;
import lnc.p3;
import q87.c;

public class StickerGroupFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001292
{
    public final StickerGroupFragment b;

    public void StickerGroupFragment$b(StickerGroupFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, StickerGroupFragment$b.class, "1")) {
          return;
       }
       this.b.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       RecyclerView$LayoutManager layoutManage = this.b.j.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          return;
       }
       int i = layoutManage.c();
       int i1 = layoutManage.i0();
       String str = -1;
       if (i1 == str || i == str) {
          Object[] objArray = new Object[0];
          p3.D().A("StickerGroupFragment", "not find item view", objArray);
          return;
       }else {
          for (int i2 = i1; i2 <= i; i2 = i2 + 1) {
             this.b.m.add(Pair.create(Integer.valueOf(i2), this.b.k.getStickerInfos().get(i2)));
          }
          StickerGroupFragment$b tb = this.b;
          tb.n = i1;
          tb.o = i;
          return;
       }
    }
}
