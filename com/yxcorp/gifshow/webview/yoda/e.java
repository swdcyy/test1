package com.yxcorp.gifshow.webview.yoda.e;
import my7.l;
import android.app.Activity;
import com.yxcorp.gifshow.webview.view.c;
import java.lang.Object;
import com.kwai.yoda.model.ButtonParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import java.lang.Boolean;
import com.kwai.yoda.model.ButtonParams$PositionId;
import com.kwai.robust.PatchProxyResult;
import yz7.c;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$Icon;
import ca7.u;
import com.kwai.yoda.model.ButtonParams$Icon;
import com.yxcorp.gifshow.webview.yoda.e$a;
import java.lang.Enum;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$IconImageUrl;
import android.net.Uri;
import xkd.b;
import android.view.View;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import java.lang.CharSequence;
import android.graphics.Color;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kwai.yoda.model.PageStyleParams;
import com.kwai.yoda.model.StatusBarParams;
import java.util.Objects;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;
import com.kwai.yoda.model.LaunchModelInternal;
import android.graphics.drawable.GradientDrawable;
import com.kwai.yoda.bridge.YodaBaseWebView;
import px7.c;
import myc.j;
import com.yxcorp.gifshow.webview.view.c$b;

public class e implements l	// class@0017ad
{
    public c a;
    public Activity b;

    public void e(Activity p0,c p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public void a(ButtonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       JsPageButtonParams jsPageButton = new JsPageButtonParams();
       jsPageButton.mShow = Boolean.FALSE;
       this.g(p0.mButtonId, jsPageButton);
       return;
    }
    public void b(ButtonParams p0){
       Uri obj;
       ButtonParams mImage1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       JsPageButtonParams jsPageButton = new JsPageButtonParams();
       jsPageButton.mShow = Boolean.TRUE;
       jsPageButton.mOnClick = p0.mPageAction;
       if (("textView").equals(p0.mViewType)) {
          jsPageButton.mText = p0.mText;
          if (c.b(p0.mTextColor)) {
             jsPageButton.mTextColor = p0.mTextColor;
          }
       }else {
          ButtonParams mImage = p0.mImage;
          JsPageButtonParams$Icon icon = PatchProxy.applyOneRefs(mImage, this, uoe, "3");
          JsPageButtonParams$IconImageUrl iconImageUrl = null;
          if (icon != patchProxyRe) {
          }else {
             try{
                int i = e$a.a[ButtonParams$Icon.valueOf((u.a(mImage)).toUpperCase()).ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         icon = (i != 4)? iconImageUrl: JsPageButtonParams$Icon.CUSTOM;
                      }else {
                         icon = JsPageButtonParams$Icon.SHARE;
                      }
                   }else {
                      icon = JsPageButtonParams$Icon.CLOSE;
                   }
                }else {
                   icon = JsPageButtonParams$Icon.BACK;
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
    label_00a9 :
       this.g(p0.mButtonId, jsPageButton);
       return;
    }
    public View c(){
       return this.a.l;
    }
    public void d(ButtonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       JsPageTitleParams jsPageTitleP = new JsPageTitleParams();
       jsPageTitleP.mTitle = p0.mTitle;
       if (c.b(p0.mTextColor)) {
          jsPageTitleP.mTitleTextColor = p0.mTextColor;
       }
       if (!u.c(jsPageTitleP.mTitleTextColor)) {
          this.a.l.t(Color.parseColor(jsPageTitleP.mTitleTextColor));
          if (!u.c(jsPageTitleP.mTitle)) {
             this.a.l(jsPageTitleP);
          }
       }else {
          this.a.l(jsPageTitleP);
       }
       return;
    }
    public void e(PageStyleParams p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "11")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "8")) {
          StatusBarParams mPosition = p0.mPosition;
          if (!PatchProxy.applyVoidOneRefs(mPosition, this, uoe, "10") && !u.c(mPosition)) {
             Objects.requireNonNull(mPosition);
             int i1 = -1;
             switch (mPosition.hashCode()){
                 case 0x33af38:
                   if (mPosition.equals("none")) {
                      i1 = 0;
                   }
                   break;
                 case 0x5cee774:
                   if (mPosition.equals("fixed")) {
                      i1 = 1;
                   }
                   break;
                 case 0x5c13d641:
                   if (mPosition.equals("default")) {
                      i1 = 2;
                   }
                   break;
                 default:
             }
             switch (i1){
                 case 0:
                 case 1:
                   this.a.l.setVisibility(8);
                   break;
                 case 2:
                   this.a.l.setVisibility(0);
                   break;
                 default:
             }
          }
          mPosition = p0.mBackgroundColor;
          if (!PatchProxy.applyVoidOneRefs(mPosition, this, uoe, "9") && !u.c(mPosition)) {
             Drawable background = this.a.l.getBackground();
             int i = (u.b(mPosition, "default"))? Color.parseColor(LaunchModelInternal.DEFAULT_BG_COLOR): Color.parseColor(mPosition);
             if (background instanceof GradientDrawable) {
                background.setColor(i);
                this.a.l.setBackground(background);
             }else {
                this.a.l.setBackgroundColor(i);
             }
          }
       }
    label_00ad :
       c b = this.a.b;
       if (b instanceof YodaBaseWebView) {
          c.b(b, p0);
       }
       return;
    }
    public void f(PageStyleParams p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "8")) {
          return;
       }
       StatusBarParams mPosition = p0.mPosition;
       if (!PatchProxy.applyVoidOneRefs(mPosition, this, uoe, "10") && !u.c(mPosition)) {
          Objects.requireNonNull(mPosition);
          int i1 = -1;
          switch (mPosition.hashCode()){
              case 0x33af38:
                if (mPosition.equals("none")) {
                   i1 = 0;
                }
                break;
              case 0x5cee774:
                if (mPosition.equals("fixed")) {
                   i1 = 1;
                }
                break;
              case 0x5c13d641:
                if (mPosition.equals("default")) {
                   i1 = 2;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
              case 1:
                this.a.l.setVisibility(8);
                break;
              case 2:
                this.a.l.setVisibility(0);
                break;
              default:
          }
       }
       StatusBarParams mBackgroundC = p0.mBackgroundColor;
       if (!PatchProxy.applyVoidOneRefs(mBackgroundC, this, uoe, "9") && !u.c(mBackgroundC)) {
          Drawable background = this.a.l.getBackground();
          int i = (u.b(mBackgroundC, "default"))? Color.parseColor(LaunchModelInternal.DEFAULT_BG_COLOR): Color.parseColor(mBackgroundC);
          if (background instanceof GradientDrawable) {
             background.setColor(i);
             this.a.l.setBackground(background);
          }else {
             this.a.l.setBackgroundColor(i);
          }
       }
       return;
    }
    public final void g(ButtonParams$PositionId p0,JsPageButtonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       j oj = new j(this);
       int i = e$a.b[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   this.a.r(p1, oj);
                }
                return;
             }else {
                this.a.q(p1, oj);
                return;
             }
          }else {
             this.a.p(p1, oj);
             return;
          }
       }else {
          this.a.n(p1, oj);
          return;
       }
    }
}
