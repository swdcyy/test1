package com.yxcorp.gifshow.log.realtime.RealTimeDBOpenHelper;
import com.yxcorp.gifshow.log.realtime.DaoMaster$DevOpenHelper;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import org.greenrobot.greendao.database.Database;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.realtime.DaoMaster$OpenHelper;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Integer;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import com.yxcorp.gifshow.log.realtime.DaoMaster;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;

public class RealTimeDBOpenHelper extends DaoMaster$DevOpenHelper	// class@001b3a
{
    public boolean mFirstTimeCreated;

    public void RealTimeDBOpenHelper(Context p0,String p1){
       super(p0, p1);
    }
    public void RealTimeDBOpenHelper(Context p0,String p1,SQLiteDatabase$CursorFactory p2){
       super(p0, p1, p2);
    }
    public boolean getIsFirstTimeCreated(){
       return this.mFirstTimeCreated;
    }
    public void onCreate(Database p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealTimeDBOpenHelper.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.mFirstTimeCreated = true;
       return;
    }
    public void onDowngrade(SQLiteDatabase p0,int p1,int p2){
       if (PatchProxy.isSupport(RealTimeDBOpenHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RealTimeDBOpenHelper.class, "2")) {
          return;
       }
       DaoMaster.dropAllTables(this.wrap(p0), true);
       this.onCreate(p0);
       return;
    }
    public void onUpgrade(Database p0,int p1,int p2){
       if (PatchProxy.isSupport(RealTimeDBOpenHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RealTimeDBOpenHelper.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("RealDao", "upgrade from "+p1+" to "+p2, objArray);
       int i = 3;
       if (p1 < i && p2 >= i) {
          try{
             p0.execSQL("ALTER TABLE \'COVER_SHOW\' ADD COLUMN \'LLSID_FIRST_PAGE\' INTEGER DEFAULT 0;");
          }catch(android.database.sqlite.SQLiteException e0){
             u1.Q("RealDao", Log.getStackTraceString(e0));
             Object[] objArray1 = new Object[0];
             a.C().u("RealDao", e0, objArray1);
             super.onUpgrade(p0, p1, p2);
          }
       }
    }
}
