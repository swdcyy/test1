package kh1.a;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a	// class@002d39
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final ClientContent$GiftPackage a(Gift p0){
       ClientContent$GiftPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$GiftPackage();
       if (p0 == null) {
          return obj;
       }
       obj.identity = String.valueOf(p0.mId);
       Gift mMagicFaceId = p0.mMagicFaceId;
       if (mMagicFaceId > 0) {
          obj.type = 3;
          obj.magicFaceId = mMagicFaceId;
       }else {
          obj.type = 1;
       }
       return obj;
    }
}
