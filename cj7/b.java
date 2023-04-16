package cj7.b;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import android.content.res.Resources$Theme;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.graphics.Movie;
import java.lang.CharSequence;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;

public class b extends Resources	// class@000565
{
    public Resources a;

    public void b(Resources p0){
       super(p0.getAssets(), c.c(p0), p0.getConfiguration());
       this.a = p0;
    }
    public XmlResourceParser getAnimation(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getAnimation(p0);
    }
    public boolean getBoolean(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.getBoolean(p0);
    }
    public int getColor(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.getColor(p0);
    }
    public int getColor(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.getColor(p0, p1);
    }
    public ColorStateList getColorStateList(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getColorStateList(p0);
    }
    public ColorStateList getColorStateList(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getColorStateList(p0, p1);
    }
    public Configuration getConfiguration(){
       Object obj = PatchProxy.apply(null, this, b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getConfiguration();
    }
    public float getDimension(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.a.getDimension(p0);
    }
    public int getDimensionPixelOffset(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.getDimensionPixelOffset(p0);
    }
    public int getDimensionPixelSize(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.getDimensionPixelSize(p0);
    }
    public DisplayMetrics getDisplayMetrics(){
       Object obj = PatchProxy.apply(null, this, b.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c(this.a);
    }
    public Drawable getDrawable(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getDrawable(p0);
    }
    public Drawable getDrawable(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getDrawable(p0, p1);
    }
    public Drawable getDrawableForDensity(int p0,int p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, b.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getDrawableForDensity(p0, p1);
    }
    public Drawable getDrawableForDensity(int p0,int p1,Resources$Theme p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getDrawableForDensity(p0, p1, p2);
    }
    public Typeface getFont(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getFont(p0);
    }
    public float getFraction(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.a.getFraction(p0, p1, p2);
    }
    public int getIdentifier(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getIdentifier(p0, p1, p2);
    }
    public int[] getIntArray(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getIntArray(p0);
    }
    public int getInteger(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.getInteger(p0);
    }
    public XmlResourceParser getLayout(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getLayout(p0);
    }
    public Movie getMovie(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getMovie(p0);
    }
    public String getQuantityString(int p0,int p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, b.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getQuantityString(p0, p1);
    }
    public String getQuantityString(int p0,int p1,Object[] p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getQuantityString(p0, p1, p2);
    }
    public CharSequence getQuantityText(int p0,int p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getQuantityText(p0, p1);
    }
    public String getResourceEntryName(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getResourceEntryName(p0);
    }
    public String getResourceName(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getResourceName(p0);
    }
    public String getResourcePackageName(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getResourcePackageName(p0);
    }
    public String getResourceTypeName(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getResourceTypeName(p0);
    }
    public String getString(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getString(p0);
    }
    public String getString(int p0,Object[] p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getString(p0, p1);
    }
    public String[] getStringArray(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getStringArray(p0);
    }
    public CharSequence getText(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getText(p0);
    }
    public CharSequence getText(int p0,CharSequence p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getText(p0, p1);
    }
    public CharSequence[] getTextArray(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getTextArray(p0);
    }
    public void getValue(int p0,TypedValue p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, b.class, "34")) {
          return;
       }
       this.a.getValue(p0, p1, p2);
       return;
    }
    public void getValue(String p0,TypedValue p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "36")) {
          return;
       }
       this.a.getValue(p0, p1, p2);
       return;
    }
    public void getValueForDensity(int p0,int p1,TypedValue p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, b.class, "35")) {
          return;
       }
       this.a.getValueForDensity(p0, p1, p2, p3);
       return;
    }
    public XmlResourceParser getXml(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.getXml(p0);
    }
    public TypedArray obtainAttributes(AttributeSet p0,int[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.obtainAttributes(p0, p1);
    }
    public TypedArray obtainTypedArray(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.obtainTypedArray(p0);
    }
    public InputStream openRawResource(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.openRawResource(p0);
    }
    public InputStream openRawResource(int p0,TypedValue p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, b.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.openRawResource(p0, p1);
    }
    public AssetFileDescriptor openRawResourceFd(int p0){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, b.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.openRawResourceFd(p0);
    }
    public void parseBundleExtra(String p0,AttributeSet p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "46")) {
          return;
       }
       this.a.parseBundleExtra(p0, p1, p2);
       return;
    }
    public void parseBundleExtras(XmlResourceParser p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "45")) {
          return;
       }
       this.a.parseBundleExtras(p0, p1);
       return;
    }
    public void updateConfiguration(Configuration p0,DisplayMetrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "47")) {
          return;
       }
       super.updateConfiguration(p0, p1);
       b ta = this.a;
       if (ta != null) {
          ta.updateConfiguration(p0, p1);
       }
       return;
    }
}
