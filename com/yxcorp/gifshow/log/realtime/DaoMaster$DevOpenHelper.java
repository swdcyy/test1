package com.yxcorp.gifshow.log.realtime.DaoMaster$DevOpenHelper;
import com.yxcorp.gifshow.log.realtime.DaoMaster$OpenHelper;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import org.greenrobot.greendao.database.Database;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.log.realtime.DaoMaster;

public class DaoMaster$DevOpenHelper extends DaoMaster$OpenHelper	// class@001b30
{

    public void DaoMaster$DevOpenHelper(Context p0,String p1){
       super(p0, p1);
    }
    public void DaoMaster$DevOpenHelper(Context p0,String p1,SQLiteDatabase$CursorFactory p2){
       super(p0, p1, p2);
    }
    public void onUpgrade(Database p0,int p1,int p2){
       if (PatchProxy.isSupport(DaoMaster$DevOpenHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, DaoMaster$DevOpenHelper.class, "1")) {
          return;
       }
       DaoMaster.dropAllTables(p0, true);
       this.onCreate(p0);
       return;
    }
}
