package com.kuaishou.live.common.core.component.gift.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ug1.f0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$c;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class h implements View$OnClickListener	// class@00131b
{
    public final LiveGiftNumberNewSelectDialog b;

    public void h(LiveGiftNumberNewSelectDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGiftNumberNewSelectDialog.class, "15")) {
       }else if(tb.y == null){
          b uob = new b(tb.getContext());
          tb.y = uob;
          uob.e(true);
          tb.y.f(new f0(tb));
       }
       tb.y.g(tb.w);
       tb.dismissAllowingStateLoss();
       return;
    }
}
