package com.kwai.nearby.local.container.NearbySecondaryContainerFragment$a;
import ha5.e;
import com.kwai.nearby.local.container.NearbySecondaryContainerFragment;
import java.lang.Object;
import java.lang.String;
import ha5.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.nearby.item.NearbyItemFragment;
import pd7.a;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class NearbySecondaryContainerFragment$a implements e	// class@000f83
{
    public final NearbySecondaryContainerFragment a;

    public void NearbySecondaryContainerFragment$a(NearbySecondaryContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       d.d(this, p0, p1, p2, p3, p4, p5);
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       p0.f = p1;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
