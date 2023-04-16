package gw9.a$a;
import android.view.View$OnClickListener;
import gw9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import im8.f;
import java.lang.Integer;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.designercreation.preview.TemplatePreviewActivity;
import com.yxcorp.gifshow.designercreation.preview.TemplatePreviewActivity$a;
import android.content.Intent;
import android.os.Parcelable;

public final class a$a implements View$OnClickListener	// class@0024ea
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       int i1;
       a r;
       ClientEvent$ElementPackage uElementPack;
       HashMap hashMap;
       String str;
       ClientContent$ContentPackage uContentPack;
       ClientContent$ProfilePackage profilePacka;
       ClientContent$PhotoPackage photoPackage;
       String str1;
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Context context = this.b.getContext();
       if (context != null) {
          a$a tb = this.b;
          a w = tb.w;
          if (w != null) {
             CreationReporter b = CreationReporter.b;
             a q = tb.q;
             int i = 0;
             if (q != null) {
                Integer integer = q.get();
                if (integer != null) {
                   i1 = integer.intValue();
                label_0030 :
                   a$a tb1 = this.b;
                   a x = tb1.x;
                   r = tb1.r;
                   a p = tb1.p;
                   Objects.requireNonNull(b);
                   CreationReporter uCreationRep = CreationReporter.class;
                   if (PatchProxy.isSupport(uCreationRep)) {
                      Object[] objArray = new Object[]{w,Integer.valueOf(i1),Integer.valueOf(x),r,p};
                      if (!PatchProxy.applyVoid(objArray, b, uCreationRep, "3")) {
                      }
                   }else {
                   }
                }
             }
             i1 = 0;
             goto label_0030 ;
          }
       label_00c1 :
          TemplatePreviewActivity$a c = TemplatePreviewActivity.C;
          a.o(context, "it");
          tb = this.b;
          r = tb.r;
          a p1 = tb.p;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidThreeRefs(context, r, p1, c, TemplatePreviewActivity$a.class, "1")) {
             a.p(context, "context");
             a.p(r, "userId");
             Intent intent = new Intent(context, TemplatePreviewActivity.class);
             intent.putExtra("USER_ID", r);
             if (p1 != null) {
                intent.putExtra("INIT_TEMPLATE", p1);
             }
             context.startActivity(intent);
          }
       }
       return;
    }
}
