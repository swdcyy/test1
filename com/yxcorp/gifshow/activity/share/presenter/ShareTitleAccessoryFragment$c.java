package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;

public final class ShareTitleAccessoryFragment$c implements View$OnClickListener	// class@0013b4
{
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$c(ShareTitleAccessoryFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTitleAccessoryFragment$c.class, "1")) {
          return;
       }
       ShareTitleAccessoryFragment$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ShareTitleAccessoryFragment.class, "14")) {
          ShareTitleAccessoryFragment t = tb.t;
          if (t == null) {
             a.S("mIfAddTitleCheckbtn");
          }
          ShareTitleAccessoryFragment t1 = tb.t;
          if (t1 == null) {
             a.S("mIfAddTitleCheckbtn");
          }
          t.setChecked((t1.isChecked() ^ 0x01));
       }
       return;
    }
}
