package com.kuaishou.live.gzone.treasurebox.presenter.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.treasurebox.presenter.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r53.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import m53.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankUserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import z12.x;
import p53.b;
import android.content.DialogInterface$OnDismissListener;
import java.util.ArrayList;
import java.util.List;
import qvb.i;
import java.util.Iterator;
import p53.c;
import qvb.q;
import xq5.a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;

public final class a implements View$OnClickListener	// class@001c79
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uob, "5")) {
       }else {
          b u = tb.u;
          ClientContent$LiveStreamPackage liveStreamPa = tb.v.a.a();
          if (!PatchProxy.applyVoidTwoRefs(u, liveStreamPa, objArray, n.class, "33")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MAOLIANG_RANK_PANEL_AUTHOR_ITEM";
             uElementPack.params = n.a(u);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
          if (TextUtils.n(tb.u.mUserInfo.mId, tb.v.a.d()) || TextUtils.x(tb.u.mLiveStreamId)) {
             tb.v.a.w0(new UserProfile(tb.u.mUserInfo), LiveStreamClickType.LIVE_GZONE_KSHELL_RANK_USER, 43, true, 0);
          }else {
             LiveGzoneKShellRankUserInfo mLiveStreamI = tb.u.mLiveStreamId;
             if (!PatchProxy.applyVoidOneRefs(mLiveStreamI, tb, uob, "6")) {
                ProgressFragment progressFrag = x.G(tb.getActivity());
                tb.x = progressFrag;
                progressFrag.k0(new b(tb));
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = tb.w.getItems().iterator();
                while (iterator.hasNext()) {
                   LiveGzoneKShellRankUserInfo liveGzoneKSh = iterator.next();
                   if (!TextUtils.x(liveGzoneKSh.mLiveStreamId)) {
                      uArrayList.add(liveGzoneKSh.mLiveStreamId);
                   }
                }
                tb.v.r.a(uArrayList, 235, null, uArrayList.indexOf(mLiveStreamI), 5, new c(tb));
             }
          }
       }
       return;
    }
}
