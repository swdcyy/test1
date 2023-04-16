package com.yxcorp.gifshow.relation.intimate.helper.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import abc.i;
import com.yxcorp.gifshow.relation.intimate.dialog.r;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import com.yxcorp.gifshow.relation.intimate.dialog.c;
import java.lang.ref.WeakReference;
import bbc.a;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.helper.i;

public class a	// class@001906
{

    public void a(){
       super();
    }
    public static e a(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       IntimateRelationDialogParams obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.mStyle;
       if (obj != null) {
          if (obj != 1) {
             if (obj != 3) {
                if (obj != 5) {
                   if (obj != 6) {
                      PatchProxy.onMethodExit(a.class, "3");
                      return new i(p0, p1, p2);
                   }else {
                      PatchProxy.onMethodExit(a.class, "3");
                      return new i(p0, p1, p2);
                   }
                }else {
                   PatchProxy.onMethodExit(a.class, "3");
                   return new r(p0, p1, p2);
                }
             }else {
                PatchProxy.onMethodExit(a.class, "3");
                return new p(p0, p1, p2);
             }
          }else {
             PatchProxy.onMethodExit(a.class, "3");
             return new c(p0, p1, p2);
          }
       }else {
          PatchProxy.onMethodExit(a.class, "3");
          return new i(p0, p1, p2);
       }
    }
    public static void b(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       i.i(new WeakReference(p0), p1, new a(p0, p1, p2), null);
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
}
