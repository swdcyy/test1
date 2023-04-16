package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$c;
import android.text.InputFilter;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;
import lnc.a1;
import e17.i;
import vw8.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class ShareEditorTextDisplayHandler$c implements InputFilter	// class@0013a2
{
    public boolean a;
    public final ShareEditorTextDisplayHandler b;

    public void ShareEditorTextDisplayHandler$c(ShareEditorTextDisplayHandler p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       b a;
       int i = 2;
       if (PatchProxy.isSupport(ShareEditorTextDisplayHandler$c.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, ShareEditorTextDisplayHandler$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "source");
       a.p(p3, "dest");
       ShareEditorTextDisplayHandler k = this.b.K;
       if (k != null) {
          if (!StringsKt__StringsKt.R4(p3, k, 0, i, null)) {
             return null;
          }else if(p5 > 0 && p4 < k.length()){
             if (!PatchProxy.applyVoid(null, this, ShareEditorTextDisplayHandler$c.class, "1") && this.a != null) {
                this.a = false;
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1047a0), 0);
                a = b.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoid(null, a, b.class, "2")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "DELETE_SAME_FRAME_POPUP";
                   u1.u0(3, uElementPack, null);
                }
             }
             return p3.subSequence(p4, p5);
          }else if(p5 != p4 || p1 != p2){
             this.a = true;
          }
       }
       return null;
    }
}
