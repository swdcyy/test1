package a4d.s;
import java.lang.Object;
import bk5.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StickerInfoPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Number;
import ak5.j;
import java.util.Objects;
import java.util.List;
import com.kwai.emotionsdk.core.j;
import oe6.e;
import android.content.SharedPreferences;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchStickerInfoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import yk5.f;

public class s	// class@000096
{

    public void s(){
       super();
    }
    public ClientContent$StickerInfoPackage a(c p0){
       ClientContent$StickerInfoPackage obj = PatchProxy.applyOneRefs(p0, this, s.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$StickerInfoPackage();
       obj.pageIndex = 0;
       obj.index = p0.e;
       obj.id = p0.b;
       obj.type = 1;
       return obj;
    }
    public void b(e0 p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OPERATED_COMMENT_PICTURE";
       i3 oi3 = i3.f();
       oi3.d("click_area", p1);
       oi3.d("type", p2);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p0).setType(1).setElementPackage(uElementPack));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 3;
       uElementPack.name = "click_emoji";
       uElementPack.action = 0x759e;
       u1.u(1, uElementPack, new ClientContent$ContentPackage());
       return;
    }
    public void d(int p0,int p1,String p2,String p3,boolean p4){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, os, "6")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "EMOTION";
       i3 oi3 = i3.f();
       oi3.c("page_index", Integer.valueOf(p0));
       oi3.c("emo_index", Integer.valueOf(p1));
       oi3.d("emo_id", p2);
       oi3.d("page_type", p3);
       String str = (p4)? "press": "click";
       oi3.d("click_type", str);
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "2")) {
          return;
       }
       j oj = j.o();
       Objects.requireNonNull(oj);
       List list = PatchProxy.apply(objArray, oj, j.class, "16");
       if (list != PatchProxyResult.class) {
       }else {
          list = j.e().a();
       }
       String str = e.a.getString("current_emotion_keyboard_tab", "");
       if (list != null && !list.isEmpty()) {
          int i = 0;
          EmotionPackage uEmotionPack = list.get(i);
          if (str != null && !TextUtils.x(str)) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   EmotionPackage uEmotionPack1 = iterator.next();
                   if (str.equals(uEmotionPack1.getMId())) {
                      uEmotionPack = uEmotionPack1;
                   }
                }
             }
          }
          if (uEmotionPack == null) {
             return;
          }else {
             ClientContent$StickerInfoPackage stickerInfoP = new ClientContent$StickerInfoPackage();
             stickerInfoP.id = uEmotionPack.mId;
             if (uEmotionPack.getMType() == 1) {
                stickerInfoP.type = 1;
             }else if(uEmotionPack.getMType() == 3){
                stickerInfoP.type = 3;
             }
             stickerInfoP.secondaryType = "icon_click";
             ClientContent$StickerInfoPackage[] stickerInfoP1 = new ClientContent$StickerInfoPackage[]{stickerInfoP};
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$BatchStickerInfoPackage uBatchSticke = new ClientContent$BatchStickerInfoPackage();
             uContentPack.batchStickerInfoPackage = uBatchSticke;
             uBatchSticke.batchInfoPackage = stickerInfoP1;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 1351;
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.contentPackage = uContentPack;
             showEvent.elementPackage = uElementPack;
             u1.g0(showEvent);
          }
       }
       return;
    }
    public void f(f p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "3")) {
          return;
       }
       ClientContent$StickerInfoPackage stickerInfoP = new ClientContent$StickerInfoPackage();
       stickerInfoP.id = p0.b();
       if (p0.d() == 1) {
          stickerInfoP.type = 1;
       }else if(p0.d() == 3 || p0.d() == 101){
          stickerInfoP.type = 3;
       }
       stickerInfoP.secondaryType = p1;
       ClientContent$StickerInfoPackage[] stickerInfoP1 = new ClientContent$StickerInfoPackage[]{stickerInfoP};
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$BatchStickerInfoPackage uBatchSticke = new ClientContent$BatchStickerInfoPackage();
       uContentPack.batchStickerInfoPackage = uBatchSticke;
       uBatchSticke.batchInfoPackage = stickerInfoP1;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 1351;
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.contentPackage = uContentPack;
       showEvent.elementPackage = uElementPack;
       u1.g0(showEvent);
       return;
    }
}
