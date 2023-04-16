package com.kuaishou.live.a;
import com.kuaishou.live.LiveLiteContainerFragment$a;
import java.lang.Object;
import com.kuaishou.live.lite.LiveLiteParam;
import gq3.a;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class a implements LiveLiteContainerFragment$a	// class@00094f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFragment a(LiveLiteParam p0,a p1,a p2,a p3,a p4){
       LiveLiteFragment liveLiteFrag;
       if (PatchProxy.isSupport(LiveLiteFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          liveLiteFrag = PatchProxy.apply(objArray, null, LiveLiteFragment.class, "1");
          if (liveLiteFrag != PatchProxyResult.class) {
          label_003d :
             return liveLiteFrag;
          }
       }
       liveLiteFrag = new LiveLiteFragment();
       liveLiteFrag.j = p0;
       liveLiteFrag.k = p1;
       liveLiteFrag.l = p2;
       liveLiteFrag.m = p3;
       liveLiteFrag.n = p4;
       liveLiteFrag.o = true;
       goto label_003d ;
    }
}
