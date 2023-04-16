package com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import ya1.v;
import brd.w;
import erd.c;
import brd.t;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget$c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.a;
import ya1.x;
import jd.c;
import s0d.e;
import ya1.w;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import fq1.d;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget$b;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget$a;

public final class LiveMultiVideoSceneAudioWidget extends FrameLayout	// class@000f1d
{
    public KwaiImageView b;
    public KwaiImageView c;
    public final PublishSubject d;
    public final PublishSubject e;
    public final t f;
    public HashMap g;

    public void LiveMultiVideoSceneAudioWidget(Context p0){
       a.p(p0, "context");
       super(p0);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.d = publishSubje;
       PublishSubject publishSubje1 = PublishSubject.g();
       a.o(publishSubje1, "PublishSubject.create<Unit>\(\)");
       this.e = publishSubje1;
       this.f = t.zip(publishSubje, publishSubje1, v.a);
       this.a(p0);
    }
    public void LiveMultiVideoSceneAudioWidget(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.d = publishSubje;
       PublishSubject publishSubje1 = PublishSubject.g();
       a.o(publishSubje1, "PublishSubject.create<Unit>\(\)");
       this.e = publishSubje1;
       this.f = t.zip(publishSubje, publishSubje1, v.a);
       this.a(p0);
    }
    public void LiveMultiVideoSceneAudioWidget(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.d = publishSubje;
       PublishSubject publishSubje1 = PublishSubject.g();
       a.o(publishSubje1, "PublishSubject.create<Unit>\(\)");
       this.e = publishSubje1;
       this.f = t.zip(publishSubje, publishSubje1, v.a);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiVideoSceneAudioWidget.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0cd0, this);
       View view = this.findViewById(R.id.live_multi_video_scene_audio_widget_background_view);
       a.o(view, "findViewById\(R.id.live_m¡­o_widget_background_view\)");
       this.b = view;
       view = this.findViewById(R.id.live_multi_video_scene_audio_widget_avatar_view);
       a.o(view, "findViewById\(R.id.live_m¡­audio_widget_avatar_view\)");
       this.c = view;
       return;
    }
    public final void b(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiVideoSceneAudioWidget.class, "2")) {
          return;
       }
       String str = "backgroundView";
       if (p0 == null) {
          LiveMultiVideoSceneAudioWidget tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          this.setDefaultImg(tb);
       }else {
          LiveMultiVideoSceneAudioWidget tc = this.c;
          if (tc == null) {
             a.S("avatarView");
          }
          a uoa = null;
          g.e(tc, p0, HeadImageSize.BIG, new LiveMultiVideoSceneAudioWidget$c(this), uoa);
          tc = this.b;
          if (tc == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidTwoRefs(p0, tc, this, LiveMultiVideoSceneAudioWidget.class, "4")) {
             int size = HeadImageSize.MIDDLE.getSize();
             f uof = f.x().r(p0.mHeadUrls).t(p0.mHeadUrl);
             uof.g(size);
             uof = uof.o(size, size);
             e[] uoeArray = uof.l(new x(30)).w();
             a.o(uoeArray, "KwaiImageRequestGroupBui¡­\n        .buildRequests\(\)");
             d uod = tc.g0(new w(this, tc), uoa, uoeArray);
             if (uod != null) {
                uoa = uod.e();
             }
             tc.setController(uoa);
          }
       }
       return;
    }
    public final t getFinishUpdateObservable(){
       LiveMultiVideoSceneAudioWidget obj = PatchProxy.apply(null, this, LiveMultiVideoSceneAudioWidget.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       a.o(obj, "finishUpdateObservable");
       return obj;
    }
    public final void setDefaultImg(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiVideoSceneAudioWidget.class, "5")) {
          return;
       }
       AbstractDraweeController uAbstractDra = null;
       d uod = p0.g0(new LiveMultiVideoSceneAudioWidget$a(this), uAbstractDra, f.x().s(d.d(R.drawable.detail_avatar_secret)).o(HeadImageSize.MIDDLE.getSize(), HeadImageSize.MIDDLE.getSize()).l(new LiveMultiVideoSceneAudioWidget$b(30)).w());
       if (uod != null) {
          uAbstractDra = uod.e();
       }
       p0.setController(uAbstractDra);
       return;
    }
}
