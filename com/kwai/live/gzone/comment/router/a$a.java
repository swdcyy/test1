package com.kwai.live.gzone.comment.router.a$a;
import vq5.b;
import com.kwai.live.gzone.comment.router.a;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import ft5.b;
import d61.y;
import java.util.Objects;
import g47.c;
import com.facebook.imagepipeline.common.Priority;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import i2b.a;
import java.lang.Runnable;
import ekd.k1;
import android.widget.RelativeLayout;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import g47.e;

public class a$a implements b	// class@000ca4
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, str)) {
          return;
       }
       LiveLogTag gZONE = LiveLogTag.GZONE;
       b.Z(gZONE, "uri:"+p0.toString());
       if (p0.isHierarchical() && a1.i(this.a.getActivity())) {
          String queryParamet = p0.getQueryParameter("comment");
          boolean booleanQuery = p0.getBooleanQueryParameter("disablestaranim", true);
          if (TextUtils.isEmpty(queryParamet)) {
             return;
          }else {
             a r = this.a.r;
             if (r != null) {
                r.U2(queryParamet);
                b.c0(gZONE, "LiveGzoneAudienceCommentRouterPresenter", "send comment", queryParamet);
             }
             if (!booleanQuery && !y.d(this.a.getActivity())) {
                a$a ta = this.a;
                Objects.requireNonNull(ta);
                a uoa = a.class;
                if (!PatchProxy.applyVoid(null, ta, uoa, "3")) {
                   b.Z(gZONE, "LiveGzoneAudienceCommentRouterPresenter start comment animation");
                   if (!PatchProxy.applyVoid(null, null, c.class, str)) {
                      Priority hIGH = Priority.HIGH;
                      c.a("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon1.webp", hIGH);
                      c.a("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon2.webp", hIGH);
                      c.a("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon3.webp", hIGH);
                   }
                   if (!PatchProxy.applyVoid(null, ta, uoa, "5") && ta.p.b().getView() instanceof ViewGroup) {
                      ViewGroup viewGroup = ta.getActivity().findViewById(0x1020002);
                      LiveGzoneAudienceCommandIconAnimView liveGzoneAud = viewGroup.findViewById(R.id.live_gzone_audience_icon_anim_view);
                      ta.v = liveGzoneAud;
                      if (liveGzoneAud == null) {
                         liveGzoneAud = a.i(viewGroup, R.layout.arg_RES_7f0d0b87);
                         ta.v = liveGzoneAud;
                         viewGroup.addView(liveGzoneAud);
                      }
                   }
                   a v = ta.v;
                   if (v != null) {
                      if (!PatchProxy.applyVoid(null, v, LiveGzoneAudienceCommandIconAnimView.class, str)) {
                         k1.m(v.o);
                         if (v.getVisibility()) {
                            v.setVisibility(0);
                            v.startAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.arg_RES_7f010085));
                         }
                         k1.o(v.o);
                      }
                      k1.s(new e(ta), ta, 0x2710);
                   }
                }
             }
          }
       }
    label_0114 :
       return;
    }
}
