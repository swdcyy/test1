package com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter$b;
import ga1.d;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter;
import java.lang.Object;
import tj3.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import qc3.d;
import java.lang.RuntimeException;
import kotlin.jvm.internal.a;

public final class LiveLiteBizPlayerPresenter$b implements d	// class@000a81
{
    public final LiveLiteBizPlayerPresenter a;

    public void LiveLiteBizPlayerPresenter$b(LiveLiteBizPlayerPresenter p0){
       this.a = p0;
       super();
    }
    public e a(){
       d obj = PatchProxy.apply(null, this, LiveLiteBizPlayerPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SystemUtil.K() && this.a.h9() == null) {
          throw new RuntimeException("player未初始化,liveLiteLogReporterController未创建!!!");
       }
       obj = this.a.h9();
       a.m(obj);
       return obj.e();
    }
}
