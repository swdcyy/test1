package com.yxcorp.gifshow.profile.adapter.g$a$b;
import ha5.e;
import com.yxcorp.gifshow.profile.adapter.g$a;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Object;
import java.lang.String;
import ha5.d;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.HashMap;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class g$a$b implements e	// class@00120d
{
    public final PublishSubject a;
    public final b b;
    public final g$a c;

    public void g$a$b(g$a p0,PublishSubject p1,b p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       d.d(this, p0, p1, p2, p3, p4, p5);
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       g$a$b uoa$b = g$a$b.class;
       if (PatchProxy.isSupport(uoa$b) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa$b, "1")) {
          return;
       }
       this.a.onNext(p0);
       this.b.d(p0);
       HashMap hashMap = new HashMap(2);
       hashMap.put("position", String.valueOf(p1));
       hashMap.put("photoId", p0.getId());
       g.g(KsLogProfileTag.PHOTO_PLAY.appendTag("PhotoListAdapter"), "onLiveStreamClick", hashMap);
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
