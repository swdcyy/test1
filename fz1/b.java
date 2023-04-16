package fz1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.graphics.Color;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import qkd.c;
import android.graphics.drawable.Drawable;
import va1.r0;
import fz1.a;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import lnc.a1;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import fz1.b$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.n;
import va1.n0;
import lnc.l1;
import fz1.c;

public class b	// class@0023ee
{

    public void b(){
       super();
    }
    public static SpannableStringBuilder a(LiveGzoneInteractiveCommentMessage p0,float p1,int p2){
       LiveSpannable obj;
       int i;
       int i1;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new LiveSpannable();
          i = Color.parseColor(p0.mCommentBackgroundColorLeft);
          i1 = Color.parseColor(p0.mCommentBackgroundColorRight);
       }catch(java.lang.IllegalArgumentException e1){
          i1 = 0x7f061fda;
          ExceptionHandler.handleCaughtException(e1);
          i = 0x7f061fda;
       }
       int i2 = 0;
       if (!j.h(p0.mRoleAvatarUrl)) {
          UserInfos$PicUrl url = p0.mRoleAvatarUrl[i2].url;
          String str = "/";
          String str1 = (url.endsWith(str))? url.substring(i2, (url.length() - 1)): url;
          int i3 = str1.lastIndexOf(str);
          if (i3 > 0 && i3 < (str1.length() - 1)) {
             str1 = str1.substring((i3 + 1));
          }
          Drawable uDrawable = r0.a(str1.hashCode());
          if (uDrawable != null) {
             obj.h(new LiveSpannable$a(new a(uDrawable, i)).c(a1.e((float)p2)));
             i2 = 1;
          }else {
             a.d(ImageRequestBuilder.k(w0.f(url)).a(), new b$a(str1));
          }
       }
       String str2 = p0.mRoleName+"£º"+p0.mCommentText;
       obj.e().b(str2);
       i2 = i2 + 1;
       p1 = n.O(str2, (float)a1.e(p1));
       str2 = n0.f();
       if (!l1.a()) {
          str2 = (str2 - p0.mMessageViewLeftMargin) - p0.mMessageViewRightMargin;
       }
       float f = (float)str2;
       if (p1 - f > 0) {
          p1 = f;
       }
       obj.o(new c(i, i1, p1), i2, obj.m());
       return obj.k();
    }
}
