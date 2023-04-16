package com.kuaishou.merchant.transaction.detail.self.widget.ScoreShoppingExperienceView$b;
import lt3.c;
import android.content.Context;
import lt3.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.transaction.detail.self.widget.ScoreShoppingExperienceView$ScoreTypeData;
import android.view.View;
import java.lang.Boolean;
import lnc.a1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.detail.self.model.ComprehensiveScoreInfo$ScoreData;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;

public class ScoreShoppingExperienceView$b extends c	// class@000774
{

    public void ScoreShoppingExperienceView$b(Context p0){
       super(p0);
    }
    public d c(int p0){
       ScoreShoppingExperienceView$ScoreTypeData obj;
       c ta;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ScoreShoppingExperienceView$b uob = ScoreShoppingExperienceView$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.d(p0);
       if (obj == null || this.a == null) {
          return super.c(p0);
       }else {
          int i = this.j(obj);
          if (i) {
             if (i != 1) {
                return super.c(p0);
             }else {
                ta = this.a;
                view = PatchProxy.applyOneRefs(ta, this, uob, "2");
                if (view != patchProxyRe) {
                }else {
                   view = new View(ta);
                   view.setTag(R.id.merchant_recycler_pendant_tag_average_id, Boolean.TRUE);
                   view.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
                }
                return new d(view, new PresenterV2(), this.j(obj));
             }
          }else {
             ta = this.a;
             ScoreShoppingExperienceView$ScoreTypeData mValue = obj.mValue;
             view = PatchProxy.applyTwoRefs(ta, mValue, this, uob, "3");
             if (view != patchProxyRe) {
             }else {
                view = a.a(ta, R.layout.arg_RES_7f0d06ba);
                TextView textView = m1.f(view, R.id.item_score_num);
                m1.f(view, R.id.item_score_title).setText(TextUtils.k(mValue.mKey));
                textView.setText(TextUtils.k(mValue.mValue));
                ComprehensiveScoreInfo$ScoreData mFontColor = mValue.mFontColor;
                int i1 = (mValue.mType == 3)? 0x7f061dfb: 0x7f061da9;
                textView.setTextColor(TextUtils.J(mFontColor, a1.a(i1)));
             }
             return new d(view, new PresenterV2(), this.j(obj));
          }
       }
    }
    public int h(Object p0){
       return this.j(p0);
    }
    public int j(ScoreShoppingExperienceView$ScoreTypeData p0){
       return p0.mType;
    }
}
