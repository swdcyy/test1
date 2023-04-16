package com.yxcorp.gifshow.reminder.friend.presenter.item.f;
import d6a.a;
import com.yxcorp.gifshow.reminder.friend.presenter.item.g;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.JsonObject;
import lec.f;
import java.lang.Integer;
import k2b.f3;
import java.util.Objects;
import java.lang.Boolean;
import hm8.a;
import lec.u;
import java.lang.Math;
import ekd.k1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import im8.f;
import crd.b;
import lnc.b9;
import crd.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import xdc.o;
import erd.r;
import xdc.m;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.trello.rxlifecycle3.components.support.RxFragment;
import xdc.p;
import xdc.n;

public class f extends a	// class@001ad1
{
    public final FeedFriendInfo b;
    public final HyperTag c;
    public final String d;
    public final AtomicBoolean e;
    public final g f;

    public void f(g p0,FeedFriendInfo p1,HyperTag p2,String p3,AtomicBoolean p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void i2(){
       boolean len;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f tb = this.b;
       if (tb.mHasShownUnreadFinishTips == null) {
          JsonObject jsonObject = f.a(tb, this.f.p);
          f tc = this.c;
          HyperTag mActionUrl = (tc != null)? tc.mActionUrl: this.d;
          HyperTag hyperTag = mActionUrl;
          if (tc != null) {
             HyperTag mIcons = tc.mIcons;
             if (mIcons != null) {
                len = mIcons.length;
             label_002f :
                if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(hyperTag, Integer.valueOf(len), jsonObject, null, f.class, "8")) {
                   f3 uof3 = f3.l("1286945", "NEW_PHOTO_FINISHED_BUTTON");
                   uof3.m(f.b(hyperTag, len, jsonObject));
                   uof3.g();
                }
                len = true;
                this.b.mHasShownUnreadFinishTips = len;
                tb = this.f;
                boolean b = this.e.get();
                Objects.requireNonNull(tb);
                if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, og, "9")) {
                   if (b) {
                      a.j(Math.min((a.c() + len), u.a()));
                   }else {
                      a.j(len);
                   }
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putLong(b.d("user")+"friend_slide_play_unread_finish_tips_last_show_timestamp", k1.i());
                   g.a(uEditor);
                }
                this.f.s.set(Boolean.FALSE);
                tb = this.f;
                tc = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(tc, tb, og, "6")) {
                   b9.a(tb.y);
                   a uoa = new a();
                   tb.y = uoa;
                   uoa.c(tb.q.Vg().j().filter(new o(tc)).subscribe(new m(tb), Functions.d()));
                   n on = new n(tb);
                   tb.y.c(tb.q.m().filter(new p(tc)).subscribe(on, Functions.d()));
                }
             }
          }
          len = 0;
          goto label_002f ;
       }
       return;
    }
}
