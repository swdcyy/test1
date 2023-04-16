package b7c.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.pymk.element.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vm5.h$a;
import com.kwai.framework.model.user.RecoUser;
import im8.f;
import java.lang.Integer;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import y6c.h;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import f7c.c;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class m implements View$OnClickListener	// class@0003ce
{
    public final e b;

    public void m(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       e t = tb.t;
       if (PatchProxy.applyVoidOneRefs(t, tb, e.class, "8")) {
       }else {
          e b = tb.B;
          b.O = 85;
          e a = tb.A;
          b.d = a;
          b.c = a.mUser;
          h$a f = b.f;
          if (f != null) {
             f.set(tb.y.get());
          }
          tb.B.P = h.a(tb.r.getCommonMeta());
          h oh = new h(tb.v, tb.u, tb.A, tb.x, tb.y.get().intValue());
          e b1 = tb.B;
          if (!PatchProxy.applyVoidTwoRefs(t, b1, f, h.class, "1") && f.a != null) {
             h b2 = f.b;
             if (b2 != null) {
                b2.startSyncWithFragment(f.c.m());
                QPhoto qPhoto = new QPhoto(f.b);
                oh = f.d;
                if (oh != null) {
                   qPhoto.setUser(oh);
                }
                if (qPhoto.isLiveStream()) {
                   f.b(f.a, qPhoto);
                   f.f.g3(qPhoto.mEntity, f.e, f.d, f.g);
                }else {
                   f.c(f.a, qPhoto, t, b1);
                   f.f.Qe(qPhoto.mEntity, f.e, f.d, f.g);
                }
             }
          }
       }
    label_00ad :
       return;
    }
}
