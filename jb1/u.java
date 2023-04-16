package jb1.u;
import android.view.View$OnClickListener;
import jb1.s$c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import db1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import jb1.s;
import aq5.d;
import fq5.b;
import eb1.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.StreamType;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import bb1.b;
import java.util.List;
import bb1.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mz6.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import db1.a;
import mz6.b$d;
import lnc.a1;
import java.lang.CharSequence;
import jb1.t;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bb1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import k2b.u1;
import android.app.Dialog;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public final class u implements View$OnClickListener	// class@002b24
{
    public final s$c b;

    public void u(s$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       s b;
       s c;
       u tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, s$c.class, "4")) {
       }else {
          UserInfo mExtraInfo1 = tb.t.a.mExtraInfo;
          if (mExtraInfo1 != null) {
             tb.v.q(mExtraInfo1.mPrivilege);
             tb.v.p(tb.t.a);
             tb.v.o(LiveApiParams$AssistantType.fromInt(tb.t.a.getAssistantType()));
             tb.v.l(tb.y.z);
             tb.v.m(tb.y.A);
             s d1 = tb.y.D;
             if (d1 != null) {
                d uod = d1.A0();
                StreamType streamType = PatchProxy.applyOneRefs(uod, objArray, c.class, "2");
                if (streamType != PatchProxyResult.class) {
                }else if(uod.r2(AnchorBizRelation.VOICE_PARTY)){
                   streamType = StreamType.VOICEPARTY;
                }else if(uod.r2(AnchorBizRelation.VOICE_PARTY_KTV)){
                   streamType = StreamType.KTV;
                }else {
                   streamType = StreamType.VIDEO;
                }
                tb.v.n(streamType);
             }
             List list = tb.y.I.x8("admin_page", tb.w);
             if (q.f(list)) {
                b.B(LiveLogTag.LIVE_ADMIN, "operation list is null.");
             }else {
                b uob = new b(tb.getActivity());
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   b$d uod1 = new b$d(uoa.a(), objArray, a1.a(0x7f0607b8));
                   uod1.g(uoa);
                   uArrayList.add(uod1);
                }
                uob.b(uArrayList);
                uob.l(new t(tb, uArrayList));
                s$c y = tb.y;
                b = y.B;
                c = y.C;
                d1 = y.D;
                ClientContent$LiveStreamPackage liveStreamPa = (d1 != null)? d1.a(): objArray;
                if (!PatchProxy.applyVoidThreeRefs(b, c, liveStreamPa, null, f.class, "4")) {
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "ADMINISTRATOR_SETTING_CARD";
                   ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                   uContentPack1.liveStreamPackage = liveStreamPa;
                   ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                   uContentWrap.liveVoicePartyPackage = f.b(b, c);
                   u1.v0(9, uElementPack1, uContentPack1, uContentWrap);
                }
                uob.q();
             }
          }
       }
       c a = tb.t.a;
       UserInfo mExtraInfo = a.mExtraInfo;
       if (mExtraInfo != null) {
          String str = (mExtraInfo.mAssistantType == 1)? "SUPER": "NORMAL";
          String str1 = str;
          s d = tb.y.D;
          if (d != null) {
             objArray = d.a();
          }
          if (!PatchProxy.applyVoidThreeRefs(a, str1, objArray, null, f.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADMINISTRATOR_INFO_ITEM";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("administrator_type", str1);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = objArray;
             uContentPack.userPackage = f.a(a);
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
