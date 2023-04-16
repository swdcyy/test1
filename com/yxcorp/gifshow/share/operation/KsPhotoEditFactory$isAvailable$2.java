package com.yxcorp.gifshow.share.operation.KsPhotoEditFactory$isAvailable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import oic.n0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.yxcorp.gifshow.model.EditInfo;
import kotlin.jvm.internal.a;
import yic.q0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class KsPhotoEditFactory$isAvailable$2 extends Lambda implements a	// class@001bfe
{
    public final n0 this$0;

    public void KsPhotoEditFactory$isAvailable$2(n0 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object[] objArray = null;
       String str = "1";
       PhotoMeta obj = PatchProxy.apply(objArray, this, KsPhotoEditFactory$isAvailable$2.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.e.mEntity.a(PhotoMeta.class).mEditInfo;
       boolean b = (obj != null && obj.mEnable != null)? true: false;
       if (b) {
          KsPhotoEditFactory$isAvailable$2 tthis$0 = this.this$0;
          String photoId = tthis$0.e.getPhotoId();
          a.o(photoId, "photo.photoId");
          boolean b1 = q0.a(this.this$0.e);
          Objects.requireNonNull(tthis$0);
          n0 on0 = n0.class;
          if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(photoId, Boolean.valueOf(b1), tthis$0, on0, "4")) {
             if (!b1) {
                str = "0";
             }
             try{
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHOW_REEDIT_ENTRY_BUTTON";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reedit_photo_id", photoId);
                jSONObject.put("is_promote_video", str);
                uElementPack.params = jSONObject.toString();
                u1.u0(6, uElementPack, objArray);
             }catch(org.json.JSONException e1){
                Log.k(e1);
             }
          }
       }
    }
}
