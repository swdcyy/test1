package k72.b;
import kr5.a;
import java.lang.Object;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.noble.LiveAdvancedEnterRoomData;
import android.view.View;
import android.animation.Animator;
import android.content.Context;
import hr5.a;
import lr5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import ekd.m1;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdTextView;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import er5.a;
import kr5.a$a;
import java.lang.Boolean;

public class b implements a	// class@0033b5
{

    public void b(){
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.h(p0);
    }
    public Animator b(LiveFloatingScreenBaseData p0,View p1){
       return this.g(p0, p1);
    }
    public View c(LiveFloatingScreenBaseData p0,Context p1,a p2,a p3){
       View view = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (view != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          a.p(p2, "resourceProvider");
          a.p(p3, "viewParser");
          view = a.a(p1, R.layout.arg_RES_7f0d09cb);
          if (view != null) {
             LiveFloatingScreenStdImageView liveFloating = m1.f(view, R.id.live_enter_room_noble_user_avatar);
             LiveFloatingScreenStdImageView liveFloating1 = m1.f(view, R.id.live_enter_room_noble_user_avatar_ring);
             LiveFloatingScreenStdImageView liveFloating2 = m1.f(view, R.id.live_enter_room_noble_welcome_image);
             LiveFloatingScreenStdTextView liveFloating3 = m1.f(view, R.id.live_enter_room_noble_welcome_text);
             if (liveFloating != null) {
                liveFloating.p0(p0.getAvatarImageItem(), p2);
             }
             if (liveFloating1 != null) {
                liveFloating1.p0(p0.getAvatarRingImageItem(), p2);
             }
             if (liveFloating2 != null) {
                liveFloating2.p0(p0.getWelcomeImageItem(), p2);
             }
             if (liveFloating3 != null) {
                liveFloating3.a(p0.getWelcomeTextItem());
             }
          }
       }
       return view;
    }
    public void d(a p0,LiveFloatingScreenBaseData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
       }else {
          a.p(p0, "mountManager");
          a.p(p1, "data");
          p0.a(p1);
       }
       return;
    }
    public void e(LiveFloatingScreenBaseData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
       }else {
          a.p(p0, "data");
       }
       return;
    }
    public void f(LiveFloatingScreenBaseData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
       }else {
          a.p(p0, "data");
       }
       return;
    }
    public Animator g(LiveAdvancedEnterRoomData p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "floatingView");
       return a$a.b(this, p0, p1);
    }
    public boolean h(LiveAdvancedEnterRoomData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return false;
    }
}
