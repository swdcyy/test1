package dcc.g;
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
import dcc.g$a;
import erd.o;
import dcc.g$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import z1.a;
import com.kwai.library.widget.button.SlipSwitchButton;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import dcc.g$c;
import com.kwai.framework.model.feed.BaseFeed;
import tac.b;

public final class g extends c	// class@002175
{
    public b f;
    public b g;
    public final User h;
    public final GifshowActivity i;
    public final b j;

    public void g(View p0,User p1,GifshowActivity p2,b p3){
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
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       b a = this.j.a;
       if (a != null) {
          a.run();
       }
       c tb = this.b;
       int i = (this.h.isFemale())? 0x7f1010bc: 0x7f1010bd;
       tb.setText(i);
       this.b.setVisibility(0);
       this.d.setVisibility(0);
       this.f = t.merge(t.just(this.h), this.h.observable()).distinctUntilChanged(g$a.b).subscribe(new g$b(this), Functions.d());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       b d = this.j.d;
       int i = 1;
       if (d != null) {
          d.accept(Boolean.valueOf((this.h.mHasRemoved ^ i)));
       }
       this.d.g((this.h.mHasRemoved ^ i), i, false);
       g tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       g th = this.h;
       this.g = b.a(-1578665399).b(this.i, th, null, th.mHasRemoved, true, true, true, new g$c(this));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.f = null;
       return;
    }
}
