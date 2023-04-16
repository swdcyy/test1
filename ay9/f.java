package ay9.f;
import erd.g;
import ay9.q;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.x0;
import com.kwai.slide.play.detail.information.caption.l;
import qp7.g;
import xq7.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import pp7.b;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import io.reactivex.subjects.PublishSubject;

public final class f implements g	// class@0002f5
{
    public final q b;

    public void f(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (VisitorModeManager.g(8)) {
       }else {
          p0 = q.class;
          if (!PatchProxy.applyVoid(null, tb, p0, "12")) {
             String str = "14";
             q oq = 1;
             if (!PatchProxy.applyVoid(null, tb, p0, str)) {
                p0 = new ClientEvent$ElementPackage();
                p0.action2 = "CLICK_PHOTO_CAPTION";
                i3 oi3 = i3.f();
                oi3.c("questionnaire_link", Integer.valueOf((TextUtils.x(tb.v.getQuestionnaireLink()) ^ oq)));
                String str1 = (tb.v.isAtlasPhotos() || tb.v.isLongPhotos())? "ALBUM_VIEW": "";
                oi3.d("caption_type", str1);
                p0.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(tb.v.getEntity());
                ClickMetaData uClickMetaDa = new ClickMetaData();
                uClickMetaDa.setElementPackage(p0).setContentPackage(uContentPack);
                u1.B(uClickMetaDa);
             }
             if (tb.H().i0()) {
                tb.E().t();
             }else if(tb.v.isQuestionnaire()){
                tb.D().i();
             }else if(tb.v.isAtlasPhotos() || tb.v.isLongPhotos()){
                tb.H().w1.onNext(Boolean.TRUE);
             }else if(tb.H().a() == oq){
                tb.E().t();
             }else if(tb.H().a() == 2){
                if (tb.v.equals(tb.A.getCurrentPhoto()) && tb.I.v()) {
                   p0 = tb.E();
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoid(null, p0, l.class, str)) {
                      p0.i.f(Boolean.TRUE);
                   }
                }
             }else {
                p0 = new g(0, null);
                p0.c = oq;
                tb.H().u1.onNext(p0);
             }
          }
       }
       return;
    }
}
