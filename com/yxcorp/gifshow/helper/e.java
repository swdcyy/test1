package com.yxcorp.gifshow.helper.e;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import android.database.Cursor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.provider.ContactsContract$CommonDataKinds$Phone;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.l;
import com.yxcorp.gifshow.util.p;
import java.lang.Throwable;
import com.yxcorp.gifshow.bean.ContactInfo;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.StringBuilder;
import java.util.List;
import wwb.o;
import java.util.Iterator;
import zq4.a;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import java.util.regex.Matcher;
import zq4.b;
import java.util.Map;
import qra.i;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;

public final class e	// class@001631
{
    public static final Pattern a;
    public static final byte[] b;
    public static boolean c;

    static {
       e.a = Pattern.compile("\(\\d\\D*\){6}$");
       e.b = ("gifshow$1801").getBytes();
    }
    public void e(){
       super();
    }
    public static Cursor a(){
       Object obj = PatchProxy.apply(null, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"contact_id","display_name","data1","has_phone_number"};
       return a.b().getContentResolver().query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, stringArray, null, null, null);
    }
    public static String b(String p0){
       Cursor obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          l.b("getContactName failed : hashValue is empty");
          return "";
       }else {
          try{
             obj = e.a();
             while (true) {
                if (obj != null && obj.moveToNext()) {
                   String str = obj.getString(obj.getColumnIndex("display_name"));
                   if (TextUtils.n(p0, p.a(str.getBytes(), e.b))) {
                      obj.close();
                      return str;
                   }
                }else if(obj != null){
                   obj.close();
                   break ;
                }
                break ;
             }
             l.b("getContactName failed : not found");
             return "";
          }catch(java.lang.SecurityException e7){
             obj = null;
          }catch(java.lang.SecurityException e7){
          }
          l.a("getContactName failed : ", e7);
          if (obj) {
             obj.close();
          }
          return null;
       }
    }
    public static ContactInfo c(){
       Cursor uCursor;
       e uoe = e.class;
       b[] obj = PatchProxy.apply(null, null, uoe, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       e.c = b;
       ContactInfo uContactInfo = new ContactInfo();
       if (!PatchProxy.applyVoid(null, null, uoe, "2")) {
          l.b("hasPermission"+PermissionUtils.a(a.b(), "android.permission.READ_CONTACTS"));
          StringBuilder str4 = "";
          Iterator iterator = o.b().iterator();
          while (iterator.hasNext()) {
             str4 = str4+iterator.next()+",";
          }
          l.b("users : "+str4);
       }
       uContactInfo.mUserAddressBook = new a();
       ArrayList uArrayList = new ArrayList();
       int i = a.t().a("maxUploadContactCount", 2000);
       try{
          uCursor = e.a();
          int i1 = 0;
          try{
             while (uCursor != null && (uCursor.moveToNext() && (!e.c && i1 < i))) {
                i1 = i1 + 1;
                String str = uCursor.getString(uCursor.getColumnIndex("display_name"));
                String str1 = uCursor.getString(uCursor.getColumnIndex("data1"));
                String str2 = "";
                if (!TextUtils.x(str1)) {
                   str1 = str1.replaceAll("[\\s\\-\(\)]", str2);
                }
                Pattern pattern = (uCursor.getInt(uCursor.getColumnIndex("has_phone_number")) > 0)? 1: null;
                if (pattern) {
                   Matcher matcher = e.a.matcher(str1);
                   if (!TextUtils.x(str1) && matcher.find()) {
                      String str3 = matcher.group();
                      if (str3.length() < str1.length()) {
                         try{
                            int i2 = str1.length() - str3.length();
                            str1 = str1.substring(b, i2);
                            if (str3.length() > 6) {
                               str3 = str3.replaceAll("\\D", str2);
                            }
                            b uob = new b();
                            str1 = str1+"_"+p.a(str3.getBytes(), e.b);
                            uob.b = str1;
                            uContactInfo.mPoneNameMap.put(str1, TextUtils.k(str));
                            uArrayList.add(uob);
                         }catch(java.lang.Exception e8){
                            l.a("11111  getContacts", e8);
                            goto label_00a2 ;
                         }
                      }
                   }
                }
             }
             if (uCursor != null) {
                uCursor.close();
             }
             l.b("local getContacts size = "+uContactInfo.mPoneNameMap.size());
             obj = new b[b];
             uContactInfo.mUserAddressBook.a = uArrayList.toArray(obj);
             if (uArrayList.size() > 0) {
                uContactInfo.mContactNum = uArrayList.size();
                return uContactInfo;
             }else {
                return null;
             }
          }catch(java.lang.SecurityException e2){
          }
          if (!PatchProxy.applyVoid(null, null, uoe, "6")) {
             k1.p(new i(), Long.valueOf(500));
          }
          l.a("22222  getContacts", e2);
          if (uCursor) {
             uCursor.close();
          }
          return null;
       }catch(java.lang.SecurityException e2){
          uCursor = null;
          goto label_01a8 ;
       }
    }
}
