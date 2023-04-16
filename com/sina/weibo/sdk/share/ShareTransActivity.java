package com.sina.weibo.sdk.share.ShareTransActivity;
import com.sina.weibo.sdk.share.BaseActivity;
import com.sina.weibo.sdk.share.ShareTransActivity$1;
import android.os.Looper;
import android.content.Intent;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.lang.String;
import android.widget.FrameLayout;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.sina.weibo.sdk.b.c;
import java.lang.Math;
import java.lang.System;
import com.sina.weibo.sdk.b.d;
import android.os.Bundle;
import android.content.Context;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;
import android.app.Activity;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.a;
import com.sina.weibo.sdk.b.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import android.os.Handler;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Exception;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.os.AsyncTask;
import com.sina.weibo.sdk.share.d;
import com.sina.weibo.sdk.share.ShareTransActivity$2;
import com.sina.weibo.sdk.share.b;

public class ShareTransActivity extends BaseActivity	// class@000bd1
{
    public Intent t;
    public FrameLayout u;
    public d v;
    public String w;
    public Handler x;

    public void ShareTransActivity(){
       super();
       this.x = new ShareTransActivity$1(this, Looper.getMainLooper());
    }
    public static void a(ShareTransActivity p0){
       p0.j();
    }
    public static void a(ShareTransActivity p0,Intent p1){
       p0.b(p1);
    }
    public static void a(ShareTransActivity p0,WeiboMultiMessage p1){
       p0.a(p1);
    }
    public static void a(ShareTransActivity p0,String p1){
       p0.c(p1);
    }
    public static FrameLayout b(ShareTransActivity p0){
       return p0.u;
    }
    public static void c(Intent p0){
       if (p0 != null && p0.getFlags()) {
          int flags = p0.getFlags();
          String str = Integer.toBinaryString(flags);
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(Integer.valueOf(64));
          uArrayList.add(Integer.valueOf(128));
          uArrayList.add(Integer.valueOf(1));
          uArrayList.add(Integer.valueOf(2));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             int i = ~ iterator.next().intValue();
             flags = flags & i;
          }
          c.a("WBShareTag", "clear flags: "+str+"->"+Integer.toBinaryString(flags));
          p0.setFlags(flags);
       }
       return;
    }
    public final void a(WeiboMultiMessage p0){
       c.a("WBShareTag", "start wb composer");
       this.t.putExtra("start_flag", 1002);
       String str = d.f(String.valueOf(((Math.random() * 10000.00f) + (double)System.currentTimeMillis())));
       this.w = str;
       this.t.putExtra("share_back_flag", str);
       this.t.putExtra("share_flag_for_new_version", 1);
       Bundle extras = this.t.getExtras();
       Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
       a$a uoa = a.c(this);
       if (uoa != null) {
          intent.setPackage(uoa.packageName);
       }
       intent.putExtras(p0.writeToBundle(extras));
       intent.putExtra("_weibo_sdkVersion", "0041005000");
       intent.putExtra("_weibo_appPackage", this.getPackageName());
       intent.putExtra("_weibo_appKey", a.a().getAppKey());
       intent.putExtra("_weibo_flag", 0x20130329);
       intent.putExtra("_weibo_sign", d.f(e.b(this, this.getPackageName())));
       String stringExtra = this.t.getStringExtra("start_web_activity");
       if (!TextUtils.isEmpty(stringExtra) && ("com.sina.weibo.sdk.web.WebActivity").equals(stringExtra)) {
          intent.setClassName(this, stringExtra);
          this.startActivityForResult(intent, 0x2711);
          return;
       }else if(a.a(this)){
          if (uoa != null) {
             intent.setPackage(uoa.packageName);
          }
          this.startActivityForResult(intent, 0x2711);
          return;
       }else {
          this.c("Start weibo client\'s composer fail. And Weibo client is not installed.");
          return;
       }
    }
    public final boolean a(Intent p0){
       if (TextUtils.isEmpty(this.w)) {
          return false;
       }
       if (p0 == null || !p0.getExtras().containsKey("share_back_flag")) {
          return false;
       }
       if (!TextUtils.equals(this.w, p0.getStringExtra("share_back_flag"))) {
          return false;
       }
       return true;
    }
    public final void b(Intent p0){
       ShareTransActivity tu = this.u;
       if (tu != null) {
          tu.setVisibility(4);
       }
       tu = this.x;
       if (tu != null) {
          tu.removeMessages(0);
          this.x = null;
       }
       if (!this.a(p0)) {
          this.j();
          return;
       }else {
          ShareTransActivity.c(p0);
          this.setResult(-1, p0);
          this.finish();
          return;
       }
    }
    public final void c(String p0){
       ShareTransActivity tu = this.u;
       if (tu != null) {
          tu.setVisibility(4);
       }
       tu = this.x;
       if (tu != null) {
          tu.removeMessages(0);
          this.x = null;
       }
       Intent intent = new Intent();
       Bundle uBundle = new Bundle();
       uBundle.putInt("_weibo_resp_errcode", 2);
       uBundle.putString("_weibo_resp_errstr", p0);
       intent.putExtras(uBundle);
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void j(){
       ShareTransActivity tu = this.u;
       if (tu != null) {
          tu.setVisibility(8);
       }
       tu = this.x;
       if (tu != null) {
          tu.removeMessages(0);
          this.x = null;
       }
       try{
          Intent intent = new Intent();
          Bundle uBundle = new Bundle();
          uBundle.putInt("_weibo_resp_errcode", 1);
          intent.putExtras(uBundle);
          this.setResult(-1, intent);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.finish();
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       c.a("WBShareTag", "onActivityResult. Means share result coming!");
       ShareTransActivity tx = this.x;
       if (tx != null) {
          if (p1 == -1) {
             Message message = Message.obtain(tx, 1);
             message.obj = p2;
             this.x.sendMessageDelayed(message, 100);
             return;
          }else {
             tx.sendEmptyMessageDelayed(0, 100);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       String str = "WBShareTag";
       c.a(str, "start share activity.");
       Intent intent = this.getIntent();
       this.t = intent;
       if (intent == null) {
          this.finish();
          return;
       }else {
          int i = -1;
          if (intent.getIntExtra("start_flag", i) != 1001) {
             this.finish();
             return;
          }else {
             this.u = new FrameLayout(this);
             int intExtra = this.getIntent().getIntExtra("progress_id", i);
             View view = (intExtra != i)? this.getSystemService("layout_inflater").inflate(intExtra, null): new ProgressBar(this);
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
             layoutParams.gravity = 17;
             this.u.addView(view, layoutParams);
             this.u.setBackgroundColor(0x33000000);
             this.setContentView(this.u);
             c.a(str, "prepare wb resource.");
             str = this.t.getExtras();
             if (str == null) {
                this.finish();
                return;
             }else {
                WeiboMultiMessage weiboMultiMe = new WeiboMultiMessage();
                weiboMultiMe.readFromBundle(str);
                if (weiboMultiMe.multiImageObject != null || weiboMultiMe.videoSourceObject != null) {
                   ShareTransActivity tv = this.v;
                   boolean b = true;
                   if (tv != null) {
                      tv.cancel(b);
                   }
                   d uod = new d(this, new ShareTransActivity$2(this));
                   this.v = uod;
                   WeiboMultiMessage[] weiboMultiMe1 = new WeiboMultiMessage[b];
                   weiboMultiMe1[0] = weiboMultiMe;
                   uod.execute(weiboMultiMe1);
                   return;
                }else {
                   this.a(weiboMultiMe);
                   return;
                }
             }
          }
       }
    }
    public void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       c.a("WBShareTag", "start share activity again. Means share result coming!");
       int intExtra = p0.getIntExtra("start_flag", -1);
       if (intExtra == 1001) {
          return;
       }
       if (intExtra == 1002) {
          this.b(p0);
          return;
       }else {
          this.j();
          return;
       }
    }
}
