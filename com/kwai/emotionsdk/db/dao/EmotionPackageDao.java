package com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.internal.DaoConfig;
import bk5.a;
import bk5.d;
import bk5.f;
import bk5.i;
import ik5.b;
import org.greenrobot.greendao.AbstractDaoSession;
import android.database.sqlite.SQLiteStatement;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionAuthor;
import com.kwai.emotionsdk.bean.EmotionExtraInfo;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Long;

public class EmotionPackageDao extends AbstractDao	// class@000dab
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final d g;
    public final f h;
    public final i i;
    public static final String TABLENAME = "EMOTION_PACKAGE";

    public void EmotionPackageDao(DaoConfig p0){
       super(p0);
       this.a = new a();
       this.b = new a();
       this.c = new a();
       this.d = new a();
       this.e = new a();
       this.f = new a();
       this.g = new d();
       this.h = new f();
       this.i = new i();
    }
    public void EmotionPackageDao(DaoConfig p0,b p1){
       super(p0, p1);
       this.a = new a();
       this.b = new a();
       this.c = new a();
       this.d = new a();
       this.e = new a();
       this.f = new a();
       this.g = new d();
       this.h = new f();
       this.i = new i();
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmotionPackageDao.class, "4")) {
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
          mId = p1.getMIntroduction();
          if (mId != null) {
             p0.bindString(3, mId);
          }
          mId = p1.getMDescription();
          if (mId != null) {
             p0.bindString(4, mId);
          }
          p0.bindLong(5, (long)p1.getMType());
          mId = p1.getMStyle();
          if (mId != null) {
             p0.bindString(6, mId);
          }
          List mPackageImag = p1.getMPackageImageSmallUrl();
          if (mPackageImag != null) {
             p0.bindString(7, this.a.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageSmallUrlDarkMode();
          if (mPackageImag != null) {
             p0.bindString(8, this.b.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageMiddleUrl();
          if (mPackageImag != null) {
             p0.bindString(9, this.c.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageBannerUrl();
          if (mPackageImag != null) {
             p0.bindString(10, this.d.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageBigUrl();
          if (mPackageImag != null) {
             p0.bindString(11, this.e.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageDownloadUrl();
          if (mPackageImag != null) {
             p0.bindString(12, this.f.a(mPackageImag));
          }
          EmotionAuthor mEmotionAuth = p1.getMEmotionAuthor();
          if (mEmotionAuth != null) {
             p0.bindString(13, this.g.a(mEmotionAuth));
          }
          mPackageImag = p1.getMEmotions();
          if (mPackageImag != null) {
             p0.bindString(14, this.h.a(mPackageImag));
          }
          EmotionExtraInfo mExtraInfo = p1.getMExtraInfo();
          if (mExtraInfo != null) {
             p0.bindString(15, this.i.a(mExtraInfo));
          }
          p0.bindLong(16, (long)p1.getMEmotionPackageVersion());
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmotionPackageDao.class, "3")) {
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
          mId = p1.getMIntroduction();
          if (mId != null) {
             p0.bindString(3, mId);
          }
          mId = p1.getMDescription();
          if (mId != null) {
             p0.bindString(4, mId);
          }
          p0.bindLong(5, (long)p1.getMType());
          mId = p1.getMStyle();
          if (mId != null) {
             p0.bindString(6, mId);
          }
          List mPackageImag = p1.getMPackageImageSmallUrl();
          if (mPackageImag != null) {
             p0.bindString(7, this.a.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageSmallUrlDarkMode();
          if (mPackageImag != null) {
             p0.bindString(8, this.b.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageMiddleUrl();
          if (mPackageImag != null) {
             p0.bindString(9, this.c.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageBannerUrl();
          if (mPackageImag != null) {
             p0.bindString(10, this.d.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageImageBigUrl();
          if (mPackageImag != null) {
             p0.bindString(11, this.e.a(mPackageImag));
          }
          mPackageImag = p1.getMPackageDownloadUrl();
          if (mPackageImag != null) {
             p0.bindString(12, this.f.a(mPackageImag));
          }
          EmotionAuthor mEmotionAuth = p1.getMEmotionAuthor();
          if (mEmotionAuth != null) {
             p0.bindString(13, this.g.a(mEmotionAuth));
          }
          mPackageImag = p1.getMEmotions();
          if (mPackageImag != null) {
             p0.bindString(14, this.h.a(mPackageImag));
          }
          EmotionExtraInfo mExtraInfo = p1.getMExtraInfo();
          if (mExtraInfo != null) {
             p0.bindString(15, this.i.a(mExtraInfo));
          }
          p0.bindLong(16, (long)p1.getMEmotionPackageVersion());
       }
       return;
    }
    public Object getKey(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, EmotionPackageDao.class, "9");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, EmotionPackageDao.class, "10");
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
       EmotionPackageDao uEmotionPack = EmotionPackageDao.class;
       if (PatchProxy.isSupport(uEmotionPack)) {
          EmotionPackage uEmotionPack1 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, uEmotionPack, "6");
          if (uEmotionPack1 != PatchProxyResult.class) {
          label_0152 :
             return uEmotionPack1;
          }
       }
       int i = p1 + 0;
       String str = (obj1.isNull(i))? null: obj1.getString(i);
       i = p1 + 1;
       int i1 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 2;
       int i2 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 3;
       int i3 = (obj1.isNull(i))? 0: obj1.getString(i);
       int intx = obj1.getInt((p1 + 4));
       i = p1 + 5;
       int i4 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 6;
       int i5 = (obj1.isNull(i))? 0: obj.a.b(obj1.getString(i));
       i = p1 + 7;
       int i6 = (obj1.isNull(i))? 0: obj.b.b(obj1.getString(i));
       i = p1 + 8;
       int i7 = (obj1.isNull(i))? 0: obj.c.b(obj1.getString(i));
       i = p1 + 9;
       int i8 = (obj1.isNull(i))? 0: obj.d.b(obj1.getString(i));
       i = p1 + 10;
       int i9 = (obj1.isNull(i))? 0: obj.e.b(obj1.getString(i));
       i = p1 + 11;
       int i10 = (obj1.isNull(i))? 0: obj.f.b(obj1.getString(i));
       i = p1 + 12;
       int i11 = (obj1.isNull(i))? 0: obj.g.b(obj1.getString(i));
       i = p1 + 13;
       int i12 = (obj1.isNull(i))? 0: obj.h.b(obj1.getString(i));
       i = p1 + 14;
       int i13 = (obj1.isNull(i))? 0: obj.i.b(obj1.getString(i));
       EmotionPackage uEmotionPack2 = new EmotionPackage(str, i1, i2, i3, intx, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, obj1.getInt((p1 + 15)));
       goto label_0152 ;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       if (!PatchProxy.isSupport(EmotionPackageDao.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, EmotionPackageDao.class, "7")) {
          int i = p2 + 0;
          EmotionExtraInfo uEmotionExtr = null;
          String str = (p0.isNull(i))? uEmotionExtr: p0.getString(i);
          p1.setMId(str);
          i = p2 + 1;
          str = (p0.isNull(i))? uEmotionExtr: p0.getString(i);
          p1.setMName(str);
          i = p2 + 2;
          str = (p0.isNull(i))? uEmotionExtr: p0.getString(i);
          p1.setMIntroduction(str);
          i = p2 + 3;
          str = (p0.isNull(i))? uEmotionExtr: p0.getString(i);
          p1.setMDescription(str);
          p1.setMType(p0.getInt((p2 + 4)));
          i = p2 + 5;
          str = (p0.isNull(i))? uEmotionExtr: p0.getString(i);
          p1.setMStyle(str);
          i = p2 + 6;
          List list = (p0.isNull(i))? uEmotionExtr: this.a.b(p0.getString(i));
          p1.setMPackageImageSmallUrl(list);
          i = p2 + 7;
          list = (p0.isNull(i))? uEmotionExtr: this.b.b(p0.getString(i));
          p1.setMPackageImageSmallUrlDarkMode(list);
          i = p2 + 8;
          list = (p0.isNull(i))? uEmotionExtr: this.c.b(p0.getString(i));
          p1.setMPackageImageMiddleUrl(list);
          i = p2 + 9;
          list = (p0.isNull(i))? uEmotionExtr: this.d.b(p0.getString(i));
          p1.setMPackageBannerUrl(list);
          i = p2 + 10;
          list = (p0.isNull(i))? uEmotionExtr: this.e.b(p0.getString(i));
          p1.setMPackageImageBigUrl(list);
          i = p2 + 11;
          list = (p0.isNull(i))? uEmotionExtr: this.f.b(p0.getString(i));
          p1.setMPackageDownloadUrl(list);
          i = p2 + 12;
          EmotionAuthor uEmotionAuth = (p0.isNull(i))? uEmotionExtr: this.g.b(p0.getString(i));
          p1.setMEmotionAuthor(uEmotionAuth);
          i = p2 + 13;
          list = (p0.isNull(i))? uEmotionExtr: this.h.b(p0.getString(i));
          p1.setMEmotions(list);
          i = p2 + 14;
          if (!p0.isNull(i)) {
             uEmotionExtr = this.i.b(p0.getString(i));
          }
          p1.setMExtraInfo(uEmotionExtr);
          p1.setMEmotionPackageVersion(p0.getInt((p2 + 15)));
       }
       return;
    }
    public Object readKey(Cursor p0,int p1){
       String str;
       EmotionPackageDao uEmotionPack = EmotionPackageDao.class;
       if (PatchProxy.isSupport(uEmotionPack)) {
          str = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uEmotionPack, "5");
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
       if (PatchProxy.isSupport(EmotionPackageDao.class)) {
          str = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, EmotionPackageDao.class, "8");
          if (str != PatchProxyResult.class) {
          label_001f :
             return str;
          }
       }
       str = p0.getMId();
       goto label_001f ;
    }
}
