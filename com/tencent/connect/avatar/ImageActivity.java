package com.tencent.connect.avatar.ImageActivity;
import android.app.Activity;
import android.graphics.Rect;
import com.tencent.connect.avatar.ImageActivity$2;
import com.tencent.connect.avatar.ImageActivity$3;
import com.tencent.connect.avatar.ImageActivity$5;
import com.tencent.connect.avatar.ImageActivity$6;
import java.lang.String;
import android.graphics.drawable.Drawable;
import com.tencent.connect.avatar.b;
import java.util.HashMap;
import java.lang.Object;
import com.tencent.open.b.h;
import java.util.Map;
import com.tencent.connect.avatar.c;
import android.widget.ProgressBar;
import android.widget.Button;
import com.tencent.connect.auth.QQToken;
import android.os.Handler;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import android.net.Uri;
import android.content.ContentResolver;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import java.lang.OutOfMemoryError;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout;
import com.tencent.connect.avatar.a;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.tencent.connect.avatar.ImageActivity$a;
import java.lang.CharSequence;
import android.content.Intent;
import com.tencent.connect.avatar.ImageActivity$QQAvatarImp;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.avatar.ImageActivity$4;
import java.lang.Runnable;
import com.tencent.open.utils.k;
import java.io.IOException;
import java.lang.StringBuilder;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import com.tencent.connect.avatar.ImageActivity$1;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.Toast;
import android.graphics.Matrix;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import com.tencent.connect.UserInfo;
import android.os.Bundle;
import java.lang.System;

public class ImageActivity extends Activity	// class@000e38
{
    public RelativeLayout a;
    public QQToken b;
    public String c;
    public Handler d;
    public c e;
    public Button f;
    public Button g;
    public b h;
    public TextView i;
    public ProgressBar j;
    public int k;
    public boolean l;
    public long m;
    public int n;
    public final int o;
    public final int p;
    public Rect q;
    public String r;
    public Bitmap s;
    public final View$OnClickListener t;
    public final View$OnClickListener u;
    public final IUiListener v;
    public final IUiListener w;

