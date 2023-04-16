package al1.h;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import k2b.u1;

public class h	// class@0000cf
{

    public void h(){
       super();
    }
    public static void a(String p0,String p1,ClientContent$LiveStreamPackage p2,ClientContent$GiftPackage p3,ClientContent$UserPackage p4,String p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,p5};
          if (PatchProxy.applyVoid(objArray, null, oh, "6")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = oobject;
       uElementPack.params = (TextUtils.isEmpty(p1))? "": oobject1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject2;
       uContentPack.giftPackage = oobject3;
       uContentPack.userPackage = oobject4;
       u1.O(p5, null, "", 1, 0, uElementPack, null, uContentPack, null, true, null, null);
       return;
    }
    public static void b(String p0,String p1,ClientContent$LiveStreamPackage p2,ClientContent$GiftPackage p3,ClientContent$UserPackage p4,String p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,p5};
          if (PatchProxy.applyVoid(objArray, null, oh, "5")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = oobject;
       uElementPack.params = (TextUtils.isEmpty(p1))? "": oobject1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject2;
       uContentPack.giftPackage = oobject3;
       uContentPack.userPackage = oobject4;
       u1.E0(p5, null, 9, uElementPack, null, uContentPack, null, null, true, null);
       return;
    }
}
