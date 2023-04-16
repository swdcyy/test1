package com.yxcorp.gifshow.comment.presenter.global.a$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.yxcorp.gifshow.comment.presenter.global.a;
import kk9.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import xk9.d;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import el9.r;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StickerInfoPackage;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.x;
import java.util.Objects;
import yk9.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchStickerInfoPackage;
import q2b.h$b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import nk9.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.HashSet;
import org.greenrobot.eventbus.a;
import java.util.Set;
import xk9.g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import com.kuaishou.weapon.i.WeaponHI;

public class a$d implements BaseEditorFragment$c	// class@0010ee
{
    public int a;
    public final d b;
    public final BaseEditorFragment c;
    public final QComment d;
    public final GifshowActivity e;
    public final boolean f;
    public final a g;

    public void a$d(a p0,d p1,BaseEditorFragment p2,QComment p3,GifshowActivity p4,boolean p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       QComment qComment;
       Object obj = this;
       ClientContent$StickerInfoPackage[] obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$d.class, "3")) {
          return;
       }
       Iterator iterator = obj.g.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(obj.b, obj.c, obj1);
       }
       if (obj1.a == null) {
          if (!QCurrentUser.ME.isLogined()) {
             r or = new r(this, p0, obj.d, obj.f, obj.c);
             d.a(-1712118428).ne(obj.e, obj.g.r.getFullSource(), "comment_reply", 7, a.B.getString(R.string.arg_RES_7f103076), obj.g.r.mEntity, null, null, v16).h();
             return;
          }else if(obj.g.W8(obj1)){
             return;
          }else {
             obj.g.R8(obj1, obj.d, obj.f, obj.c);
             BaseEditorFragment$g g = obj1.g;
             if (g != null && g.size() > 0) {
                a q = obj.g.q;
                obj1 = new ClientContent$StickerInfoPackage[0];
                ClientContent$StickerInfoPackage[] stickerInfoP = obj1.g.toArray(obj1);
                x ox = obj.g.getActivity().N2();
                Objects.requireNonNull(q);
                if (!PatchProxy.applyVoidTwoRefs(stickerInfoP, ox, q, d.class, "31")) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   ClientContent$BatchStickerInfoPackage uBatchSticke = new ClientContent$BatchStickerInfoPackage();
                   uContentPack.batchStickerInfoPackage = uBatchSticke;
                   uBatchSticke.batchInfoPackage = stickerInfoP;
                   h$b uob = h$b.d(7, 0x75a5);
                   uob.h(uContentPack);
                   uob.l(q.a.getFeedLogCtx());
                   b.a(0x4b316083).L0("", uob, ox);
                }
             }
          }
       }else {
          a$d g1 = obj.g;
          g1.q.w(obj.d, g1.L, g1.getActivity().N2());
          a$d g2 = obj.g;
          a uoa = new a(g2.r, obj1.c, obj1.e, obj1.f, obj1.g, obj1.r, obj1.s, g2.getActivity().hashCode());
          g2 = (g1.a())? obj.d: null;
          g1.b(g2);
          a.d().k(g1);
       }
    label_0137 :
       iterator = obj.g.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(obj.d);
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       Iterator iterator = this.g.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(this.b, this.c, p0);
       }
       if (p0 != null && !q.f(this.g.t)) {
          BaseEditorFragment$h c = p0.c;
          if (c != null && p0.a == -1) {
             Iterator iterator1 = this.g.t.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().f(this.d);
             }
             RxBus.f.b(new b(false));
             iterator1.P = false;
          }else if(c == null){
             BaseEditorFragment$h b = p0.b;
             a$d tg = this.g;
             if ((p0.a + b) <= tg.N && this.a != b) {
                this.a = b;
                iterator = tg.t.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(p0.a, this.d);
                }
             }
          }
       }
       return;
    }
    public void d(BaseEditorFragment$m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "2")) {
          return;
       }
       Iterator iterator = this.g.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(this.b, this.c, p0);
       }
       WeaponHI.setT(3, p0.c);
       return;
    }
}
