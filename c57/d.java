package c57.d;
import erd.g;
import c57.f;
import java.lang.Object;
import com.kwai.live.gzone.emotion.module.LiveGzoneEmotionsResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import b57.a;
import com.kwai.emotionsdk.bean.EmotionPackage;
import wkd.b;
import z47.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.util.Map;
import java.lang.Integer;
import z47.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import z47.c$a;
import android.graphics.Bitmap;
import jl5.h;
import z47.b;
import jk5.c;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements g	// class@0004e8
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a uoa;
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (!q.f(p0.mLiveGzoneCustomEmotionPackages) && (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "5") && !q.f(p0.mLiveGzoneCustomEmotionPackages))) {
          tb.w = new ArrayList();
          p0 = p0.mLiveGzoneCustomEmotionPackages.iterator();
          while (p0.hasNext()) {
             a mEmotionPack = p0.next().mEmotionPackageInfo;
             mEmotionPack.mType = 101;
             tb.w.add(mEmotionPack);
          }
          p0 = b.a(-1181769043);
          String userId = tb.u.getUserId();
          f w = tb.w;
          Objects.requireNonNull(p0);
          c uoc = c.class;
          if (!PatchProxy.applyVoidTwoRefs(userId, w, p0, uoc, "4") && !q.f(w)) {
             if (!PatchProxy.applyVoidOneRefs(userId, p0, uoc, "7")) {
                Integer integer = p0.c.get(userId);
                if (integer == null) {
                   integer = Integer.valueOf(0);
                }
                p0.c.put(userId, Integer.valueOf((integer.intValue() + 1)));
             }
             if (p0.b.containsKey(userId)) {
                uoa = p0.b.get(userId);
             }else if(p0.b.size() > 8){
                uoa = new a();
                p0.b.put(userId, uoa);
             }
             p0.a = userId;
             Iterator iterator = w.iterator();
             while (iterator.hasNext()) {
                Iterator iterator1 = iterator.next().mEmotions.iterator();
                while (iterator1.hasNext()) {
                   EmotionInfo uEmotionInfo = iterator1.next();
                   c$a uoa1 = new c$a(p0, uEmotionInfo.mId);
                   if (!PatchProxy.applyVoidOneRefs(uEmotionInfo, uoa1, c$a.class, "1")) {
                      Bitmap uBitmap = h.c(uEmotionInfo.mId);
                      if (uBitmap != null) {
                         uoa1.a = uBitmap;
                      }else {
                         h.a(uEmotionInfo, new b(uoa1));
                      }
                   }
                   Iterator iterator2 = uEmotionInfo.mEmotionCode.iterator();
                   while (iterator2.hasNext()) {
                      EmotionInfo$EmotionCode uEmotionCode = iterator2.next();
                      if (TextUtils.x(uEmotionCode.mLanguage)) {
                         continue ;
                      }else {
                         Iterator iterator3 = uEmotionCode.mCode.iterator();
                         while (iterator3.hasNext()) {
                            String str = iterator3.next();
                            if (!TextUtils.x(uEmotionCode.mLanguage)) {
                               Objects.requireNonNull(uoa);
                               if (PatchProxy.applyVoidTwoRefs(str, uoa1, uoa, a.class, "1")) {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                            uoa.a.put(str, uoa1);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0150 :
       return;
    }
}
