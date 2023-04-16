package p1.j;
import p1.k;
import android.content.Context;
import o1.c$b;
import android.content.res.Resources;
import android.graphics.Typeface;
import o1.c$c;
import android.graphics.fonts.Font$Builder;
import java.lang.String;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.FontStyle;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import x1.f$b;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.lang.Throwable;
import java.io.InputStream;
import java.lang.RuntimeException;

public class j extends k	// class@0028a1
{

    public void j(){
       super();
    }
    public Typeface b(Context p0,c$b p1,Resources p2,int p3){
       Typeface typeface = null;
       try{
          c$c[] uocArray = p1.a();
          int len = uocArray.length;
          int i = 0;
          FontFamily$Builder uBuilder = typeface;
          int i1 = 0;
          int i2 = 1;
          while (i1 < len) {
             object oobject = uocArray[i1];
             try{
                Font$Builder uBuilder1 = new Font$Builder(p2, oobject.b()).setWeight(oobject.e());
                if (!oobject.f()) {
                   i2 = 0;
                }
                Font uFont = uBuilder1.setSlant(i2).setTtcIndex(oobject.c()).setFontVariationSettings(oobject.d()).build();
                if (uBuilder == null) {
                   uBuilder = new FontFamily$Builder(uFont);
                }else {
                   uBuilder.addFont(uFont);
                }
                i1 = i1 + 1;
             }catch(java.io.IOException e0){
             }
          }
          if (uBuilder == null) {
             return typeface;
          }
          int i3 = (p3 & 0x01)? 700: 400;
          if (p3 & 0x02) {
             i = 1;
          }
          typeface = new Typeface$CustomFallbackBuilder(uBuilder.build()).setStyle(new FontStyle(i3, i)).build();
          return typeface;
       }catch(java.lang.Exception e0){
       }
    }
    public Typeface c(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       ContentResolver contentResol = p0.getContentResolver();
       try{
          int i = 0;
          int len = p2.length;
          int i1 = 0;
          FontFamily$Builder uBuilder = i;
          int i2 = 0;
          int i3 = 1;
          while (i2 < len) {
             object oobject = p2[i2];
             try{
                ParcelFileDescriptor parcelFileDe = contentResol.openFileDescriptor(oobject.d(), "r", p1);
                if (parcelFileDe == null) {
                   if (parcelFileDe == null) {
                   label_005c :
                      i2 = i2 + 1;
                   }
                }else {
                   Font$Builder uBuilder1 = new Font$Builder(parcelFileDe).setWeight(oobject.e());
                   if (!oobject.f()) {
                      i3 = 0;
                   }
                   Font uFont = uBuilder1.setSlant(i3).setTtcIndex(oobject.c()).build();
                   if (uBuilder == null) {
                      uBuilder = new FontFamily$Builder(uFont);
                   }else {
                      uBuilder.addFont(uFont);
                   }
                }
                parcelFileDe.close();
                goto label_005c ;
             }catch(java.io.IOException e0){
             }
          }
          if (uBuilder == null) {
             return i;
          }
          int i4 = (p3 & 0x01)? 700: 400;
          if (p3 & 0x02) {
             i1 = 1;
          }
          return new Typeface$CustomFallbackBuilder(uBuilder.build()).setStyle(new FontStyle(i4, i1)).build();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public Typeface d(Context p0,InputStream p1){
       throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    public Typeface e(Context p0,Resources p1,int p2,String p3,int p4){
       try{
          Font uFont = new Font$Builder(p1, p2).build();
          return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(uFont).build()).setStyle(uFont.getStyle()).build();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public f$b h(f$b[] p0,int p1){
       throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
