package f4a.i0;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Object;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.UUID;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import na6.b;
import brd.t;
import t45.d;
import brd.z;
import f4a.h0;
import erd.g;
import crd.b;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import kotlin.jvm.internal.a;
import k2b.e0;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class i0	// class@0022a9
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public boolean g;
    public long h;
    public boolean i;
    public String j;
    public b k;
    public boolean l;
    public final PlcEntryDataAdapter m;

    public void i0(PlcEntryDataAdapter p0){
       String photoId;
       super();
       this.m = p0;
       this.a = "3054614";
       this.b = "3054640";
       this.c = "PLC_POPUP_LOADING_DURATION";
       this.d = "PLC_POPUP_STAY_LENGTH";
       this.e = 1;
       StringBuilder str = "";
       if (p0 != null) {
          QPhoto photo = p0.getPhoto();
          if (photo != null) {
             photoId = photo.getPhotoId();
             if (photoId != null) {
             label_002e :
                this.j = str+photoId+'_'+UUID.randomUUID();
                if (!PatchProxy.applyVoid(null, this, i0.class, "1")) {
                   this.c();
                   this.k = RxBus.f.f(b.class).observeOn(d.d).subscribe(new h0(this));
                }
                return;
             }
          }
       }
       photoId = "UNKNOWN";
       goto label_002e ;
    }
    public final void a(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          Uri uri = Uri.parse(p0);
          a.o(uri, "uri");
          uri = (TextUtils.n(uri.getScheme(), "kwai") && TextUtils.n(uri.getHost(), "servicehalfwebview"))? 1: null;
          if (uri) {
             i0 tj = this.j;
             if (!PatchProxy.applyVoidThreeRefs("halfWebDialogToken", tj, p1, this, i0.class, "5") && !p1.containsKey("halfWebDialogToken")) {
                p1.put("halfWebDialogToken", tj);
             }
          }
       }
    label_0053 :
       return;
    }
    public final void b(String p0,e0 p1,long p2,String p3){
       String photoId;
       String userId;
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, i0.class, "3")) {
          return;
       }
       if (p2 - null < 0) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       i0 tm = this.m;
       String str = "";
       if (tm != null) {
          QPhoto photo = tm.getPhoto();
          if (photo != null) {
             photoId = photo.getPhotoId();
             if (photoId != null) {
             label_003f :
                i0 tm1 = this.m;
                if (tm1 != null) {
                   QPhoto photo1 = tm1.getPhoto();
                   if (photo1 != null) {
                      userId = photo1.getUserId();
                      if (userId != null) {
                         str = userId;
                      }
                   }
                }
                tm1 = this.m;
                if (tm1 != null) {
                   userId = String.valueOf(tm1.getBizType());
                   if (userId != null) {
                   label_0061 :
                      oi3.d("business_type", userId);
                      oi3.d("duration", String.valueOf(p2));
                      oi3.d("photo_id", photoId);
                      oi3.d("s_author_id", str);
                      i0 te = (this.i != null)? this.e: this.f;
                      oi3.c("status", Integer.valueOf(te));
                      uElementPack.action2 = p3;
                      uElementPack.params = oi3.e();
                      u1.C0(p0, p1, 4, uElementPack, null);
                      return;
                   }
                }
                userId = "UNKNOWN";
                goto label_0061 ;
             }
          }
       }
       photoId = str;
       goto label_003f ;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0.class, "6")) {
          return;
       }
       i0 tk = this.k;
       if (tk != null) {
          if (tk.isDisposed() ^ 0x01) {
             objArray = tk;
          }
          if (objArray != null) {
             objArray.dispose();
          }
       }
       return;
    }
}
