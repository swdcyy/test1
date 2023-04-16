package com.kuaishou.live.core.show.luckystar.util.b;
import com.kuaishou.live.core.show.luckystar.util.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import gc2.d;
import java.lang.Runnable;
import android.widget.ImageView;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.luckystar.util.b$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Long;
import ekd.k1;
import android.view.View;
import android.content.Context;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import gc2.b;
import android.view.View$OnClickListener;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import mkc.b;
import mkc.c;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import android.text.TextPaint;
import android.graphics.Color;
import gc2.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;

public class b	// class@000cfa
{
    public static x a;

    static {
       b.a = Suppliers.a(a.b);
    }
    public void b(){
       super();
    }
    public static void a(KwaiImageView p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "7")) {
          return;
       }
       if (!q.f(p1)) {
          p0.post(new d(p0, p1));
       }
       return;
    }
    public static void b(KwaiImageView p0,List p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "8")) {
          return;
       }
       if (!q.f(p1) && p2 > 0) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          p0.a0(p1.toArray(uCDNUrlArray), new b$a(p0, p2));
       }else {
          b.H(LiveLogTag.LUCKY_STAR, "bindImageWithUrls with invalid param", "targetHeight", Integer.valueOf(p2), null);
       }
       return;
    }
    public static void c(KwaiDialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.dismissAllowingStateLoss();
       }
       return;
    }
    public static int d(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 == null)? 0: p0.size();
       return i;
    }
    public static int e(){
       Object obj = PatchProxy.apply(null, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.a.get().intValue();
    }
    public static String f(Throwable p0){
       if (p0 instanceof KwaiException) {
          return p0.mErrorMessage;
       }
       return null;
    }
    public static String g(boolean p0){
       String str = (p0)? "author": "audience";
       return str;
    }
    public static long h(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (p0 - 1 <= 0) {
          return 0;
       }else {
          return k1.k(p0);
       }
    }
    public static void i(View p0,String p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "2")) {
          return;
       }
       Context context = p0.getContext();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(R.drawable.arg_RES_7f0812d1);
       uoa.p(new b(p2));
       if (!QCurrentUser.me().isLogined()) {
          uoa.e(R.string.arg_RES_7f10422b);
          uoa.h(R.string.arg_RES_7f103d81);
       }
       if (!TextUtils.isEmpty(p1)) {
          uoa.i(p1);
       }
       p0 = c.e(p0, b.g, uoa);
       if (p0 instanceof KwaiEmptyStateView) {
          p0.getEmptyDesc().setTextColor(ContextCompat.getColor(context, R.color.arg_RES_7f061e52));
          TextView textView = p0.findViewById(R.id.retry_btn);
          textView.getPaint().setFakeBoldText(true);
          textView.setTextColor(Color.parseColor("#ED2847"));
          textView.setBackgroundResource(R.drawable.arg_RES_7f08136c);
       }
       return;
    }
    public static void j(View p0,String p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "6")) {
          return;
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.q(3);
       uoa.p(new c(p2));
       if (!TextUtils.isEmpty(p1)) {
          uoa.i(p1);
       }
       c.e(p0, b.g, uoa);
       return;
    }
    public static void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "4")) {
          return;
       }
       p0 = c.h(p0, b.d);
       if (p0 instanceof KwaiLoadingView) {
          p0.setLoadingStyle(LoadingStyle.WHITE);
       }
       return;
    }
    public static void l(LiveLuckyStarOpenResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "5")) {
          return;
       }
       if (p0 != null && p0.mDisableJumpUserProfile != null) {
          Iterator iterator = p0.mLuckyUsers.iterator();
          while (iterator.hasNext()) {
             UserInfo userInfo = iterator.next();
             if (userInfo != null) {
                if (userInfo.mExtraInfo == null) {
                   userInfo.mExtraInfo = new UserExtraInfo();
                }
                userInfo.mExtraInfo.mDisableJumpUserProfile = p0.mDisableJumpUserProfile;
             }
          }
       }
       return;
    }
}
