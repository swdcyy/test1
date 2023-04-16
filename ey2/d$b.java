package ey2.d$b;
import kr5.c;
import ey2.d;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.voiceparty.LiveVoicePartyEnterRoomData;
import android.view.View;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import android.view.ViewGroup;
import hr5.a;
import lr5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import i2b.a;
import ey2.d$a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.Objects;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import ey2.c;
import android.animation.Animator$AnimatorListener;
import ey2.e;
import java.lang.Runnable;
import android.widget.ImageView;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenLottieView;
import hm2.j;
import az1.a;
import com.kuaishou.live.core.show.wealthgrade.c;
import com.airbnb.lottie.LottieAnimationView;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c$b;
import com.kuaishou.live.common.core.basic.resource.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import n91.e;

public class d$b extends c	// class@002814
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.p(p0);
    }
    public void e(LiveFloatingScreenBaseData p0,View p1){
       this.o(p0, p1);
    }
    public void g(LiveFloatingScreenCommonData p0,ViewGroup p1,a p2,a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d$b.class, "1")) {
       }else {
          View view = a.a(this.a.D2(), R.layout.arg_RES_7f0d16a8);
          d$a enterRoomInf = p0.getEnterRoomInfo();
          if (enterRoomInf != null) {
             TextView textView = view.findViewById(R.id.live_voice_party_welcome_nearby_tag);
             TextView textView1 = view.findViewById(R.id.live_voice_party_welcome_sex_tag);
             TextView textView2 = view.findViewById(R.id.live_voice_party_welcome_micseat_level_tag);
             if (enterRoomInf.a != null) {
                if (enterRoomInf.c != null) {
                   textView.setVisibility(0);
                   textView1.setVisibility(8);
                   textView2.setVisibility(0);
                   textView2.setText(enterRoomInf.f);
                }else {
                   textView.setVisibility(0);
                   int b = ("M").equalsIgnoreCase(enterRoomInf.b.userGender);
                   textView1.setVisibility(0);
                   textView2.setVisibility(8);
                   int i = (b)? 0x7f1038ec: 0x7f1038eb;
                   textView1.setText(i);
                   Drawable uDrawable = a.r(textView1.getBackground());
                   b = (b)? d.s: d.t;
                   a.n(uDrawable, b);
                   textView1.setBackground(uDrawable);
                }
             }else if(enterRoomInf.c != null){
                textView.setVisibility(8);
                textView1.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText(enterRoomInf.f);
             }
             p1.addView(view);
             super.g(p0, p1, p2, p3);
          }
       }
       return;
    }
    public void h(LiveFloatingScreenCommonData p0,KwaiImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "2")) {
       }else {
          super.h(p0, p1);
          d$b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p1, ta, d.class, "6")) {
             ta.V2();
             ObjectAnimator objectAnimat = j.a(p1, new float[2]{0x3f800000,0});
             ta.p = objectAnimat;
             objectAnimat.setDuration(1600);
             ta.p.addListener(new c(ta, p1));
          }
          d$a enterRoomInf = p0.getEnterRoomInfo();
          if (enterRoomInf != null) {
             enterRoomInf = enterRoomInf.d;
             e uoe = (enterRoomInf == 5 || enterRoomInf == 6)? 1: null;
             if (uoe) {
                p1.postDelayed(new e(this), 600);
             }
          }
       }
       return;
    }
    public void i(LiveFloatingScreenCommonData p0,LiveFloatingScreenLottieView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "3")) {
       }else {
          super.i(p0, p1);
          if (p1 == null || (p0.getEnterRoomInfo() != null && p0.getEnterRoomInfo().d == 6)) {
             p1.setVisibility(0);
             j.a(p1, d.r);
             c.c(p1, new a(), c.a, 0);
          }
       }
       return;
    }
    public void l(LiveFloatingScreenCommonData p0,View p1){
       this.o(p0, p1);
    }
    public boolean n(LiveFloatingScreenCommonData p0){
       return this.p(p0);
    }
    public void o(LiveVoicePartyEnterRoomData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "5")) {
          return;
       }
       super.l(p0, p1);
       this.a.V2();
       return;
    }
    public boolean p(LiveVoicePartyEnterRoomData p0){
       d$b obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.n(p0);
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo == null) {
          return false;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(userInfo, obj, d.class, "5")) {
          obj.n.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 0, false, 78);
       }
       return true;
    }
}
