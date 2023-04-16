package nfd.o1;
import a9c.e;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.s0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class o1 extends e	// class@001de9
{

    public void o1(){
       super();
    }
    public boolean a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o1.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): s0.a(p0, p1);
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       SearchItem obj = PatchProxy.applyTwoRefs(p0, p1, this, o1.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = p0.mPhoto;
          if (obj == null) {
             obj = p0.mLivePhoto;
          }
          SearchItem mPhoto = p1.mPhoto;
          if (mPhoto == null) {
             mPhoto = p1.mLivePhoto;
          }
          if (obj != null && mPhoto != null) {
             b = TextUtils.n(obj.getPhotoId(), mPhoto.getPhotoId());
          }else {
             b = s0.a(p0, p1);
          }
       }
       return b;
    }
}
