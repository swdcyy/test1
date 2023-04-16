package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import zw8.z2;

public final class ShareTitleAccessoryFragment$d implements View$OnClickListener	// class@0013b5
{
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$d(ShareTitleAccessoryFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTitleAccessoryFragment$d.class, "1")) {
          return;
       }
       ShareTitleAccessoryFragment$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ShareTitleAccessoryFragment.class, "16")) {
          ShareTitleAccessoryFragment y = tb.y;
          if (y != null) {
             y.a();
          }
       }
       return;
    }
}
