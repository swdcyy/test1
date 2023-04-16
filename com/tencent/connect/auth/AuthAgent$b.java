package com.tencent.connect.auth.AuthAgent$b;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.tauth.IUiListener;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.OutOfMemoryError;
import android.graphics.NinePatch;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.Rect;
import java.io.IOException;
import android.view.View$OnClickListener;
import android.view.View;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.app.Activity;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IRequestListener;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.log.SLog;
import android.app.Dialog;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.StringBuilder;
import java.lang.StackTraceElement;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import com.tencent.connect.auth.AuthAgent$b$1;
import com.tencent.connect.auth.AuthAgent$b$2;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.tencent.connect.auth.AuthAgent$b$3;
import android.content.DialogInterface$OnCancelListener;
import org.json.JSONObject;
import java.net.URLDecoder;
import android.text.TextUtils;
import com.tencent.tauth.UiError;

public class AuthAgent$b extends DefaultUiListener	// class@000e1d
{
    public WeakReference a;
    public final AuthAgent b;
    public final String c;
    public final String d;
    public final String e;

    public void AuthAgent$b(AuthAgent p0,IUiListener p1){
       this.b = p0;
       super();
       this.c = "sendinstall";
       this.d = "installwording";
       this.e = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
       this.a = new WeakReference(p1);
    }
    public final Drawable a(String p0,Context p1){
       int i;
       Drawable uDrawable;
       Bitmap uBitmap;
       AssetManager assets = p1.getApplicationContext().getAssets();
       try{
          i = 0;
          InputStream inputStream = SplitAssetHelper.open(assets, p0);
          if (inputStream == null) {
             return i;
          }else if(p0.endsWith(".9.png")){
             try{
                uBitmap = BitmapFactory.decodeStream(inputStream);
             }catch(java.lang.OutOfMemoryError e4){
                e4.printStackTrace();
                uBitmap = i;
             }
             if (uBitmap != null) {
                byte[] ninePatchChu = uBitmap.getNinePatchChunk();
                NinePatch.isNinePatchChunk(ninePatchChu);
                uDrawable = new NinePatchDrawable(uBitmap, ninePatchChu, new Rect(), i);
             label_0044 :
                return uDrawable;
             }else {
                return i;
             }
          }else {
             Drawable uDrawable1 = Drawable.createFromStream(inputStream, p0);
             inputStream.close();
          }
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
       uDrawable = i;
       goto label_0044 ;
    }
    public final View a(Context p0,Drawable p1,String p2,View$OnClickListener p3,View$OnClickListener p4){
       AuthAgent$b uob = this;
       Context uContext = p0;
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       uContext.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       uDisplayMetr = uDisplayMetr.density;
       RelativeLayout relativeLayo = new RelativeLayout(uContext);
       ImageView imageView = new ImageView(uContext);
       imageView.setImageDrawable(p1);
       imageView.setScaleType(ImageView$ScaleType.FIT_XY);
       imageView.setId(1);
       int i = (int)(uDisplayMetr * 14.00f);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)(60.00f * uDisplayMetr), (int)(60.00f * uDisplayMetr));
       layoutParams.addRule(9);
       layoutParams.setMargins(0, (int)(18.00f * uDisplayMetr), (int)(6.00f * uDisplayMetr), (int)(18.00f * uDisplayMetr));
       relativeLayo.addView(imageView, layoutParams);
       TextView textView = new TextView(uContext);
       textView.setText(p2);
       textView.setTextSize(14.00f);
       textView.setGravity(3);
       textView.setIncludeFontPadding(0);
       textView.setPadding(0, 0, 0, 0);
       textView.setLines(2);
       textView.setId(5);
       textView.setMinWidth((int)(185.00f * uDisplayMetr));
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams.addRule(1, 1);
       layoutParams.addRule(6, 1);
       float f = 5.00f * uDisplayMetr;
       layoutParams.setMargins(0, 0, (int)f, 0);
       relativeLayo.addView(textView, layoutParams);
       View view = new View(uContext);
       view.setBackgroundColor(Color.rgb(214, 214, 214));
       view.setId(3);
       layoutParams = new RelativeLayout$LayoutParams(-2, 2);
       layoutParams.addRule(3, 1);
       layoutParams.addRule(5, 1);
       layoutParams.addRule(7, 5);
       int i1 = (int)(12.00f * uDisplayMetr);
       layoutParams.setMargins(0, 0, 0, i1);
       relativeLayo.addView(view, layoutParams);
       LinearLayout linearLayout = new LinearLayout(uContext);
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams.addRule(5, 1);
       layoutParams.addRule(7, 5);
       layoutParams.addRule(3, 3);
       Button uButton = new Button(uContext);
       uButton.setText("跳过");
       uButton.setBackgroundDrawable(uob.a("buttonNegt.png", uContext));
       uButton.setTextColor(Color.rgb(36, 97, 131));
       uButton.setTextSize(20.00f);
       uButton.setOnClickListener(p4);
       uButton.setId(4);
       int i2 = (int)(45.00f * uDisplayMetr);
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(0, i2);
       layoutParams1.rightMargin = i;
       int i3 = (int)(4.00f * uDisplayMetr);
       layoutParams1.leftMargin = i3;
       layoutParams1.weight = 0x3f800000;
       linearLayout.addView(uButton, layoutParams1);
       uButton = new Button(uContext);
       uButton.setText("确定");
       uButton.setTextSize(20.00f);
       uButton.setTextColor(Color.rgb(255, 255, 255));
       uButton.setBackgroundDrawable(uob.a("buttonPost.png", uContext));
       uButton.setOnClickListener(p3);
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(0, i2);
       layoutParams2.weight = 0x3f800000;
       layoutParams2.rightMargin = i3;
       linearLayout.addView(uButton, layoutParams2);
       relativeLayo.addView(linearLayout, layoutParams);
       relativeLayo.setPadding(i, 0, i1, i1);
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams((int)(279.00f * uDisplayMetr), (int)(uDisplayMetr * 163.00f)));
       relativeLayo.setBackgroundColor(Color.rgb(247, 251, 247));
       PaintDrawable paintDrawabl = new PaintDrawable(Color.rgb(247, 251, 247));
       paintDrawabl.setCornerRadius(f);
       relativeLayo.setBackgroundDrawable(paintDrawabl);
       return relativeLayo;
    }
    public void a(){
       Bundle uBundle = AuthAgent.j(this.b);
       if (AuthAgent.e(this.b) == null) {
          return;
       }
       Object obj = AuthAgent.e(this.b).get();
       if (obj != null) {
          HttpUtils.requestAsync(AuthAgent.k(this.b), obj, "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", uBundle, "POST", null);
       }
       return;
    }
    public final void a(String p0,IUiListener p1,Object p2){
       int i1;
       PackageInfo packageInfo;
       Drawable uDrawable;
       String str = "openSDK_LOG.AuthAgent";
       if (AuthAgent.e(this.b) == null) {
          SLog.i(str, "showFeedConfrimDialog mActivity null and return");
          return;
       }else {
          Activity uActivity = AuthAgent.e(this.b).get();
          if (uActivity == null) {
             SLog.i(str, "showFeedConfrimDialog mActivity.get\(\) null and return");
             return;
          }else {
             Dialog uDialog = new Dialog(uActivity);
             uDialog.requestWindowFeature(1);
             PackageManager packageManag = uActivity.getPackageManager();
             int i = 0;
             try{
                i1 = 0;
                packageInfo = packageManag.getPackageInfo(uActivity.getPackageName(), i);
             }catch(android.content.pm.PackageManager$NameNotFoundException e5){
                SLog.e(packageInfo, "showFeedConfrimDialog exception:"+e5.getStackTrace().toString());
                packageInfo = i1;
             }
             if (packageInfo != null) {
                uDrawable = packageInfo.applicationInfo.loadIcon(packageManag);
             }
             ColorDrawable uColorDrawab = new ColorDrawable();
             uColorDrawab.setAlpha(i);
             uDialog.getWindow().setBackgroundDrawable(uColorDrawab);
             uDialog.setContentView(this.a(uActivity, uDrawable, p0, new AuthAgent$b$1(this, uDialog, p1, p2), new AuthAgent$b$2(this, uDialog, p1, p2)));
             uDialog.setOnCancelListener(new AuthAgent$b$3(this, p1, p2));
             if (!uActivity.isFinishing()) {
                uDialog.show();
             }
             return;
          }
       }
    }
    public void onCancel(){
       if (this.a.get() != null) {
          this.a.get().onCancel();
       }
       return;
    }
    public void onComplete(Object p0){
       boolean b;
       String str1;
       String str = "openSDK_LOG.AuthAgent";
       if (p0 != null) {
          JSONObject jSONObject = p0;
          AuthAgent$b uob = null;
          try{
             b = true;
             if (jSONObject.getInt("sendinstall") != b) {
                b = false;
             }
             try{
                str1 = jSONObject.getString("installwording");
             }catch(org.json.JSONException e0){
                SLog.w(e0, "FeedConfirmListener onComplete There is no value for sendinstall.");
                str1 = "";
             }
          }catch(org.json.JSONException e0){
             b = false;
             goto label_001b ;
          }
          str1 = URLDecoder.decode(str1);
          SLog.i(e0, " WORDING = "+str1+"xx,showConfirmDialog="+b);
          if (b && !TextUtils.isEmpty(str1)) {
             this.a(str1, this.a.get(), p0);
             SLog.i(e0, " WORDING is not empty and return");
             return;
          }else {
             IUiListener iUiListener = this.a.get();
             if (iUiListener != null) {
                if (AuthAgent.h(this.b) != null) {
                   uob = AuthAgent.i(this.b).saveSession(jSONObject);
                   SLog.i(e0, " saveSession saveSuccess="+uob);
                }
                if (uob) {
                   iUiListener.onComplete(p0);
                }else {
                   iUiListener.onError(new UiError(-6, "持久化失败!", null));
                }
             }else {
                SLog.i(e0, " userListener is null");
             }
          }
       }
       return;
    }
    public void onError(UiError p0){
       if (this.a.get() != null) {
          this.a.get().onError(p0);
       }
       return;
    }
}
