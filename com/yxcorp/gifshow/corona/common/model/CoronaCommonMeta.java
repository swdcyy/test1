package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;

public class CoronaCommonMeta implements Serializable	// class@00120c
{
    public CoronaCaption mCoronaCaption;
    public CoronaCoverInfo mCoronaCoverInfo;
    public int mCoronaShowFlag;
    public CoronaCommonMeta$OwnerCount mOwnerCount;
    public CoronaCommonMeta$CoronaTVWatchHistoryRecord mTVWatchRecord;
    public static final long serialVersionUID = 0x9197896268db9d8c;

    public void CoronaCommonMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CoronaCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(CoronaCommonMeta.class, "", "coronaCommonModel");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
}
