package com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$a;
import zuc.c;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import java.lang.Object;
import d0c.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import d0c.a;
import yuc.d;
import yuc.c;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class FontAdapter$a implements c	// class@001435
{
    public final FontAdapter b;

    public void FontAdapter$a(FontAdapter p0){
       this.b = p0;
       super();
    }
    public void D1(boolean p0,int p1,d p2){
       if (PatchProxy.isSupport(FontAdapter$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, FontAdapter$a.class, "1")) {
          return;
       }
       a.p(p2, "viewData");
       if (p0) {
          int i = this.b.j.b();
          Object[] objArray = new Object[0];
          a.D().s("FontBIZ", "onItemClick before: "+i+", after: "+p1, objArray);
          if (i == p1) {
             return;
          }else if(i >= 0){
             this.b.L0().get(i).q(0);
             this.b.M0(i);
          }
          this.b.j.g(p1);
          String str = p2.c();
          if (str != null) {
             d uod = this.b.i.C1();
             if (uod != null) {
                uod.a(str);
             }
          }
          this.b.J0(p1);
          FontAdapter$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p2, tb, FontAdapter.class, "13")) {
             Activity activity = tb.i.getActivity();
             if (!activity instanceof EditorActivity) {
                activity = null;
             }
             Activity uActivity = activity;
             if (uActivity != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FONT_BUTTON";
                uElementPack.name = "×ÖÌå";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
                videoEditOpe.type = 10;
                videoEditOpe.subType = "FONT";
                videoEditOpe.name = p2.e();
                videoEditOpe.extraMessage = p2.d();
                uContentPack.videoEditOperationPackage = videoEditOpe;
                i = uActivity.getPage();
                if (i != 29) {
                   if (i != 63) {
                      str = (i != 116)? "": "2107191";
                   }else {
                      str = "2107189";
                   }
                }else {
                   str = "2107187";
                }
                u1.M(str, uActivity, 1, uElementPack, uContentPack, null);
                Object[] objArray1 = new Object[0];
                a.D().s("FontBIZ", "********* call logClickEvent: "+p2.e(), objArray1);
             }
          }
       }
       return;
    }
}
