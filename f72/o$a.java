package f72.o$a;
import com.yxcorp.gifshow.widget.m;
import f72.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import e72.p;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import java.util.Map;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.ImmutableMap;
import k2b.k2;
import k2b.u1;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.android.model.mix.CommonMeta;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public class o$a extends m	// class@0028d3
{
    public final o c;

    public void o$a(o p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       CommonParams uCommonParam;
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o p = this.c.p;
       if (!p.mEntity instanceof LiveStreamFeed) {
          return;
       }
       int i = 1;
       int i1 = p.isCloseLive() ^ i;
       o$a tc = this.c;
       QPhoto mEntity = tc.p.mEntity;
       o r = tc.r;
       LiveDoubleListParam mLogExtraPar = tc.s.mLogExtraParamMap;
       boolean b = tc.v.isPlaying();
       p op = p.class;
       String str = "LIVE_CARD";
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{Boolean.valueOf(i1),mEntity,r,mLogExtraPar,str,Boolean.valueOf(b)};
          if (!PatchProxy.applyVoid(objArray, null, op, "4")) {
          label_0061 :
             if (mEntity != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_CARD_CLICK";
                JsonObject jsonObject = new JsonObject();
                jsonObject.H("is_living", Boolean.valueOf(i1));
                jsonObject.c0("lv_params", x.g(mEntity));
                jsonObject.c0("btn_type", str);
                jsonObject.H("is_play", Boolean.valueOf(b));
                p.d(jsonObject, mLogExtraPar);
                uElementPack.params = jsonObject.toString();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = p.a(mEntity);
                if (TextUtils.n(str, str)) {
                   uCommonParam = new CommonParams();
                   ImmutableMap immutableMap = PatchProxy.applyThreeRefs(mEntity, uElementPack, jsonObject, null, p.class, "15");
                   if (immutableMap != PatchProxyResult.class) {
                   }else {
                      k2 ok2 = u1.j();
                      jsonObject.a0("photo_type", Integer.valueOf(r1.S1(mEntity).toInt()));
                      jsonObject.c0("photo_identity", r1.t1(mEntity));
                      jsonObject.c0("photo_exp_tag", r1.M0(mEntity));
                      jsonObject.a0("photo_index", Integer.valueOf(r1.y1(mEntity)));
                      jsonObject.c0("photo_llsid", r1.w0(mEntity).mListLoadSequenceID);
                      String str1 = "";
                      String str2 = (ok2 != null && ok2.l() != null)? ok2.l(): str1;
                      jsonObject.c0("url_params", str2);
                      ImmutableMap$b uob = ImmutableMap.builder();
                      if (ok2 != null) {
                         str1 = ok2.d;
                      }
                      uob.c("page_name", new g(str1));
                      uob.c("element_action", new g(uElementPack.action2));
                      uob.c("params", jsonObject);
                      immutableMap = uob.a();
                   }
                   uCommonParam.mEntryTag = immutableMap;
                }else {
                   uCommonParam = null;
                }
                u1.B(new ClickMetaData().setLogPage(r).setType(i).setElementPackage(uElementPack).setContentPackage(uContentPack).setCommonParams(uCommonParam).setFeedLogCtx(r1.O0(mEntity)));
             }
          }
       }else {
          goto label_0061 ;
       }
       this.c.S8(null);
       return;
    }
}
