package eja.u1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.presenter.d0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.reduce.h;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import ok.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import wkd.b;
import rfc.a;
import com.kuaishou.android.model.feed.PhotoType;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ha5.b;
import ia5.a;

public final class u1 implements View$OnClickListener	// class@0026fe
{
    public final d0 b;

    public void u1(d0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       u1 tb = this.b;
       Objects.requireNonNull(tb);
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod0, "5")) {
       }else {
          d0 s = tb.s;
          if (!PatchProxy.applyVoidOneRefs(s, tb, uod0, "8")) {
             AggregateTemplateFeed mTemplateMod = s.mTemplateModel;
             d0 s1 = tb.s;
             AggregateTemplateFeed mTemplateMod1 = s1.mTemplateModel;
             if (s1 == s || mTemplateMod.mContentType == mTemplateMod1.mContentType) {
                tb.y.g(tb.p, s1);
             }
          }
          Object obj = tb.s.a(CommonMeta.class);
          n.j(obj);
          PymkLogSender.reportPymkNegative(QCurrentUser.ME.getId(), tb.t.f(), 0, obj, 3, "", "", "", tb.t.o());
          b.a(0x4a533fa).e(PhotoType.FEED_AGGREGATE_TEMPLATE.toInt(), tb.v.mContentType, "").subscribe(Functions.d());
          uod0 = tb.x;
          if (uod0 != null) {
             uod0.b(tb.s, tb.u, tb.v);
          }
          a.d(tb.v.mContentType, tb.z, tb.s, 1462, p0);
       }
       return;
    }
}
