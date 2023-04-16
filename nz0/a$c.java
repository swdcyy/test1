package nz0.a$c;
import ql1.c;
import nz0.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ql1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.Gift;
import android.animation.AnimatorSet;
import android.animation.Animator;

public final class a$c implements c	// class@003431
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(GiftPanelItem p0,int p1,boolean p2){
       b.e(this, p0, p1, p2);
    }
    public void b(GiftPanelItem p0,int p1,boolean p2){
       b.f(this, p0, p1, p2);
    }
    public void c(GiftTab p0,GiftPanelItem p1,int p2,View p3){
       boolean b;
       AnimatorSet uAnimatorSet;
       Animator[] uAnimatorArr;
       Gift gift;
       a uoa = a.class;
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "giftTab");
       b.h(this, p0, p1, p2, p3);
       a$c ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean uBoolean = PatchProxy.applyTwoRefs(p0, p1, ta, uoa, "3");
       int i = 2;
       if (uBoolean != patchProxyRe) {
       }else if(p0 == GiftTab.PropsPanel){
          uBoolean = Boolean.FALSE;
       }else if(p1 == null){
          p0 = PatchProxy.applyOneRefs(p1, ta, uoa, "11");
          if (p0 != patchProxyRe) {
             b = p0.booleanValue();
          }else if(p1.mItemType == i || p1.isEnableJumpByLink()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             uBoolean = Boolean.FALSE;
          }else if(!q.f(p1.getSubPanelItems())){
             List subPanelItem = p1.getSubPanelItems();
             if (subPanelItem != null) {
                GiftPanelItem giftPanelIte = subPanelItem.get(false);
                if (giftPanelIte != null) {
                   gift = giftPanelIte.getGift();
                }
             }
             gift = null;
          }else {
             gift = p1.getGift();
          }
          if (gift != null) {
             uBoolean = Boolean.valueOf(gift.mDrawable);
          }
       }
       uBoolean = null;
       if (uBoolean != null) {
          b = uBoolean.booleanValue();
          a$c ta1 = this.a;
          if (ta1.d == null && b == ta1.c) {
             return;
          }else {
             ta1.d = false;
             float f = 0x3f800000;
             if (b) {
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, uoa, "5")) {
                   ta1.d();
                   ta1.h.setClickable(true);
                   ta1.f.setClickable(true);
                   uAnimatorSet = new AnimatorSet();
                   uAnimatorArr = new Animator[i];
                   uAnimatorArr[0] = ta1.b((float)ta1.c(), 0);
                   uAnimatorArr[1] = ta1.a(0, f);
                   uAnimatorSet.playTogether(uAnimatorArr);
                   ta1.a = uAnimatorSet;
                   uAnimatorSet.start();
                }
             }else {
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, uoa, "4")) {
                   ta1.d();
                   ta1.h.setClickable(false);
                   ta1.f.setClickable(false);
                   uAnimatorSet = new AnimatorSet();
                   uAnimatorArr = new Animator[i];
                   uAnimatorArr[0] = ta1.b(0, (float)ta1.c());
                   uAnimatorArr[1] = ta1.a(f, 0);
                   uAnimatorSet.playTogether(uAnimatorArr);
                   ta1.b = uAnimatorSet;
                   uAnimatorSet.start();
                }
             }
             ta1.c = b;
          }
       }
       return;
    }
    public void d(){
       b.d(this);
    }
    public void e(GiftTab p0,GiftPanelItem p1){
       b.a(this, p0, p1);
    }
    public void f(){
       b.c(this);
    }
    public void g(GiftTab p0){
       b.g(this, p0);
    }
    public void h(){
       b.b(this);
    }
}
