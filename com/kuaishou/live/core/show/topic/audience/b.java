package com.kuaishou.live.core.show.topic.audience.b;
import ub.a;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class b extends a	// class@0011f9
{
    public final KwaiImageView b;
    public final LiveAudienceTopicDetailActivityView c;

    public void b(LiveAudienceTopicDetailActivityView p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
       }else if(p1 != null){
          LiveAudienceTopicDetailActivityView.a(this.b, p1.getWidth(), p1.getHeight());
       }
       return;
    }
}
