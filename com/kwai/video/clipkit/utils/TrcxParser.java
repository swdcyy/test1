package com.kwai.video.clipkit.utils.TrcxParser;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import com.kwai.video.clipkit.utils.Lyrics;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.video.clipkit.utils.Lyrics$Line;
import java.util.Iterator;
import com.kwai.video.clipkit.utils.Lyrics$Meta;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.Reader;
import java.io.IOException;
import java.util.regex.Matcher;
import com.kwai.video.clipkit.utils.Lyrics$Singer;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Number;
import java.lang.NumberFormatException;

public class TrcxParser	// class@001afc
{
    public static final Pattern PATTERN_TIME_A;
    public static final Pattern PATTERN_TIME_B;

    static {
       TrcxParser.PATTERN_TIME_A = Pattern.compile("\\d{2}:\\d{2}\\.\\d{2,3}");
       TrcxParser.PATTERN_TIME_B = Pattern.compile("\\d*,\\d*");
    }
    public void TrcxParser(){
       super();
    }
    public static void adjustLinesDuration(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TrcxParser.class, "8")) {
          return;
       }
       if (p0 != null) {
          Lyrics mLines = p0.mLines;
          if (mLines != null && !mLines.isEmpty()) {
             mLines = p0.mLines;
             int i = 0;
             int i1 = mLines.size() - 1;
             while (i < i1) {
                Lyrics$Line line = mLines.get(i);
                i = i + 1;
                Lyrics$Line line1 = mLines.get(i);
                Lyrics$Line mDuration = line.mDuration;
                if (mDuration > null) {
                   int i2 = line.mStart + mDuration;
                   if (i2 <= line1.mStart) {
                   }
                }
                int i3 = line1.mStart - line.mStart;
                i3 = i3 - 5;
                if (i3 >= 0) {
                   line.mDuration = i3;
                }
             }
             Lyrics$Line line2 = mLines.get((mLines.size() - 1));
             if (line2.mDuration <= null) {
                p0 = p0.mDuration;
                if (p0 > null) {
                   int i4 = p0 - line2.mStart;
                   if (i4 >= 0) {
                      line2.mDuration = i4;
                   }
                }
             }
          }
       }
       return;
    }
    public static void calculateLineDuration(Lyrics$Line p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TrcxParser.class, "7")) {
          return;
       }
       Lyrics$Line mMeta = p0.mMeta;
       if (mMeta != null && !mMeta.isEmpty()) {
          p0.mDuration = 0;
          Iterator iterator = p0.mMeta.iterator();
          while (iterator.hasNext()) {
             int i = p0.mDuration + iterator.next().mDuration;
             p0.mDuration = i;
          }
       }
       return;
    }
    public static Lyrics parse(String p0){
       BufferedReader obj = null;
       Lyrics obj1 = PatchProxy.applyOneRefs(p0, obj, TrcxParser.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       try{
          obj1 = new Lyrics();
          BufferedReader uBufferedRea = new BufferedReader(new StringReader(p0));
          try{
             p0 = uBufferedRea.readLine();
             while (p0 != null) {
                TrcxParser.parseLine(obj1, p0);
             }
             TrcxParser.adjustLinesDuration(obj1);
             uBufferedRea.close();
          }catch(java.io.IOException e4){
             obj = uBufferedRea;
          }
          e4.printStackTrace();
          if (obj) {
             obj.close();
          }
       }catch(java.io.IOException e4){
          goto label_0040 ;
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
       return obj1;
    }
    public static void parseLine(Lyrics p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, TrcxParser.class, "2")) {
          return;
       }
       int i = 1;
       if (p1.startsWith("\xfe\x02\x00")) {
          p1 = p1.substring(i);
       }
       String str = "\'";
       p1 = (p1.replaceAll("\x91\x00", str)).replaceAll("\x92\x00", str);
       if (!p1.startsWith("[")) {
          return;
       }else {
          int i1 = p1.indexOf(93);
          if (i1 == -1) {
             return;
          }else {
             String str1 = p1.substring(i, i1);
             int i2 = 3;
             if (str1.startsWith("ar:")) {
                p0.mArtist = str1.substring(i2);
             }else if(str1.startsWith("ti:")){
                p0.mTitle = str1.substring(i2);
             }else if(str1.startsWith("total:")){
                p0.mDuration = TrcxParser.safelyParseInt(str1.substring(6));
             }else if(str1.startsWith("offset:")){
                p0.mOffset = TrcxParser.safelyParseInt(str1.substring(7));
             }else if(str1.startsWith("by:")){
                p0.mProducer = str1.substring(i2);
             }
             boolean b = TrcxParser.PATTERN_TIME_A.matcher(str1).matches();
             boolean b1 = TrcxParser.PATTERN_TIME_B.matcher(str1).matches();
             if (b || b1) {
                Lyrics$Line line = new Lyrics$Line();
                if (b) {
                   TrcxParser.parseLineTimeByPattenA(str1, line, (- p0.mOffset));
                }else {
                   TrcxParser.parseLineTimeByPattenB(str1, line, (- p0.mOffset));
                }
                int i3 = i1 + 1;
                if (p1.length() <= i3) {
                   return;
                }else {
                   int i4 = i1 + 2;
                   if (p1.length() > i4) {
                      i1 = i1 + i2;
                      if ((p1.substring(i4, i1)).equals(":")) {
                         line.mSinger = Lyrics$Singer.parseSinger(p1.substring(i3, i4));
                         if (p1.length() > i1) {
                            if (b) {
                               TrcxParser.parseWordsByPattenA(line, p1.substring(i1));
                            }else {
                               TrcxParser.parseWordsByPattenB(line, p1.substring(i1));
                            }
                         }
                      }else if(b){
                         TrcxParser.parseWordsByPattenA(line, p1.substring(i3));
                      }else {
                         TrcxParser.parseWordsByPattenB(line, p1.substring(i3));
                      }
                   }else {
                      goto label_00ff ;
                   }
                   p0.mLines.add(line);
                }
             }
             return;
          }
       }
    }
    public static void parseLineTimeByPattenA(String p0,Lyrics$Line p1,int p2){
       if (PatchProxy.isSupport(TrcxParser.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, TrcxParser.class, "3")) {
          return;
       }
       int i = TrcxParser.safelyParseInt(p0.substring(0, 2));
       int i1 = TrcxParser.safelyParseInt(p0.substring(3, 5));
       p0 = p0.substring(6);
       int i2 = TrcxParser.safelyParseInt(p0);
       int i3 = (p0.length() == 2)? 10: 1;
       p1.mStart = ((((i * 60) * 1000) + (i1 * 1000)) + (i2 * i3)) + p2;
       return;
    }
    public static void parseLineTimeByPattenB(String p0,Lyrics$Line p1,int p2){
       if (PatchProxy.isSupport(TrcxParser.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, TrcxParser.class, "4")) {
          return;
       }
       try{
          p1.mStart = TrcxParser.safelyParseInt(p0.split(",")[0]) + p2;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void parseWordsByPattenA(Lyrics$Line p0,String p1){
       Lyrics$Meta meta = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, meta, TrcxParser.class, "5")) {
          return;
       }
       StringBuilder str = "";
       int i = 0;
       while (i < p1.length()) {
          char c = p1.charAt(i);
          if (c != '<') {
             str = str+c;
          }else {
             int i1 = p1.indexOf(62, i);
             if (i1 == -1) {
                break ;
             }else {
                Lyrics$Meta meta1 = new Lyrics$Meta(str.length());
                i = i + 1;
                String[] stringArray = (p1.substring(i, i1)).split(",");
                if (stringArray.length >= 1) {
                   int i2 = TrcxParser.safelyParseInt(stringArray[0]);
                   int i3 = (meta == null)? 0: meta.mStart;
                   i3 = i3 + i2;
                   meta1.mStart = i3;
                   if (meta != null && meta.mDuration == null) {
                      meta.mDuration = i2;
                   }
                }
             label_005f :
                if (stringArray.length >= 2) {
                   meta1.mDuration = TrcxParser.safelyParseInt(stringArray[1]);
                }
                i = i1 + 1;
                if (i >= p1.length()) {
                   break ;
                }else {
                   p0.mMeta.add(meta1);
                   str = str+p1.charAt(i);
                   meta = meta1;
                }
             }
          }
          i = i + 1;
       }
       TrcxParser.calculateLineDuration(p0);
       p0.mText = str;
       return;
    }
    public static void parseWordsByPattenB(Lyrics$Line p0,String p1){
       Lyrics$Meta meta = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, meta, TrcxParser.class, "6")) {
          return;
       }
       StringBuilder str = "";
       int i = 0;
       while (i < p1.length()) {
          char c = p1.charAt(i);
          if (c != '<') {
             str = str+c;
          }else {
             int i1 = p1.indexOf(62, i);
             if (i1 == -1) {
                break ;
             }else {
                Lyrics$Meta meta1 = new Lyrics$Meta(str.length());
                i = i + 1;
                String[] stringArray = (p1.substring(i, i1)).split(",");
                if (stringArray.length >= 3) {
                   meta1.mStart = TrcxParser.safelyParseInt(stringArray[0]);
                   meta1.mDuration = TrcxParser.safelyParseInt(stringArray[1]);
                }else if(stringArray.length >= 1){
                   int i2 = TrcxParser.safelyParseInt(stringArray[0]);
                   int i3 = (meta == null)? 0: meta.mStart;
                   i3 = i3 + i2;
                   meta1.mStart = i3;
                   if (meta != null && meta.mDuration == null) {
                      meta.mDuration = i2;
                   }
                }
             label_0075 :
                if (stringArray.length >= 2) {
                   meta1.mDuration = TrcxParser.safelyParseInt(stringArray[1]);
                }
                i = i1 + 1;
                if (i >= p1.length()) {
                   break ;
                }else {
                   p0.mMeta.add(meta1);
                   str = str+p1.charAt(i);
                   meta = meta1;
                }
             }
          }
          i = i + 1;
       }
       TrcxParser.calculateLineDuration(p0);
       p0.mText = str;
       return;
    }
    public static int safelyParseInt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TrcxParser.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return Integer.parseInt(p0);
       }catch(java.lang.NumberFormatException e3){
          e3.printStackTrace();
          return 0;
       }
    }
}
