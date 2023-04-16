package jf1.i0;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;
import r81.c;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import hf1.f;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$GiftSegment;
import android.graphics.Bitmap;
import cm1.a;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ButtonSegment;
import com.yxcorp.utility.TextUtils;
import jf1.h0;
import android.text.style.ClickableSpan;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ImageSegment;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import va1.r0;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import jf1.g0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$PlainSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import ne1.k;
import java.lang.Number;
import java.lang.Long;

public class i0 implements d	// class@002b6d
{
    public final f a;

    public void i0(){
       super(null);
    }
    public void i0(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       LiveSpannable$b uob;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          RichTextMessageOld mSegments = p0.mSegments;
          if (mSegments == null) {
             spannableStr = liveSpannabl.k();
          }else {
             p1.d();
             int len = mSegments.length;
             int i = 0;
             while (i < len) {
                object oobject = mSegments[i];
                switch (oobject.getContentCase()){
                    case 1:
                      LiveStreamRichTextFeed$UserInfoSegment userInfo = oobject.getUserInfo();
                      uob = f.c(b.c(UserInfo.convertFromProto(userInfo.user)), p1);
                      uob.c(this.b(userInfo.color));
                      liveSpannabl.j(uob);
                      if (k.b()) {
                         liveSpannabl.e();
                      }
                      break;
                    case 2:
                      LiveStreamRichTextFeed$PlainSegment plain = oobject.getPlain();
                      uob = f.c(plain.text, p1);
                      uob.c(this.b(plain.color));
                      liveSpannabl.j(uob);
                      break;
                    case 3:
                      LiveStreamRichTextFeed$ImageSegment image = oobject.getImage();
                      int i1 = this.b(image.alternativeColor);
                      LiveStreamRichTextFeed$ImageSegment alternativeT = image.alternativeText;
                      UserInfos$PicUrl url = image.imageUrls[0].url;
                      Drawable uDrawable = r0.a(url.hashCode());
                      if (uDrawable != null) {
                         liveSpannabl.h(new LiveSpannable$a(uDrawable).c(p1.f));
                      }else {
                         LiveSpannable$b uob1 = f.c(alternativeT, p1);
                         uob1.c(i1);
                         liveSpannabl.j(uob1);
                         a.d(ImageRequestBuilder.k(w0.f(url)).a(), new g0(this, url));
                      }
                      break;
                    case 4:
                      if (oobject.getButton() != null && (!TextUtils.x(oobject.getButton().text) && this.a != null)) {
                         LiveSpannable$a uoa = p1.f(oobject.getButton().text);
                         uoa.a(new h0(this, p0));
                         liveSpannabl.e().h(uoa);
                         p0.setHasLastButton(true);
                      }
                      break;
                    case 5:
                      LiveStreamRichTextFeed$GiftSegment giftId = oobject.getGift().giftId;
                      if (giftId > null) {
                         Bitmap uBitmap = a.b(giftId);
                         BitmapDrawable uBitmapDrawa = (uBitmap != null)? new BitmapDrawable(uBitmap): a1.f(R.drawable.arg_RES_7f081143);
                         liveSpannabl.e().h(new LiveSpannable$a(uBitmapDrawa).c(p1.f));
                      }
                      break;
                    case 6:
                      f.b(p0, liveSpannabl, p1);
                      break;
                    default:
                }
             label_012b :
                i = i + 1;
             }
             spannableStr = liveSpannabl.k();
          }
       }
       return spannableStr;
    }
    public final int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return (int)Long.parseLong(p0.replace("#", "ff"), 16);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
}
