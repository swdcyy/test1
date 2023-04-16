package com.kwai.user.base.db.dao.FollowUserDao;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.internal.DaoConfig;
import tu7.e;
import elb.b;
import uu7.b;
import org.greenrobot.greendao.AbstractDaoSession;
import android.database.sqlite.SQLiteStatement;
import java.lang.Object;
import com.kwai.user.base.db.entity.FollowUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Long;

public class FollowUserDao extends AbstractDao	// class@001982
{
    public final e a;
    public final b b;
    public static final String TABLENAME = "FOLLOW_USER";

    public void FollowUserDao(DaoConfig p0){
       super(p0);
       this.a = new e();
       this.b = new b();
    }
    public void FollowUserDao(DaoConfig p0,b p1){
       super(p0, p1);
       this.a = new e();
       this.b = new b();
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowUserDao.class, "4")) {
       }else {
          p0.clearBindings();
          String mId = p1.getMId();
          if (mId != null) {
             p0.bindString(1, mId);
          }
          mId = p1.getMName();
          if (mId != null) {
             p0.bindString(2, mId);
          }
          mId = p1.getMNamePY();
          if (mId != null) {
             p0.bindString(3, mId);
          }
          mId = p1.getMNameAbbr();
          if (mId != null) {
             p0.bindString(4, mId);
          }
          mId = p1.getMRemarkName();
          if (mId != null) {
             p0.bindString(5, mId);
          }
          mId = p1.getMRemarkNamePY();
          if (mId != null) {
             p0.bindString(6, mId);
          }
          mId = p1.getMRemarkNameAbbr();
          if (mId != null) {
             p0.bindString(7, mId);
          }
          mId = p1.getMGender();
          if (mId != null) {
             p0.bindString(8, mId);
          }
          mId = p1.getMHeadUrl();
          if (mId != null) {
             p0.bindString(9, mId);
          }
          List mHeadUrls = p1.getMHeadUrls();
          if (mHeadUrls != null) {
             p0.bindString(10, this.a.a(mHeadUrls));
          }
          mHeadUrls = p1.getMHeadCDNUrls();
          if (mHeadUrls != null) {
             p0.bindString(11, this.b.a(mHeadUrls));
          }
          p1 = p1.getMRelation();
          if (p1 != null) {
             p0.bindString(12, p1);
          }
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowUserDao.class, "3")) {
       }else {
          p0.clearBindings();
          String mId = p1.getMId();
          if (mId != null) {
             p0.bindString(1, mId);
          }
          mId = p1.getMName();
          if (mId != null) {
             p0.bindString(2, mId);
          }
          mId = p1.getMNamePY();
          if (mId != null) {
             p0.bindString(3, mId);
          }
          mId = p1.getMNameAbbr();
          if (mId != null) {
             p0.bindString(4, mId);
          }
          mId = p1.getMRemarkName();
          if (mId != null) {
             p0.bindString(5, mId);
          }
          mId = p1.getMRemarkNamePY();
          if (mId != null) {
             p0.bindString(6, mId);
          }
          mId = p1.getMRemarkNameAbbr();
          if (mId != null) {
             p0.bindString(7, mId);
          }
          mId = p1.getMGender();
          if (mId != null) {
             p0.bindString(8, mId);
          }
          mId = p1.getMHeadUrl();
          if (mId != null) {
             p0.bindString(9, mId);
          }
          List mHeadUrls = p1.getMHeadUrls();
          if (mHeadUrls != null) {
             p0.bindString(10, this.a.a(mHeadUrls));
          }
          mHeadUrls = p1.getMHeadCDNUrls();
          if (mHeadUrls != null) {
             p0.bindString(11, this.b.a(mHeadUrls));
          }
          p1 = p1.getMRelation();
          if (p1 != null) {
             p0.bindString(12, p1);
          }
       }
       return;
    }
    public Object getKey(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, FollowUserDao.class, "9");
       if (str != PatchProxyResult.class) {
       }else if(p0 != null){
          str = p0.getMId();
       }else {
          str = null;
       }
       return str;
    }
    public boolean hasKey(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowUserDao.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getMId() != null){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean isEntityUpdateable(){
       return true;
    }
    public Object readEntity(Cursor p0,int p1){
       Object obj = this;
       Object obj1 = p0;
       FollowUserDao uFollowUserD = FollowUserDao.class;
       if (PatchProxy.isSupport(uFollowUserD)) {
          FollowUser uFollowUser = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, uFollowUserD, "6");
          if (uFollowUser != PatchProxyResult.class) {
          label_00ef :
             return uFollowUser;
          }
       }
       int i = p1 + 0;
       int i1 = 0;
       String str = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 1;
       int i2 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 2;
       int i3 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 3;
       int i4 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 4;
       int i5 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 5;
       int i6 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 6;
       int i7 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 7;
       int i8 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 8;
       int i9 = (obj1.isNull(i))? i1: obj1.getString(i);
       i = p1 + 9;
       int i10 = (obj1.isNull(i))? i1: obj.a.b(obj1.getString(i));
       i = p1 + 10;
       int i11 = (obj1.isNull(i))? i1: obj.b.b(obj1.getString(i));
       i = p1 + 11;
       int i12 = (obj1.isNull(i))? i1: obj1.getString(i);
       FollowUser uFollowUser1 = new FollowUser(str, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
       goto label_00ef ;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       if (!PatchProxy.isSupport(FollowUserDao.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, FollowUserDao.class, "7")) {
          int i = p2 + 0;
          String str = null;
          String str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMId(str1);
          i = p2 + 1;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMName(str1);
          i = p2 + 2;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMNamePY(str1);
          i = p2 + 3;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMNameAbbr(str1);
          i = p2 + 4;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMRemarkName(str1);
          i = p2 + 5;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMRemarkNamePY(str1);
          i = p2 + 6;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMRemarkNameAbbr(str1);
          i = p2 + 7;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMGender(str1);
          i = p2 + 8;
          str1 = (p0.isNull(i))? str: p0.getString(i);
          p1.setMHeadUrl(str1);
          i = p2 + 9;
          List list = (p0.isNull(i))? str: this.a.b(p0.getString(i));
          p1.setMHeadUrls(list);
          i = p2 + 10;
          list = (p0.isNull(i))? str: this.b.b(p0.getString(i));
          p1.setMHeadCDNUrls(list);
          p2 = p2 + 11;
          if (!p0.isNull(p2)) {
             str = p0.getString(p2);
          }
          p1.setMRelation(str);
       }
       return;
    }
    public Object readKey(Cursor p0,int p1){
       String str;
       FollowUserDao uFollowUserD = FollowUserDao.class;
       if (PatchProxy.isSupport(uFollowUserD)) {
          str = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uFollowUserD, "5");
          if (str != PatchProxyResult.class) {
          label_0028 :
             return str;
          }
       }
       p1 = p1 + 0;
       int i = (p0.isNull(p1))? 0: p0.getString(p1);
       str = i;
       goto label_0028 ;
    }
    public Object updateKeyAfterInsert(Object p0,long p1){
       String str;
       if (PatchProxy.isSupport(FollowUserDao.class)) {
          str = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, FollowUserDao.class, "8");
          if (str != PatchProxyResult.class) {
          label_001f :
             return str;
          }
       }
       str = p0.getMId();
       goto label_001f ;
    }
}
