package dcc.h;
import dcc.c;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dcc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.TextView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import brd.w;
import dcc.h$a;
import erd.o;
import dcc.h$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import z1.a;
import com.kwai.library.widget.button.SlipSwitchButton;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import dcc.h$c;
import com.kwai.framework.model.feed.BaseFeed;
import tac.b;

public final class h extends c	// class@002179
{
    public b f;
    public b g;
    public final User h;
    public final GifshowActivity i;
    public final b j;

    public void h(View p0,User p1,GifshowActivity p2,b p3){
       a.p(p0, "itemView");
       a.p(p1, "user");
       a.p(p2, "activity");
       a.p(p3, "callback");
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       b a = this.j.a;
       if (a != null) {
          a.run();
       }
       c tb = this.b;
       int i = (this.h.isFemale())? 0x7f1010be: 0x7f1010bf;
       tb.setText(i);
       this.b.setVisibility(0);
       this.d.setVisibility(0);
       this.f = t.merge(t.just(this.h), this.h.observable()).distinctUntilChanged(h$a.b).subscribe(new h$b(this), Functions.d());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       b d = this.j.d;
       int i = 1;
       if (d != null) {
          d.accept(Boolean.valueOf((this.h.mHasReverseRemoved ^ i)));
       }
       this.d.g((this.h.mHasReverseRemoved ^ i), i, false);
       h tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       h th = this.h;
       this.g = b.a(-1578665399).A(this.i, th, null, th.mHasReverseRemoved, true, true, new h$c(this));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       h tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.f = null;
       return;
    }
}
