package com.kwai.feature.post.api.postcard.PostCardView$h;
import erd.o;
import java.lang.Object;
import com.kwai.feature.post.api.postcard.model.MissUMaterial;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k46.g;
import kotlin.jvm.internal.a;
import java.util.List;

public final class PostCardView$h implements o	// class@001426
{
    public static final PostCardView$h b;

    static {
       PostCardView$h.b = new PostCardView$h();
    }
    public void PostCardView$h(){
       super();
    }
    public Object apply(Object p0){
       g og = PatchProxy.applyOneRefs(p0, this, PostCardView$h.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "recoData");
          MissUMaterial mButtonConte = p0.mButtonContent;
          a.o(mButtonConte, "recoData.mButtonContent");
          g og1 = new g(String.valueOf(p0.mId), p0.mIcon, null, p0.mName, p0.mMaterialContent, p0.mMaterialType, p0.mMaterialSource, p0.mScheme, mButtonConte, p0.friendIcons);
       }
       return og;
    }
}
