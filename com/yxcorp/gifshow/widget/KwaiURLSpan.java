package com.yxcorp.gifshow.widget.KwaiURLSpan;
import com.yxcorp.gifshow.widget.SourceURLSpan;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.view.Window;
import android.content.Context;
import android.content.Intent;
import android.text.style.URLSpan;
import android.net.Uri;
import ekd.w0;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import e3a.a;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import zf6.k;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;

public class KwaiURLSpan extends SourceURLSpan	// class@00186f
{
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public BaseFeed k;
    public View$OnClickListener l;
    public boolean m;
    public String n;

    public void KwaiURLSpan(String p0,String p1){
       super(p0, p1);
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = false;
       this.j = null;
    }
    public void KwaiURLSpan(String p0,String p1,String p2){
       super(p0, p2);
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = false;
       this.j = null;
       this.j = p1;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiURLSpan.class, "3")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       View decorView = uActivity.getWindow().getDecorView();
       Context context = p0.getContext();
       Intent intent = new Intent("android.intent.action.VIEW", w0.f(this.getURL()));
       KwaiURLSpan th = this.h;
       if (th >= null) {
          intent.putExtra("activityCloseEnterAnimation", th);
       }
       th = this.g;
       if (th >= null) {
          intent.putExtra("activityOpenExitAnimation", th);
       }
       if (this.i != null) {
          intent.setPackage(context.getPackageName());
       }
       th = this.k;
       if (th != null) {
          intent.putExtra("arg_photo_exp_tag", r1.M0(th));
       }
       intent.putExtra("com.android.browser.application_id", context.getPackageName());
       if (uActivity instanceof GifshowActivity) {
          uActivity.q3(intent, 1001, decorView);
       }
       Activity uActivity1 = a.b(context);
       if (uActivity1 != null) {
          KwaiURLSpan te = this.e;
          if (te >= null) {
             KwaiURLSpan tf = this.f;
             if (tf >= null) {
                uActivity1.overridePendingTransition(te, tf);
             }
          }
       }
       return;
    }
    public KwaiURLSpan b(int p0,int p1){
       this.g = p0;
       this.h = p1;
       return this;
    }
    public KwaiURLSpan c(int p0,int p1){
       this.e = p0;
       this.f = p1;
       return this;
    }
    public KwaiURLSpan d(int p0){
       this.c = p0;
       return this;
    }
    public KwaiURLSpan e(boolean p0){
       this.i = p0;
       return this;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiURLSpan.class, "2")) {
          return;
       }
       Activity uActivity = a.a(p0);
       KwaiURLSpan tj = this.j;
       if (tj != null && uActivity instanceof GifshowActivity) {
          uActivity.m3(tj);
          this.a(p0);
          uActivity.m3(null);
       }else {
          this.a(p0);
       }
       KwaiURLSpan tl = this.l;
       if (tl != null) {
          tl.onClick(p0);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiURLSpan.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       int i = (k.d())? 0x7f060216: 0x7f060215;
       KwaiURLSpan tc = this.c;
       if (tc == null) {
          p0.setColor(a.a().a().getResources().getColor(i));
       }else if(this.m != null){
          KwaiURLSpan td = this.d;
          if (td != null) {
             tc = td;
          }
       }
       p0.setColor(tc);
       return;
    }
}
