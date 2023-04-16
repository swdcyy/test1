package k79.i$a;
import java.lang.Object;
import nsd.u;
import android.database.Cursor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g79.a;
import w69.b0;
import android.app.Application;
import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.MediaStore$Files;
import k79.i;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import java.util.List;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import com.yxcorp.utility.RomUtils;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import java.lang.Boolean;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.lang.Throwable;
import w69.l;
import com.yxcorp.gifshow.models.QMedia;
import k79.j;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.System;
import android.text.TextUtils;
import java.lang.Long;
import ekd.k1;
import java.lang.RuntimeException;

public final class i$a	// class@002b53
{

    public void i$a(){
       super();
    }
    public void i$a(u p0){
       super();
    }
    public final Cursor a(){
       a obj = PatchProxy.apply(null, this, i$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       if (!obj.g().h(obj.b(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
          return null;
       }
       try{
          return obj.b().getContentResolver().query(MediaStore$Files.getContentUri("external"), this.g(), "\(media_type=1 or media_type=3\) ", null, "date_modified desc");
       }catch(java.lang.Exception e0){
          Log.d(i.a, "createAssetsCursor failed:: "+e0.getMessage());
          return v1;
       }
    }
    public final Cursor b(int p0,List p1){
       a obj;
       String str;
       ArrayList uArrayList;
       int i;
       String str1;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p1, "keywords");
       obj = a.c;
       b0 uob0 = obj.g();
       int b = uob0.h(obj.b(), "android.permission.WRITE_EXTERNAL_STORAGE");
       if (!b) {
          return null;
       }else if(!p0){
          str = "media_type=3";
       }else if(p0 == 1){
          str = "media_type=1";
       }else {
          str = "media_type=1 or media_type=3";
       }
       if (Build$VERSION.SDK_INT >= 29) {
          b = p1.size();
          uArrayList = new ArrayList(b);
          for (i = 0; i < b; i = i + 1) {
             uArrayList.add("relative_path like ? ");
          }
          str1 = CollectionsKt___CollectionsKt.V2(uArrayList, " or ", null, null, 0, null, null, 62, null);
       }else {
          b = p1.size();
          uArrayList = new ArrayList(b);
          for (i = 0; i < b; i = i + 1) {
             uArrayList.add("_data like ? ");
          }
          str1 = CollectionsKt___CollectionsKt.V2(uArrayList, " or ", null, null, 0, null, null, 62, null);
       }
       String str2 = "\( "+str+" \) and \( "+str1+" \)";
       ArrayList uArrayList1 = new ArrayList(u.Y(p1, 10));
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          char c = '%';
          uArrayList1.add(c+iterator.next()+c);
       }
       String[] stringArray = new String[0];
       Object[] objArray = uArrayList1.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       Object[] objArray1 = objArray;
       str = i.a;
       str1 = Arrays.toString(objArray1);
       a.o(str1, "java.util.Arrays.toString\(this\)");
       String str3 = "selectionClause="+str2+", selectionArgs="+str1;
       try{
          Log.b(str, str3);
          return a.c.b().getContentResolver().query(MediaStore$Files.getContentUri("external"), this.g(), str2, objArray1, "date_modified desc");
       }catch(java.lang.Exception e14){
          Log.d(i.a, "createAssetsCursorByKeywords failed:: "+e14.getMessage());
          return uob0;
       }
    }
    public final Cursor c(){
       Cursor uCursor;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       a obj = PatchProxy.apply(null, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.c;
       if (!obj.g().h(obj.b(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
          return null;
       }
       try{
          if (RomUtils.n()) {
             uCursor = PatchProxy.apply(null, this, uoa, "12");
             if (uCursor != patchProxyRe) {
             }else {
                uCursor = obj.b().getContentResolver().query(MediaStore$Files.getContentUri("external"), this.h(), "\(media_type=1\)", null, "date_modified desc");
             }
          }else {
             uCursor = obj.b().getContentResolver().query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, this.h(), null, null, "date_modified desc");
          }
          return uCursor;
       }catch(java.lang.Exception e0){
          Log.d(i.a, "createImageCursor failed:: "+e0.getMessage());
          return null;
       }
    }
    public final Cursor d(){
       String a;
       a obj = PatchProxy.apply(null, this, i$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       if (!obj.g().h(obj.b(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
          return null;
       }
       try{
          ContentResolver contentResol = obj.b().getContentResolver();
          Cursor uCursor = (RomUtils.n())? this.j(): contentResol.query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, this.i(), null, null, "date_modified desc");
          return uCursor;
       }catch(java.lang.Exception e0){
          a = i.a;
          String str = "createVideoCursor failed:: "+e0.getMessage();
          try{
             Log.d(a, str);
             return this.j();
          }catch(java.lang.Exception e0){
             Log.d(i.a, "createVideoCursor retry failed:: "+e0.getMessage());
             return v1;
          }
       }
    }
    public final boolean e(Cursor p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (!p0.isBeforeFirst() && !p0.isAfterLast())) {
          b = false;
       }
    label_0024 :
       return b;
    }
    public final MediaMetadataRetriever f(MediaMetadataRetriever p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          try{
             p0 = new MediaMetadataRetriever();
             p0.setDataSource(a.c.b(), Uri.fromFile(new File(p1)));
          }catch(java.lang.Exception e4){
             Log.e(i.a, "retriever set data source failed", e4);
             a.c.c().onException(e4);
          }
       }
    }
    public final String[] g(){
       return i.d;
    }
    public final String[] h(){
       return i.b;
    }
    public final String[] i(){
       return i.c;
    }
    public final Cursor j(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c.b().getContentResolver().query(MediaStore$Files.getContentUri("external"), this.i(), "\(media_type=3\)", null, "date_modified desc");
    }
    public final boolean k(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "videoMedia");
       boolean b = (p0.isVideoType() && (p0.duration > 0 && (p0.mWidth <= null || p0.mHeight <= null)))? true: false;
       return b;
    }
    public final QMedia l(Cursor p0){
       int i;
       Object obj = p0;
       String obj1 = PatchProxy.applyOneRefs(obj, this, i$a.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (j.e(p0)) {
          Log.d(i.a, "loadPhotoMedia cursor is closed !!!");
          return null;
       }else if(this.e(p0)){
          Log.d(i.a, "loadPhotoMedia cursor has no data");
          return null;
       }else if(obj != null){
          String str = obj.getString(1);
          long longx = obj.getLong(0);
          long longx1 = obj.getLong(3);
          if (!longx1) {
             longx1 = obj.getLong(2) * 1000;
          }
          obj1 = str;
          QMedia qMedia = v15;
          QMedia qMedia1 = new QMedia(longx, str, 0, obj.getLong(8), longx1, obj.getLong(4), 0);
          if (obj.getColumnIndex("width") == -1) {
             Log.d(i.a, "MediaLoader::nextMedia\(\) path="+obj1+" columns="+Arrays.toString(p0.getColumnNames()));
             return null;
          }else {
             i = 5;
             QMedia qMedia2 = qMedia;
             qMedia2.mWidth = obj.getInt(i);
             int i1 = 6;
             int intx = obj.getInt(i1);
             qMedia2.mHeight = intx;
             if (qMedia2.mWidth == null && !intx) {
                BitmapFactory$Options options = new BitmapFactory$Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(obj1, options);
                qMedia2.mWidth = options.outWidth;
                qMedia2.mHeight = options.outHeight;
             }
             qMedia2.mRatio = j.c(obj.getInt(i), obj.getInt(i1), obj.getInt(7));
             qMedia2.setOrientation(obj.getInt(7));
             return qMedia2;
          }
       }else {
          return null;
       }
    }
    public final QMedia m(Cursor p0){
       int i;
       int this;
       QMedia qMedia1;
       int intx3;
       BitmapFactory$Options options;
       BitmapFactory$Options this1;
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, i$a.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       QMedia qMedia = null;
       if (j.e(p0)) {
          Log.d(i.a, "loadMedia cursor is closed !!!");
          return qMedia;
       }else if(this.e(p0)){
          Log.d(i.a, "loadMedia cursor has no data");
          return qMedia;
       }else if(obj != null){
          i = 1;
          String str = obj.getString(i);
          long longx = obj.getLong(0);
          int intx = obj.getInt(6);
          long longx1 = obj.getLong(7);
          int i1 = 3;
          long longx2 = obj.getLong(i1);
          long longx3 = obj.getLong(8);
          int intx1 = obj.getInt(4);
          int intx2 = obj.getInt(5);
          if (intx != i) {
             if (intx != i1) {
                qMedia = null;
             label_00d7 :
                return qMedia;
             }else {
                this = intx1;
                qMedia1 = new QMedia(longx, str, obj.getLong(10), longx1, longx3, longx2, 1);
                i.mWidth = this;
                i.mHeight = intx2;
                intx3 = obj.getInt(9);
                i.setOrientation(intx3);
                i.mRatio = j.c(this, intx2, intx3);
             }
          }else {
             this = intx1;
             if (!longx3) {
                longx3 = obj.getLong(2) * 1000;
             }
             if (!this && (!intx2 && new File(str).exists())) {
                options = new BitmapFactory$Options();
                options.inJustDecodeBounds = i;
                BitmapFactory.decodeFile(str, options);
                options = options.outHeight;
                this1 = options.outWidth;
             }
             qMedia1 = new QMedia(longx, str, 0, longx1, longx3, longx2, 0);
             i.mWidth = this1;
             i.mHeight = options;
             intx3 = obj.getInt(9);
             i.setOrientation(intx3);
             i.mRatio = j.c(this1, options, intx3);
          }
          qMedia = i;
          goto label_00d7 ;
       }else {
          return qMedia;
       }
    }
    public final QMedia n(Cursor p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, i$a.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (j.e(p0)) {
          Log.d(i.a, "loadVideoMedia cursor is closed !!!");
          return null;
       }else if(this.e(p0)){
          Log.d(i.a, "loadVideoMedia cursor has no data");
          return null;
       }else if(obj != null){
          String str = obj.getString(1);
          long longx = obj.getLong(0);
          long longx1 = obj.getLong(8);
          if (!longx1) {
             longx1 = obj.getLong(3) * 1000;
          }
          QMedia qMedia = new QMedia(longx, str, obj.getLong(2), obj.getLong(5), longx1, obj.getLong(4), 1);
          obj1.mWidth = obj.getInt(6);
          obj1.mHeight = obj.getInt(7);
          int intx = obj.getInt(9);
          obj1.setOrientation(intx);
          obj1.mRatio = j.c(obj1.mWidth, obj1.mHeight, intx);
          return obj1;
       }else {
          return null;
       }
    }
    public final QMedia o(QMedia p0){
       QMedia path;
       String str5;
       int i;
       int i1;
       MediaMetadataRetriever obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "videoMedia");
       obj = null;
       String str = ".path";
       String str1 = " for=";
       String str2 = "videoMedia.path";
       String str3 = null;
       if (p0.duration - str3 <= 0) {
          path = p0.path;
          a.h(path, str2);
          obj = this.f(obj, path);
          try{
             long l = System.currentTimeMillis();
             String str4 = obj.extractMetadata(9);
             if (TextUtils.isEmpty(str4)) {
                Log.d(i.a, "inflateEmptyInfo: get wrong strDuration="+str4+str1+p0+str);
             }else {
                try{
                   Log.b(i.a, "inflateEmptyInfo: strDuration="+str4);
                   if (str4 != null) {
                      str3 = Long.parseLong(str4);
                   }
                   p0.duration = str3;
                }catch(java.lang.NumberFormatException e8){
                   Log.e(i.a, "inflateEmptyInfo: "+str4, e8);
                }
                Log.b(i.a, "inflateEmptyInfo: duration="+str4+" extract duration cost "+k1.t(l));
             }
          }catch(java.lang.RuntimeException e1){
             Log.e(i.a, "inflateEmptyInfo:  video="+p0.path+e1.getMessage(), e1);
          }
       }
    }
}
