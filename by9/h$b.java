package by9.h$b;
import erd.g;
import by9.h;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import k2b.e0;
import by9.h$a;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.util.List;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;

public final class h$b implements g	// class@00051b
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$b.class, "1")) {
       }else {
          a.o(p0, "index");
          h.x.b(h.o0(this.b), "AUTHOR_HEAD", h.n0(this.b), p0.intValue());
          CoCreateInfo coCreateInfo = h.o0(this.b).getCoCreateInfo();
          if (coCreateInfo != null) {
             coCreateInfo = coCreateInfo.mMembers;
             if (coCreateInfo != null) {
                CoCreateInfo$CoCreateMember uCoCreateMem = coCreateInfo.get(p0.intValue());
                if (uCoCreateMem != null) {
                   uCoCreateMem = uCoCreateMem.mUserId;
                   h v = this.b.v;
                   if (v != null) {
                      v.onNext(p0);
                   }
                   ProfileStartParam profileStart = ProfileStartParam.m(String.valueOf(uCoCreateMem));
                   profileStart.C("COCREATE");
                   profileStart.s(p0.intValue());
                   profileStart.x(h.o0(this.b).getEntity());
                   d.a(-1718536792).tn(this.b.w, profileStart, 0, null);
                }
             }
          }
          PatchProxy.onMethodExit(h$b.class, "1");
       }
       return;
    }
}
