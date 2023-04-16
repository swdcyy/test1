package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import z5c.y1;
import k2b.h;
import lnc.i3;
import k2b.e0;
import java.util.Objects;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$CloseClickInfo;
import java.lang.System;
import s1c.o;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class MyProfilePostRecoTipsPresenter$b extends m	// class@00142b
{
    public final MyProfilePostRecoTipsPresenter c;
    public final String d;
    public final String e;
    public final String f;

    public void MyProfilePostRecoTipsPresenter$b(MyProfilePostRecoTipsPresenter p0,String p1,String p2,String p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$b.class, "1")) {
          return;
       }
       BaseFragment uBaseFragmen = MyProfilePostRecoTipsPresenter.P8(this.c);
       MyProfilePostRecoTipsPresenter$b td = this.d;
       MyProfilePostRecoTipsPresenter$b te = this.e;
       MyProfilePostRecoTipsPresenter$b tf = this.f;
       if (!PatchProxy.applyVoidFourRefs(uBaseFragmen, td, te, tf, null, y1.class, "148")) {
          h oh = h.k("MATERIAL_POPUP_CLOSE");
          i3 oi3 = i3.f();
          oi3.d("material_id", td);
          oi3.d("material_name", te);
          oi3.d("material_type", tf);
          oh.n(oi3.e());
          oh.i(uBaseFragmen);
       }
       boolean b = true;
       this.c.d9(b);
       MyProfilePostRecoTipsPresenter$b tc = this.c;
       MyProfilePostRecoTipsPresenter$b td1 = this.d;
       MyProfilePostRecoTipsPresenter$b tf1 = this.f;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(td1, tf1, tc, MyProfilePostRecoTipsPresenter.class, "23")) {
          if (td1 != null && td1.length()) {
             b = false;
          }
          if (!b) {
             MyProfilePostRecoTipsPresenter$CloseClickInfo uCloseClickI = new MyProfilePostRecoTipsPresenter$CloseClickInfo();
             uCloseClickI.setId(td1);
             uCloseClickI.setType(tf1);
             uCloseClickI.setClickTime(System.currentTimeMillis());
             SharedPreferences$Editor uEditor = o.a.edit();
             uEditor.putString(b.d("user")+"profile_post_reco_tips_last_close_info", b.e(uCloseClickI));
             g.a(uEditor);
          }
       }
       return;
    }
}
