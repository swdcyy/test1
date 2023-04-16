package com.yxcorp.gifshow.relation.explore.presenter.e;
import java.lang.Runnable;
import android.widget.TextView;
import fac.d;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.SpannableStringBuilder;
import com.kwai.framework.model.user.User;
import java.util.List;
import java.lang.Object;
import android.text.Layout;
import lnc.a1;
import com.yxcorp.gifshow.relation.explore.presenter.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import java.lang.CharSequence;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.user.base.RichTextMetaExt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kwai.framework.model.user.RichTextMeta;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import lu7.d;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.framework.model.user.RichTextMeta$Param;
import java.util.Iterator;
import ok.h;
import tkd.b;
import tkd.d;
import zu7.a;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.explore.presenter.c;
import erd.r;
import brd.m;
import hac.a0;
import erd.o;
import com.yxcorp.gifshow.relation.explore.presenter.d;
import hac.w;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class e implements Runnable	// class@001823
{
    public final TextView b;
    public final d c;
    public final View d;
    public final View e;
    public final KwaiImageView[] f;
    public final int g;
    public final SpannableStringBuilder h;
    public final User i;
    public final List j;

    public void e(TextView p0,d p1,View p2,View p3,KwaiImageView[] p4,int p5,SpannableStringBuilder p6,User p7,List p8){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
    }
    public final void run(){
       CharSequence uCharSequenc1;
       e uoe = this;
       e b = uoe.b;
       e c = uoe.c;
       e d = uoe.d;
       e e = uoe.e;
       e f = uoe.f;
       e g = uoe.g;
       e h = uoe.h;
       e i = uoe.i;
       e j = uoe.j;
       if (b.getLayout() == null || b.getLayout().getLineCount() < 2) {
          if (c.e == null) {
             f.e(d, (int)((float)a1.d(R.dimen.arg_RES_7f07030d) * c.g));
          }
       }else {
          f.e(d, (int)((float)a1.d(R.dimen.arg_RES_7f070325) * c.g));
          int i1 = 0x7f0702ef;
          f.e(e, (int)((float)a1.d(i1) * c.g));
          ViewGroup$LayoutParams width = f[0].getLayoutParams().width;
          int width1 = (b.getWidth() > 0)? b.getWidth(): b.getLayout().getWidth();
          float f1 = (float)width1;
          float f2 = ((float)a1.d(i1) * c.g) - (float)width;
          int i2 = (g > null)? 1: 0;
          i1 = (int)(f1 - (f2 * (float)i2));
          if (i1 <= 0) {
             i1 = width1;
          }
          int i3 = 2;
          g = j;
          StaticLayout staticLayout = new StaticLayout(h, b.getPaint(), i1, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, null, 0);
          b.setMaxLines(i3);
          if (i2.getLineCount() >= 3) {
             UserExtraInfo mRecoTextInf = i.mExtraInfo.mRecoTextInfo;
             SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(mRecoTextInf, null, null, RichTextMetaExt.class, "14");
             if (spannableStr != PatchProxyResult.class) {
             }else {
                ArrayList uArrayList = new ArrayList();
                if (mRecoTextInf != null && (TextUtils.x(mRecoTextInf.mRawText) || q.f(mRecoTextInf.mParamList))) {
                   spannableStr = new SpannableStringBuilder("");
                }else {
                   Collections.sort(mRecoTextInf.mParamList, new d(mRecoTextInf));
                   int i4 = 0;
                   while (i4 < mRecoTextInf.mParamList.size()) {
                      RichTextMeta$Param param = mRecoTextInf.mParamList.get(i4);
                      if (param != null && (!TextUtils.x(param.mKeyName) && param.mTextType == i3)) {
                         uArrayList.add(param);
                         param = new RichTextMeta$Param();
                         param.mTextValue = ", ";
                         uArrayList.add(param);
                      }
                      i4 = i4 + 1;
                   }
                   if (q.f(uArrayList)) {
                      spannableStr = new SpannableStringBuilder();
                   }else {
                      uArrayList.remove((uArrayList.size() - 1));
                      SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         RichTextMeta$Param param1 = iterator.next();
                         CharSequence uCharSequenc = PatchProxy.applyTwoRefs(param1, null, null, RichTextMetaExt.class, "15");
                         if (uCharSequenc != PatchProxyResult.class) {
                         }else if(!TextUtils.x(param1.mThirdPartyName)){
                            uCharSequenc1 = RichTextMetaExt.b(param1.mThirdPartyName, param1.mLinkUrl, param1, null);
                         }else if(param1.mEnableAlias != null){
                            uCharSequenc1 = RichTextMetaExt.b(TextUtils.i(d.a(-2117944241).ZM(String.valueOf(param1.mUserId)), param1.mTextValue), param1.mLinkUrl, param1, null);
                         }else {
                            uCharSequenc1 = RichTextMetaExt.b(param1.mTextValue, param1.mLinkUrl, param1, null);
                         }
                         uCharSequenc = uCharSequenc1;
                         spannableStr1.append(uCharSequenc);
                      }
                      spannableStr = spannableStr1;
                   }
                }
             }
             if (!TextUtils.x(spannableStr)) {
                g.add(RichTextMetaExt.k(i.mExtraInfo.mRecoTextInfo).T(d.c).t(c.b).t(new a0(b, i1, c)).m(d.b).u(d.a).y(new w(b), Functions.d()));
             }
          }
       }
    label_01e0 :
       return;
    }
}
