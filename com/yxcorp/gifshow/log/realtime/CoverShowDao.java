package com.yxcorp.gifshow.log.realtime.CoverShowDao;
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
import com.yxcorp.gifshow.log.realtime.CoverShow;
import java.lang.Long;
import org.greenrobot.greendao.database.DatabaseStatement;
import com.kwai.robust.PatchProxyResult;
import android.database.Cursor;
import java.lang.Integer;

public class CoverShowDao extends AbstractDao	// class@001b2f
{
    public static final String TABLENAME = "COVER_SHOW";

    public void CoverShowDao(DaoConfig p0){
       super(p0);
    }
    public void CoverShowDao(DaoConfig p0,DaoSession p1){
       super(p0, p1);
    }
    public static void createTable(Database p0,boolean p1){
       CoverShowDao uCoverShowDa = CoverShowDao.class;
       if (PatchProxy.isSupport(uCoverShowDa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCoverShowDa, "1")) {
          return;
       }
       String str = (p1)? "IF NOT EXISTS ": "";
       p0.execSQL("CREATE TABLE "+str+"\"COVER_SHOW\" \(\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"LLSID\" INTEGER,\"CONTENT\" BLOB,\"LLSID_FIRST_PAGE\" INTEGER\);");
       return;
    }
    public static void dropTable(Database p0,boolean p1){
       CoverShowDao uCoverShowDa = CoverShowDao.class;
       if (PatchProxy.isSupport(uCoverShowDa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCoverShowDa, "2")) {
          return;
       }
       StringBuilder str = "DROP TABLE ";
       String str1 = (p1)? "IF EXISTS ": "";
       p0.execSQL(str+str1+"\"COVER_SHOW\"");
       return;
    }
    public final void bindValues(SQLiteStatement p0,CoverShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverShowDao.class, "4")) {
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
       Long llsidFirstPa = p1.getLlsidFirstPage();
       if (llsidFirstPa != null) {
          p0.bindLong(4, llsidFirstPa.longValue());
       }
       return;
    }
    public void bindValues(SQLiteStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public final void bindValues(DatabaseStatement p0,CoverShow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverShowDao.class, "3")) {
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
       Long llsidFirstPa = p1.getLlsidFirstPage();
       if (llsidFirstPa != null) {
          p0.bindLong(4, llsidFirstPa.longValue());
       }
       return;
    }
    public void bindValues(DatabaseStatement p0,Object p1){
       this.bindValues(p0, p1);
    }
    public Long getKey(CoverShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoverShowDao.class, "9");
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
    public boolean hasKey(CoverShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoverShowDao.class, "10");
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
    public CoverShow readEntity(Cursor p0,int p1){
       CoverShowDao uCoverShowDa = CoverShowDao.class;
       if (PatchProxy.isSupport(uCoverShowDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCoverShowDa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p1 + 0;
       Long longx = null;
       Long longx1 = (p0.isNull(i))? longx: Long.valueOf(p0.getLong(i));
       int i1 = p1 + 1;
       Long longx2 = (p0.isNull(i1))? longx: Long.valueOf(p0.getLong(i1));
       int i2 = p1 + 2;
       byte[] uobyteArray = (p0.isNull(i2))? longx: p0.getBlob(i2);
       p1 = p1 + 3;
       if (!p0.isNull(p1)) {
          longx = Long.valueOf(p0.getLong(p1));
       }
       return new CoverShow(longx1, longx2, uobyteArray, longx);
    }
    public Object readEntity(Cursor p0,int p1){
       return this.readEntity(p0, p1);
    }
    public void readEntity(Cursor p0,CoverShow p1,int p2){
       if (PatchProxy.isSupport(CoverShowDao.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CoverShowDao.class, "7")) {
          return;
       }
       int i = p2 + 0;
       Long longx = null;
       Long longx1 = (p0.isNull(i))? longx: Long.valueOf(p0.getLong(i));
       p1.setId(longx1);
       i = p2 + 1;
       longx1 = (p0.isNull(i))? longx: Long.valueOf(p0.getLong(i));
       p1.setLlsid(longx1);
       i = p2 + 2;
       byte[] uobyteArray = (p0.isNull(i))? longx: p0.getBlob(i);
       p1.setContent(uobyteArray);
       p2 = p2 + 3;
       if (!p0.isNull(p2)) {
          longx = Long.valueOf(p0.getLong(p2));
       }
       p1.setLlsidFirstPage(longx);
       return;
    }
    public void readEntity(Cursor p0,Object p1,int p2){
       this.readEntity(p0, p1, p2);
    }
    public Long readKey(Cursor p0,int p1){
       CoverShowDao uCoverShowDa = CoverShowDao.class;
       if (PatchProxy.isSupport(uCoverShowDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCoverShowDa, "5");
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
    public final Long updateKeyAfterInsert(CoverShow p0,long p1){
       CoverShowDao uCoverShowDa = CoverShowDao.class;
       if (PatchProxy.isSupport(uCoverShowDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uCoverShowDa, "8");
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
