package l09.f;
import ai7.e;
import l09.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import nc6.b;
import o56.a;
import android.content.Context;
import f3b.t;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import java.lang.Enum;
import k2b.u1;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;

public final class f implements e	// class@002c6c
{
    public final d a;
    public final PhotoAdvertisement b;

    public void f(d p0,PhotoAdvertisement p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onRelease(KwaiPlayerResultQos p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
       videoStatEve.videoQosJson = (b.a())? p0.videoStatJson: p0.briefVideoStatJson;
       videoStatEve.sessionUuid = this.a.u;
       videoStatEve.socName = TextUtils.k(t.a(a.B));
       videoStatEve.boardPlatform = SystemUtil.g();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       String str = "=";
       StringBuilder str1 = "ad_source_type"+str+this.b.mSourceType;
       PhotoAdvertisement mAdGroup = this.b.mAdGroup;
       if (mAdGroup != null) {
          str1 = str1+",ad_type"+str+mAdGroup.ordinal();
       }
       str1 = str1+",page_id"+str+this.b.mPageId+",sub_page_id"+str+this.b.mSubPageId+",creative_id"+str+this.b.mCreativeId;
       urlPackage.params = str1;
       videoStatEve.urlPackage = urlPackage;
       videoStatEve.bizType = "popShowVideo";
       u1.M0(str1);
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.videoStatEvent = videoStatEve;
       u1.j0(statPackage);
       return;
    }
}
