package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a;
import qvb.q;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a$a;
import java.lang.Runnable;
import android.os.Handler;
import qvb.i;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a$c;
import qvb.p;
import android.widget.TextView;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2$a$b;

public final class KSFeedListFooterPresenter$mObserver$2$a implements q	// class@001ac9
{
    public final KSFeedListFooterPresenter$mObserver$2 b;

    public void KSFeedListFooterPresenter$mObserver$2$a(KSFeedListFooterPresenter$mObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(KSFeedListFooterPresenter$mObserver$2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, KSFeedListFooterPresenter$mObserver$2$a.class, "3")) {
          return;
       }
       this.b.this$0.s.post(new KSFeedListFooterPresenter$mObserver$2$a$a(this));
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(KSFeedListFooterPresenter$mObserver$2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, KSFeedListFooterPresenter$mObserver$2$a.class, "1")) {
          return;
       }
       KSFeedListFooterPresenter p = this.b.this$0.p;
       if (p != null && !p.isEmpty()) {
          this.b.this$0.s.post(new KSFeedListFooterPresenter$mObserver$2$a$c(this));
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       KSFeedListFooterPresenter$mObserver$2$a omObserver$2 = KSFeedListFooterPresenter$mObserver$2$a.class;
       if (PatchProxy.isSupport(omObserver$2) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omObserver$2, "4")) {
          return;
       }
       KSFeedListFooterPresenter p = this.b.this$0.p;
       if (p != null && p.isEmpty() == true) {
          KSFeedListFooterPresenter.R8(this.b.this$0).setVisibility(8);
       }else {
          KSFeedListFooterPresenter.R8(this.b.this$0).setVisibility(0);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(KSFeedListFooterPresenter$mObserver$2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, KSFeedListFooterPresenter$mObserver$2$a.class, "2")) {
          return;
       }
       KSFeedListFooterPresenter p = this.b.this$0.p;
       if (p != null && !p.hasMore()) {
          p = this.b.this$0.p;
          if (p != null && !p.isEmpty()) {
             this.b.this$0.s.post(new KSFeedListFooterPresenter$mObserver$2$a$b(this));
          }
       }
       return;
    }
}
