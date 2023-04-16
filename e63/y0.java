package e63.y0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import fs3.g;
import mz6.b$d;
import oz1.b;
import mz6.b;
import android.content.Context;
import java.util.Collection;
import com.kuaishou.live.gzone.v2.profile.f;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import e63.z0;
import android.content.DialogInterface$OnCancelListener;
import e63.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.UserProfile;
import e63.b1;
import com.kuaishou.live.gzone.v2.profile.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import tx1.d;

public final class y0 implements View$OnClickListener	// class@00267b
{
    public final e b;

    public void y0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b uob1;
       y0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "33")) {
       }else {
          e p = tb.p;
          LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
          int i = 0x7f101d16;
          int i1 = 0x7f1028af;
          int i2 = 0x7f102225;
          if (tb.r.getOriginUserAssType() == pUSHER) {
             ArrayList uArrayList = new ArrayList();
             if (d.a(-1695065466).gc(tb.r.getLiveStreamId())) {
                uArrayList.add(tb.h9(R.string.arg_RES_7f104a8e));
                b.j(tb.r.getLiveStreamId());
             }
             int i3 = (tb.r.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? 0x7f102cfb: 0x7f102cfd;
             uArrayList.add(tb.h9(i3));
             if (tb.r.getTargetUserAssType() != LiveApiParams$AssistantType.ADMIN) {
                i = 0x7f10406c;
             }
             uArrayList.add(tb.h9(i));
             if (tb.f1 != null) {
                uArrayList.add(tb.h9(i1));
             }else {
                uArrayList.add(tb.h9(i2));
             }
             uArrayList.add(tb.h9(R.string.arg_RES_7f10406b));
             uArrayList.add(tb.h9(R.string.arg_RES_7f100103));
             b uob = new b(p);
             uob.b(uArrayList);
             uob.l(new f(tb));
             uob.q();
          }else if(tb.r.getTargetUserAssType() != pUSHER){
             uob1 = new b(p);
             LiveApiParams$AssistantType sUPER_ADMIN = LiveApiParams$AssistantType.SUPER_ADMIN;
             if (tb.r.getOriginUserAssType() == sUPER_ADMIN && tb.r.getTargetUserAssType() != sUPER_ADMIN) {
                if (tb.r.getTargetUserAssType() != LiveApiParams$AssistantType.ADMIN) {
                   i = 0x7f10406c;
                }
                b$d uod = tb.h9(i);
                uod.f(R.drawable.arg_RES_7f0812bd);
                uob1.a(uod);
                if (tb.r.getOriginUserAssPrivilege().mForbidComment != null) {
                   if (tb.f1 != null) {
                      uob1.a(tb.h9(i1));
                   }else {
                      uob1.a(tb.h9(i2));
                   }
                }
                if (tb.r.getOriginUserAssPrivilege().mKickUser != null) {
                   uob1.a(tb.h9(R.string.arg_RES_7f10406b));
                }
                if (tb.r.getOriginUserAssPrivilege().mBlock != null) {
                   uob1.a(tb.h9(R.string.arg_RES_7f100103));
                }
                uob1.a(tb.h9(R.string.arg_RES_7f10169b));
             }else if(tb.r.getOriginUserAssType() == LiveApiParams$AssistantType.ADMIN && tb.r.getTargetUserAssType() == LiveApiParams$AssistantType.AUDIENCE){
                if (tb.r.getOriginUserAssPrivilege().mForbidComment != null) {
                   if (tb.f1 != null) {
                      uob1.a(tb.h9(i1));
                   }else {
                      uob1.a(tb.h9(i2));
                   }
                }
                if (tb.r.getOriginUserAssPrivilege().mKickUser != null) {
                   uob1.a(tb.h9(R.string.arg_RES_7f10406b));
                }
                if (tb.r.getOriginUserAssPrivilege().mBlock != null) {
                   uob1.a(tb.h9(R.string.arg_RES_7f100103));
                }
                uob1.a(tb.h9(R.string.arg_RES_7f10169b));
             }else {
                uob1.a(tb.h9(R.string.arg_RES_7f10169b));
             }
             uob1.k(new z0(tb));
             uob1.l(new a1(tb, p));
             uob1.q();
          }else {
             uob1 = new b(p);
             ArrayList uArrayList1 = new ArrayList();
             if (tb.r.getLiveSourceType() == 4) {
                uArrayList1.add(tb.h9(R.string.arg_RES_7f10169b));
                uArrayList1.add(tb.j9(R.string.arg_RES_7f104f68));
                if (tb.r.getUserProfile().isFollowing != null) {
                   uArrayList1.add(tb.h9(R.string.arg_RES_7f104f05));
                }
             }else {
                uArrayList1.add(tb.h9(R.string.arg_RES_7f10169b));
                uArrayList1.add(tb.j9(R.string.arg_RES_7f104f68));
                uArrayList1.add(tb.h9(R.string.arg_RES_7f100103));
             }
             uob1.b(uArrayList1);
             uob1.k(new b1(tb));
             uob1.l(new g(tb, p));
             uob1.q();
          }
          p = tb.y;
          if (p != null) {
             p.onClickMoreAtLiveTips(tb.r.getBaseFeed(), tb.r.getUserProfile().mProfile.mId);
          }
          e w = tb.w;
          if (w != null) {
             w.f();
          }
       }
       return;
    }
}
