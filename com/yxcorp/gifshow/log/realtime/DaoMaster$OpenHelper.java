package com.yxcorp.gifshow.log.realtime.DaoMaster$OpenHelper;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import org.greenrobot.greendao.database.Database;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.realtime.DaoMaster;

public abstract class DaoMaster$OpenHelper extends DatabaseOpenHelper	// class@001b31
{

    public void DaoMaster$OpenHelper(Context p0,String p1){
       super(p0, p1, 3);
    }
    public void DaoMaster$OpenHelper(Context p0,String p1,SQLiteDatabase$CursorFactory p2){
       super(p0, p1, p2, 3);
    }
    public void onCreate(Database p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DaoMaster$OpenHelper.class, "1")) {
          return;
       }
       DaoMaster.createAllTables(p0, false);
       return;
    }
}
