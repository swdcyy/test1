package com.yxcorp.gifshow.log.realtime.CommentShowDao;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.internal.DaoConfig;
import com.yxcorp.gifshow.log.realtime.DaoSession;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import android.database.sqlite.SQLiteStatement;
import com.yxcorp.gifshow.log.realtime.CommentShow;
import java.lang.Long;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import android.database.Cursor;
import java.lang.Integer;

public class CommentShowDao extends AbstractDao	// class@001b2c
{
    public static final String TABLENAME = "COMMENT_SHOW";

    public void CommentShowDao(DaoConfig p0){
       super(p0);
    }
    public void CommentShowDao(DaoConfig p0,DaoSession p1){
       super(p0, p1);
    }
    public static void createTable(Database p0,boolean p1){
       CommentShowDao uCommentShow = CommentShowDao.class;
       if (PatchProxy.isSupport(uCommentShow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCommentShow, "1")) {
          return;
       }
       String str = (p1)? "IF NOT EXISTS ": "";
       p0.execSQL("CREATE TABLE "+str+"\"COMMENT_SHOW\" \(\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"EXP_TAG\" TEXT,\"PHOTO_ID\" TEXT,\"USER_ID\" TEXT,\"CONTENT\" BLOB\);");
       return;
    }
    public static void dropTable(Database p0,boolean p1){
       CommentShowDao uCommentShow = CommentShowDao.class;
       if (PatchProxy.isSupport(uCommentShow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCommentShow, "2")) {
          return;
       }
       StringBuilder str = "DROP TABLE ";
       String str1 = (p1)? "IF EXISTS ": "";
       p0.execSQL(str+str1+"\"COMMENT_SHOW\"");
       return;
    }
    public final void bindValues(SQLiteStatement p0,CommentShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentShowDao.class, "4")) {
          return;
       }
       p0.clearBindings();
       Long id = p1.getId();
       if (id != null) {
          p0.bindLong(1, id.longValue());
       }
       String expTag = p1.getExpTag();
       if (expTag != null) {
          p0.bindString(2, expTag);
       }
       expTag = p1.getPhotoId();
       if (expTag != null) {
          p0.bindString(3, expTag);
       }
       expTag = p1.getUserId();
       if (expTag != null) {
          p0.bindString(4, expTag);
       }
       byte[] content = p1.getContent();
       if (content != null) {
          p0.bindBlob(5, content);
       }
       return;
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public final void bindValues(DatabaseStatement p0,CommentShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentShowDao.class, "3")) {
          return;
       }
       p0.clearBindings();
       Long id = p1.getId();
       if (id != null) {
          p0.bindLong(1, id.longValue());
       }
       String expTag = p1.getExpTag();
       if (expTag != null) {
          p0.bindString(2, expTag);
       }
       expTag = p1.getPhotoId();
       if (expTag != null) {
          p0.bindString(3, expTag);
       }
       expTag = p1.getUserId();
       if (expTag != null) {
          p0.bindString(4, expTag);
       }
       byte[] content = p1.getContent();
       if (content != null) {
          p0.bindBlob(5, content);
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public Long getKey(CommentShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentShowDao.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0.getId();
       }
       return null;
    }
    public Object getKey(Object p0){
       return this.getKey(p0);
    }
    public boolean hasKey(CommentShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentShowDao.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getId() != null)? true: false;
       return b;
    }
    public boolean hasKey(Object p0){
       return this.hasKey(p0);
    }
    public final boolean isEntityUpdateable(){
       return true;
    }
    public CommentShow readEntity(Cursor p0,int p1){
       Object obj;
       CommentShowDao uCommentShow = CommentShowDao.class;
       if (PatchProxy.isSupport(uCommentShow)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCommentShow, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p1 + 0;
       int i1 = 0;
       Long longx = (p0.isNull(i))? i1: Long.valueOf(p0.getLong(i));
       i = p1 + 1;
       int i2 = (p0.isNull(i))? i1: p0.getString(i);
       i = p1 + 2;
       int i3 = (p0.isNull(i))? i1: p0.getString(i);
       i = p1 + 3;
       int i4 = (p0.isNull(i))? i1: p0.getString(i);
       p1 = p1 + 4;
       int i5 = (p0.isNull(p1))? i1: p0.getBlob(p1);
       CommentShow uCommentShow1 = new CommentShow(longx, i2, i3, i4, i5);
       return obj;
    }
    public Object readEntity(Cursor p0,int p1){
       return this.readEntity(p0, p1);
    }
    public void readEntity(Cursor p0,CommentShow p1,int p2){
       if (PatchProxy.isSupport(CommentShowDao.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CommentShowDao.class, "7")) {
          return;
       }
       int i = p2 + 0;
       byte[] uobyteArray = null;
       Long longx = (p0.isNull(i))? uobyteArray: Long.valueOf(p0.getLong(i));
       p1.setId(longx);
       i = p2 + 1;
       String str = (p0.isNull(i))? uobyteArray: p0.getString(i);
       p1.setExpTag(str);
       i = p2 + 2;
       str = (p0.isNull(i))? uobyteArray: p0.getString(i);
       p1.setPhotoId(str);
       i = p2 + 3;
       str = (p0.isNull(i))? uobyteArray: p0.getString(i);
       p1.setUserId(str);
       p2 = p2 + 4;
       if (!p0.isNull(p2)) {
          uobyteArray = p0.getBlob(p2);
       }
       p1.setContent(uobyteArray);
       return;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       this.readEntity(p0, p1, p2);
    }
    public Long readKey(Cursor p0,int p1){
       CommentShowDao uCommentShow = CommentShowDao.class;
       if (PatchProxy.isSupport(uCommentShow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCommentShow, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = p1 + 0;
       Long longx = (p0.isNull(p1))? null: Long.valueOf(p0.getLong(p1));
       return longx;
    }
    public Object readKey(Cursor p0,int p1){
       return this.readKey(p0, p1);
    }
    public final Long updateKeyAfterInsert(CommentShow p0,long p1){
       CommentShowDao uCommentShow = CommentShowDao.class;
       if (PatchProxy.isSupport(uCommentShow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uCommentShow, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0.setId(Long.valueOf(p1));
       return Long.valueOf(p1);
    }
    public Object updateKeyAfterInsert(Object p0,long p1){
       return this.updateKeyAfterInsert(p0, p1);
    }
}
