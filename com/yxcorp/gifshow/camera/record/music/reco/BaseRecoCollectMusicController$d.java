package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$d;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.response.ReportRecordRecoCollectMusicResponse;
import q87.c;

public final class BaseRecoCollectMusicController$d implements g	// class@000e8f
{
    public static final BaseRecoCollectMusicController$d b;

    static {
       BaseRecoCollectMusicController$d.b = new BaseRecoCollectMusicController$d();
    }
    public void BaseRecoCollectMusicController$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "report bubble show success : "+p0.a().mResult, objArray);
       }
       return;
    }
}
