package com.kwai.user.base.db.dao.UserSimpleInfoDao;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.internal.DaoConfig;
import elb.b;
import pa6.b0;
import tu7.i;
import tu7.d;
import tu7.e;
import tu7.c;
import tu7.a;
import tu7.g;
import tu7.f;
import tu7.h;
import tu7.b;
import tu7.j;
import uu7.b;
import org.greenrobot.greendao.AbstractDaoSession;
import android.database.sqlite.SQLiteStatement;
import java.lang.Object;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.kwai.user.base.chat.target.bean.UserMoodInfo;
import com.kwai.user.base.chat.target.bean.TagStyle;
import com.kwai.user.base.chat.target.bean.UserPendant;
import java.util.Map;
import com.kwai.user.base.chat.target.bean.WhatsUpButton;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Long;

public class UserSimpleInfoDao extends AbstractDao	// class@001984
{
    public final b a;
    public final b0 b;
    public final b c;
    public final i d;
    public final d e;
    public final e f;
    public final c g;
    public final a h;
    public final g i;
    public final f j;
    public final h k;
    public final b l;
    public final j m;
    public static final String TABLENAME = "USER_SIMPLE_INFO";

    public void UserSimpleInfoDao(DaoConfig p0){
       super(p0);
       this.a = new b();
       this.b = new b0();
       this.c = new b();
       this.d = new i();
       this.e = new d();
       this.f = new e();
       this.g = new c();
       this.h = new a();
       this.i = new g();
       this.j = new f();
       this.k = new h();
       this.l = new b();
       this.m = new j();
    }
    public void UserSimpleInfoDao(DaoConfig p0,b p1){
       super(p0, p1);
       this.a = new b();
       this.b = new b0();
       this.c = new b();
       this.d = new i();
       this.e = new d();
       this.f = new e();
       this.g = new c();
       this.h = new a();
       this.i = new g();
       this.j = new f();
       this.k = new h();
       this.l = new b();
       this.m = new j();
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserSimpleInfoDao.class, "4")) {
       }else {
          p0.clearBindings();
          List mHeadUrls = p1.getMHeadUrls();
          if (mHeadUrls != null) {
             p0.bindString(1, this.a.a(mHeadUrls));
          }
          p0.bindLong(2, (long)p1.getMDenyMessageFlag());
          String mGender = p1.getMGender();
          if (mGender != null) {
             p0.bindString(3, mGender);
          }
          mGender = p1.getMHeadUrl();
          if (mGender != null) {
             p0.bindString(4, mGender);
          }
          mGender = p1.getMId();
          if (mGender != null) {
             p0.bindString(5, mGender);
          }
          mGender = p1.getMSubBiz();
          if (mGender != null) {
             p0.bindString(6, mGender);
          }
          p0.bindLong(7, (long)p1.getMType());
          mGender = p1.getMSubbizExtra();
          if (mGender != null) {
             p0.bindString(8, mGender);
          }
          mGender = p1.getMName();
          if (mGender != null) {
             p0.bindString(9, mGender);
          }
          int i = 10;
          long l = 1;
          long l1 = (p1.getMDisableSendImage())? l: 0;
          p0.bindLong(i, l1);
          i = 11;
          l1 = (p1.getMIsBlocked())? l: 0;
          p0.bindLong(i, l1);
          p0.bindLong(12, (long)p1.getMRelationType());
          i = 13;
          l1 = (p1.getMIsFollowRequesting())? l: 0;
          p0.bindLong(i, l1);
          UserSettingOption mUserSetting = p1.getMUserSettingOption();
          if (mUserSetting != null) {
             p0.bindString(14, this.b.a(mUserSetting));
          }
          mGender = p1.getMNamePY();
          if (mGender != null) {
             p0.bindString(15, mGender);
          }
          mGender = p1.getMNameAbbr();
          if (mGender != null) {
             p0.bindString(16, mGender);
          }
          mHeadUrls = p1.getMAvatarPendantUrls();
          if (mHeadUrls != null) {
             p0.bindString(17, this.c.a(mHeadUrls));
          }
          UserVerifiedDetail mUserVerifie = p1.getMUserVerifiedDetail();
          if (mUserVerifie != null) {
             p0.bindString(18, this.d.a(mUserVerifie));
          }
          ProfilePageInfo mProfilePage = p1.getMProfilePageInfo();
          if (mProfilePage != null) {
             p0.bindString(19, this.e.a(mProfilePage));
          }
          p0.bindLong(20, (long)p1.getMOfficialAccountType());
          i = 21;
          l1 = (p1.getMAccountCancelled())? l: 0;
          p0.bindLong(i, l1);
          p0.bindLong(22, (long)p1.getMTargetUserType());
          mGender = p1.getMTag();
          if (mGender != null) {
             p0.bindString(23, mGender);
          }
          i = 24;
          l1 = (p1.getMReplacePresetPanel())? l: 0;
          p0.bindLong(i, l1);
          mHeadUrls = p1.getMPresetPanel();
          if (mHeadUrls != null) {
             p0.bindString(25, this.f.a(mHeadUrls));
          }
          mHeadUrls = p1.getMAccountPanel();
          if (mHeadUrls != null) {
             p0.bindString(26, this.g.a(mHeadUrls));
          }
          mHeadUrls = p1.getMBottomNavItems();
          if (mHeadUrls != null) {
             p0.bindString(27, this.h.a(mHeadUrls));
          }
          UserMoodInfo mUserMoodInf = p1.getMUserMoodInfo();
          if (mUserMoodInf != null) {
             p0.bindString(28, this.i.a(mUserMoodInf));
          }
          TagStyle mTagStyle = p1.getMTagStyle();
          if (mTagStyle != null) {
             p0.bindString(29, this.j.a(mTagStyle));
          }
          p0.bindLong(30, (long)p1.getMMsgCountLeft());
          UserPendant mUserPendant = p1.getMUserPendant();
          if (mUserPendant != null) {
             p0.bindString(31, this.k.a(mUserPendant));
          }
          Map mLogParams = p1.getMLogParams();
          if (mLogParams != null) {
             p0.bindString(32, this.l.a(mLogParams));
          }
          p0.bindLong(33, p1.getMExpireTimestamp());
          WhatsUpButton mWhatsUpButt = p1.getMWhatsUpButton();
          if (mWhatsUpButt != null) {
             p0.bindString(34, this.m.a(mWhatsUpButt));
          }
          if (!p1.getMBlockedByOwner()) {
             l = 0;
          }
          p0.bindLong(35, l);
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserSimpleInfoDao.class, "3")) {
       }else {
          p0.clearBindings();
          List mHeadUrls = p1.getMHeadUrls();
          if (mHeadUrls != null) {
             p0.bindString(1, this.a.a(mHeadUrls));
          }
          p0.bindLong(2, (long)p1.getMDenyMessageFlag());
          String mGender = p1.getMGender();
          if (mGender != null) {
             p0.bindString(3, mGender);
          }
          mGender = p1.getMHeadUrl();
          if (mGender != null) {
             p0.bindString(4, mGender);
          }
          mGender = p1.getMId();
          if (mGender != null) {
             p0.bindString(5, mGender);
          }
          mGender = p1.getMSubBiz();
          if (mGender != null) {
             p0.bindString(6, mGender);
          }
          p0.bindLong(7, (long)p1.getMType());
          mGender = p1.getMSubbizExtra();
          if (mGender != null) {
             p0.bindString(8, mGender);
          }
          mGender = p1.getMName();
          if (mGender != null) {
             p0.bindString(9, mGender);
          }
          int i = 10;
          long l = 1;
          long l1 = (p1.getMDisableSendImage())? l: 0;
          p0.bindLong(i, l1);
          i = 11;
          l1 = (p1.getMIsBlocked())? l: 0;
          p0.bindLong(i, l1);
          p0.bindLong(12, (long)p1.getMRelationType());
          i = 13;
          l1 = (p1.getMIsFollowRequesting())? l: 0;
          p0.bindLong(i, l1);
          UserSettingOption mUserSetting = p1.getMUserSettingOption();
          if (mUserSetting != null) {
             p0.bindString(14, this.b.a(mUserSetting));
          }
          mGender = p1.getMNamePY();
          if (mGender != null) {
             p0.bindString(15, mGender);
          }
          mGender = p1.getMNameAbbr();
          if (mGender != null) {
             p0.bindString(16, mGender);
          }
          mHeadUrls = p1.getMAvatarPendantUrls();
          if (mHeadUrls != null) {
             p0.bindString(17, this.c.a(mHeadUrls));
          }
          UserVerifiedDetail mUserVerifie = p1.getMUserVerifiedDetail();
          if (mUserVerifie != null) {
             p0.bindString(18, this.d.a(mUserVerifie));
          }
          ProfilePageInfo mProfilePage = p1.getMProfilePageInfo();
          if (mProfilePage != null) {
             p0.bindString(19, this.e.a(mProfilePage));
          }
          p0.bindLong(20, (long)p1.getMOfficialAccountType());
          i = 21;
          l1 = (p1.getMAccountCancelled())? l: 0;
          p0.bindLong(i, l1);
          p0.bindLong(22, (long)p1.getMTargetUserType());
          mGender = p1.getMTag();
          if (mGender != null) {
             p0.bindString(23, mGender);
          }
          i = 24;
          l1 = (p1.getMReplacePresetPanel())? l: 0;
          p0.bindLong(i, l1);
          mHeadUrls = p1.getMPresetPanel();
          if (mHeadUrls != null) {
             p0.bindString(25, this.f.a(mHeadUrls));
          }
          mHeadUrls = p1.getMAccountPanel();
          if (mHeadUrls != null) {
             p0.bindString(26, this.g.a(mHeadUrls));
          }
          mHeadUrls = p1.getMBottomNavItems();
          if (mHeadUrls != null) {
             p0.bindString(27, this.h.a(mHeadUrls));
          }
          UserMoodInfo mUserMoodInf = p1.getMUserMoodInfo();
          if (mUserMoodInf != null) {
             p0.bindString(28, this.i.a(mUserMoodInf));
          }
          TagStyle mTagStyle = p1.getMTagStyle();
          if (mTagStyle != null) {
             p0.bindString(29, this.j.a(mTagStyle));
          }
          p0.bindLong(30, (long)p1.getMMsgCountLeft());
          UserPendant mUserPendant = p1.getMUserPendant();
          if (mUserPendant != null) {
             p0.bindString(31, this.k.a(mUserPendant));
          }
          Map mLogParams = p1.getMLogParams();
          if (mLogParams != null) {
             p0.bindString(32, this.l.a(mLogParams));
          }
          p0.bindLong(33, p1.getMExpireTimestamp());
          WhatsUpButton mWhatsUpButt = p1.getMWhatsUpButton();
          if (mWhatsUpButt != null) {
             p0.bindString(34, this.m.a(mWhatsUpButt));
          }
          if (!p1.getMBlockedByOwner()) {
             l = 0;
          }
          p0.bindLong(35, l);
       }
       return;
    }
    public Object getKey(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, UserSimpleInfoDao.class, "9");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, UserSimpleInfoDao.class, "10");
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
       UserSimpleInfoDao userSimpleIn = UserSimpleInfoDao.class;
       if (PatchProxy.isSupport(userSimpleIn)) {
          UserSimpleInfo userSimpleIn1 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, userSimpleIn, "6");
          if (userSimpleIn1 != PatchProxyResult.class) {
          label_028e :
             return userSimpleIn1;
          }
       }
       int i = p1 + 0;
       List list = (obj1.isNull(i))? null: obj.a.b(obj1.getString(i));
       int intx = obj1.getInt((p1 + 1));
       i = p1 + 2;
       int i1 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 3;
       int i2 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 4;
       int i3 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 5;
       int i4 = (obj1.isNull(i))? 0: obj1.getString(i);
       int intx1 = obj1.getInt((p1 + 6));
       i = p1 + 7;
       int i5 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 8;
       int i6 = (obj1.isNull(i))? 0: obj1.getString(i);
       int i7 = (obj1.getShort((p1 + 9)))? 1: 0;
       int i8 = (obj1.getShort((p1 + 10)))? 1: 0;
       int intx2 = obj1.getInt((p1 + 11));
       int i9 = (obj1.getShort((p1 + 12)))? 1: 0;
       i = p1 + 13;
       int i10 = (obj1.isNull(i))? 0: obj.b.b(obj1.getString(i));
       i = p1 + 14;
       int i11 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 15;
       int i12 = (obj1.isNull(i))? 0: obj1.getString(i);
       i = p1 + 16;
       int i13 = (obj1.isNull(i))? 0: obj.c.b(obj1.getString(i));
       i = p1 + 17;
       int i14 = (obj1.isNull(i))? 0: obj.d.b(obj1.getString(i));
       i = p1 + 18;
       int i15 = (obj1.isNull(i))? 0: obj.e.b(obj1.getString(i));
       int intx3 = obj1.getInt((p1 + 19));
       int i16 = (obj1.getShort((p1 + 20)))? 1: 0;
       int intx4 = obj1.getInt((p1 + 21));
       i = p1 + 22;
       int i17 = (obj1.isNull(i))? 0: obj1.getString(i);
       int i18 = (obj1.getShort((p1 + 23)))? 1: 0;
       i = p1 + 24;
       int i19 = (obj1.isNull(i))? 0: obj.f.b(obj1.getString(i));
       i = p1 + 25;
       int i20 = (obj1.isNull(i))? 0: obj.g.b(obj1.getString(i));
       i = p1 + 26;
       int i21 = (obj1.isNull(i))? 0: obj.h.b(obj1.getString(i));
       i = p1 + 27;
       int i22 = (obj1.isNull(i))? 0: obj.i.b(obj1.getString(i));
       i = p1 + 28;
       int i23 = (obj1.isNull(i))? 0: obj.j.b(obj1.getString(i));
       int intx5 = obj1.getInt((p1 + 29));
       i = p1 + 30;
       int i24 = (obj1.isNull(i))? 0: obj.k.b(obj1.getString(i));
       i = p1 + 31;
       int i25 = (obj1.isNull(i))? 0: obj.l.b(obj1.getString(i));
       long longx = obj1.getLong((p1 + 32));
       i = p1 + 33;
       int i26 = (obj1.isNull(i))? 0: obj.m.b(obj1.getString(i));
       obj1 = (obj1.getShort((p1 + 34)))? 1: 0;
       UserSimpleInfo userSimpleIn2 = new UserSimpleInfo(list, intx, i1, i2, i3, i4, intx1, i5, i6, i7, i8, intx2, i9, i10, i11, i12, i13, i14, i15, intx3, i16, intx4, i17, i18, i19, i20, i21, i22, i23, intx5, i24, i25, longx, i26, obj1);
       goto label_028e ;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       if (!PatchProxy.isSupport(UserSimpleInfoDao.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, UserSimpleInfoDao.class, "7")) {
          boolean i = p2 + 0;
          WhatsUpButton whatsUpButto = null;
          List list = (p0.isNull(i))? whatsUpButto: this.a.b(p0.getString(i));
          p1.setMHeadUrls(list);
          p1.setMDenyMessageFlag(p0.getInt((p2 + 1)));
          i = p2 + 2;
          String str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMGender(str);
          i = p2 + 3;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMHeadUrl(str);
          i = p2 + 4;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMId(str);
          i = p2 + 5;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMSubBiz(str);
          p1.setMType(p0.getInt((p2 + 6)));
          i = p2 + 7;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMSubbizExtra(str);
          i = p2 + 8;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMName(str);
          boolean b = true;
          i = (p0.getShort((p2 + 9)))? true: false;
          p1.setMDisableSendImage(i);
          i = (p0.getShort((p2 + 10)))? true: false;
          p1.setMIsBlocked(i);
          p1.setMRelationType(p0.getInt((p2 + 11)));
          i = (p0.getShort((p2 + 12)))? true: false;
          p1.setMIsFollowRequesting(i);
          i = p2 + 13;
          UserSettingOption userSettingO = (p0.isNull(i))? whatsUpButto: this.b.b(p0.getString(i));
          p1.setMUserSettingOption(userSettingO);
          i = p2 + 14;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMNamePY(str);
          i = p2 + 15;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMNameAbbr(str);
          i = p2 + 16;
          list = (p0.isNull(i))? whatsUpButto: this.c.b(p0.getString(i));
          p1.setMAvatarPendantUrls(list);
          i = p2 + 17;
          UserVerifiedDetail userVerified = (p0.isNull(i))? whatsUpButto: this.d.b(p0.getString(i));
          p1.setMUserVerifiedDetail(userVerified);
          i = p2 + 18;
          ProfilePageInfo profilePageI = (p0.isNull(i))? whatsUpButto: this.e.b(p0.getString(i));
          p1.setMProfilePageInfo(profilePageI);
          p1.setMOfficialAccountType(p0.getInt((p2 + 19)));
          i = (p0.getShort((p2 + 20)))? true: false;
          p1.setMAccountCancelled(i);
          p1.setMTargetUserType(p0.getInt((p2 + 21)));
          i = p2 + 22;
          str = (p0.isNull(i))? whatsUpButto: p0.getString(i);
          p1.setMTag(str);
          i = (p0.getShort((p2 + 23)))? true: false;
          p1.setMReplacePresetPanel(i);
          i = p2 + 24;
          list = (p0.isNull(i))? whatsUpButto: this.f.b(p0.getString(i));
          p1.setMPresetPanel(list);
          i = p2 + 25;
          list = (p0.isNull(i))? whatsUpButto: this.g.b(p0.getString(i));
          p1.setMAccountPanel(list);
          i = p2 + 26;
          list = (p0.isNull(i))? whatsUpButto: this.h.b(p0.getString(i));
          p1.setMBottomNavItems(list);
          i = p2 + 27;
          UserMoodInfo userMoodInfo = (p0.isNull(i))? whatsUpButto: this.i.b(p0.getString(i));
          p1.setMUserMoodInfo(userMoodInfo);
          i = p2 + 28;
          TagStyle tagStyle = (p0.isNull(i))? whatsUpButto: this.j.b(p0.getString(i));
          p1.setMTagStyle(tagStyle);
          p1.setMMsgCountLeft(p0.getInt((p2 + 29)));
          i = p2 + 30;
          UserPendant userPendant = (p0.isNull(i))? whatsUpButto: this.k.b(p0.getString(i));
          p1.setMUserPendant(userPendant);
          i = p2 + 31;
          Map map = (p0.isNull(i))? whatsUpButto: this.l.b(p0.getString(i));
          p1.setMLogParams(map);
          p1.setMExpireTimestamp(p0.getLong((p2 + 32)));
          i = p2 + 33;
          if (!p0.isNull(i)) {
             whatsUpButto = this.m.b(p0.getString(i));
          }
          p1.setMWhatsUpButton(whatsUpButto);
          if (!p0.getShort((p2 + 34))) {
             b = false;
          }
          p1.setMBlockedByOwner(b);
       }
       return;
    }
    public Object readKey(Cursor p0,int p1){
       String str;
       UserSimpleInfoDao userSimpleIn = UserSimpleInfoDao.class;
       if (PatchProxy.isSupport(userSimpleIn)) {
          str = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, userSimpleIn, "5");
          if (str != PatchProxyResult.class) {
          label_0028 :
             return str;
          }
       }
       p1 = p1 + 4;
       int i = (p0.isNull(p1))? 0: p0.getString(p1);
       str = i;
       goto label_0028 ;
    }
    public Object updateKeyAfterInsert(Object p0,long p1){
       String str;
       if (PatchProxy.isSupport(UserSimpleInfoDao.class)) {
          str = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, UserSimpleInfoDao.class, "8");
          if (str != PatchProxyResult.class) {
          label_001f :
             return str;
          }
       }
       str = p0.getMId();
       goto label_001f ;
    }
}
