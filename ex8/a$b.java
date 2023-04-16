package ex8.a$b;
import android.view.View$OnClickListener;
import ex8.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ex8.d;
import java.lang.Integer;
import java.lang.StringBuilder;
import androidx.lifecycle.LiveData;
import java.util.List;
import ex8.b;
import com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import androidx.lifecycle.MutableLiveData;
import qw8.o;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Publish$ShareType;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import java.lang.Enum;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import qr4.i;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.l$a;
import android.widget.RadioButton;

public final class a$b implements View$OnClickListener	// class@00224b
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Object[] objArray2;
       b d;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       Object obj = null;
       String str = "ShareBarPresenter";
       int i = 1;
       int i1 = 0;
       if (this.b.y != null) {
          Object[] objArray = new Object[i1];
          a.b().w(str, "realCLick", objArray);
          a$b tb = this.b;
          tb.y = i1;
          a x = tb.x;
          if (x == null) {
             a.S("mViewModel");
          }
          a.o(p0, "v");
          int id = p0.getId();
          Objects.requireNonNull(this.b);
          int i2 = -1;
          if (id == 0x7f0a390a) {
             i = 0;
          }else if(id == 0x7f0a390b){
             if (id == 0x7f0a390c) {
                i = 2;
             }else if(id == 0x7f0a390d){
                i = 3;
             }else {
                i = -1;
             }
          }
          Objects.requireNonNull(x);
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), x, uod, "2")) {
             Object[] objArray1 = new Object[i1];
             String str1 = "ShareBarViewModel";
             a.b().w(str1, "selectShareOption index: "+i+" === "+"old index: "+x.b.getValue(), objArray1);
             PublishPageShareOption publishPageS = x.c.b().get(i);
             objArray1 = new Object[i1];
             a.b().w(str1, "selectShareOption Option: "+publishPageS+" === "+"old selectedOption: "+x.c.a(), objArray1);
             if (publishPageS == x.c.a()) {
                publishPageS = PublishPageShareOption.NONE;
                x.b.setValue(Integer.valueOf(i2));
                objArray = new Object[i1];
                a.b().w(str1, "cancel select "+publishPageS, objArray);
             }else {
                objArray2 = new Object[i1];
                a.b().w(str1, "select "+publishPageS, objArray2);
                x.b.setValue(Integer.valueOf(i));
             }
             d c = x.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidOneRefs(publishPageS, c, b.class, "5")) {
                a.p(publishPageS, "option");
                objArray2 = new Object[i1];
                a.b().w("ShareBarRepo", "onShareOptionChange option: "+publishPageS, objArray2);
                String clickAction = publishPageS.getClickAction();
                a uoa = a.class;
                if (!PatchProxy.applyVoidOneRefs(clickAction, obj, uoa, "77")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "SYNCHRO_SHARE_OUTSIDE_PLATFORM";
                   if (!TextUtils.x(clickAction)) {
                      String str2 = PatchProxy.applyOneRefs(clickAction, obj, uoa, "78");
                      if (str2 != PatchProxyResult.class) {
                      }else {
                         try{
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("platform", clickAction);
                            str2 = jSONObject.toString();
                         }catch(org.json.JSONException e3){
                            a.b().e("logMerchantOrMissionShown", "exception", e3);
                            str2 = obj;
                         }
                      }
                   }
                   u1.u(6, uElementPack, obj);
                }
                c.b = publishPageS;
                b c1 = c.c;
                if (c1 != null) {
                   c1 = c1.Q0();
                   if (!PatchProxy.applyVoidTwoRefs(publishPageS, c1, obj, o.class, "3")) {
                      Publish$ShareType draftType = publishPageS.getDraftType();
                      Object[] objArray3 = new Object[i1];
                      a.b().s("share_draft_tag", "updateShareOption: "+draftType, objArray3);
                      if (c1.v() != null && !draftType.equals(c1.v().getShareType())) {
                         c1.c0();
                         Publish$b uob = c1.k();
                         uob.copyOnWrite();
                         uob.instance.setShareType(draftType);
                         c1.f();
                      }
                   }
                }
                d = c.d;
                if (PatchProxy.applyVoidTwoRefs(publishPageS, d, obj, o.class, "4") || (d != null && d.F() != null)) {
                   d.F().e.e = publishPageS.getPhotoMetaType();
                }
             }
          }
       }else if(!p0 instanceof RadioButton){
          p0 = obj;
       }
       if (p0 != null) {
          if (i != p0.isChecked()) {
             i = false;
          }
          p0.setChecked(i);
       }
       Object[] objArray4 = new Object[i1];
       a.b().w(str, "click is cancel", objArray4);
    label_024b :
       return;
    }
}
