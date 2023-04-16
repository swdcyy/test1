package i59.f;
import java.lang.Object;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ll8.c$b;
import ekd.j1;
import android.content.res.Resources;
import com.kwai.framework.model.feed.BaseFeed;
import android.text.SpannableStringBuilder;
import nl9.c$a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import nl9.c$a$a;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import ync.a;
import android.graphics.drawable.Drawable;
import y17.a;
import i59.d;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;

public class f	// class@002636
{

    public void f(){
       super();
    }
    public static ForegroundColorSpan a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForegroundColorSpan(p0.getResources().getColor(j1.a(p0, c$b.T3, 13)));
    }
    public static void b(BaseFeed p0,SpannableStringBuilder p1,Context p2,c$a p3){
       int i;
       int i2;
       int i4;
       d uod = p0;
       CharSequence uCharSequenc = p1;
       Context uContext = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f.class, "4")) {
          return;
       }
       String str = "AD";
       Object obj = uod.get(str);
       if (obj == null) {
          return;
       }
       c$a uoa = (p3 == null)? new c$a$a(uContext).a(): p3;
       PhotoAdvertisement mCaptionUrls = obj.mCaptionUrls;
       String str1 = -1;
       if (mCaptionUrls != null) {
          i = 0;
          int i1 = 0;
          while (i < mCaptionUrls.size()) {
             i2 = TextUtils.indexOf(uCharSequenc, mCaptionUrls.get(i).mPlaceholder, i1);
             if (i2 != str1) {
                PhotoAdvertisement$UrlMapping mPlaceholder = mCaptionUrls.get(i).mPlaceholder;
                String str2 = " "+obj.mCaptionUrls.get(i).mTitle;
                int i3 = mPlaceholder.length() + i2;
                uCharSequenc.replace(i2, i3, mPlaceholder+str2);
                Drawable uDrawable = a.g(uContext, uoa.a, a.c(p2));
                if (uDrawable != null) {
                   a uoa1 = new a(uDrawable, mPlaceholder);
                   uoa1.c(uDrawable.getIntrinsicWidth(), uDrawable.getIntrinsicHeight());
                   i4 = mPlaceholder.length() + i2;
                   uCharSequenc.setSpan(uoa1, i2, i4, 33);
                }
                i1 = mPlaceholder.length() + i2;
                d uod1 = new d(uod);
                uod1.b(uoa.b);
                if (PatchProxy.isSupport(d.class)) {
                   d obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), uod1, d.class, "1");
                   if (obj1 != PatchProxyResult.class) {
                      uod1 = obj1;
                   }else {
                   label_00db :
                      obj1 = uod1.b;
                      if (obj1 != null) {
                         uod1.c = i;
                         uod1.d = obj1.get(str).mCaptionUrls.get(i).mUrl;
                      }
                   }
                }else {
                   goto label_00db ;
                }
                int i5 = str2.length() + i1;
                uCharSequenc.setSpan(uod1, i1, i5, 33);
                i1 = i2;
             }
             i = i + 1;
             str1 = -1;
          }
       }
       if (!PatchProxy.applyVoidThreeRefs(obj, p1, uoa, null, f.class, "5")) {
          PhotoAdvertisement mCaptionHint = obj.mCaptionHints;
          if (mCaptionHint != null) {
             int i6 = 0;
             i4 = 0;
             while (i4 < mCaptionHint.size()) {
                PhotoAdvertisement$HintMapping hintMapping = mCaptionHint.get(i4);
                if (hintMapping != null && (hintMapping.mClick == null || hintMapping.mPlaceholder == null)) {
                   PhotoAdvertisement$HintMapping hintMapping1 = -1;
                }else {
                   i = TextUtils.indexOf(uCharSequenc, mCaptionHint.get(i4).mPlaceholder, i6);
                   if (i != -1) {
                      PhotoAdvertisement$HintMapping mClick = mCaptionHint.get(i4).mClick;
                      i6 = (mCaptionHint.get(i4).mPlaceholder).length() + i;
                      uCharSequenc.replace(i, i6, mClick);
                      i2 = mClick.length() + i;
                      uCharSequenc.setSpan(uoa.c, i, i2, 33);
                      i6 = i;
                   }
                }
                i4 = i4 + 1;
             }
          }
       }
       return;
    }
    public static CharSequence c(Context p0,String p1){
       SpannableString obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p1)) {
          return "";
       }
       obj = new SpannableString(p1);
       obj.setSpan(f.a(p0), 0, obj.length(), 33);
       return obj;
    }
}