    public void ImageActivity(){
       super();
       this.k = 0;
       this.l = false;
       this.m = 0;
       this.n = 0;
       this.o = 640;
       this.p = 640;
       this.q = new Rect();
       this.t = new ImageActivity$2(this);
       this.u = new ImageActivity$3(this);
       this.v = new ImageActivity$5(this);
       this.w = new ImageActivity$6(this);
    }
    public static Rect a(ImageActivity p0,Rect p1){
       p0.q = p1;
       return p1;
    }
    public static Drawable a(ImageActivity p0,String p1){
       return p0.b(p1);
    }
    public static b a(ImageActivity p0){
       return p0.h;
    }
    public static void a(ImageActivity p0,int p1,String p2,String p3,String p4){
       p0.a(p1, p2, p3, p4);
    }
    public static void a(ImageActivity p0,String p1,int p2){
       p0.b(p1, p2);
    }
    public static void a(String p0,long p1,String p2){
       HashMap hashMap = new HashMap();
       hashMap.put("strValue", p2);
       hashMap.put("nValue", p0);
       hashMap.put("qver", "3.5.4.lite");
       if (p1) {
          hashMap.put("elt", String.valueOf(p1));
       }
       h.a().a("https://cgi.qplus.com/report/report", hashMap);
       return;
    }
    public static boolean a(ImageActivity p0,boolean p1){
       p0.l = p1;
       return p1;
    }
    public static Rect b(ImageActivity p0){
       return p0.q;
    }
    public static void b(ImageActivity p0,String p1){
       p0.c(p1);
    }
    public static void b(ImageActivity p0,String p1,int p2){
       p0.a(p1, p2);
    }
    public static c c(ImageActivity p0){
       return p0.e;
    }
    public static ProgressBar d(ImageActivity p0){
       return p0.j;
    }
    public static Button e(ImageActivity p0){
       return p0.g;
    }
    public static Button f(ImageActivity p0){
       return p0.f;
    }
    public static void g(ImageActivity p0){
       p0.c();
    }
    public static boolean h(ImageActivity p0){
       return p0.l;
    }
    public static long i(ImageActivity p0){
       return p0.m;
    }
    public static void j(ImageActivity p0){
       p0.d();
    }
    public static QQToken k(ImageActivity p0){
       return p0.b;
    }
    public static String l(ImageActivity p0){
       return p0.c;
    }
    public static Handler m(ImageActivity p0){
       return p0.d;
    }
    public static int n(ImageActivity p0){
       return p0.k;
    }
    public static void o(ImageActivity p0){
       p0.e();
    }
    public final Bitmap a(String p0){
       BitmapFactory$Options options = new BitmapFactory$Options();
       boolean b = true;
       options.inJustDecodeBounds = b;
       Uri uri = Uri.parse(p0);
       InputStream inputStream = this.getContentResolver().openInputStream(uri);
       Bitmap uBitmap = null;
       if (inputStream == null) {
          return uBitmap;
       }
       try{
          BitmapFactory.decodeStream(inputStream, uBitmap, options);
       }catch(java.lang.OutOfMemoryError e4){
          e4.printStackTrace();
       }
       inputStream.close();
       inputStream = 0x400000;
       BitmapFactory$Options outWidth = options.outWidth;
       BitmapFactory$Options outHeight = options.outHeight;
       int i = outWidth * outHeight;
       while (i > inputStream) {
          outWidth = outWidth / 2;
          outHeight = outHeight / 2;
          b = b * 2;
       }
       options.inJustDecodeBounds = false;
       options.inSampleSize = b;
       InputStream inputStream1 = this.getContentResolver().openInputStream(uri);
       try{
          uBitmap = BitmapFactory.decodeStream(inputStream1, uBitmap, options);
       }catch(java.lang.OutOfMemoryError e8){
          e8.printStackTrace();
       }
       return uBitmap;
    }
    public final View a(){
       ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
       ViewGroup$LayoutParams layoutParams1 = new ViewGroup$LayoutParams(-2, -2);
       RelativeLayout relativeLayo = new RelativeLayout(this);
       this.a = relativeLayo;
       relativeLayo.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.a.setBackgroundColor(0xff000000);
       RelativeLayout relativeLayo1 = new RelativeLayout(this);
       relativeLayo1.setLayoutParams(layoutParams1);
       this.a.addView(relativeLayo1);
       c uoc = new c(this);
       this.e = uoc;
       uoc.setLayoutParams(layoutParams);
       this.e.setScaleType(ImageView$ScaleType.MATRIX);
       relativeLayo1.addView(this.e);
       this.h = new b(this);
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(layoutParams);
       layoutParams2.addRule(14, -1);
       layoutParams2.addRule(15, -1);
       this.h.setLayoutParams(layoutParams2);
       relativeLayo1.addView(this.h);
       LinearLayout linearLayout = new LinearLayout(this);
       layoutParams2 = new RelativeLayout$LayoutParams(-2, a.a(this, 80.00f));
       layoutParams2.addRule(14, -1);
       linearLayout.setLayoutParams(layoutParams2);
       linearLayout.setOrientation(0);
       linearLayout.setGravity(17);
       this.a.addView(linearLayout);
       ImageView imageView = new ImageView(this);
       imageView.setLayoutParams(new LinearLayout$LayoutParams(a.a(this, 24.00f), a.a(this, 24.00f)));
       imageView.setImageDrawable(this.b("com.tencent.plus.logo.png"));
       linearLayout.addView(imageView);
       this.i = new TextView(this);
       LinearLayout$LayoutParams layoutParams3 = new LinearLayout$LayoutParams(layoutParams1);
       layoutParams3.leftMargin = a.a(this, 7.00f);
       this.i.setLayoutParams(layoutParams3);
       this.i.setEllipsize(TextUtils$TruncateAt.END);
       this.i.setSingleLine();
       this.i.setTextColor(-1);
       this.i.setTextSize(24.00f);
       this.i.setVisibility(8);
       linearLayout.addView(this.i);
       relativeLayo1 = new RelativeLayout(this);
       layoutParams2 = new RelativeLayout$LayoutParams(-1, a.a(this, 60.00f));
       layoutParams2.addRule(12, -1);
       layoutParams2.addRule(9, -1);
       relativeLayo1.setLayoutParams(layoutParams2);
       relativeLayo1.setBackgroundDrawable(this.b("com.tencent.plus.bar.png"));
       relativeLayo1.setPadding(a.a(this, 10.00f), a.a(this, 10.00f), a.a(this, 10.00f), 0);
       this.a.addView(relativeLayo1);
       ImageActivity$a uoa = new ImageActivity$a(this, this);
       int i = a.a(this, 14.00f);
       int i1 = a.a(this, 7.00f);
       this.g = new Button(this);
       this.g.setLayoutParams(new RelativeLayout$LayoutParams(a.a(this, 78.00f), a.a(this, 45.00f)));
       this.g.setText("取消");
       this.g.setTextColor(-1);
       this.g.setTextSize(18.00f);
       this.g.setPadding(i, i1, i, i1);
       uoa.b(this.g);
       relativeLayo1.addView(this.g);
       this.f = new Button(this);
       RelativeLayout$LayoutParams layoutParams4 = new RelativeLayout$LayoutParams(a.a(this, 78.00f), a.a(this, 45.00f));
       layoutParams4.addRule(11, -1);
       this.f.setLayoutParams(layoutParams4);
       this.f.setTextColor(-1);
       this.f.setTextSize(18.00f);
       this.f.setPadding(i, i1, i, i1);
       this.f.setText("选取");
       uoa.a(this.f);
       relativeLayo1.addView(this.f);
       TextView textView = new TextView(this);
       RelativeLayout$LayoutParams layoutParams5 = new RelativeLayout$LayoutParams(layoutParams1);
       layoutParams5.addRule(13, -1);
       textView.setLayoutParams(layoutParams5);
       textView.setText("移动和缩放");
       textView.setPadding(0, a.a(this, 3.00f), 0, 0);
       textView.setTextSize(18.00f);
       textView.setTextColor(-1);
       relativeLayo1.addView(textView);
       this.j = new ProgressBar(this);
       RelativeLayout$LayoutParams layoutParams6 = new RelativeLayout$LayoutParams(layoutParams1);
       layoutParams6.addRule(14, -1);
       layoutParams6.addRule(15, -1);
       this.j.setLayoutParams(layoutParams6);
       this.j.setVisibility(8);
       this.a.addView(this.j);
       return this.a;
    }
    public final void a(int p0,String p1,String p2,String p3){
       Intent intent = new Intent();
       intent.putExtra("key_error_code", p0);
       intent.putExtra("key_error_msg", p2);
       intent.putExtra("key_error_detail", p3);
       intent.putExtra("key_response", p1);
       this.setResult(-1, intent);
    }
    public final void a(Bitmap p0){
       new ImageActivity$QQAvatarImp(this, this.b).setAvator(p0, this.v);
    }
    public final void a(String p0,int p1){
       this.d.post(new ImageActivity$4(this, p0, p1));
    }
    public void a(String p0,long p1){
       ImageActivity.a(p0, p1, this.b.getAppId());
    }
    public final Drawable b(String p0){
       return k.a(p0, this);
    }
    public final void b(){
       try{
          Bitmap uBitmap = this.a(this.r);
          this.s = uBitmap;
          if (uBitmap != null) {
             this.e.setImageBitmap(uBitmap);
          }else {
             throw new IOException("cannot read picture: \'"+this.r+"\'!");
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          String str = "图片读取失败，请检查该图片是否有效";
          this.a(str, 1);
          this.a(-5, null, str, e0.getMessage());
          this.d();
       }
       this.f.setOnClickListener(this.t);
       this.g.setOnClickListener(this.u);
       this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ImageActivity$1(this));
       return;
    }
    public final void b(String p0,int p1){
       Toast toast = Toast.makeText(this, p0, 1);
       LinearLayout view = toast.getView();
       view.getChildAt(0).setPadding(8, 0, 0, 0);
       ImageView imageView = new ImageView(this);
       imageView.setLayoutParams(new LinearLayout$LayoutParams(a.a(this, 16.00f), a.a(this, 16.00f)));
       if (!p1) {
          imageView.setImageDrawable(this.b("com.tencent.plus.ic_success.png"));
       }else {
          imageView.setImageDrawable(this.b("com.tencent.plus.ic_error.png"));
       }
       view.addView(imageView, 0);
       view.setOrientation(0);
       view.setGravity(17);
       toast.setView(view);
       toast.setGravity(17, 0, 0);
       toast.show();
       return;
    }
    public final void c(){
       Matrix imageMatrix = this.e.getImageMatrix();
       float[] uofloatArray = new float[9];
       imageMatrix.getValues(uofloatArray);
       int i = uofloatArray[5];
       int i1 = uofloatArray[0];
       float f = 640.00f / (float)this.q.width();
       ImageActivity tq = this.q;
       int i2 = (int)(((float)tq.left - uofloatArray[2]) / i1);
       int i3 = (i2 < 0)? 0: i2;
       int i4 = (int)(((float)tq.top - i) / i1);
       int i5 = (i4 < 0)? 0: i4;
       Matrix matrix = new Matrix();
       matrix.set(imageMatrix);
       matrix.postScale(f, f);
       i4 = (int)(650.00f / i1);
       int i6 = Math.min((this.s.getWidth() - i3), i4);
       int i7 = Math.min((this.s.getHeight() - i5), i4);
       try{
          Bitmap uBitmap = Bitmap.createBitmap(this.s, i3, i5, i6, i7, matrix, true);
          uBitmap.recycle();
          this.a(Bitmap.createBitmap(uBitmap, 0, 0, 640, 640));
       }catch(java.lang.IllegalArgumentException e0){
          e0.printStackTrace();
          this.a("图片读取失败，请检查该图片是否有效", 1);
          this.a(-5, null, "图片读取失败，请检查该图片是否有效", e0.getMessage());
          this.d();
       }
       return;
    }
    public final void c(String p0){
       p0 = this.d(p0);
       if (!("").equals(p0)) {
          this.i.setText(p0);
          this.i.setVisibility(0);
       }
       return;
    }
    public final String d(String p0){
       return ((((p0.replaceAll("&gt;", ">")).replaceAll("&lt;", "<")).replaceAll("&quot;", "\"")).replaceAll("&#39;", "\'")).replaceAll("&amp;", "&");
    }
    public final void d(){
       this.finish();
       ImageActivity tn = this.n;
       if (tn != null) {
          this.overridePendingTransition(0, tn);
       }
       return;
    }
    public final void e(){
       this.k = this.k + 1;
       new UserInfo(this, this.b).getUserInfo(this.w);
    }
    public void onBackPressed(){
       this.setResult(0);
       this.d();
    }
    public void onCreate(Bundle p0){
       this.requestWindowFeature(1);
       super.onCreate(p0);
       this.setRequestedOrientation(1);
       this.setContentView(this.a());
       this.d = new Handler();
       p0 = this.getIntent().getBundleExtra("key_params");
       this.r = p0.getString("picture");
       this.c = p0.getString("return_activity");
       String str = p0.getString("appid");
       String str1 = p0.getString("access_token");
       long longx = p0.getLong("expires_in");
       String str2 = p0.getString("openid");
       this.n = p0.getInt("exitAnim");
       QQToken qQToken = new QQToken(str);
       this.b = qQToken;
       qQToken.setAccessToken(str1, ((longx - System.currentTimeMillis()) / 1000)+"");
       this.b.setOpenId(str2);
       this.b();
       this.e();
       this.m = System.currentTimeMillis();
       this.a("10653", 0);
    }
    public void onDestroy(){
       super.onDestroy();
       this.e.setImageBitmap(null);
       ImageActivity ts = this.s;
       if (ts != null && !ts.isRecycled()) {
          this.s.recycle();
       }
       return;
    }
}
