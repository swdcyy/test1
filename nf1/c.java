package nf1.c;
import m81.a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import h81.e;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import java.lang.ref.WeakReference;
import nf1.b;
import cp3.f;
import android.graphics.drawable.Drawable;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import h81.b;
import h81.a;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import cp3.b;
import nf1.a;
import cp3.a;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import y51.a;
import java.lang.Math;
import android.text.style.ImageSpan;
import o81.b;
import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import va1.k0;
import java.util.Collection;
import trd.i0;
import lnc.u9;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.a;

public class c implements a	// class@003307
{
    public static WeakReference a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public static final CharSequence b(LiveCommentRichText$CommentIconSegment p0,int p1){
       UserStateRichTextSegment obj;
       CharSequence uCharSequenc;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          obj = new UserStateRichTextSegment();
          obj.setIconSegment(p0);
          uCharSequenc = c.c(obj, p1, null);
          if (uCharSequenc != null) {
          label_002d :
             return uCharSequenc;
          }
       }
       uCharSequenc = "";
       goto label_002d ;
    }
    public static final CharSequence c(UserStateRichTextSegment p0,int p1,e p2){
       Object[] obj;
       Drawable uDrawable;
       b uob;
       a uoa;
       WeakReference a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, c.class, "9");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       if (p0 != null) {
          LiveCommentRichText$CommentIconSegment iconSegment = p0.getIconSegment();
          if (iconSegment != null) {
             IconSegmentDecoder iconSegmentD = PatchProxy.apply(obj, obj, uoc, "12");
             if (iconSegmentD != patchProxyRe) {
             }else {
                a = c.a;
                iconSegmentD = (a != null)? a.get(): obj;
                if (iconSegmentD == null) {
                   iconSegmentD = new IconSegmentDecoder(b.a);
                   c.a = new WeakReference(iconSegmentD);
                }
             }
             uDrawable = iconSegmentD.a(iconSegment);
             uob = a.a(iconSegment.tapAction);
          label_005b :
             if (p0 != null) {
                LiveCommentRichText$CommentBadgeSegment badgeSegment = p0.getBadgeSegment();
                if (badgeSegment != null) {
                   uob = PatchProxy.apply(obj, obj, uoc, "13");
                   if (uob != patchProxyRe) {
                   }else {
                      uob = new b(a.a);
                   }
                   uDrawable = uob.a(p0.getBadgeSegment());
                   uob = a.a(badgeSegment.tapAction);
                }
             }
             LiveSpannable liveSpannabl = new LiveSpannable();
             if (uDrawable != null) {
                if (PatchProxy.isSupport(uoc)) {
                   uoa = PatchProxy.applyTwoRefs(uDrawable, Integer.valueOf(p1), obj, uoc, "11");
                   if (uoa != patchProxyRe) {
                   label_00c6 :
                      liveSpannabl.g(uoa);
                      if (uob != null) {
                         liveSpannabl.n(new b(p2, uob));
                      }
                   }
                }
                uoa = new a(uDrawable, "");
                float f = (uDrawable.getIntrinsicHeight())? (float)p1 / (float)uDrawable.getIntrinsicHeight(): 0;
                uoa.b((int)(float)Math.ceil((double)((float)uDrawable.getIntrinsicWidth() * f)), p1);
                goto label_00c6 ;
             }
             return liveSpannabl.l(false);
          }
       }
       uob = obj;
       uDrawable = uob;
       goto label_005b ;
    }
    public static final CharSequence d(List p0,int p1){
       CharSequence uCharSequenc;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          UserStateRichTextSegment userStateRic = CollectionsKt___CollectionsKt.p2(p0);
          if (userStateRic != null) {
             uCharSequenc = c.c(userStateRic, p1, null);
             if (uCharSequenc != null) {
             label_002d :
                return uCharSequenc;
             }
          }
       }
       uCharSequenc = "";
       goto label_002d ;
    }
    public static final CharSequence e(UserStateRichTextSegment[] p0,int p1){
       CharSequence uCharSequenc;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          UserStateRichTextSegment userStateRic = ArraysKt___ArraysKt.Ib(p0);
          if (userStateRic != null) {
             uCharSequenc = c.c(userStateRic, p1, null);
             if (uCharSequenc != null) {
             label_002d :
                return uCharSequenc;
             }
          }
       }
       uCharSequenc = "";
       goto label_002d ;
    }
    public static final CharSequence f(List p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.g(p0, p1, p2, null);
    }
    public static final CharSequence g(List p0,int p1,int p2,e p3){
       LiveSpannable obj;
       CharSequence obj1;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveSpannable();
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (k0.b(obj1)) {
                uArrayList.add(obj1);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             obj1 = c.c(iterator1.next(), p1, p3);
             if (obj1 != null) {
                uArrayList1.add(obj1);
             }
          }
          Iterable iterable = CollectionsKt___CollectionsKt.S5(uArrayList1);
          if (iterable != null) {
             iterator = iterable.iterator();
             while (iterator.hasNext()) {
                i0 oi0 = iterator.next();
                if (!oi0.e()) {
                   obj.b(oi0.f());
                }else {
                   obj.a(new u9(p2));
                   obj.b(oi0.f());
                }
             }
          }
       }
       SpannableStringBuilder spannableStr = obj.l(false);
       a.o(spannableStr, "icons.build\(false\)");
       return spannableStr;
    }
    public CharSequence B1(UserStateRichTextSegment p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.c(p0, p1, null);
    }
    public CharSequence a(String p0,int p1,int p2,e p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, c.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "base64Segments");
       return c.g(k0.a(p0), p1, p2, p3);
    }
    public UserStateRichTextSegment s1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = k0.a(p0);
       UserStateRichTextSegment userStateRic = (list != null)? CollectionsKt___CollectionsKt.p2(list): null;
       return userStateRic;
    }
}
