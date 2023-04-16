package com.yxcorp.gifshow.log.realtime.DaoMaster;
import org.greenrobot.greendao.AbstractDaoMaster;
import android.database.sqlite.SQLiteDatabase;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import java.lang.Class;
import com.yxcorp.gifshow.log.realtime.CoverShowDao;
import com.yxcorp.gifshow.log.realtime.OperationDao;
import com.yxcorp.gifshow.log.realtime.CommentShowDao;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.log.realtime.DaoSession;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.realtime.DaoMaster$DevOpenHelper;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import java.util.Map;
import org.greenrobot.greendao.AbstractDaoSession;

public class DaoMaster extends AbstractDaoMaster	// class@001b32
{

    public void DaoMaster(SQLiteDatabase p0){
       super(new StandardDatabase(p0));
    }
    public void DaoMaster(Database p0){
       super(p0, 3);
       this.registerDaoClass(RealShowDao.class);
       this.registerDaoClass(CoverShowDao.class);
       this.registerDaoClass(OperationDao.class);
       this.registerDaoClass(CommentShowDao.class);
    }
    public static void createAllTables(Database p0,boolean p1){
       DaoMaster uDaoMaster = DaoMaster.class;
       if (PatchProxy.isSupport(uDaoMaster) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uDaoMaster, "1")) {
          return;
       }
       RealShowDao.createTable(p0, p1);
       CoverShowDao.createTable(p0, p1);
       OperationDao.createTable(p0, p1);
       CommentShowDao.createTable(p0, p1);
       return;
    }
    public static void dropAllTables(Database p0,boolean p1){
       DaoMaster uDaoMaster = DaoMaster.class;
       if (PatchProxy.isSupport(uDaoMaster) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uDaoMaster, "2")) {
          return;
       }
       RealShowDao.dropTable(p0, p1);
       CoverShowDao.dropTable(p0, p1);
       OperationDao.dropTable(p0, p1);
       CommentShowDao.dropTable(p0, p1);
       return;
    }
    public static DaoSession newDevSession(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DaoMaster.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DaoMaster(new DaoMaster$DevOpenHelper(p0, p1).getWritableDb()).newSession();
    }
    public DaoSession newSession(){
       Object obj = PatchProxy.apply(null, this, DaoMaster.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }
    public DaoSession newSession(IdentityScopeType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DaoMaster.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DaoSession(this.db, p0, this.daoConfigMap);
    }
    public AbstractDaoSession newSession(){
       return this.newSession();
    }
    public AbstractDaoSession newSession(IdentityScopeType p0){
       return this.newSession(p0);
    }
}
