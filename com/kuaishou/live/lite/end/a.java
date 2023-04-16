package com.kuaishou.live.lite.end.a;
import com.kuaishou.live.LiveLiteContainerFragment$a;
import java.lang.Object;
import com.kuaishou.live.lite.LiveLiteParam;
import gq3.a;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.liteend.LiveLiteEndFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class a implements LiveLiteContainerFragment$a	// class@0008dd
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFragment a(LiveLiteParam p0,a p1,a p2,a p3,a p4){
       LiveLiteEndFragment liveLiteEndF;
       if (PatchProxy.isSupport(LiveLiteEndFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          liveLiteEndF = PatchProxy.apply(objArray, null, LiveLiteEndFragment.class, "1");
          if (liveLiteEndF != PatchProxyResult.class) {
          label_003d :
             return liveLiteEndF;
          }
       }
       liveLiteEndF = new LiveLiteEndFragment();
       liveLiteEndF.j = p0;
       liveLiteEndF.k = p1;
       liveLiteEndF.l = p2;
       liveLiteEndF.m = p3;
       liveLiteEndF.n = p4;
       liveLiteEndF.o = true;
       goto label_003d ;
    }
}
