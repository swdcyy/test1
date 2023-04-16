package g7a.c;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import java.lang.Object;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;
import e17.s;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$BottomEditorClickType;
import fx9.c$a;
import k2b.e0;
import brd.y;
import fx9.c$c;
import fx9.c$b;
import fx9.c$f;
import com.kuaishou.android.model.mix.QComment;
import r7a.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import fx9.c$g;
import java.util.List;
import fx9.c$e;

public final class c implements g	// class@0023d1
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "10")) {
       }else if(tb.D.t() != tb.s){
          if (!tb.t.isAllowComment()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10078c);
          }else if(tb.p != null){
             s.h(a1.p(R.string.arg_RES_7f10076d));
          }else {
             MilanoContainerEventBus$a b = p0.b;
             if (b == MilanoContainerEventBus$BottomEditorClickType.AT_USER_BTN) {
                tb.x.onNext(new c$a(p0.c.toString(), tb.s));
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.EMOJI_BTN){
                tb.x.onNext(new c$c(tb.s));
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.NORMAL_CONTAINER){
                tb.x.onNext(new c$b("", tb.P8()));
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.FINISH_BTN){
                tb.x.onNext(new c$f(p0.d));
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.OVERALL_EMOTION){
                tb.x.onNext(new c$b(p0.c.toString(), tb.P8()));
                p0 = tb.s;
                if (p0 != null) {
                   a t = tb.t;
                   if (t != null && !PatchProxy.applyVoidTwoRefs(p0, t, null, a.class, "7")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "EMOJI_DYNAMIC_GUIDE";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.g(t.getEntity(), (t.getPosition() + 1));
                      u1.B(new ClickMetaData().setLogPage(p0).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(t.getFeedLogCtx()));
                   }
                }
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.QUCIK_EMOJI){
                tb.x.onNext(new c$g(p0.g, p0.h));
             }else if(b == MilanoContainerEventBus$BottomEditorClickType.PICTURE_BTN){
                tb.x.onNext(new c$e(p0.c.toString(), tb.s));
             }
          }
       }
       return;
    }
}
