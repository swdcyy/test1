package ei2.a;
import z1.k;
import uw1.m;
import zh2.b;
import bi2.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ah1.c;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardView;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import zh2.o;
import android.view.ViewParent;
import zh2.g;
import bi2.g;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import android.content.Context;
import androidx.fragment.app.Fragment;
import zh2.h;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import zh2.i;
import zh2.j;
import zh2.k;
import zh2.l;
import android.view.View$OnClickListener;
import android.widget.TextView;
import zh2.m;
import zh2.n;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUnUsedVM;
import zh2.c;
import zh2.d;
import zh2.e;
import zh2.f;
import java.lang.Long;

public final class a	// class@002728
{
    public LiveRichCardUnUsedVM a;
    public LiveRichCardUsedVM b;
    public g c;
    public o d;
    public final c e;
    public k f;
    public final m g;
    public final b h;
    public final e i;

    public void a(k p0,m p1,b p2,e p3){
       a.p(p0, "redPacketDiaLogFragment");
       a.p(p1, "redPacketService");
       a.p(p2, "liveRichCardListener");
       a.p(p3, "richCardModel");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       c uoc = new c("countDownModel", null, false, false, 14, null);
       this.e = p0;
    }
    public final void a(){
       ViewGroup viewGroup;
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       LiveRedPacketContainerDialogFragment liveRedPacke = this.f.get();
       if (liveRedPacke != null) {
          viewGroup = liveRedPacke.Ch();
          int i = 0;
          int childCount = (viewGroup != null)? viewGroup.getChildCount(): 0;
          Object[] objArray = null;
          while (i < childCount) {
             ViewGroup viewGroup1 = liveRedPacke.Ch();
             View childAt = (viewGroup1 != null)? viewGroup1.getChildAt(i): null;
             if (childAt instanceof LiveRichCardView) {
                objArray = childAt;
             }
             i = i + 1;
          }
          if (objArray != null) {
             viewGroup = liveRedPacke.Ch();
             if (viewGroup != null) {
                viewGroup.removeView(objArray);
             }
          }
          this.i.c(liveRedPacke);
          this.e.c(liveRedPacke);
       }
       a td = this.d;
       String str = "3";
       if (td != null && !PatchProxy.applyVoid(null, td, o.class, str)) {
          ViewGroup parent = td.h.getParent();
          o h = td.h;
          if (h != null && parent != null) {
             parent.removeView(h);
          }
       }
       td = this.c;
       if (td != null && !PatchProxy.applyVoid(null, td, g.class, str)) {
          viewGroup = td.d.getParent();
          g d = td.d;
          if (d != null && viewGroup != null) {
             viewGroup.removeView(d);
          }
       }
       this.b = null;
       this.d = null;
       this.a = null;
       this.c = null;
       return;
    }
    public final void b(){
       boolean b;
       a uoa1;
       LiveRichCardView liveRichCard1;
       ViewGroup viewGroup1;
       LiveRichCardView liveRichCard4;
       int childCount;
       Object[] objArray1;
       LiveRichCardUsedVM liveRichCard = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveRichCard, uoa, "4")) {
          return;
       }
       g og = liveRichCard.i.a();
       og = (og != null)? og.g: objArray;
       g og1 = liveRichCard.i.a();
       Integer integer = (og1 != null)? Integer.valueOf(og1.d()): objArray;
       Object obj = liveRichCard.f.get();
       if (!obj instanceof LiveRedPacketContainerDialogFragment) {
          return;
       }else if(obj.Ch() == null){
          b.Z(LiveLogTag.RED_PACKET, "[LiveRichCardDetailManager][tryInitRichCardBlackTips]: richCardViewContainer is null");
          return;
       }else {
          ViewGroup viewGroup = obj.Ch();
          Object obj1 = PatchProxy.applyOneRefs(viewGroup, liveRichCard, uoa, "3");
          b = false;
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(viewGroup != null){
             childCount = viewGroup.getChildCount();
          }else {
             childCount = 0;
          }
          int i2 = 0;
          while (i2 < childCount) {
             View childAt = (viewGroup != null)? viewGroup.getChildAt(i2): objArray;
             if (childAt instanceof LiveRichCardView) {
                b = true;
                break ;
             }
             i2 = i2 + 1;
          }
          if (b) {
             return;
          }else if(integer != null && (integer.intValue() != 10 || (!PatchProxy.applyVoidTwoRefs(obj, og, liveRichCard, uoa, "1") && obj.Ch() != null))){
             LiveRichCardUsedVM liveRichCard2 = v8;
             LiveRichCardUsedVM liveRichCard3 = v8;
             uoa1 = uoa;
             int i1 = 10;
             liveRichCard2 = new LiveRichCardUsedVM(obj, liveRichCard.e, liveRichCard.i, liveRichCard.h, og);
             liveRichCard.b = liveRichCard3;
             Context context1 = obj.getContext();
             if (context1 != null) {
                a.o(context1, "it");
                liveRichCard4 = new LiveRichCardView(context1, i1);
             }else {
                liveRichCard4 = null;
             }
             o oo = (liveRichCard4 != null)? new o(liveRichCard4): null;
             liveRichCard.d = oo;
             a b1 = liveRichCard.b;
             if (b1 == null || (oo != null && !PatchProxy.applyVoidTwoRefs(obj, b1, oo, o.class, "1"))) {
                a.p(obj, "lifecycleOwner");
                a.p(b1, "viewModel");
                b1.a.observe(obj, new h(oo));
                b1.u0().observe(obj, new i(oo));
                b1.v0().observe(obj, new j(oo));
                b1.x0().observe(obj, new k(oo));
                oo.c.setOnClickListener(new l(b1));
                oo.h.setOnClickListener(m.b);
                b1.w0().observe(obj, new n(oo));
             }
          label_0138 :
             viewGroup1 = obj.Ch();
             if (viewGroup1 != null) {
                viewGroup1.addView(liveRichCard4);
             }
          }else {
             uoa1 = uoa;
          }
          if (integer != null) {
             int i = 7;
             if (integer.intValue() != i || (!PatchProxy.applyVoidTwoRefs(obj, og, liveRichCard, uoa1, "2") && obj.Ch() != null)) {
                liveRichCard.a = new LiveRichCardUnUsedVM(obj, liveRichCard.i, liveRichCard.h, og);
                Context context = obj.getContext();
                if (context != null) {
                   a.o(context, "it");
                   liveRichCard1 = new LiveRichCardView(context, i);
                }else {
                   liveRichCard1 = null;
                }
                g og2 = (liveRichCard1 != null)? new g(liveRichCard1): null;
                liveRichCard.c = og2;
                uoa = liveRichCard.a;
                if (uoa == null || (og2 != null && !PatchProxy.applyVoidTwoRefs(obj, uoa, og2, g.class, "1"))) {
                   a.p(obj, "lifecycleOwner");
                   a.p(uoa, "viewModel");
                   uoa.v0().observe(obj, new c(og2));
                   og2.b.setOnClickListener(new d(uoa));
                   og2.d.setOnClickListener(e.b);
                   uoa.u0().observe(obj, new f(og2));
                }
             label_01c5 :
                viewGroup1 = obj.Ch();
                if (viewGroup1 != null) {
                   viewGroup1.addView(liveRichCard1);
                }
             }
          }
       label_01ce :
          return;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.a();
       return;
    }
    public final void d(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "9")) {
          return;
       }
       this.e.e("updateExitTime", Long.valueOf(p0));
       return;
    }
}
