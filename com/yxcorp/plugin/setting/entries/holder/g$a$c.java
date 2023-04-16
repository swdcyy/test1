package com.yxcorp.plugin.setting.entries.holder.g$a$c;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.entries.holder.h;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.d;
import com.kwai.framework.model.user.QCurrentUser;
import erd.g;
import k2b.e0;
import sgd.b;
import com.yxcorp.plugin.setting.entries.holder.c;

public class g$a$c extends b	// class@000855
{
    public final boolean c;
    public final g$a d;

    public void g$a$c(g$a p0,int p1,boolean p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g$a$c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       g$a$c td = this.d;
       g$a$c tc = this.c;
       Objects.requireNonNull(td);
       if (PatchProxy.isSupport(g$a.class)) {
          obj = PatchProxy.applyThreeRefs(view, p0, Boolean.valueOf(tc), td, g$a.class, "5");
          if (obj != patchProxyRe) {
             view = obj;
          }else {
          label_003d :
             View view1 = view.findViewById(R.id.switch_first);
             View view2 = view.findViewById(R.id.switch_second);
             j oj = new j(td.r.a);
             view.findViewById(R.id.pymk_know_more_text).setOnClickListener(new h(td, p0));
             td.P8(view1, new d(td, view2, oj), QCurrentUser.ME.isRecommendToOthers(), R.string.arg_RES_7f1049a7, "enable_recommended_know_people");
             g a = td.r.a;
             String str = "open";
             obj = (QCurrentUser.ME.isRecommendToOthers())? str: "close";
             b.h(a, "RECOMMENT_TO_PYMK", obj);
             if (((QCurrentUser.ME.isNotRecommendToContacts() ^ 0x01) ^ QCurrentUser.ME.isRecommendToOthers()) || tc != null) {
                view2.setVisibility(0);
                td.P8(view2, new c(td, view1, oj), (QCurrentUser.ME.isNotRecommendToContacts() ^ 0x01), R.string.arg_RES_7f1049a6, "not_recommend_to_contacts");
                a = td.r.a;
                if (QCurrentUser.ME.isNotRecommendToContacts()) {
                   str = "close";
                }
                b.h(a, "RECOMMENT_TO_CONTACT_FRIEND", str);
             }else {
                view2.setVisibility(8);
             }
          }
       }else {
          goto label_003d ;
       }
       return view;
    }
}
