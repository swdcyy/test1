package df2.e;
import android.view.View$OnClickListener;
import df2.m0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import ne2.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import fs3.g;
import mz6.b$d;
import oz1.b;
import hy2.c;
import android.content.Context;
import java.util.Collection;
import mz6.b;
import df2.h0;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import df2.w;
import android.content.DialogInterface$OnCancelListener;
import df2.l0;
import com.kwai.framework.model.user.UserProfile;
import df2.l;
import df2.k0;
import tx1.d;

public final class e implements View$OnClickListener	// class@0024ed
{
    public final m0 b;

    public void e(m0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m0 d;
       c uoc1;
       e tb = this.b;
       m0 z = tb.z;
       Objects.requireNonNull(z);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, z, k.class, "7")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERSONAL_CARD_MORE";
          u1.G("", 1, uElementPack, z.a());
       }
       z = m0.class;
       if (!PatchProxy.applyVoid(objArray, tb, z, "12")) {
          m0 w = tb.w;
          if (tb.y == LiveProfileMode.ESCROW_VIEW_AUDIENCE) {
             tb.T9(w);
          }else {
             LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
             int i = 0x7f10406b;
             int i1 = 0x7f1028af;
             int i2 = 0x7f101d16;
             if (tb.x.getOriginUserAssType() == pUSHER) {
                if (!PatchProxy.applyVoidOneRefs(w, tb, z, "28")) {
                   ArrayList uArrayList = new ArrayList();
                   if (d.a(-1695065466).gc(tb.x.getLiveStreamId())) {
                      uArrayList.add(tb.j9(R.string.arg_RES_7f104a8e));
                      b.j(tb.x.getLiveStreamId());
                   }
                   int i3 = (tb.x.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? 0x7f102cfb: 0x7f102cfd;
                   uArrayList.add(tb.j9(i3));
                   if (tb.x.getTargetUserAssType() != LiveApiParams$AssistantType.ADMIN) {
                      i2 = 0x7f10406c;
                   }
                   uArrayList.add(tb.j9(i2));
                   if (tb.J != null) {
                      uArrayList.add(tb.j9(i1));
                   }else {
                      uArrayList.add(tb.j9(R.string.arg_RES_7f102225));
                   }
                   uArrayList.add(tb.j9(i));
                   uArrayList.add(tb.j9(R.string.arg_RES_7f100103));
                   c uoc = new c(w);
                   uoc.b(uArrayList);
                   uoc.l(new h0(tb));
                   uoc.q();
                }
             }else if(tb.x.getTargetUserAssType() != pUSHER){
                if (!PatchProxy.applyVoidOneRefs(w, tb, z, "27")) {
                   uoc1 = new c(w);
                   pUSHER = LiveApiParams$AssistantType.SUPER_ADMIN;
                   if (tb.x.getOriginUserAssType() == pUSHER && tb.x.getTargetUserAssType() != pUSHER) {
                      if (tb.x.getTargetUserAssType() != LiveApiParams$AssistantType.ADMIN) {
                         i2 = 0x7f10406c;
                      }
                      b$d uod = tb.j9(i2);
                      uod.f(R.drawable.arg_RES_7f0812bd);
                      uoc1.a(uod);
                      if (tb.x.getOriginUserAssPrivilege().mForbidComment != null) {
                         if (tb.J != null) {
                            uoc1.a(tb.j9(i1));
                         }else {
                            uoc1.a(tb.j9(R.string.arg_RES_7f102225));
                         }
                      }
                      if (tb.x.getOriginUserAssPrivilege().mKickUser != null) {
                         uoc1.a(tb.j9(i));
                      }
                      if (tb.x.getOriginUserAssPrivilege().mBlock != null) {
                         uoc1.a(tb.j9(R.string.arg_RES_7f100103));
                      }
                      uoc1.a(tb.j9(R.string.arg_RES_7f10169b));
                   }else if(tb.x.getOriginUserAssType() == LiveApiParams$AssistantType.ADMIN && tb.x.getTargetUserAssType() == LiveApiParams$AssistantType.AUDIENCE){
                      if (tb.x.getOriginUserAssPrivilege().mForbidComment != null) {
                         if (tb.J != null) {
                            uoc1.a(tb.j9(i1));
                         }else {
                            uoc1.a(tb.j9(R.string.arg_RES_7f102225));
                         }
                      }
                      if (tb.x.getOriginUserAssPrivilege().mKickUser != null) {
                         uoc1.a(tb.j9(i));
                      }
                      if (tb.x.getOriginUserAssPrivilege().mBlock != null) {
                         uoc1.a(tb.j9(R.string.arg_RES_7f100103));
                      }
                      uoc1.a(tb.j9(R.string.arg_RES_7f10169b));
                   }else {
                      uoc1.a(tb.j9(R.string.arg_RES_7f10169b));
                   }
                   uoc1.k(new w(tb));
                   uoc1.l(new l0(tb, w));
                   uoc1.q();
                }
             }else if(PatchProxy.applyVoidOneRefs(w, tb, z, "23")){
                uoc1 = new c(w);
                ArrayList uArrayList1 = new ArrayList();
                if (tb.x.getLiveSourceType() == 4) {
                   uArrayList1.add(tb.j9(R.string.arg_RES_7f10169b));
                   uArrayList1.add(tb.l9(R.string.arg_RES_7f104f68));
                   if (tb.x.getUserProfile().isFollowing != null) {
                      uArrayList1.add(tb.j9(R.string.arg_RES_7f104f05));
                   }
                }else {
                   uArrayList1.add(tb.j9(R.string.arg_RES_7f10169b));
                   uArrayList1.add(tb.l9(R.string.arg_RES_7f104f68));
                   uArrayList1.add(tb.j9(R.string.arg_RES_7f100103));
                }
                uoc1.b(uArrayList1);
                uoc1.k(new l(tb));
                uoc1.l(new k0(tb, w));
                uoc1.q();
             }
          }
          d = tb.D;
          if (d != null) {
             d.f();
          }
       }
       return;
    }
}
