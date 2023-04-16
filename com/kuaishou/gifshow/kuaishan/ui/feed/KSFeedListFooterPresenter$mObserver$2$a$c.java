package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a$c;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public final class KSFeedListFooterPresenter$mObserver$2$a$c implements Runnable	// class@001ac8
{
    public final KSFeedListFooterPresenter$mObserver$2$a b;

    public void KSFeedListFooterPresenter$mObserver$2$a$c(KSFeedListFooterPresenter$mObserver$2$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFooterPresenter$mObserver$2$a$c.class, "1")) {
          return;
       }
       KSFeedListFooterPresenter.R8(this.b.b.this$0).setVisibility(8);
       KSFeedListFooterPresenter.P8(this.b.b.this$0).setVisibility(0);
       return;
    }
}
