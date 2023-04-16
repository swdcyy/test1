package com.yxcorp.gifshow.notice.krn.RCTNoticeCommentEditorView;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import i2b.a;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.String;
import im8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ttb.g;
import ttb.l;

public class RCTNoticeCommentEditorView extends FrameLayout	// class@002195
{
    public View b;
    public PresenterV2 c;
    public PublishSubject d;

    public void RCTNoticeCommentEditorView(Context p0){
       super(p0);
       View view = a.a(p0, R.layout.arg_RES_7f0d10bc);
       this.b = view;
       if (view != null) {
          this.addView(view);
          this.d = PublishSubject.g();
          PresenterV2 noticeCommen = this.getNoticeCommentEditorPresenter();
          this.c = noticeCommen;
          noticeCommen.f(this.b);
          Object[] objArray = new Object[]{c.a("NOTICE_COMMENT_ACTION", this.d)};
          this.c.i(objArray);
       }
       return;
    }
    public final PresenterV2 getNoticeCommentEditorPresenter(){
       g obj = PatchProxy.applyWithListener(null, this, RCTNoticeCommentEditorView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g();
       obj.U7(new l());
       PatchProxy.onMethodExit(RCTNoticeCommentEditorView.class, "2");
       return obj;
    }
}
