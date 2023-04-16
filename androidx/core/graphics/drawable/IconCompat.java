package androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.res.ColorStateList;
import z1.h;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.lang.IllegalArgumentException;
import android.content.Context;
import java.lang.Integer;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import android.content.ContentResolver;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources$Theme;
import o1.f;
import java.nio.charset.Charset;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import android.content.Intent;
import android.content.Intent$ShortcutIconResource;
import androidx.core.content.ContextCompat;
import android.app.ActivityManager;
import java.lang.Throwable;

public class IconCompat extends CustomVersionedParcelable	// class@000715
{
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public String i;
    public String j;
    public static final PorterDuff$Mode k;

    static {
       IconCompat.k = PorterDuff$Mode.SRC_IN;
    }
    public void IconCompat(){
       super();
       this.a = -1;
       this.c = null;
       this.d = null;
       this.e = 0;
       this.f = 0;
       this.g = null;
       this.h = IconCompat.k;
       this.i = null;
    }
    public void IconCompat(int p0){
       super();
       this.a = -1;
       this.c = null;
       this.d = null;
       this.e = 0;
       this.f = 0;
       this.g = null;
       this.h = IconCompat.k;
       this.i = null;
       this.a = p0;
    }
    public static Uri B(Icon p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getUri();
       }
       Uri uri = null;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p0.getClass().getMethod("getUri", uClassArray).invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public static String K(int p0){
       switch (p0){
           case 1:
             return "BITMAP";
           case 2:
             return "RESOURCE";
           case 3:
             return "DATA";
           case 4:
             return "URI";
           case 5:
             return "BITMAP_MASKABLE";
           case 6:
             return "URI_MASKABLE";
           default:
             return "UNKNOWN";
       }
    }
    public static IconCompat h(Bundle p0){
       int intx = p0.getInt("type");
       IconCompat iconCompat = new IconCompat(intx);
       iconCompat.e = p0.getInt("int1");
       iconCompat.f = p0.getInt("int2");
       iconCompat.j = p0.getString("string1");
       String str = "tint_list";
       if (p0.containsKey(str)) {
          iconCompat.g = p0.getParcelable(str);
       }
       str = "tint_mode";
       if (p0.containsKey(str)) {
          iconCompat.h = PorterDuff$Mode.valueOf(p0.getString(str));
       }
       switch (intx){
           case 0xffffffff:
           case 1:
           case 5:
             iconCompat.b = p0.getParcelable("obj");
             break;
           case 2:
           case 4:
           case 6:
             iconCompat.b = p0.getString("obj");
             break;
           case 3:
             iconCompat.b = p0.getByteArray("obj");
             break;
           default:
          label_004a :
             return null;
       }
       return iconCompat;
    }
    public static IconCompat i(Icon p0){
       h.g(p0);
       int i = IconCompat.z(p0);
       if (i == 2) {
          return IconCompat.r(null, IconCompat.w(p0), IconCompat.u(p0));
       }
       if (i == 4) {
          return IconCompat.o(IconCompat.B(p0));
       }
       if (i == 6) {
          return IconCompat.l(IconCompat.B(p0));
       }
       IconCompat iconCompat = new IconCompat(-1);
       iconCompat.b = p0;
       return iconCompat;
    }
    public static Bitmap j(Bitmap p0,boolean p1){
       int i = (int)((float)Math.min(p0.getWidth(), p0.getHeight()) * 0x3f2aaaab);
       Bitmap uBitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       Paint paint = new Paint(3);
       float f = (float)i;
       float f1 = 0x3f000000 * f;
       float f2 = 0x3f6aaaab * f1;
       if (p1) {
          float f3 = 0.01f * f;
          paint.setColor(0);
          paint.setShadowLayer(f3, 0, (f * 0.02f), 0x3d000000);
          uCanvas.drawCircle(f1, f1, f2, paint);
          paint.setShadowLayer(f3, 0, 0, 0x1e000000);
          uCanvas.drawCircle(f1, f1, f2, paint);
          paint.clearShadowLayer();
       }
       paint.setColor(0xff000000);
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       Matrix matrix = new Matrix();
       matrix.setTranslate((float)((- (p0.getWidth() - i)) / 2), (float)((- (p0.getHeight() - i)) / 2));
       uBitmapShade.setLocalMatrix(matrix);
       paint.setShader(uBitmapShade);
       uCanvas.drawCircle(f1, f1, f2, paint);
       uCanvas.setBitmap(null);
       return uBitmap;
    }
    public static IconCompat k(Bitmap p0){
       IconCompat iconCompat = new IconCompat(5);
       iconCompat.b = p0;
       return iconCompat;
    }
    public static IconCompat l(Uri p0){
       if (p0 != null) {
          return IconCompat.m(p0.toString());
       }
       throw new IllegalArgumentException("Uri must not be null.");
    }
    public static IconCompat m(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Uri must not be null.");
       }
       IconCompat iconCompat = new IconCompat(6);
       iconCompat.b = p0;
       return iconCompat;
    }
    public static IconCompat n(Bitmap p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Bitmap must not be null.");
       }
       IconCompat iconCompat = new IconCompat(1);
       iconCompat.b = p0;
       return iconCompat;
    }
    public static IconCompat o(Uri p0){
       if (p0 != null) {
          return IconCompat.p(p0.toString());
       }
       throw new IllegalArgumentException("Uri must not be null.");
    }
    public static IconCompat p(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Uri must not be null.");
       }
       IconCompat iconCompat = new IconCompat(4);
       iconCompat.b = p0;
       return iconCompat;
    }
    public static IconCompat q(Context p0,int p1){
       if (p0 != null) {
          return IconCompat.r(p0.getResources(), p0.getPackageName(), p1);
       }
       throw new IllegalArgumentException("Context must not be null.");
    }
    public static IconCompat r(Resources p0,String p1,int p2){
       if (p1 == null) {
          throw new IllegalArgumentException("Package must not be null.");
       }
       if (!p2) {
          throw new IllegalArgumentException("Drawable resource ID must not be 0");
       }
       IconCompat iconCompat = new IconCompat(2);
       iconCompat.e = p2;
       iconCompat.b = (p0 != null)? p0.getResourceName(p2): p1;
       iconCompat.j = p1;
       return iconCompat;
    }
    public static int u(Icon p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getResId();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return p0.getClass().getMethod("getResId", uClassArray).invoke(p0, objArray).intValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public static String w(Icon p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getResPackage();
       }
       String str = null;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p0.getClass().getMethod("getResPackage", uClassArray).invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public static Resources x(Context p0,String p1){
       int i1;
       if (("android").equals(p1)) {
          return Resources.getSystem();
       }
       PackageManager packageManag = p0.getPackageManager();
       int i = 8192;
       try{
          i1 = 0;
          ApplicationInfo applicationI = packageManag.getApplicationInfo(p1, i);
          if (applicationI != null) {
             return packageManag.getResourcesForApplication(applicationI);
          }
          return i1;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          Object[] objArray = new Object[]{p1};
          String.format("Unable to find pkg=%s for icon", objArray);
          return i1;
       }
    }
    public static int z(Icon p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getType();
       }
       int i = -1;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p0.getClass().getMethod("getType", uClassArray).invoke(p0, objArray).intValue();
       }catch(java.lang.IllegalAccessException e0){
          e0+p0;
          return i;
       }catch(java.lang.reflect.InvocationTargetException e0){
          e0+p0;
          return i;
       }catch(java.lang.NoSuchMethodException e0){
          e0+p0;
          return i;
       }
    }
    public Uri A(){
       IconCompat ta = this.a;
       if (ta == -1 && Build$VERSION.SDK_INT >= 23) {
          return IconCompat.B(this.b);
       }
       if (ta == 4 || ta == 6) {
          return Uri.parse(this.b);
       }
       throw new IllegalStateException("called getUri\(\) on "+this);
    }
    public InputStream C(Context p0){
       try{
          Uri uri = this.A();
          String scheme = uri.getScheme();
          if (("content").equals(scheme) || ("file").equals(scheme)) {
             return p0.getContentResolver().openInputStream(uri);
          }
          return new FileInputStream(new File(this.b));
       }catch(java.io.FileNotFoundException e0){
          StringBuilder str = "Unable to load image from path: "+e0;
       }
       return null;
    }
    public Drawable D(Context p0){
       this.g(p0);
       if (Build$VERSION.SDK_INT >= 23) {
          return this.J(p0).loadDrawable(p0);
       }
       Drawable uDrawable = this.E(p0);
       if (uDrawable != null && (this.g != null || this.h != IconCompat.k)) {
          uDrawable.mutate();
          a.o(uDrawable, this.g);
          a.p(uDrawable, this.h);
       }
       return uDrawable;
    }
    public final Drawable E(Context p0){
       InputStream inputStream;
       IconCompat iconCompat = null;
       IconCompat iconCompat1 = null;
       switch (this.a){
           case 1:
             return new BitmapDrawable(p0.getResources(), this.b);
           case 2:
             String str = this.v();
             if (TextUtils.isEmpty(str)) {
                str = p0.getPackageName();
             }
             Resources resources = IconCompat.x(p0, str);
             try{
                return f.c(resources, this.e, p0.getTheme());
             }catch(java.lang.RuntimeException e0){
                Object[] objArray = new Object[2];
                objArray[iconCompat1] = Integer.valueOf(this.e);
                objArray[1] = this.b;
                String.format("Unable to load resource 0x%08x from pkg=%s", objArray);
             }
             break;
           case 3:
             return new BitmapDrawable(p0.getResources(), BitmapFactory.decodeByteArray(this.b, this.e, this.f));
           case 4:
             inputStream = this.C(p0);
             if (inputStream != null) {
                return new BitmapDrawable(p0.getResources(), BitmapFactory.decodeStream(inputStream));
             }
             break;
           case 5:
             return new BitmapDrawable(p0.getResources(), IconCompat.j(this.b, iconCompat1));
           case 6:
             inputStream = this.C(p0);
             if (inputStream != null) {
                if (Build$VERSION.SDK_INT >= 26) {
                   return new AdaptiveIconDrawable(iconCompat, new BitmapDrawable(p0.getResources(), BitmapFactory.decodeStream(inputStream)));
                }
                return new BitmapDrawable(p0.getResources(), IconCompat.j(BitmapFactory.decodeStream(inputStream), iconCompat1));
             }
             break;
           default:
       }
    }
    public void F(){
       IconCompat td;
       this.h = PorterDuff$Mode.valueOf(this.i);
       String str = null;
       switch (this.a){
           case 0xffffffff:
             td = this.d;
             if (td == null) {
                throw new IllegalArgumentException("Invalid icon");
             }
             this.b = td;
             break;
           case 1:
           case 5:
             td = this.d;
             if (td != null) {
                this.b = td;
             }else {
                td = this.c;
                this.b = td;
                this.a = 3;
                this.e = str;
                this.f = td.length;
             }
             break;
           case 2:
           case 4:
           case 6:
             String str1 = new String(this.c, Charset.forName("UTF-16"));
             this.b = str1;
             if (this.a == 2 && this.j == null) {
                this.j = str1.split(":", -1)[str];
             }
             break;
           case 3:
             this.b = this.c;
             break;
           default:
       }
    label_005d :
       return;
    }
    public void G(boolean p0){
       this.i = this.h.name();
       String str = "UTF-16";
       switch (this.a){
           case 0xffffffff:
             if (p0) {
                throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
             }
             this.d = this.b;
             break;
           case 1:
           case 5:
             if (p0) {
                ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                this.b.compress(Bitmap$CompressFormat.PNG, 90, uByteArrayOu);
                this.c = uByteArrayOu.toByteArray();
             }else {
                this.d = this.b;
             }
             break;
           case 2:
             this.c = (this.b).getBytes(Charset.forName(str));
             break;
           case 3:
             this.c = this.b;
             break;
           case 4:
           case 6:
             this.c = (this.b.toString()).getBytes(Charset.forName(str));
             break;
           default:
       }
       return;
    }
    public Bundle H(){
       Bundle uBundle = new Bundle();
       String str = "obj";
       switch (this.a){
           case 0xffffffff:
             uBundle.putParcelable(str, this.b);
          label_0033 :
             uBundle.putInt("type", this.a);
             uBundle.putInt("int1", this.e);
             uBundle.putInt("int2", this.f);
             uBundle.putString("string1", this.j);
             IconCompat tg = this.g;
             if (tg != null) {
                uBundle.putParcelable("tint_list", tg);
             }
             tg = this.h;
             if (tg != IconCompat.k) {
                uBundle.putString("tint_mode", tg.name());
             }
             break;
           case 1:
           case 5:
             uBundle.putParcelable(str, this.b);
             goto label_0033 ;
             break;
           case 2:
           case 4:
           case 6:
             uBundle.putString(str, this.b);
             goto label_0033 ;
             break;
           case 3:
             uBundle.putByteArray(str, this.b);
             goto label_0033 ;
             break;
           default:
          label_000c :
             throw new IllegalArgumentException("Invalid icon");
       }
       return uBundle;
    }
    public Icon I(){
       return this.J(null);
    }
    public Icon J(Context p0){
       Icon icon;
       PorterDuff$Mode mode = null;
       switch (this.a){
           case 0xffffffff:
           case 1:
             icon = Icon.createWithBitmap(this.b);
          label_00bb :
             IconCompat tg = this.g;
             if (tg != null) {
                icon.setTintList(tg);
             }
             tg = this.h;
             if (tg != IconCompat.k) {
                icon.setTintMode(tg);
             }
             return icon;
             break;
           case 2:
             icon = Icon.createWithResource(this.v(), this.e);
             goto label_00bb ;
             break;
           case 3:
             icon = Icon.createWithData(this.b, this.e, this.f);
             goto label_00bb ;
             break;
           case 4:
             icon = Icon.createWithContentUri(this.b);
             goto label_00bb ;
             break;
           case 5:
             if (Build$VERSION.SDK_INT >= 26) {
                icon = Icon.createWithAdaptiveBitmap(this.b);
                goto label_00bb ;
             }else {
                icon = Icon.createWithBitmap(IconCompat.j(this.b, mode));
                goto label_00bb ;
             }
             break;
           case 6:
             int sDK_INT = Build$VERSION.SDK_INT;
             if (sDK_INT >= 30) {
                icon = Icon.createWithAdaptiveBitmapContentUri(this.A());
                goto label_00bb ;
             }else if(p0 != null){
                InputStream inputStream = this.C(p0);
                if (inputStream == null) {
                   throw new IllegalStateException("Cannot load adaptive icon from uri: "+this.A());
                }
                if (sDK_INT >= 26) {
                   icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStream));
                   goto label_00bb ;
                }else {
                   icon = Icon.createWithBitmap(IconCompat.j(BitmapFactory.decodeStream(inputStream), mode));
                   goto label_00bb ;
                }
             }else {
                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: "+this.A());
             }
             break;
           default:
          label_0008 :
             throw new IllegalArgumentException("Unknown type");
       }
       return this.b;
    }
    public void f(Intent p0,Drawable p1,Context p2){
       Bitmap uBitmap;
       this.g(p2);
       IconCompat ta = this.a;
       int b = true;
       if (ta != b) {
          if (ta != 2) {
             if (ta == 5) {
                uBitmap = IconCompat.j(this.b, b);
             }else {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
             }
          }else {
             try{
                b = 0;
                p2 = p2.createPackageContext(this.v(), b);
                if (p1 == null) {
                   p0.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent$ShortcutIconResource.fromContext(p2, this.e));
                   return;
                }else {
                   Drawable drawable = ContextCompat.getDrawable(p2, this.e);
                   uBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0)? Bitmap.createBitmap(p2.getSystemService("activity").getLauncherLargeIconSize(), p2.getSystemService("activity").getLauncherLargeIconSize(), Bitmap$Config.ARGB_8888): Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                   drawable.setBounds(b, b, uBitmap.getWidth(), uBitmap.getHeight());
                   drawable.draw(new Canvas(uBitmap));
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e5){
                throw new IllegalArgumentException("Can\'t find package "+this.b, e5);
             }
          }
       }else {
          uBitmap = this.b;
          if (p1 != null) {
             uBitmap = uBitmap.copy(uBitmap.getConfig(), b);
          }
       }
       if (p1 != null) {
          int width = uBitmap.getWidth();
          b = uBitmap.getHeight();
          p1.setBounds((width / 2), (b / 2), width, b);
          p1.draw(new Canvas(uBitmap));
       }
       p0.putExtra("android.intent.extra.shortcut.ICON", uBitmap);
       return;
    }
    public void g(Context p0){
       if (this.a == 2) {
          IconCompat tb = this.b;
          if (tb != null) {
             String str = ":";
             if (!tb.contains(str)) {
                return;
             }else {
                object oobject = tb.split(str, -1)[1];
                object oobject1 = oobject.split("/", -1)[0];
                oobject = oobject.split("/", -1)[1];
                object oobject2 = tb.split(str, -1)[0];
                if (("0_resource_name_obfuscated").equals(oobject)) {
                   return;
                }else {
                   int identifier = IconCompat.x(p0, this.v()).getIdentifier(oobject, oobject1, oobject2);
                   if (this.e != identifier) {
                      this.e = identifier;
                   }
                }
             }
          }
       }
       return;
    }
    public Bitmap s(){
       IconCompat ta = this.a;
       if (ta == -1 && Build$VERSION.SDK_INT >= 23) {
          ta = this.b;
          if (ta instanceof Bitmap) {
             return ta;
          }
          return null;
       }else {
          boolean b = true;
          if (ta == b) {
             return this.b;
          }
          if (ta == 5) {
             return IconCompat.j(this.b, b);
          }
          throw new IllegalStateException("called getBitmap\(\) on "+this);
       }
    }
    public int t(){
       IconCompat ta = this.a;
       if (ta == -1 && Build$VERSION.SDK_INT >= 23) {
          return IconCompat.u(this.b);
       }
       if (ta == 2) {
          return this.e;
       }
       throw new IllegalStateException("called getResId\(\) on "+this);
    }
    public String toString(){
       if (this.a == -1) {
          return String.valueOf(this.b);
       }
       StringBuilder str = "Icon\(typ="+IconCompat.K(this.a);
       switch (this.a){
           case 1:
           case 5:
             str = str+" size="+this.b.getWidth()+"x"+this.b.getHeight();
             break;
           case 2:
             Object[] objArray = new Object[]{Integer.valueOf(this.t())};
             str = str+" pkg="+this.j+" id="+String.format("0x%08x", objArray);
             break;
           case 3:
             str = str+" len="+this.e;
             if (this.f != null) {
                str = str+" off="+this.f;
             }
             break;
           case 4:
           case 6:
             str = str+" uri="+this.b;
             break;
           default:
       }
       if (this.g != null) {
          str = str+" tint="+this.g;
       }
       if (this.h != IconCompat.k) {
          str = str+" mode="+this.h;
       }
       return str+"\)";
    }
    public String v(){
       IconCompat ta = this.a;
       int i = -1;
       if (ta == i && Build$VERSION.SDK_INT >= 23) {
          return IconCompat.w(this.b);
       }
       if (ta != 2) {
          throw new IllegalStateException("called getResPackage\(\) on "+this);
       }
       if (TextUtils.isEmpty(this.j)) {
          return (this.b).split(":", i)[0];
       }
       return this.j;
    }
    public int y(){
       IconCompat ta = this.a;
       if (ta == -1 && Build$VERSION.SDK_INT >= 23) {
          ta = IconCompat.z(this.b);
       }
       return ta;
    }
}
