package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a$a;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.TextView;

public final class KSFeedListFooterPresenter$mObserver$2$a$a implements Runnable	// class@001ac6
{
    public final KSFeedListFooterPresenter$mObserver$2$a b;

    public void KSFeedListFooterPresenter$mObserver$2$a$a(KSFeedListFooterPresenter$mObserver$2$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFooterPresenter$mObserver$2$a$a.class, "1")) {
          return;
       }
       KSFeedListFooterPresenter.P8(this.b.b.this$0).setVisibility(8);
       KSFeedListFooterPresenter.R8(this.b.b.this$0).setVisibility(8);
       return;
    }
}
