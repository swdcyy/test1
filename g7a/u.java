package g7a.u;
import com.kwai.component.tabs.panel.a$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import com.kwai.component.tabs.panel.h;
import yg5.c;
import d0a.f;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class u implements a$a	// class@0023fe
{
    public final d a;

    public void u(d p0){
       this.a = p0;
    }
    public void a(int p0,h p1){
       c.a(this, p0, p1);
    }
    public final void onPanelCloseEvent(int p0){
       u ta = this.a;
       d j = ta.J;
       if (j != null) {
          int i = 1;
          if (p0 == i) {
             j.onNext(new f(2));
             if (!PatchProxy.applyVoid(null, ta, d.class, "18")) {
                ta.C.get().a(a$a.c("COMMENT_DIALOG_CLOSE_BUTTON", ""));
             }
          }else if(p0 == 3){
             j.onNext(new f(i));
          }else {
             j.onNext(new f());
          }
       }else {
          ta.R8();
       }
       return;
    }
}
