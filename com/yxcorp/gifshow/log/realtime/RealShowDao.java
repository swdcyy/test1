package com.yxcorp.gifshow.log.realtime.RealShowDao;
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
import com.yxcorp.gifshow.log.realtime.RealShow;
import java.lang.Long;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import android.database.Cursor;
import java.lang.Integer;

public class RealShowDao extends AbstractDao	// class@001b39
{
    public static final String TABLENAME = "REAL_SHOW";

    public void RealShowDao(DaoConfig p0){
       super(p0);
    }
    public void RealShowDao(DaoConfig p0,DaoSession p1){
       super(p0, p1);
    }
    public static void createTable(Database p0,boolean p1){
       RealShowDao realShowDao = RealShowDao.class;
       if (PatchProxy.isSupport(realShowDao) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, realShowDao, "1")) {
          return;
       }
       String str = (p1)? "IF NOT EXISTS ": "";
       p0.execSQL("CREATE TABLE "+str+"\"REAL_SHOW\" \(\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"LLSID\" INTEGER,\"CONTENT\" BLOB,\"IS_DELAYED_LOG\" INTEGER\);");
       return;
    }
    public static void dropTable(Database p0,boolean p1){
       RealShowDao realShowDao = RealShowDao.class;
       if (PatchProxy.isSupport(realShowDao) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, realShowDao, "2")) {
          return;
       }
       StringBuilder str = "DROP TABLE ";
       String str1 = (p1)? "IF EXISTS ": "";
       p0.execSQL(str+str1+"\"REAL_SHOW\"");
       return;
    }
    public final void bindValues(SQLiteStatement p0,RealShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealShowDao.class, "4")) {
          return;
       }
       p0.clearBindings();
       Long id = p1.getId();
       if (id != null) {
          p0.bindLong(1, id.longValue());
       }
       id = p1.getLlsid();
       if (id != null) {
          p0.bindLong(2, id.longValue());
       }
       byte[] content = p1.getContent();
       if (content != null) {
          p0.bindBlob(3, content);
       }
       Boolean is_delayed_l = p1.getIs_delayed_log();
       if (is_delayed_l != null) {
          long l = (is_delayed_l.booleanValue())? 1: 0;
          p0.bindLong(4, l);
       }
       return;
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public final void bindValues(DatabaseStatement p0,RealShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealShowDao.class, "3")) {
          return;
       }
       p0.clearBindings();
       Long id = p1.getId();
       if (id != null) {
          p0.bindLong(1, id.longValue());
       }
       id = p1.getLlsid();
       if (id != null) {
          p0.bindLong(2, id.longValue());
       }
       byte[] content = p1.getContent();
       if (content != null) {
          p0.bindBlob(3, content);
       }
       Boolean is_delayed_l = p1.getIs_delayed_log();
       if (is_delayed_l != null) {
          long l = (is_delayed_l.booleanValue())? 1: 0;
          p0.bindLong(4, l);
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public Long getKey(RealShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RealShowDao.class, "9");
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
    public boolean hasKey(RealShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RealShowDao.class, "10");
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
    public RealShow readEntity(Cursor p0,int p1){
       RealShowDao realShowDao = RealShowDao.class;
       if (PatchProxy.isSupport(realShowDao)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, realShowDao, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p1 + 0;
       Boolean uBoolean = null;
       Long longx = (p0.isNull(i))? uBoolean: Long.valueOf(p0.getLong(i));
       int i1 = p1 + 1;
       Long longx1 = (p0.isNull(i1))? uBoolean: Long.valueOf(p0.getLong(i1));
       int i2 = p1 + 2;
       byte[] uobyteArray = (p0.isNull(i2))? uBoolean: p0.getBlob(i2);
       p1 = p1 + 3;
       if (!p0.isNull(p1)) {
          boolean b = (p0.getShort(p1))? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return new RealShow(longx, longx1, uobyteArray, uBoolean);
    }
    public Object readEntity(Cursor p0,int p1){
       return this.readEntity(p0, p1);
    }
    public void readEntity(Cursor p0,RealShow p1,int p2){
       if (PatchProxy.isSupport(RealShowDao.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, RealShowDao.class, "7")) {
          return;
       }
       int i = p2 + 0;
       Boolean uBoolean = null;
       Long longx = (p0.isNull(i))? uBoolean: Long.valueOf(p0.getLong(i));
       p1.setId(longx);
       i = p2 + 1;
       longx = (p0.isNull(i))? uBoolean: Long.valueOf(p0.getLong(i));
       p1.setLlsid(longx);
       i = p2 + 2;
       byte[] uobyteArray = (p0.isNull(i))? uBoolean: p0.getBlob(i);
       p1.setContent(uobyteArray);
       p2 = p2 + 3;
       if (!p0.isNull(p2)) {
          boolean b = (p0.getShort(p2))? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       p1.setIs_delayed_log(uBoolean);
       return;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       this.readEntity(p0, p1, p2);
    }
    public Long readKey(Cursor p0,int p1){
       RealShowDao realShowDao = RealShowDao.class;
       if (PatchProxy.isSupport(realShowDao)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, realShowDao, "5");
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
    public final Long updateKeyAfterInsert(RealShow p0,long p1){
       RealShowDao realShowDao = RealShowDao.class;
       if (PatchProxy.isSupport(realShowDao)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, realShowDao, "8");
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