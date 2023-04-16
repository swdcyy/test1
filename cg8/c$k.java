package cg8.c$k;
import v2.q;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.mini.packagemanager.model.MiniAppDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;
import java.util.List;
import zi8.x0;
import com.mini.packagemanager.model.MiniAppNetDomain;

public class c$k extends q	// class@000410
{
    public final c d;

    public void c$k(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "INSERT OR REPLACE INTO `MiniAppDetailInfo` \(`appId`,`name`,`icon`,`developerName`,`desc`,`isIntegrated`,`menuBlocklist`,`scopeName`,`webViewDomains`,`chatTargetId`,`isInternal`,`appEnableGuide`,`canShareExternal`,`shareExternalSubbiz`,`apiBlacklist`,`request`,`uploadFile`,`downloadFile`,`socket`,`udp`\) VALUES \(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\)";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$k.class, "1")) {
       }else {
          MiniAppDetailInfo appId = p1.appId;
          int i = 1;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.appName;
          i = 2;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.appIcon;
          i = 3;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.developerName;
          i = 4;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.desc;
          i = 5;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p0.bindLong(6, (long)p1.isIntegrated);
          String str = x0.a(p1.menuInvisibleItems);
          i = 7;
          if (str == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, str);
          }
          str = x0.a(p1.scopeNames);
          i = 8;
          if (str == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, str);
          }
          str = x0.a(p1.webViewDomains);
          i = 9;
          if (str == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, str);
          }
          appId = p1.chatTargetId;
          i = 10;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p0.bindLong(11, (long)p1.isInternal);
          p0.bindLong(12, (long)p1.appEnableGuide);
          p0.bindLong(13, (long)p1.canShareExternal);
          appId = p1.shareExternalSubbiz;
          i = 14;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.apiBlacklist;
          i = 15;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p1 = p1.netDomain;
          int i1 = 18;
          int i2 = 17;
          int i3 = 16;
          if (p1 != null) {
             String str1 = x0.a(p1.requests);
             if (str1 == null) {
                p0.bindNull(i3);
             }else {
                p0.bindString(i3, str1);
             }
             String str2 = x0.a(p1.uploadFiles);
             if (str2 == null) {
                p0.bindNull(i2);
             }else {
                p0.bindString(i2, str2);
             }
             String str3 = x0.a(p1.downloadFiles);
             if (str3 == null) {
                p0.bindNull(i1);
             }else {
                p0.bindString(i1, str3);
             }
             String str4 = x0.a(p1.sockets);
             if (str4 == null) {
                p0.bindNull(19);
             }else {
                p0.bindString(19, str4);
             }
             p1 = x0.a(p1.udps);
             if (p1 == null) {
                p0.bindNull(20);
             }else {
                p0.bindString(20, p1);
             }
          }else {
             p0.bindNull(i3);
             p0.bindNull(i2);
             p0.bindNull(i1);
             p0.bindNull(19);
             p0.bindNull(20);
          }
       }
       return;
    }
}
