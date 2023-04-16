package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$d;
import erd.g;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.GrowthStayPageConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.model.response.GrowthStayPageConfig$PageItemData;
import kotlin.Result;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.net.Uri;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.TextView;
import java.lang.CharSequence;
import sqa.k;
import android.view.View$OnClickListener;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import sqa.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class UninstallToStayPresenter$d implements g	// class@0014c7
{
    public final UninstallToStayPresenter b;

    public void UninstallToStayPresenter$d(UninstallToStayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj2;
       TextView textView;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, UninstallToStayPresenter$d.class, "1")) {
       }else if(obj1 != null){
          if (obj1.items.isEmpty()) {
             PatchProxy.onMethodExit(UninstallToStayPresenter$d.class, "1");
          }else {
             int i = obj1.items.size();
             int i1 = 0;
             while (i1 < i) {
                UninstallToStayPresenter$d b = obj.b;
                Objects.requireNonNull(b);
                if (PatchProxy.isSupport(UninstallToStayPresenter.class)) {
                   obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), b, UninstallToStayPresenter.class, "5");
                   if (obj2 != PatchProxyResult.class) {
                   }else if(i1){
                      if (i1 != 1) {
                         if (i1 != 2) {
                            obj2 = null;
                         }else {
                            obj2 = b.w;
                            if (obj2 == null) {
                               a.S("mBottomItem");
                            }
                         }
                      }else {
                         obj2 = b.v;
                         if (obj2 == null) {
                            a.S("mMiddleItem");
                         }
                      }
                   }else {
                      obj2 = b.u;
                      if (obj2 == null) {
                         a.S("mTopItem");
                      }
                   }
                }else {
                   goto label_0048 ;
                }
                Object obj3 = obj1.items.get(i1);
                if (PatchProxy.applyVoidTwoRefs(obj2, obj3, b, UninstallToStayPresenter.class, "4")) {
                   int i2 = 0;
                }else {
                   a.m(obj2);
                   a.m(obj3);
                   GrowthStayPageConfig$PageItemData icon = obj3.icon;
                   if (icon != null) {
                      KwaiImageView kwaiImageVie = obj2.findViewById(R.id.kiv_item_icon);
                      if (kwaiImageVie != null) {
                         kwaiImageVie.setImageURI(Uri.parse(icon));
                      }
                   }
                   Ref$ObjectRef objectRef = new Ref$ObjectRef();
                   objectRef.element = "";
                   icon = obj3.title;
                   if (icon != null) {
                      textView = obj2.findViewById(R.id.tv_item_title);
                      if (textView != null) {
                         textView.setText(icon);
                      }
                      objectRef.element = icon;
                   }
                   icon = obj3.desc;
                   if (icon != null) {
                      textView = obj2.findViewById(R.id.tv_item_subtitle);
                      if (textView != null) {
                         textView.setText(icon);
                      }
                   }
                   GrowthStayPageConfig$PageItemData button = obj3.button;
                   if (button != null) {
                      GrowthStayPageConfig$PageItemData link = obj3.link;
                      if (link != null) {
                         View view = obj2.findViewById(0x7f0a0546);
                         if (view != null) {
                            view.setText(button);
                            view.setOnClickListener(new k(link, button, objectRef, b, obj2, obj3));
                         }
                      }
                   }
                   obj2.setVisibility(0);
                   Result.constructor-impl(l1.a);
                }
                i1 = i1 + 1;
             }
          }
       }
       UninstallToStayPresenter.P8(obj.b).a().dismiss();
       PatchProxy.onMethodExit(UninstallToStayPresenter$d.class, "1");
       return;
    }
}
