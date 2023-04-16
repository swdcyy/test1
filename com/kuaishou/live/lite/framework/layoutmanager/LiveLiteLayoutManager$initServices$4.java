package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initServices$4;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import com.kuaishou.live.lite.layoutmanager.StageType;
import vb3.c;
import db3.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import bb3.f;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.lang.IllegalArgumentException;
import db3.j;
import vb3.q;
import android.app.Activity;
import android.view.View;
import mrd.a;
import db3.e;
import com.kwai.video.waynelive.LivePlayerController;
import mrd.c;
import db3.a;
import brd.t;
import kc3.c;
import vb3.o;
import db3.f;

public final class LiveLiteLayoutManager$initServices$4 extends Lambda implements p	// class@000914
{
    public final LiveLiteLayoutManager this$0;

    public void LiveLiteLayoutManager$initServices$4(LiveLiteLayoutManager p0){
       this.this$0 = p0;
       super(2);
    }
    public final g invoke(StageType p0,c p1){
       f uof;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, LiveLiteLayoutManager$initServices$4.class, "1");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       a.p(obj1, "stageType");
       LiveLiteLayoutManager$initServices$4 this$0 = obj.this$0;
       LiveLiteLayoutManager v = this$0.V;
       Objects.requireNonNull(this$0);
       obj3 = PatchProxy.applyThreeRefs(p0, v, p1, this$0, LiveLiteLayoutManager.class, "20");
       if (obj3 != patchProxyRe) {
       }else {
          switch (f.a[p0.ordinal()]){
              case 1:
                uof = new f(this$0.N, this$0.P, this$0.A.a(), v, this$0.d, this$0.b);
                break;
              case 2:
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.kuaishou.live.lite.layoutmanager.MultiChatStrategy");
                a uoa = new a(this$0.N, this$0.l, this$0.P, this$0.A.a(), obj2, v, this$0.d, this$0.b, this$0.c, this$0.f(), this$0.a);
                break;
              case 3:
              case 4:
                uof = new e(this$0.N, this$0.P, v, this$0.b);
                break;
              case 5:
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.kuaishou.live.lite.layoutmanager.VoicePartyStrategy");
                uof = new j(this$0.N, this$0.l, v, obj2);
                break;
              case 6:
                throw new IllegalArgumentException("can not enter StageType.None");
              default:
                throw new NoWhenBranchMatchedException();
          }
       }
       return obj3;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
