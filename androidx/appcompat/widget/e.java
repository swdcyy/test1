package androidx.appcompat.widget.e;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import java.lang.String;
import android.graphics.Movie;
import java.lang.Object;
import java.lang.CharSequence;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;

public class e extends Resources	// class@000646
{
    public final Resources a;

    public void e(Resources p0){
       super(p0.getAssets(), c.c(p0), p0.getConfiguration());
       this.a = p0;
    }
    public XmlResourceParser getAnimation(int p0){
       return this.a.getAnimation(p0);
    }
    public boolean getBoolean(int p0){
       return this.a.getBoolean(p0);
    }
    public int getColor(int p0){
       return this.a.getColor(p0);
    }
    public ColorStateList getColorStateList(int p0){
       return this.a.getColorStateList(p0);
    }
    public Configuration getConfiguration(){
       return this.a.getConfiguration();
    }
    public float getDimension(int p0){
       return this.a.getDimension(p0);
    }
    public int getDimensionPixelOffset(int p0){
       return c.a(this.a, p0);
    }
    public int getDimensionPixelSize(int p0){
       return c.b(this.a, p0);
    }
    public DisplayMetrics getDisplayMetrics(){
       return c.c(this.a);
    }
    public Drawable getDrawable(int p0){
       return this.a.getDrawable(p0);
    }
    public Drawable getDrawable(int p0,Resources$Theme p1){
       return this.a.getDrawable(p0, p1);
    }
    public Drawable getDrawableForDensity(int p0,int p1){
       return this.a.getDrawableForDensity(p0, p1);
    }
    public Drawable getDrawableForDensity(int p0,int p1,Resources$Theme p2){
       return this.a.getDrawableForDensity(p0, p1, p2);
    }
    public float getFraction(int p0,int p1,int p2){
       return this.a.getFraction(p0, p1, p2);
    }
    public int getIdentifier(String p0,String p1,String p2){
       return this.a.getIdentifier(p0, p1, p2);
    }
    public int[] getIntArray(int p0){
       return this.a.getIntArray(p0);
    }
    public int getInteger(int p0){
       return this.a.getInteger(p0);
    }
    public XmlResourceParser getLayout(int p0){
       return this.a.getLayout(p0);
    }
    public Movie getMovie(int p0){
       return this.a.getMovie(p0);
    }
    public String getQuantityString(int p0,int p1){
       return this.a.getQuantityString(p0, p1);
    }
    public String getQuantityString(int p0,int p1,Object[] p2){
       return this.a.getQuantityString(p0, p1, p2);
    }
    public CharSequence getQuantityText(int p0,int p1){
       return this.a.getQuantityText(p0, p1);
    }
    public String getResourceEntryName(int p0){
       return this.a.getResourceEntryName(p0);
    }
    public String getResourceName(int p0){
       return this.a.getResourceName(p0);
    }
    public String getResourcePackageName(int p0){
       return this.a.getResourcePackageName(p0);
    }
    public String getResourceTypeName(int p0){
       return this.a.getResourceTypeName(p0);
    }
    public String getString(int p0){
       return this.a.getString(p0);
    }
    public String getString(int p0,Object[] p1){
       return this.a.getString(p0, p1);
    }
    public String[] getStringArray(int p0){
       return this.a.getStringArray(p0);
    }
    public CharSequence getText(int p0){
       return this.a.getText(p0);
    }
    public CharSequence getText(int p0,CharSequence p1){
       return this.a.getText(p0, p1);
    }
    public CharSequence[] getTextArray(int p0){
       return this.a.getTextArray(p0);
    }
    public void getValue(int p0,TypedValue p1,boolean p2){
       this.a.getValue(p0, p1, p2);
    }
    public void getValue(String p0,TypedValue p1,boolean p2){
       this.a.getValue(p0, p1, p2);
    }
    public void getValueForDensity(int p0,int p1,TypedValue p2,boolean p3){
       this.a.getValueForDensity(p0, p1, p2, p3);
    }
    public XmlResourceParser getXml(int p0){
       return this.a.getXml(p0);
    }
    public TypedArray obtainAttributes(AttributeSet p0,int[] p1){
       return this.a.obtainAttributes(p0, p1);
    }
    public TypedArray obtainTypedArray(int p0){
       return this.a.obtainTypedArray(p0);
    }
    public InputStream openRawResource(int p0){
       return this.a.openRawResource(p0);
    }
    public InputStream openRawResource(int p0,TypedValue p1){
       return this.a.openRawResource(p0, p1);
    }
    public AssetFileDescriptor openRawResourceFd(int p0){
       return this.a.openRawResourceFd(p0);
    }
    public void parseBundleExtra(String p0,AttributeSet p1,Bundle p2){
       this.a.parseBundleExtra(p0, p1, p2);
    }
    public void parseBundleExtras(XmlResourceParser p0,Bundle p1){
       this.a.parseBundleExtras(p0, p1);
    }
    public void updateConfiguration(Configuration p0,DisplayMetrics p1){
       super.updateConfiguration(p0, p1);
       e ta = this.a;
       if (ta != null) {
          ta.updateConfiguration(p0, p1);
       }
       return;
    }
}
