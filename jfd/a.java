package jfd.a;
import jfd.d;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalFeed;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.z0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalPhotoModel;
import java.lang.Number;
import java.lang.CharSequence;
import jfd.c;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.f;
import vb5.a;
import jd.c;
import s0d.a;
import s0d.e;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.android.model.mix.CommonMeta;

public class a implements d	// class@0016d5
{
    public final BigCardExternalFeed a;

    public void a(BigCardExternalFeed p0){
       super();
       this.a = p0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.b(this.a);
    }
    public boolean b(){
       return false;
    }
    public Object c(){
       return this.a;
    }
    public FeedLogCtx c0(){
       return null;
    }
    public String d(){
       return "";
    }
    public boolean e(){
       return false;
    }
    public boolean f(){
       return false;
    }
    public float g(){
       return 0;
    }
    public float getCoverAspectRatio(){
       BigCardExternalFeed mAcfunModel = this.a.mAcfunModel;
       BigCardExternalPhotoModel mWidth = mAcfunModel.mWidth;
       BigCardExternalPhotoModel mHeight = mAcfunModel.mHeight;
       if (mWidth == null || mHeight == null) {
          return 0x3f800000;
       }
       return (((float)mHeight * 0x3f800000) / (float)mWidth);
    }
    public String getExpTag(){
       return "";
    }
    public int getHeight(){
       return this.a.mAcfunModel.mHeight;
    }
    public String getId(){
       return this.a.mId;
    }
    public int getMediaType(){
       return 1;
    }
    public String getPhotoId(){
       return this.a.mId;
    }
    public float getRatio(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getCoverAspectRatio();
    }
    public String getUserId(){
       return "";
    }
    public CharSequence getUserName(){
       return c.b(this);
    }
    public int getVideoType(){
       return 0;
    }
    public int getWidth(){
       return this.a.mAcfunModel.mWidth;
    }
    public boolean h(){
       return false;
    }
    public boolean i(){
       return false;
    }
    public boolean isAd(){
       return false;
    }
    public boolean isLongVideo(){
       return false;
    }
    public boolean isVideoType(){
       return true;
    }
    public CDNUrl[] j(int p0,int p1){
       return this.a.mAcfunModel.mCoverUrls;
    }
    public int k(){
       return 0;
    }
    public ImageRequest[] l(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.x().r(this.a.mAcfunModel.mCoverUrls).l(new a(100)).w();
    }
    public PhotoType m(){
       return PhotoType.VIDEO;
    }
    public CDNUrl[] n(){
       return c.a(this);
    }
    public CommonMeta o(){
       return null;
    }
    public boolean p(){
       return false;
    }
    public boolean q(){
       return false;
    }
}
