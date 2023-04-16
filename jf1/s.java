package jf1.s;
import o81.d;
import com.kuaishou.live.common.core.component.comments.b$a;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import r81.c;
import android.content.res.Resources;
import lnc.a1;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import jf1.s$a;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftMergedMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMergedMessage;
import java.util.Locale;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.view.View$OnClickListener;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.style.ClickableSpan;
import jf1.r;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import android.text.SpannableStringBuilder;
import jf1.q;

public class s implements d	// class@002b7e
{
    public final b$a a;

    public void s(b$a p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       s$a d;
       String str1;
       LiveSpannable$b uob1;
       LiveSpannable$b obj1;
       String str2;
       s os = s.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, os, str);
       if (spannableStr != patchProxyRe) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          p1.d();
          Resources resources = a1.m();
          LiveSpannable$b uob = f.c(b.c(p0.mUser), p1);
          if (p1.p()) {
             uob.d(p1.h());
          }else {
             uob.d(R.color.arg_RES_7f060871);
          }
          liveSpannabl.j(uob);
          if (p1.p()) {
             liveSpannabl.e();
          }else {
             liveSpannabl.c();
          }
          Object obj = null;
          s$a uoa = PatchProxy.applyOneRefs(p0, obj, s$a.class, str);
          int i = 1;
          if (uoa != patchProxyRe) {
          }else {
             uoa = new s$a();
             uoa.c = p0.mCount;
             if (p0 instanceof LiveGiftMergedMessage) {
                uoa.b = i;
                uoa.d = p0.mMergeCount;
             }else if(p0 instanceof LiveGiftToAudienceMessage){
                uoa.a = i;
                uoa.e = b.c(p0.mGiftReceiverUserInfo);
                if (p0 instanceof LiveGiftToAudienceMergedMessage) {
                   uoa.b = i;
                   uoa.d = p0.mMergeCount;
                }
             }
          }
          int i1 = 0;
          if (uoa.b != null) {
             d = uoa.d;
             s$a c = uoa.c;
             int i2 = d * c;
             if (i2 > i) {
                if (d > i && c > i) {
                   Object[] objArray = new Object[]{Integer.valueOf(d),Integer.valueOf(uoa.c)};
                   str1 = String.format(Locale.US, "%d x %d", objArray);
                }else {
                   str1 = String.valueOf(i2);
                }
             }else {
             label_00ca :
                str1 = obj;
             }
          }else {
             d = uoa.c;
             if (d > i) {
                str1 = String.valueOf(d);
             }else {
                goto label_00ca ;
             }
          }
          if (uoa.a != null) {
             uob1 = f.c(resources.getString(R.string.arg_RES_7f102c25), p1);
             uob = f.c("@"+uoa.e, p1);
             if (p1.p()) {
                uob1.d(p1.l());
                uob.d(p1.h());
             }else {
                uob1.d(R.color.arg_RES_7f06086b);
                uob.d(R.color.arg_RES_7f06086b);
             }
             uob1.b(this.b(p0));
             uob.b(this.b(p0));
             if (p1.p()) {
                liveSpannabl.e().j(uob1).e().j(uob).e();
             }else {
                liveSpannabl.e().j(uob1).j(uob);
             }
             if (!TextUtils.x(str1)) {
                uob1 = f.c(a1.r(R.string.arg_RES_7f102c1e, str1), p1);
                this.d(p1, uob1);
                uob1.b(this.b(p0));
                liveSpannabl.j(uob1);
             }
          }else if(!TextUtils.x(str1)){
             Object[] objArray1 = new Object[i];
             objArray1[i1] = str1;
             str2 = resources.getString(this.c(i), objArray1);
          }else {
             str2 = resources.getString(this.c(i1));
          }
          uob1 = f.c(str2, p1);
          this.d(p1, uob1);
          uob1.b(this.b(p0));
          liveSpannabl.j(uob1);
          if (p0.mIsWishListGift != null) {
             uob1 = f.c(a1.p(R.string.arg_RES_7f102f2e), p1);
             this.d(p1, uob1);
             uob1.b(this.b(p0));
             liveSpannabl.j(uob1);
          }
          Gift gift = a.a(p0.mGiftId);
          if (gift != null && !TextUtils.x(gift.mName)) {
             uob = f.c(gift.mName, p1);
             this.d(p1, uob);
             uob.b(this.b(p0));
             liveSpannabl.j(uob);
          }
          Bitmap uBitmap = a.b(p0.mGiftId);
          BitmapDrawable uBitmapDrawa = (uBitmap != null)? new BitmapDrawable(uBitmap): ContextCompat.getDrawable(a1.c(), R.drawable.arg_RES_7f081143);
          if (uBitmapDrawa != null) {
             LiveSpannable liveSpannabl1 = liveSpannabl.e();
             LiveSpannable$a uoa1 = new LiveSpannable$a(uBitmapDrawa).c(p1.f);
             obj1 = PatchProxy.applyOneRefs(p0, this, os, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else if(this.a == null){
                obj = new r(this, p0);
             }
             uoa1.a(obj);
             liveSpannabl1.h(uoa1);
          }
          if (gift != null && gift.isFansTopGift()) {
             liveSpannabl.b("£¬").b(a1.p(R.string.arg_RES_7f101eec));
          }
          if (uoa.a == null) {
             if (p0.mIsOpenArrowRedPack != null) {
                obj1 = f.c(a1.p(R.string.arg_RES_7f101eed), p1).d(R.color.arg_RES_7f06086b);
                obj1.b(this.b(p0));
                liveSpannabl.e().j(obj1);
             }
             if (!PatchProxy.applyVoidThreeRefs(p0, liveSpannabl, p1, null, s.class, "5") && p1.m()) {
                p0 = p0.mLiveAudienceState;
                if (p0 != null && p0.isFromFansTop != null) {
                   liveSpannabl.e().h(p1.a(R.drawable.arg_RES_7f081315));
                }
             }
          }
       label_027b :
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
    public final View$OnClickListener b(GiftMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return null;
       }
       return new q(this, p0);
    }
    public final int c(boolean p0){
       int i = (p0)? 0x7f104647: 0x7f104646;
       return i;
    }
    public final void d(g p0,LiveSpannable$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "4")) {
          return;
       }
       if (p0.p()) {
          p1.d(p0.l());
       }else {
          p1.d(R.color.arg_RES_7f06086b);
       }
       return;
    }
}
