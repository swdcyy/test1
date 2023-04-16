package fva.m$a;
import com.yxcorp.gifshow.widget.m;
import fva.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import xua.a;
import uua.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import fva.r;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.util.List;
import fva.k;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import qrd.l1;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import k2b.e0;
import k2b.u1;
import com.yxcorp.utility.Log;

public final class m$a extends m	// class@002a11
{
    public final m c;

    public void m$a(m p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       k a;
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = this.c.S8().L0().indexOf(m.P8(this.c));
       if (i >= 0) {
          int i1 = this.c.S8().L0().size();
          for (; i < i1; i++) {
             uArrayList.add(this.c.S8().L0().get(i));
          }
          Activity activity = this.c.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          r.a.b(m.P8(this.c), activity, 2, uArrayList, m.R8(this.c));
          a = k.a;
          HotSpotItem hotSpotItem = m.P8(this.c);
          HotSpotFragment hotSpotFragm = m.R8(this.c);
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(hotSpotItem, hotSpotFragm, a, k.class, "6")) {
             a.p(hotSpotItem, "data");
             a.p(hotSpotFragm, "page");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "HOT_SPOT_NEWS_CARD";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("module_name", "guess_you_want");
             jsonObject.c0("card_title", hotSpotItem.mKeyWord);
             uElementPack.params = jsonObject.toString();
             ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
             new ClientContent$ContentPackage().photoPackage = photoPackage;
             photoPackage.type = 1;
             String str = (TextUtils.isEmpty(hotSpotItem.mPhotoId))? "": hotSpotItem.mPhotoId;
             photoPackage.identity = str;
             u1.L(null, hotSpotFragm, 1, uElementPack, null);
          }
          return;
       }else {
          Log.g("hotSpot", "点击不响应进内流，原因：position<0");
          return;
       }
    }
}
