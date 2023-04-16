package com.kuaishou.merchant.transaction.detail.self.selfdetail.service.DetailServiceContentView;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceInfo$RuleInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import xm4.a;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;

public class DetailServiceContentView extends AutoFitRowsView	// class@00075d
{

    public void DetailServiceContentView(Context p0){
       super(p0);
    }
    public void DetailServiceContentView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DetailServiceContentView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailServiceContentView.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.removeAllViews();
       int i = 0;
       while (i < p0.size() && i < 3) {
          if (!TextUtils.x(p0.get(i).mTitle)) {
             DetailServiceInfo$RuleInfo ruleInfo = p0.get(i);
             if (!PatchProxy.applyVoidOneRefs(ruleInfo, this, DetailServiceContentView.class, "2")) {
                View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0296);
                MerchantKwaiImageView merchantKwai = m1.f(view, R.id.detail_service_item_icon);
                TextView textView = m1.f(view, R.id.detail_service_item_text);
                int i1 = (TextUtils.x(ruleInfo.mIcon))? 8: 0;
                merchantKwai.setVisibility(i1);
                merchantKwai.L(ruleInfo.mIcon);
                textView.setText(ruleInfo.mTitle);
                this.addView(view);
             }
          }
          i = i + 1;
       }
       return;
    }
}
