package cj7.a;
import cj7.b;
import android.content.res.Resources;
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
import java.io.InputStream;
import android.util.TypedValue;
import android.content.res.AssetFileDescriptor;

public class a extends b	// class@000564
{
    public Resources b;

    public void a(Resources p0,Resources p1){
       super(p1);
       this.b = p0;
    }
    public XmlResourceParser getAnimation(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getAnimation(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getAnimation(p0);
       }
    }
    public boolean getBoolean(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          return super.getBoolean(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getBoolean(p0);
       }
    }
    public int getColor(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.getColor(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getColor(p0);
       }
    }
    public int getColor(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.getColor(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getColor(p0, p1);
       }
    }
    public ColorStateList getColorStateList(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getColorStateList(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getColorStateList(p0);
       }
    }
    public ColorStateList getColorStateList(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getColorStateList(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getColorStateList(p0, p1);
       }
    }
    public float getDimension(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       try{
          return super.getDimension(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDimension(p0);
       }
    }
    public int getDimensionPixelOffset(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.getDimensionPixelOffset(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDimensionPixelOffset(p0);
       }
    }
    public int getDimensionPixelSize(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.getDimensionPixelSize(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDimensionPixelSize(p0);
       }
    }
    public Drawable getDrawable(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getDrawable(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDrawable(p0);
       }
    }
    public Drawable getDrawable(int p0,Resources$Theme p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getDrawable(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDrawable(p0, p1);
       }
    }
    public Drawable getDrawableForDensity(int p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getDrawableForDensity(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getDrawableForDensity(p0, p1);
       }
    }
    public Drawable getDrawableForDensity(int p0,int p1,Resources$Theme p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getDrawableForDensity(p0, p1, p2);
       }catch(java.lang.Exception e0){
          return this.b.getDrawableForDensity(p0, p1, p2);
       }
    }
    public Typeface getFont(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getFont(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getFont(p0);
       }
    }
    public int getInteger(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.getInteger(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getInteger(p0);
       }
    }
    public XmlResourceParser getLayout(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getLayout(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getLayout(p0);
       }
    }
    public Movie getMovie(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getMovie(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getMovie(p0);
       }
    }
    public String getResourceName(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getResourceName(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getResourceName(p0);
       }
    }
    public String getString(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getString(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getString(p0);
       }
    }
    public String getString(int p0,Object[] p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getString(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getString(p0, p1);
       }
    }
    public CharSequence getText(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getText(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getText(p0);
       }
    }
    public CharSequence getText(int p0,CharSequence p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getText(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getText(p0, p1);
       }
    }
    public XmlResourceParser getXml(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getXml(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.getXml(p0);
       }
    }
    public InputStream openRawResource(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.openRawResource(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.openRawResource(p0);
       }
    }
    public InputStream openRawResource(int p0,TypedValue p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.openRawResource(p0, p1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.openRawResource(p0, p1);
       }
    }
    public AssetFileDescriptor openRawResourceFd(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.openRawResourceFd(p0);
       }catch(android.content.res.Resources$NotFoundException e0){
          return this.b.openRawResourceFd(p0);
       }
    }
}
