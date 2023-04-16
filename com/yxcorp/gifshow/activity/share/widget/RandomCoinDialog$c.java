package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class RandomCoinDialog$c implements View$OnClickListener	// class@00149f
{
    public final RandomCoinDialog b;

    public void RandomCoinDialog$c(RandomCoinDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RandomCoinDialog$c.class, "1")) {
          return;
       }
       this.b.o();
       return;
    }
}
