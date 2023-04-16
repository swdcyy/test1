package com.yxcorp.gifshow.log.realtime.RealTimeReporting;
import java.lang.Object;
import com.yxcorp.gifshow.log.realtime.RealTimeDBOpenHelper;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.yxcorp.gifshow.log.realtime.DaoMaster;
import com.yxcorp.gifshow.log.realtime.DaoSession;
import h8c.a;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.google.common.base.Optional;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.realtime.CommentShowDao;
import com.yxcorp.gifshow.log.realtime.CoverShowDao;
import com.yxcorp.gifshow.log.realtime.OperationDao;
import com.yxcorp.gifshow.log.realtime.RealShowDao;

public class RealTimeReporting	// class@001b3b
{
    public final Optional mDaoSession;
    public static final RealTimeReporting sRealTimeReporting;

    static {
       RealTimeReporting.sRealTimeReporting = new RealTimeReporting();
    }
    public void RealTimeReporting(){
       DaoSession uDaoSession;
       super();
       try{
          int i = 0;
          uDaoSession = new DaoMaster(new RealTimeDBOpenHelper(a.b(), "real_time_reporting_v2.db", i).getWritableDatabase()).newSession();
       }catch(android.database.sqlite.SQLiteException e1){
          a.C().r("RealtimeReporting", "init error: ", e1);
          ExceptionHandler.handleCaughtException(e1);
       }
       this.mDaoSession = Optional.fromNullable(uDaoSession);
       return;
    }
    public static RealTimeReporting getInstance(){
       return RealTimeReporting.sRealTimeReporting;
    }
    public Optional getCommentShowDao(){
       Object obj = PatchProxy.apply(null, this, RealTimeReporting.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDaoSession.isPresent()) {
          return Optional.of(this.mDaoSession.get().getCommentShowDao());
       }
       return Optional.absent();
    }
    public Optional getCoverShowDao(){
       Object obj = PatchProxy.apply(null, this, RealTimeReporting.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDaoSession.isPresent()) {
          return Optional.of(this.mDaoSession.get().getCoverShowDao());
       }
       return Optional.absent();
    }
    public Optional getOperationDao(){
       Object obj = PatchProxy.apply(null, this, RealTimeReporting.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDaoSession.isPresent()) {
          return Optional.of(this.mDaoSession.get().getOperationDao());
       }
       return Optional.absent();
    }
    public Optional getRealShowDao(){
       Object obj = PatchProxy.apply(null, this, RealTimeReporting.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDaoSession.isPresent()) {
          return Optional.of(this.mDaoSession.get().getRealShowDao());
       }
       return Optional.absent();
    }
}
