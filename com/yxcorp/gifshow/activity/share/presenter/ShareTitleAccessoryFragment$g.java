package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.ViewTreeObserver;

public final class ShareTitleAccessoryFragment$g implements ViewTreeObserver$OnGlobalLayoutListener	// class@0013b8
{
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$g(ShareTitleAccessoryFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment$g.class, "1")) {
          return;
       }
       if (ShareTitleAccessoryFragment.sh(this.b).getWidth() && ShareTitleAccessoryFragment.sh(this.b).getHeight()) {
          ShareTitleAccessoryFragment.sh(this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.vh();
       }
       return;
    }
}
