package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import zi1.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class a implements View$OnClickListener	// class@00122f
{
    public final LiveGiftNumberSelectDialog$b b;
    public final int c;
    public final int d;
    public final LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem e;

    public void a(LiveGiftNumberSelectDialog$b p0,int p1,int p2,LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a te = this.e;
       Objects.requireNonNull(tb);
       if (this.c == this.d && te.mIsEditGiftCountItem != null) {
          LiveGiftNumberSelectDialog$b h = tb.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(null, h, LiveGiftNumberSelectDialog.class, "11")) {
             if (h.w == null) {
                b uob = new b(h.getContext());
                h.w = uob;
                uob.e(true);
                h.w.f(new j(h));
             }
             h.w.g(h.u);
          }
       }else {
          LiveGiftNumberSelectDialog t = tb.h.t;
          if (t != null) {
             t.a(te.mGiftBatchCount, te.mIsFromAllItem);
          }
       }
       tb.h.dismissAllowingStateLoss();
       return;
    }
}
