package com.yxcorp.gifshow.util.SameFrameExt;
import java.lang.String;
import com.yxcorp.gifshow.util.SameFrameExt$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.Object;
import tl8.d;
import com.yxcorp.gifshow.util.SameFrameExt$a;
import com.yxcorp.gifshow.util.SameFrameExt$InfoGetType;
import com.kuaishou.android.model.mix.SameFrameInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.User;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Math;
import java.lang.NumberFormatException;
import java.lang.IllegalArgumentException;

public class SameFrameExt	// class@001f2e
{
    public static final boolean a;

    public static String a(String p0){
       SameFrameExt$b c;
       SameFrameExt$b uob = SameFrameExt.d(p0);
       if (uob != null) {
          c = uob.c;
       }
       return c;
    }
    public static String b(QPhoto p0){
       SameFrameExt$InfoGetType none;
       String str1;
       BaseFeed entity = p0.getEntity();
       PhotoMeta photoMeta = entity.a(PhotoMeta.class);
       String str = null;
       photoMeta = (photoMeta != null)? photoMeta.mSameFrameInfo: str;
       int[] a = SameFrameExt$a.a;
       if (photoMeta == null) {
          none = SameFrameExt$InfoGetType.None;
       }else if(!TextUtils.isEmpty(photoMeta.mUserName) && !TextUtils.isEmpty(photoMeta.mOriginPhotoId)){
          none = SameFrameExt$InfoGetType.SameFrameInfo;
       }else if(photoMeta.mShowSameFrameCurrentTag == null || TextUtils.isEmpty(entity.getId())){
          none = SameFrameExt$InfoGetType.None;
       }else {
          User user = entity.a(User.class);
          none = (user != null && !TextUtils.isEmpty(user.getName()))? SameFrameExt$InfoGetType.QPhoto: SameFrameExt$InfoGetType.None;
       }
       int i = a[none.ordinal()];
       if (i != 1) {
          if (i == 2) {
             str = entity.getId();
          }
       }else {
          str = photoMeta.mOriginPhotoId;
       }
       return str;
    }
    public static String c(String p0,String p1){
       if (SameFrameExt.d(p1) != null) {
          return p1;
       }
       SameFrameExt$b uob = SameFrameExt.d(p0);
       if (uob == null) {
          return p1;
       }
       Object[] objArray = new Object[]{uob.a,Integer.valueOf(p1.length()),uob.b};
       return (uob.e).replace(uob.d, String.format("$${2|%s|%s}%s$$", objArray))+p1;
    }
    public static SameFrameExt$b d(String p0){
       SameFrameExt$b uob = null;
       if (p0 == null) {
          return uob;
       }
       try{
          Matcher matcher = Pattern.compile("\\$\\$\\{2\\|\(.*?\)\\|\(.*?\)\\}\(.*?\)\\$\\$").matcher(p0);
          if (!matcher.find()) {
             return uob;
          }
          int i = 3;
          if (matcher.groupCount() != i) {
             return uob;
          }
          String str = matcher.group(2);
          if (str == null) {
             return uob;
          }
          try{
             int i1 = Integer.parseInt(str);
             String str1 = matcher.group(1);
             if (str1 == null) {
                return uob;
             }
             String str2 = matcher.group(i);
             if (str2 == null) {
                return uob;
             }
             String str3 = p0.substring((p0.length() - Math.max(0, Math.min(p0.length(), i1))));
             SameFrameExt$b uob1 = new SameFrameExt$b(str1, str2, str3, matcher.group(), p0.substring(0, (p0.length() - str3.length())));
             return p0;
          }catch(java.lang.NumberFormatException e11){
             e11.printStackTrace();
             return uob;
          }
       }catch(java.lang.IllegalArgumentException e11){
          e11.printStackTrace();
          return uob;
       }
    }
}
