package com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import yx.j0;
import android.os.Build$VERSION;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Character;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import java.util.Collection;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView$b;
import java.lang.Runnable;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView$c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView$d;

public final class AdPrivacyTextView extends AppCompatTextView	// class@001616
{
    public QPhoto f;
    public String g;
    public List h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public HashMap m;
    public static final AdPrivacyTextView$a n;

    static {
       AdPrivacyTextView.n = new AdPrivacyTextView$a(null);
    }
    public void AdPrivacyTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AdPrivacyTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AdPrivacyTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.h = new ArrayList();
       this.setIncludeFontPadding(false);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h);
       a.o(typedArray, "context.obtainStyledAttr¡­leable.AdPrivacyTextView\)");
       this.l = typedArray.getBoolean(3, false);
       this.i = typedArray.getColor(false, -1);
       this.j = typedArray.getColor(2, -1);
       this.k = typedArray.getColor(1, -1);
       typedArray.recycle();
       this.q();
       this.setTextColor(this.i);
       this.setMovementMethod(LinkMovementMethod.getInstance());
       this.setHighlightColor(false);
    }
    public void AdPrivacyTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getLinkShowText(){
       String obj = PatchProxy.apply(null, this, AdPrivacyTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = this.h.size() - 1;
       int i1 = 0;
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = obj+obj1.mLinkText;
          if (i1 != i) {
             obj = obj+" | ";
          }
          i1 = i2;
       }
       obj = obj;
       a.o(obj, "sb.toString\(\)");
       return obj;
    }
    public final void p(){
       AdPrivacyTextView tg;
       StaticLayout staticLayout;
       StaticLayout staticLayout1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPrivacyTextView.class, "5")) {
          return;
       }
       if (this.g != null) {
          if (this.h.isEmpty()) {
             return;
          }else {
             int i = (this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight();
             Object[] objArray1 = new Object[0];
             j0.a("AdPrivacyTextView", "line width is "+i, objArray1);
             if (i <= 0) {
                return;
             }else {
                String str = a.C(this.g, this.getLinkShowText());
                if (Build$VERSION.SDK_INT >= 23) {
                   tg = this.g;
                   a.m(tg);
                   AdPrivacyTextView tg1 = this.g;
                   a.m(tg1);
                   staticLayout = StaticLayout$Builder.obtain(tg, 0, tg1.length(), this.getPaint(), i).build();
                   String str1 = "StaticLayout.Builder\n   ¡­Width\)\n          .build\(\)";
                   a.o(staticLayout, str1);
                   staticLayout1 = StaticLayout$Builder.obtain(str, 0, str.length(), this.getPaint(), i).build();
                   a.o(staticLayout1, str1);
                }else {
                   int i1 = i;
                   staticLayout = new StaticLayout(this.g, this.getPaint(), i1, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, this.getLineSpacingExtra(), this.getIncludeFontPadding());
                   staticLayout = new StaticLayout(str, this.getPaint(), i1, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, this.getLineSpacingExtra(), this.getIncludeFontPadding());
                   staticLayout = v13;
                   staticLayout1 = v14;
                }
                int lineCount = staticLayout.getLineCount();
                int lineCount1 = staticLayout1.getLineCount();
                Object[] objArray2 = new Object[0];
                j0.a("AdPrivacyTextView", "line num without link is "+lineCount+", "+"line num with link is "+lineCount1, objArray2);
                if (lineCount1 > lineCount) {
                   tg = this.g;
                   if (tg != null && !StringsKt__StringsKt.R2(tg, 10, 0, 2, objArray)) {
                      AdPrivacyTextView tg2 = this.g;
                      a.m(tg2);
                      if (staticLayout1.getLineStart(lineCount) != tg2.length()) {
                         this.g = a.C(this.g, Character.valueOf(10));
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, AdPrivacyTextView.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          Object[] objArray = new Object[0];
          j0.a("AdPrivacyTextView", "current break strategy is : "+this.getBreakStrategy(), objArray);
          this.setBreakStrategy(0);
       }
       return;
    }
    public final void r(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPrivacyTextView.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       if (!PatchProxy.applyVoidOneRefs(p0, this, AdPrivacyTextView.class, "3")) {
          this.f = p0;
          this.h.clear();
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mPrivacyOpti = photoAdverti.mPrivacyOption;
                if (mPrivacyOpti != null) {
                   PhotoAdvertisement$PrivacyOption mAppDisplayT = mPrivacyOpti.mAppDisplayText;
                   String str = (mAppDisplayT == null || !mAppDisplayT.length())? 1: null;
                   str = (str)? "": mPrivacyOpti.mAppDisplayText+"   ";
                   this.g = str;
                   PhotoAdvertisement$PrivacyOption mAppInfoLink = mPrivacyOpti.mAppInfoLinkList;
                   if (mAppInfoLink != null) {
                      this.h.addAll(mAppInfoLink);
                   }
                }
             }
          }
       }
       this.post(new AdPrivacyTextView$b(this));
       return;
    }
    public final void s(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPrivacyTextView.class, "9")) {
          return;
       }
       AdPrivacyTextView tf = this.f;
       if (tf != null) {
          QPhoto mEntity = tf.mEntity;
          if (mEntity != null) {
             i0.a().e(141, mEntity).d(AdPrivacyTextView$c.b).q("button_text", p0).a();
          }
       }
       return;
    }
    public final void setAdLinkTextColor(int p0){
       this.j = p0;
    }
    public final void setLinkDividerColor(int p0){
       this.k = p0;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, AdPrivacyTextView.class, "10")) {
          return;
       }
       AdPrivacyTextView tf = this.f;
       if (tf != null) {
          QPhoto mEntity = tf.mEntity;
          if (mEntity != null) {
             i0.a().e(140, mEntity).d(AdPrivacyTextView$d.b).a();
          }
       }
       return;
    }
}
