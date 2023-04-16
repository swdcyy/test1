package a9d.d;
import a9d.c;
import android.view.View;
import android.app.Activity;
import com.yxcorp.plugin.search.entity.BubbleConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import f9d.a;
import java.lang.StringBuilder;
import uy5.b;
import com.kwai.library.widget.popup.bubble.a$c;
import java.util.Arrays;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.yxcorp.plugin.search.utils.j0;
import com.yxcorp.plugin.search.widget.SearchPopupBackgroundView;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.yxcorp.gifshow.widget.PopupBackgroundView;
import nfd.t0;
import sy5.a;
import com.google.gson.JsonObject;
import ecd.d;

public final class d extends c	// class@0000a7
{

    public void d(View p0,Activity p1){
       super(p0, p1);
    }
    public boolean a(BubbleConfig p0){
       String str2;
       c obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = " bubbleConfig.mStaySeconds = ";
       String str1 = " bubbleConfig.mPeriodLimit = ";
       boolean b = false;
       if (p0.mRuleId != null && (p0.mDailyLimit != null && (p0.mPeriodLimit != null && (p0.mStaySeconds == null || p0.mEndTime <= 0)))) {
          str2 = "isBubbleConfigValid, bubbleConfig.mType = "+p0.mType+" bubbleConfig.mRuleId = "+p0.mRuleId+" bubbleConfig.mDailyLimit = "+p0.mDailyLimit+str1+p0.mPeriodLimit+str+p0.mStaySeconds+" mEndTime = "+p0.mEndTime;
          b.c("GradientBubbleFactory", str2);
          this.i("bubbleConfig limit is invalid", str2);
          return b;
       }else if(TextUtils.x(p0.mTitle) && (!TextUtils.x(p0.mSubTitle) || (!q.f(p0.mIcons) && (TextUtils.x(p0.mStartColor) || TextUtils.x(p0.mEndColor))))){
          str2 = "isBubbleConfigValid, bubbleConfig.mTitle = "+p0.mTitle+" bubbleConfig.mSubTitle = "+p0.mSubTitle+" bubbleConfig.mIcons = "+q.f(p0.mIcons)+str1+p0.mStartColor+str+p0.mEndColor;
          b.c("GradientBubbleFactory", str2);
          this.i("bubbleConfig title or color is invalid", str2);
          return b;
       }else {
          obj = this.d;
          if (obj != null && !obj.a(p0)) {
             return b;
          }
          if (p0.mType == 1) {
             b = true;
          }
          return b;
       }
    }
    public a$c c(BubbleConfig p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       this.a.getLocationInWindow(obj);
       int i = 0;
       if (obj[i] >= 0) {
          int i1 = 1;
          if (obj[i1] >= 0) {
             if (!obj[i] || !obj[i1]) {
                b.c("GradientBubbleFactory", "searchViewLocation = "+Arrays.toString(obj));
             }
             a$c uoc = super.c(p0);
             if (uoc == null) {
                return null;
             }else {
                uoc.E0((obj[i] + a1.e(6.50f)));
                return uoc;
             }
          }
       }
       b.c("GradientBubbleFactory", "showBubbleInternal,searchView location is invalid.");
       return null;
    }
    public int d(){
       return 0x7f0d13c2;
    }
    public void e(View p0,BubbleConfig p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "2")) {
          return;
       }
       BubbleConfig mIcons = p1.mIcons;
       if (!PatchProxy.applyVoidTwoRefs(p0, mIcons, this, uod, "4")) {
          p0.findViewById(R.id.icon).P(mIcons);
       }
       mIcons = p1.mTitle;
       BubbleConfig mTitleColor = p1.mTitleColor;
       BubbleConfig mSubTitle = p1.mSubTitle;
       BubbleConfig mSubTitleCol = p1.mSubTitleColor;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,mIcons,mTitleColor,mSubTitle,mSubTitleCol};
          if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          label_007f :
             mIcons = p1.mStartColor;
             p1 = p1.mEndColor;
             int[] ointArray = PatchProxy.applyTwoRefs(mIcons, p1, this, uod, "6");
             if (ointArray != PatchProxyResult.class) {
             }else {
                int i = -1;
                int i1 = j0.v(mIcons, i);
                int i2 = j0.v(p1, i);
                if (i1 == i || i2 == i) {
                   ointArray = null;
                }else {
                   ointArray = new int[]{i1,i2};
                }
             }
             if (ointArray != null && !PatchProxy.applyVoidTwoRefs(p0, ointArray, this, uod, "3")) {
                SearchPopupBackgroundView searchPopupB = p0.findViewById(R.id.background_view);
                searchPopupB.e(ointArray, GradientDrawable$Orientation.TOP_BOTTOM);
                float f = (float)t0.m;
                searchPopupB.setCornerRadius(f);
                searchPopupB.setArrowGravity(3);
                searchPopupB.setArrowMarginLeft(t0.u);
                searchPopupB.c((float)t0.f, f, (float)t0.c);
             }
             return;
          }
       }
       TextView textView = p0.findViewById(R.id.title);
       TextView textView1 = p0.findViewById(R.id.sub_title);
       textView.setText(mIcons);
       textView.setTextColor(j0.v(mTitleColor, a1.a(R.color.arg_RES_7f0601be)));
       textView1.setText(mSubTitle);
       textView1.setTextColor(j0.v(mSubTitleCol, a1.a(R.color.arg_RES_7f0601ba)));
       goto label_007f ;
    }
    public final void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       d.d("search_home", p0, "", a.k().e("params", p1).j());
       return;
    }
}
