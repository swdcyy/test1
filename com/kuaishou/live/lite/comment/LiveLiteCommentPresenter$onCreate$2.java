package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vb3.n;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import q93.a;
import z1.k;
import kotlin.jvm.internal.a;
import v51.a;
import hf3.a;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import xp5.i;
import uf1.a;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteCommentPresenter$onCreate$2 extends Lambda implements a	// class@0007ea
{
    public final LiveLiteCommentPresenter this$0;

    public void LiveLiteCommentPresenter$onCreate$2(LiveLiteCommentPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommentPresenter$onCreate$2.class, "1")) {
          return;
       }
       n on = LiveLiteCommentPresenter.n9(this.this$0);
       LayoutViewType comboComment = LayoutViewType.ComboComment;
       LiveLiteCommentPresenter obj = LiveLiteCommentPresenter.l9(this.this$0).get();
       a.o(obj, "longConnectionManager.get\(\)");
       a uoa = obj.u();
       a.o(uoa, "longConnectionManager.get\(\).liveLongConnection");
       obj = LiveLiteCommentPresenter.c9(this.this$0).get();
       a.o(obj, "audienceInfoManager.get\(\)");
       LiveStreamFeedWrapper liveStreamFe = obj.r5();
       a.o(liveStreamFe, "audienceInfoManager.get\(\).liveStreamFeedWrapper");
       obj = LiveLiteCommentPresenter.k9(this.this$0).get();
       a.o(obj, "liveLogPackageProvider.get\(\)");
       Object obj1 = obj;
       obj = this.this$0.S;
       if (obj == null) {
          a.S("dataTransferManager");
       }
       a obj2 = obj.get();
       a.o(obj2, "dataTransferManager.get\(\)");
       Object obj3 = obj2;
       obj2 = new a(uoa, liveStreamFe, obj1, obj3, this.this$0.v.a(), this.this$0.x.a());
       on.c(comboComment, v9);
       return;
    }
}
